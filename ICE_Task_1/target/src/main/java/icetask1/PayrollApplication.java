/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icetask1;

import java.util.ArrayList;
import java.util.Scanner;

public class PayrollApplication
{
    public static void main(String[] args)
    {
        // Store multiple companies
        try (Scanner input = new Scanner(System.in)) {
            // Store multiple companies
            ArrayList<Company> companies = new ArrayList<>();
            
            Company company1 = new Company(
                    "C001",
                    "Tech Solutions",
                    "Johannesburg");
            
            Company company2 = new Company(
                    "C002",
                    "Digital Systems",
                    "Pretoria");
            
            companies.add(company1);
            companies.add(company2);
            
            // Store multiple employees
            ArrayList<Employee> employees = new ArrayList<>();
            
            Employee employee1 = new Employee(
                    "E001",
                    "John",
                    "Smith",
                    "Johannesburg",
                    company1,
                    "01/01/2026",
                    "31/12/2026");
            
            Employee employee2 = new Employee(
                    "E002",
                    "Sarah",
                    "Jones",
                    "Pretoria",
                    company2,
                    "01/01/2026",
                    "31/12/2026");
            
            employees.add(employee1);
            employees.add(employee2);
            
            // Remuneration information
            ArrayList<Remuneration> remunerations = new ArrayList<>();
            
            remunerations.add(
                    new Remuneration(employee1, 150.00, 160));
            
            remunerations.add(
                    new Remuneration(employee2, 180.00, 160));
            
            String[] months =
            {
                "January",
                "February",
                "March",
                "April",
                "May",
                "June"
            };
            
            // Store salary records
            ArrayList<Salary> salaries = new ArrayList<>();
            
            // Record six months of hours worked
            for (int i = 0; i < remunerations.size(); i++)
            {
                Remuneration remuneration = remunerations.get(i);
                
                System.out.println();
                System.out.println("-----------------------------------");
                System.out.println("EMPLOYEE: "
                        + remuneration.getEmployee().getName()
                        + " "
                        + remuneration.getEmployee().getSurname());
                
                System.out.println("COMPANY: "
                        + remuneration.getCompanyName());
                
                System.out.println("-----------------------------------");
                
                for (int j = 0; j < months.length; j++)
                {
                    System.out.print("Enter hours worked for "
                            + months[j] + ": ");
                    
                    double hoursWorked = input.nextDouble();
                    
                    Salary salary = new Salary(
                            months[j],
                            remuneration.getEmployee(),
                            remuneration.getHourlyRate(),
                            remuneration.getNormalMonthlyWorkingHours(),
                            hoursWorked);
                    
                    salaries.add(salary);
                }
            }
            
            // Generate SARS report
            for (int i = 0; i < employees.size(); i++)
            {
                printReport(employees.get(i), salaries);
            }
        }
    }

    public static void printReport(Employee employee,
            ArrayList<Salary> salaries)
    {
        double totalNormalSalary = 0;
        double totalOvertimeHours = 0;
        double totalOvertimeSalary = 0;
        double totalGrossSalary = 0;

        boolean workedOvertime = false;

        System.out.println();
        System.out.println(
                "==============================================================");

        System.out.println("SIX-MONTH SARS REMUNERATION REPORT");

        System.out.println(
                "==============================================================");

        System.out.println("EMPLOYEE ID: "
                + employee.getEmployeeId());

        System.out.println("EMPLOYEE: "
                + employee.getName() + " "
                + employee.getSurname());

        System.out.println("COMPANY: "
                + employee.getCompany().getCompanyName());

        System.out.println();

        System.out.printf("%-12s %-15s %-12s %-15s %-15s%n",
                "MONTH",
                "NORMAL SALARY",
                "OT HOURS",
                "OT EARNINGS",
                "TOTAL");

        System.out.println(
                "---------------------------------------------------------------------");

        for (Salary salary : salaries)
        {
            if (salary.getEmployeeId()
                    .equals(employee.getEmployeeId()))
            {
                System.out.printf(
                        "%-12s R%-14.2f %-12.2f R%-14.2f R%-14.2f%n",
                        salary.getMonth(),
                        salary.getNormalSalary(),
                        salary.getOvertimeHours(),
                        salary.getOvertimeSalary(),
                        salary.getTotalSalary());

                totalNormalSalary += salary.getNormalSalary();
                totalOvertimeHours += salary.getOvertimeHours();
                totalOvertimeSalary += salary.getOvertimeSalary();
                totalGrossSalary += salary.getTotalSalary();

                if (salary.getOvertimeHours() > 0)
                {
                    workedOvertime = true;
                }
            }
        }

        System.out.println(
                "---------------------------------------------------------------------");

        System.out.printf(
                "TOTAL NORMAL SALARY: R%.2f%n",
                totalNormalSalary);

        System.out.printf(
                "TOTAL OVERTIME HOURS: %.2f%n",
                totalOvertimeHours);

        System.out.printf(
                "TOTAL OVERTIME EARNINGS: R%.2f%n",
                totalOvertimeSalary);

        System.out.printf(
                "TOTAL GROSS SALARY: R%.2f%n",
                totalGrossSalary);

        if (workedOvertime)
        {
            System.out.println(
                    "WORKED OVERTIME DURING SIX MONTHS: YES");
        }
        else
        {
            System.out.println(
                    "WORKED OVERTIME DURING SIX MONTHS: NO");
        }
    }
}
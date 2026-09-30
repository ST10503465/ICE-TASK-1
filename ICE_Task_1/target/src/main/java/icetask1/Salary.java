/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icetask1;

public class Salary extends Remuneration
{
    private final String month;
    private final Company company;
    private final double hoursWorked;
    private double normalSalary;
    private double overtimeHours;
    private double overtimeSalary;
    private double totalSalary;

    public Salary(String month, Employee employee, double hourlyRate,
            int normalMonthlyWorkingHours, double hoursWorked)
    {
        super(employee, hourlyRate, normalMonthlyWorkingHours);

        this.month = month;
        this.company = employee.getCompany();
        this.hoursWorked = hoursWorked;

        calculateSalary();
    }

    private void calculateSalary()
    {
        if (hoursWorked > getNormalMonthlyWorkingHours())
        {
            normalSalary = getNormalMonthlyWorkingHours()
                    * getHourlyRate();

            overtimeHours = hoursWorked
                    - getNormalMonthlyWorkingHours();

            overtimeSalary = overtimeHours
                    * getOvertimeRate();
        }
        else
        {
            normalSalary = hoursWorked * getHourlyRate();
            overtimeHours = 0;
            overtimeSalary = 0;
        }

        totalSalary = normalSalary + overtimeSalary;
    }

    public String getMonth()
    {
        return month;
    }

    public Company getCompany()
    {
        return company;
    }

    public double getHoursWorked()
    {
        return hoursWorked;
    }

    public double getNormalSalary()
    {
        return normalSalary;
    }

    public double getOvertimeHours()
    {
        return overtimeHours;
    }

    public double getOvertimeSalary()
    {
        return overtimeSalary;
    }

    public double getTotalSalary()
    {
        return totalSalary;
    }
}

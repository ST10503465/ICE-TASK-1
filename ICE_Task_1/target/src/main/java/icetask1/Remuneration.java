/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icetask1;

public class Remuneration
{
    private final Employee employee;
    private final double hourlyRate;
    private final int normalMonthlyWorkingHours;
    private final double overtimeRate;

    public Remuneration(Employee employee, double hourlyRate,
            int normalMonthlyWorkingHours)
    {
        this.employee = employee;
        this.hourlyRate = hourlyRate;
        this.normalMonthlyWorkingHours = normalMonthlyWorkingHours;

        // Overtime is paid at 1.5 times the hourly rate
        this.overtimeRate = hourlyRate * 1.5;
    }

    public Employee getEmployee()
    {
        return employee;
    }

    public String getEmployeeId()
    {
        return employee.getEmployeeId();
    }

    public String getCompanyName()
    {
        return employee.getCompany().getCompanyName();
    }

    public double getHourlyRate()
    {
        return hourlyRate;
    }

    public int getNormalMonthlyWorkingHours()
    {
        return normalMonthlyWorkingHours;
    }

    public double getOvertimeRate()
    {
        return overtimeRate;
    }
}
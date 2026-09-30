/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icetask1;

public class Employee
{
    private final String employeeId;
    private final String name;
    private final String surname;
    private final String address;
    private final Company company;
    private final String startDate;
    private final String endDate;

    public Employee(String employeeId, String name, String surname,
            String address, Company company, String startDate,
            String endDate)
    {
        this.employeeId = employeeId;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.company = company;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getEmployeeId()
    {
        return employeeId;
    }

    public String getName()
    {
        return name;
    }

    public String getSurname()
    {
        return surname;
    }

    public String getAddress()
    {
        return address;
    }

    public Company getCompany()
    {
        return company;
    }

    public String getStartDate()
    {
        return startDate;
    }

    public String getEndDate()
    {
        return endDate;
    }
}
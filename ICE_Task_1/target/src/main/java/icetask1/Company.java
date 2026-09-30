/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icetask1;

public class Company
{
    private final String companyId;
    private final String companyName;
    private final String location;

    public Company(String companyId, String companyName, String location)
    {
        this.companyId = companyId;
        this.companyName = companyName;
        this.location = location;
    }

    public String getCompanyId()
    {
        return companyId;
    }

    public String getCompanyName()
    {
        return companyName;
    }

    public String getLocation()
    {
        return location;
    }
}

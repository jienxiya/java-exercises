/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeV1;

/**
 *
 * @author pallerma_sd1022
 */
public class HourlyEmployee {
    private int id;
    private String name;
    private String companyName;
    private String birthDate;
    private String hiredDate;
    private double totalHours;
    private double ratePerHour;

    public HourlyEmployee() {
    }

    public HourlyEmployee(int id, String name, String companyName, String birthDate, String hiredDate) {
        this.id = id;
        this.name = name;
        this.companyName = companyName;
        this.birthDate = birthDate;
        this.hiredDate = hiredDate;
    }

    public HourlyEmployee(int id, String name, String companyName, String birthDate, String hiredDate, double totalHours, double ratePerHour) {
        this.id = id;
        this.name = name;
        this.companyName = companyName;
        this.birthDate = birthDate;
        this.hiredDate = hiredDate;
        this.totalHours = totalHours;
        this.ratePerHour = ratePerHour;
    }
//setters

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setHiredDate(String hiredDate) {
        this.hiredDate = hiredDate;
    }

    public void setTotalHours(double totalHours) {
        this.totalHours = totalHours;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

//getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getHiredDate() {
        return hiredDate;
    }

    public double getTotalHours() {
        return totalHours;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public double computeSalary() {
        double salary;
        if (totalHours <= 40) {
            salary = totalHours * ratePerHour;
        } else {
            salary = 40 * ratePerHour + (totalHours - 40) * (1.5 * ratePerHour);
        }
        return salary;
    }

    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format(("ID: %d \nName: %s \nCompany Name: %s \nBirthday: %s \nHired Date: %s \nTotal Hours: %f \nRate Per Hour: %f"), id, name, companyName, birthDate, hiredDate, totalHours, ratePerHour);
    }

    
    
}

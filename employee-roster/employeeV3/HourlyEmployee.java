/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeV3;

/**
 *
 * @author pallerma_sd1022
 */
public class HourlyEmployee extends Employee {

    private double totalHours;
    private double ratePerHour;

    public HourlyEmployee() {
    }

    public HourlyEmployee(double totalHours, double ratePerHour, int id, String name, String companyName, String hiredDate, String birthDate) {
        super(id, name, companyName, hiredDate, birthDate);
        this.totalHours = totalHours;
        this.ratePerHour = ratePerHour;
    }
//getters

    public double getTotalHours() {
        return totalHours;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }
//setters

    public void setTotalHours(double totalHours) {
        this.totalHours = totalHours;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    @Override
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
        return String.format(("ID: %d \nName: %s \nCompany Name: %s \nBirthday: %s \nHired Date: %s \nTotal Hours: %f \nRate Per Hour: %f"), super.getId(), super.getName(), super.getCompanyName(), super.getBirthDate(), super.getHiredDate(), totalHours, ratePerHour);
    }

}

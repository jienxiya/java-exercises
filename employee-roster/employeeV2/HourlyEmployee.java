/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeV2;

/**
 *
 * @author pallerma_sd1022
 */
public class HourlyEmployee {

    private Employee hourlyEmployee;
    private float totalHour;
    private float ratePerHour;

    public HourlyEmployee() {
    }

    public HourlyEmployee(Employee hourlyEmployee, float totalHour, float ratePerHour) {
        this.hourlyEmployee = hourlyEmployee;
        this.totalHour = totalHour;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(String name, int id, Date birthDate, Date hired, String companyName) {
        this.hourlyEmployee.setName(name);
        this.hourlyEmployee.setId(id);
        this.hourlyEmployee.setBirthDate(birthDate);
        this.hourlyEmployee.setHiredDate(birthDate);
        this.hourlyEmployee.setCompanyName(companyName);
    }

    //getters
    public String getName() {
        return hourlyEmployee.getName();
    }

    public int getId() {
        return hourlyEmployee.getId();
    }

    public Date getBirthday() {
        return hourlyEmployee.getBirthDate();
    }

    public Date getHiredDate() {
        return hourlyEmployee.getHiredDate();
    }

    public String getCompanyName() {
        return hourlyEmployee.getCompanyName();
    }

    public Employee getHourlyEmployee() {
        return hourlyEmployee;
    }

    public float getTotalHour() {
        return totalHour;
    }

    public float getRatePerHour() {
        return ratePerHour;
    }

    //setters
    public void setName(String name) {
        this.hourlyEmployee.setName(name);
    }
    
    public void setId(int id){
        this.hourlyEmployee.setId(id);
    }
    
    public void setBirthDate(Date birthDate){
        this.hourlyEmployee.setBirthDate(birthDate);
    }
    
    public void setHiredDate(Date hiredDate){
        this.hourlyEmployee.setHiredDate(hiredDate);
    }
    
    public void setCompanyName(String companyName){
        this.hourlyEmployee.setCompanyName(companyName);
    }
    public void setHourlyEmployee(Employee hourlyEmployee) {
        this.hourlyEmployee = hourlyEmployee;
    }

    public void setTotalHour(float totalHour) {
        this.totalHour = totalHour;
    }

    public void setRatePerHour(float ratePerHour) {
        this.ratePerHour = ratePerHour;
    }
    
    public double computeSalary(){
        double salary;
        if (totalHour <= 40) {
            salary = totalHour * ratePerHour;
        } else {
            salary = 40 * ratePerHour + (totalHour - 40) * (1.5 * ratePerHour);
        }
        return salary;
    }
    
    public void display(){
        System.out.println(this);
    }
    @Override
    public String toString() {
        return String.format("%s\nTotal Hours : %f\nRate per Hour : %f\nSalary : %f",this.hourlyEmployee,this.totalHour,this.ratePerHour,this.computeSalary());
    }

}

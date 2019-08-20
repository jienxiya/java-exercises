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
public class BasedPlusCommissionEmployee {
    private double totalSales;
    private double salary;
    private Employee bpcEmployee;

    public BasedPlusCommissionEmployee() {
    }

    public BasedPlusCommissionEmployee(double totalSales, Employee bpcEmployee ,double salary) {
        this.totalSales = totalSales;
        this.bpcEmployee = bpcEmployee;
        this.salary = salary;
    }

    public BasedPlusCommissionEmployee(Employee bpcEmployee) {
        this.bpcEmployee = bpcEmployee;
    }

    public BasedPlusCommissionEmployee(String name, Date birthDate, Date hireDate, String companyName, int id) {
        this.bpcEmployee.setName(name);
        this.bpcEmployee.setId(id);
        this.bpcEmployee.setHiredDate(hireDate);
        this.bpcEmployee.setBirthDate(birthDate);
    }

    public String getName() {
        return bpcEmployee.getName();
    }

    public void setName(String name) {
        this.bpcEmployee.setName(name);
    }

    public Date getBirthDate() {
        return bpcEmployee.getBirthDate();
    }

    public void setBirthDate(Date birthDate) {
        this.bpcEmployee.setBirthDate(birthDate);
    }

    public Date getHireDate() {
        return bpcEmployee.getHiredDate();
    }

    public void setHireDate(Date hireDate) {
        this.bpcEmployee.setHiredDate(hireDate);
    }

    public String getCompanyName() {
        return bpcEmployee.getCompanyName();
    }

    public void setCompanyName(String companyName) {
        this.bpcEmployee.setCompanyName(companyName);
    }

    public int getId() {
        return bpcEmployee.getId();
    }

    public void setId(int id) {
        this.bpcEmployee.setId(id);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

   public double computeSalary() {
        double com = 0;
        if(0< this.totalSales && this.totalSales<= 1000000){
           com = 0.1;
        }else if ( this.totalSales<= 5000000) {
            com = 0.15;
        }else if (this.totalSales > 5000000) {
            com =  0.2;
        } 
        return this.salary + this.totalSales * com;

    }

    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        String detail; 
        if (this.totalSales != 0) {
            detail =  String.format("%s\nTotal Sales : %f\nSalary : %f",
                     this.bpcEmployee, this.totalSales, this.computeSalary());
        } else {
            detail = String.format("%s", this.bpcEmployee);
        }
        return detail;

    }

}

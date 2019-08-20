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
public class BasedPlusCommissionEmployee extends CommissionEmployee {
    private double fixSalary;

    public BasedPlusCommissionEmployee() {
    }

    public BasedPlusCommissionEmployee(double fixSalary, double sales, int id, String name, String companyName, String birthDate, String hiredDate){
        super(sales,id,name,companyName,birthDate,hiredDate);
        this.fixSalary = fixSalary;
    }

    public double getFixSalary() {
        return fixSalary;
    }

    public void setFixSalary(double fixSalary) {
        this.fixSalary = fixSalary;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }
      
    public double computeSalary(){
        return super.computeSalary() + fixSalary;
    }
    public void display(){
        System.out.println(this);
    }
    
    
    @Override
    public String toString() {
        return String.format(("ID: %d \nName: %s \nCompany Name: %s \nBirthday: %s \nHired Date: %s \nSales: %f \nFix Salary: %f"), super.getId(), super.getName(), super.getCompanyName(), super.getBirthDate(), super.getHiredDate(), sales, fixSalary);
    }
    
}



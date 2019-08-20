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
public class CommissionEmployee {
        private Employee commissionEmployee;
    private double totalSales;
    
    public CommissionEmployee() {
        }

    public CommissionEmployee(double totalSales, Employee comissionEmployee) {
        this.totalSales = totalSales;
        this.commissionEmployee = comissionEmployee;
    }

    public CommissionEmployee(Employee commissionEmployee) {
        this.commissionEmployee = commissionEmployee;
    }

    public CommissionEmployee(String name, Date birthDate, Date hireDate, String companyName, int id) {
        this.commissionEmployee.setName(name);
        this.commissionEmployee.setId(id);
        this.commissionEmployee.setHiredDate(hireDate);
        this.commissionEmployee.setBirthDate(birthDate);
    }

    public String getName() {
        return commissionEmployee.getName();
    }

    public void setName(String name) {
        this.commissionEmployee.setName(name);
    }

    public Date getBirthDate() {
        return commissionEmployee.getBirthDate();
    }

    public void setBirthDate(Date birthDate) {
        this.commissionEmployee.setBirthDate(birthDate);
    }

    public Date getHireDate() {
        return commissionEmployee.getHiredDate();
    }

    public void setHireDate(Date hireDate) {
        this.commissionEmployee.setHiredDate(hireDate);
    }

    public String getCompanyName() {
        return commissionEmployee.getCompanyName();
    }

    public void setCompanyName(String companyName) {
        this.commissionEmployee.setCompanyName(companyName);
    }

    public int getId() {
        return commissionEmployee.getId();
    }

    public void setId(int id) {
        this.commissionEmployee.setId(id);
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
        return  this.totalSales * 0.1;
       
    }

    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        String detail ;
        if (this.totalSales != 0) {
            detail =  String.format("%s\nTotal Sales : %f\nSalary : %f",
                     this.commissionEmployee, this.totalSales, this.computeSalary());
        } else {
            detail =  String.format("%s", this.commissionEmployee);
        }
        return detail;

    }

}

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
public class CommissionEmployee extends Employee {
    
    double sales;

    public CommissionEmployee() {
    }

    public CommissionEmployee(double sales, int id, String name, String companyName, String birthDate, String hiredDate) {
        super(id, name, companyName, birthDate, hiredDate);
        this.sales = sales;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    @Override
    public double computeSalary() {
        if (sales > 0 && sales <= 1000000) {
            return sales *= 0.1;
        } else if (sales > 1000000 && sales <= 5000000) {
            return sales *= 0.15;
        } else {
            return sales *= 0.2;
        }
    }
    public void display() {
        System.out.println(this);
    }
    
    @Override
    public String toString() {
        return String.format(("ID: %d \nName: %s \nCompany Name: %s \nBirthday: %s \nHired Date: %s\nSales: %f"), super.getId(), super.getName(), super.getCompanyName(), super.getBirthDate(), super.getHiredDate(), sales);
    }
}


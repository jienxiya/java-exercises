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
public class CommissionEmployee {
    private int id;
    private String name;
    private String companyName;
    private String birthDate;
    private String hiredDate;
    private double sales;

    public CommissionEmployee() {
    }

    public CommissionEmployee(int id, String name, String companyName, String birthDate, String hiredDate) {
        this.id = id;
        this.name = name;
        this.companyName = companyName;
        this.birthDate = birthDate;
        this.hiredDate = hiredDate;
    }

    public CommissionEmployee(int id, String name, String companyName, String birthDate, String hiredDate, double sales) {
        this.id = id;
        this.name = name;
        this.companyName = companyName;
        this.birthDate = birthDate;
        this.hiredDate = hiredDate;
        this.sales = sales;
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

    public void setSales(double sales) {
        this.sales = sales;
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

    public double getSales() {
        return sales;
    }
    
    public double computeSalary(){
        if(sales > 0 && sales <= 1000000){
            return sales *= 0.1; 
        }else if (sales > 1000000 && sales <= 5000000){
            return sales *= 0.15;
        }else{
            return sales *= 0.2;
        }
    }
    public void display(){
        System.out.println(this);
    }
    
    @Override
    public String toString(){
        return String.format(("ID: %d \nName: %s \nCompany Name: %s \nBirthday: %s \nHired Date: %s \nSales: %f"), id,name,companyName,birthDate,hiredDate,sales);
    }

    
}

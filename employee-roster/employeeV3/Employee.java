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
public class Employee {
    private int id;
    private String name;
    private String companyName;
    private String birthDate;
    private String hiredDate;

    public Employee() {
    }

    public Employee(int id, String name, String companyName, String birthDate, String hiredDate) {
        this.id = id;
        this.name = name;
        this.companyName = companyName;
        this.birthDate = birthDate;
        this.hiredDate = hiredDate;
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
    
    public double computeSalary(){
        return 0;
    }
    
    @Override
    public String toString(){
        return String.format("Id : %d\nName : %s\nBirthday: %s\nHireDate : %s\nCompany Name : %s"
                ,this.id,this.name,this.birthDate,this.hiredDate,this.companyName);
    }
}

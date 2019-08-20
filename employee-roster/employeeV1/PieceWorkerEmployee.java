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
public class PieceWorkerEmployee {
    private int id;
    private String name;
    private String companyName;
    private String birthDate;
    private String hiredDate;
    private int totalPieces;
    private double ratePerPiece;

    public PieceWorkerEmployee() {
    }

    public PieceWorkerEmployee(int id, String name, String companyName, String birthDate, String hiredDate) {
        this.id = id;
        this.name = name;
        this.companyName = companyName;
        this.birthDate = birthDate;
        this.hiredDate = hiredDate;
    }

    public PieceWorkerEmployee(int id, String name, String companyName, String birthDate, String hiredDate, int totalPieces, double ratePerPiece) {
        this.id = id;
        this.name = name;
        this.companyName = companyName;
        this.birthDate = birthDate;
        this.hiredDate = hiredDate;
        this.totalPieces = totalPieces;
        this.ratePerPiece = ratePerPiece;
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

    public void setTotalPieces(int totalPieces) {
        this.totalPieces = totalPieces;
    }

    public void setRatePerPiece(double ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
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

    public int getTotalPieces() {
        return totalPieces;
    }

    public double getRatePerPiece() {
        return ratePerPiece;
    }

    public double computeSalary() {
        double salary;
        if (totalPieces <= 100) {
            salary = totalPieces * ratePerPiece;
        } else {
            salary = totalPieces * ratePerPiece + ((totalPieces / 100 * 10) * ratePerPiece);
        }
        return salary;
    }
    
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format(("ID: %d \nName: %s \nCompany Name: %s \nBirthday: %s \nHired Date: %s \n Total Piece: %d \nRate Per Piece: %f"), id, name, companyName, birthDate, hiredDate, totalPieces, ratePerPiece);
    }

}

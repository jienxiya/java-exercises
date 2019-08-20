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
public class PieceWorkerEmployee extends Employee {
    private int totalPieces;
    private double ratePerPiece;

    public PieceWorkerEmployee() {
    }

    public PieceWorkerEmployee(int totalPieces, double ratePerPiece, int id, String name, String companyName, String birthDate, String hiredDate) {
        super(id, name, companyName, birthDate, hiredDate);
        this.totalPieces = totalPieces;
        this.ratePerPiece = ratePerPiece;
    }
    
    //getters

    public int getTotalPieces() {
        return totalPieces;
    }

    public double getRatePerPiece() {
        return ratePerPiece;
    }
    
    //setters

    public void setTotalPieces(int totalPieces) {
        this.totalPieces = totalPieces;
    }

    public void setRatePerPiece(double ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }
    
    @Override
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
        return String.format(("ID: %d \nName: %s \nCompany Name: %s \nBirthday: %s \nHired Date: %s \n Total Piece: %d \nRate Per Piece: %f"), super.getId(), super.getName(), super.getCompanyName(), super.getBirthDate(), super.getHiredDate(), totalPieces, ratePerPiece);
    }
    
    
}

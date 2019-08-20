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
public class PieceWorkerEmployee {
    private Employee pieceWorker;
    private int totalPieces;
    private double ratePerPiece;

    public PieceWorkerEmployee() {
    }

    public PieceWorkerEmployee(Employee pieceWorker, int totalPieces, double ratePerPiece) {
        this.pieceWorker = pieceWorker;
        this.totalPieces = totalPieces;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceWorkerEmployee(Employee pieceWorker) {
        this.pieceWorker = pieceWorker;
    }
    
    public PieceWorkerEmployee(String name, Date birthDate, Date hireDate, String companyName, int id) {
        this.pieceWorker.setName(name);
        this.pieceWorker.setId(id);
        this.pieceWorker.setHiredDate(hireDate);
        this.pieceWorker.setBirthDate(birthDate);
    }

    public String getName() {
        return pieceWorker.getName();
    }

    public void setName(String name) {
        this.pieceWorker.setName(name);
    }

    public Date getBirthDate() {
        return pieceWorker.getBirthDate();
    }

    public void setBirthDate(Date birthDate) {
        this.pieceWorker.setBirthDate(birthDate);
    }

    public Date getHireDate() {
        return pieceWorker.getHiredDate();
    }

    public void setHireDate(Date hireDate) {
        this.pieceWorker.setHiredDate(hireDate);
    }

    public String getCompanyName() {
        return pieceWorker.getCompanyName();
    }

    public void setCompanyName(String companyName) {
        this.pieceWorker.setCompanyName(companyName);
    }

    public int getId() {
        return pieceWorker.getId();
    }

    public void setId(int id) {
        this.pieceWorker.setId(id);
    }

    public Employee getPieceWorker() {
        return pieceWorker;
    }

    public void setPieceWorker(Employee pieceWorker) {
        this.pieceWorker = pieceWorker;
    }

    public int getTotalPieces() {
        return totalPieces;
    }

    public void setTotalPieces(int totalPieces) {
        this.totalPieces = totalPieces;
    }

    public double getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(double ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }

    public double computeSalary() {
        if (this.totalPieces >= 100) {
            int temp = this.totalPieces / 100;
            return this.totalPieces * this.ratePerPiece + ((temp * 10) * this.ratePerPiece);
        } else {
            return this.totalPieces * this.ratePerPiece;
        }
    }

    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        if (this.totalPieces != 0 && this.ratePerPiece != 0) {
            return String.format("%s\nTotal Pieces : %d\nRate per Piece : %f\nSalary : %f",
                    this.pieceWorker, this.totalPieces, this.ratePerPiece, this.computeSalary());
        } else {
            return String.format("%s", this.pieceWorker);
        }
    }

}

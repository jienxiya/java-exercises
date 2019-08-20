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
public class Date {
    private int day;
    private int year;
    private String month;

    public Date() {
    }

    public Date(int day, int year, String month) {
        this.day = day;
        this.year = year;
        this.month = month;
    }

    //getters
    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }
    
    //setters

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(String month) {
        this.month = month;
    }
    
    @Override
    public String toString(){
        return String.format("%s %d, %d", month, day, year);
    }
}


import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Renan Bargaso|Mary Jane Paller|Lealyn Eulin|Princess Duran
 */
public class Book {
    private String title;
    private String category;
    private String author;
    private int yearPublished;
    private int numberOfPages;
    private boolean isBorrowed;
    private boolean isReturned;
    private LocalDate dateBorrowed;
    private LocalDate duedate;

    public Book() {
    }
    
    public Book(String title) {
         this.title = title;
    }  
     
     
    public Book(String title, String category, String author, int yearPublished) {
        this.title = title;
        this.category = category;
        this.author = author;
        this.yearPublished =  yearPublished;
        this.isBorrowed = false;
        this.isReturned = false;
    }

    public Book(String title, String category, String author, int yearPublished,int numberOfPages) {
        this.title = title;
        this.category = category;
        this.author = author;
        this.yearPublished =  yearPublished;
        this.numberOfPages = numberOfPages;
        this.isBorrowed = false;
         this.isReturned = false;
        
    }

    public boolean getIsBorrowed() {
        return isBorrowed;
    }

    public void setIsBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }

    public boolean isIsReturned() {
        return isReturned;
    }

    public void setIsReturned(boolean isReturned) {
        this.isReturned = isReturned;
    }

    
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    
    public String tabularize() {
        return String.format("%-18s %-18s %-18s", title, author, yearPublished);
    }

    public LocalDate getDateBorrowed() {
        return dateBorrowed;
    }

    public void setDateBorrowed(LocalDate dateBorrowed) {
        this.dateBorrowed = dateBorrowed;
        this.duedate = this.dateBorrowed.plusDays(7);
    }

    public LocalDate getDuedate() {
        return duedate;
    }
    
    
    @Override
    public String toString() {
        return "Title: " + title + "\nCategory: " + category + "\nAuthor: " + author + "\nYear Published: " + yearPublished + "\nNumber Of Pages: " + numberOfPages;
    }
    
    
    
    
}

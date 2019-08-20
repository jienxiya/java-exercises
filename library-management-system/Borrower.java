
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Renan Bargaso|Mary Jane Paller|Lealyn Eulin|Princess Duran
 */
public class Borrower extends UserAccount {
    private Book[] booksBorrowed;
    private int maxNumOfBooks;
    private int numOfBooksBorrowed = 0;
    private LocalDate dateNow = getDate();
    private int pin;
    private double charge;
    private String department;
    private String course;

    public Borrower() {
    }

    public Borrower(Name name) {
        super(name);
        this.department = department;
        this.maxNumOfBooks = 5;
        this.booksBorrowed = new Book[this.maxNumOfBooks];
    }
    
    public Borrower(Name name, String course, String department, int pin,int idNumber) {
        super(name, pin, idNumber);
        this.course = course;
        this.department = department;
        this.maxNumOfBooks = 5;
        this.booksBorrowed = new Book[this.maxNumOfBooks];
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getCharge() {
        return charge;
    }

    public LocalDate getDateNow() {
        return dateNow;
    }

    public void setDateNow(LocalDate dateNow) {
        this.dateNow = dateNow;
    }

    public Book[] getBooksBorrowed() {
        return booksBorrowed;
    }

    public int getMaxNumOfBooks() {
        return maxNumOfBooks;
    }

    public void setMaxNumOfBooks(int maxNumOfBooks) {
        this.maxNumOfBooks = maxNumOfBooks;
    }

    public int getNumOfBooksBorrowed() {
        return numOfBooksBorrowed;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    
    

    public boolean addBookToBorrowedBooksList(Book book) {
        boolean reslt = false;
        if (this.numOfBooksBorrowed < this.maxNumOfBooks) {
            Book result = book;
            if (!"0 RESULTS FOUND!".equals(result.getTitle()) && !result.getIsBorrowed()) {
                result.setIsBorrowed(true);
                result.setDateBorrowed(dateNow);
                booksBorrowed[this.numOfBooksBorrowed++] = result;
                reslt = true;
            }
        }
        return reslt;
    }

    public boolean removeBookToBorrowedBooksList() {
        Book book;
        int numOfLateReturned = 0;
        int limit = this.numOfBooksBorrowed;
        for (int i = 0; i < limit; ++i) {
            book = booksBorrowed[i];
            book.setIsBorrowed(false);
            --numOfBooksBorrowed;
            if (dateNow.getMonthValue() > book.getDuedate().getMonthValue() || dateNow.getDayOfMonth() > book.getDuedate().getDayOfMonth()) {
                    int date;
                    if (dateNow.getMonthValue() > book.getDuedate().getMonthValue()) {
                        date = book.getDuedate().lengthOfMonth() - book.getDuedate().getDayOfMonth() + dateNow.getDayOfMonth();
                    } else {
                        date = dateNow.getDayOfMonth()- book.getDuedate().getDayOfMonth();
                    }       
                    this.charge += date * 5;
                    System.out.println(dateNow.compareTo(book.getDuedate()));
                    ++numOfLateReturned;
                }
            
        }
        return numOfLateReturned > 0;
    }


    public boolean removeBookToBorrowedBooksList(String title) { //remove book in your borrowed cart
        Book book;
        int numOfLateReturned = 0;
        for (int i = 0; i < this.numOfBooksBorrowed; ++i) {
            book = booksBorrowed[i];
            if (book.getTitle().equals(title)) {
                book.setIsBorrowed(false);
                for (int j=i;j<this.numOfBooksBorrowed-1;++j) {
                    booksBorrowed[j] = booksBorrowed[j+1];
                }
                --numOfBooksBorrowed;
                if (dateNow.getMonthValue() > book.getDuedate().getMonthValue() || dateNow.getDayOfMonth() > book.getDuedate().getDayOfMonth()) {
                    int date;
                    if (dateNow.getMonthValue() > book.getDuedate().getMonthValue()) {
                        date = book.getDuedate().lengthOfMonth() - book.getDuedate().getDayOfMonth() + dateNow.getDayOfMonth();
                    } else {
                        date = dateNow.getDayOfMonth()- book.getDuedate().getDayOfMonth();
                    }       
                    this.charge += date * 5;
                    System.out.println(dateNow.compareTo(book.getDuedate()));
                    ++numOfLateReturned;
                }
            }
            return numOfLateReturned > 0;

        }
        return false;
    }

    public LocalDate getDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Calendar cal = Calendar.getInstance();
        return cal.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public String viewBorrowedBooks() {
        String display = "No borrowed book";
        if (this.numOfBooksBorrowed > 0) {
            display = String.format("\n%-18s %-18s %-17s %-18s %-18s %-18s\n", "TITLE", "AUTHOR", "YEAR PUBLISHED", "NUMBER OF PAGES", "DATE BORROWED", "DUE DATE");
            for (int i = 0; i < this.numOfBooksBorrowed; ++i) {
                Book book = booksBorrowed[i];
                display += String.format(book.tabularize() + "%-18s %-18s %-18s\n", book.getNumberOfPages(), book.getDateBorrowed(), book.getDuedate());
            }
        }
        return display;
    }

    @Override
    public String toString() {
        return String.format("\nName: %s\nID Number: %d\nCourse: %s\nDepartment: %s\nType: Borrower\n%s", super.getName(), super.getIdNumber(), course, department,viewBorrowedBooks());

    }

}

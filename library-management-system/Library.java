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
public class Library {
    private Book[] bookShelves;
    private UserAccount[] accounts; /*polymorphism logic here [administrator,borrower]*/ 
    private int totalCapacity;
    private int numberOfBooksAdded = 0;
    private int NumberOfAccountAdded = 0;
    private int maxNumberOfAccounts;
    private double chargesCollected;
    private int numOfBorrowedBooks;
    private LocalDate dateNow = getDate();
    private int relatedAcountFound;

    public Library() {
        this(2000, 72);
    }

    public Library(int totalCapacity, int maxNumberOfAccounts) {
        this.totalCapacity = totalCapacity;
        this.bookShelves = new Book[totalCapacity];
        this.maxNumberOfAccounts = maxNumberOfAccounts;
        this.accounts = new UserAccount[maxNumberOfAccounts];
    }

    public void setTotalCapacity(int totalCapacity) {
        this.totalCapacity = totalCapacity;
        this.bookShelves = new Book[totalCapacity];
    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public int getNumberOfBooksAdded() {
        return numberOfBooksAdded;
    }

    public double getChargesCollected() {
        return chargesCollected;
    }

    public Book[] getBookShelves() {
        return bookShelves;
    }

    public int getNumberOfAccountAdded() {
        return NumberOfAccountAdded;
    }

    public int getMaxNumberOfAccounts() {
        return maxNumberOfAccounts;
    }

    public int getNumOfBorrowedBooks() {
        return numOfBorrowedBooks;
    }
    
    public void setDateNow(LocalDate dateNow) {
        this.dateNow = dateNow;
    }

    public LocalDate getDateNow() {
        return dateNow;
    }

    public int getRelatedAcountFound() {
        return relatedAcountFound;
    }

    public void setRelatedAcountFound(int relatedAcountFound) {
        this.relatedAcountFound = relatedAcountFound;
    }

    public boolean addBook(Book newBook) {
        if (this.numberOfBooksAdded <= this.totalCapacity) {
            bookShelves[numberOfBooksAdded++] = newBook;
            return true;
        }
        return false;     
    }

    public void populateAccountList() {
        Name name = new Name("Jonathan", "Velarade", "Rivas");
        Name name1 = new Name("Maria Judelyn", "C", "Espra");
        Name name2 = new Name("Monica", "D", "Lusares");
        Name name3 = new Name("Mary Grace", "B", "Cordoto");
        Name name4 = new Name("Renan", "C", "Bargaso");
        Name name5 = new Name("Princess Joy", "C", "Duran");
        Name name6 = new Name("Mary Jane", "C.", "Paller");
        Name name7 = new Name("Lealyn", "B", "Eulin");
        addAccount(new Administrator(name5, 111111,123456));
        addAccount(new Administrator(name6, 121212, 234567));
        addAccount(new Administrator(name7, 212121, 345678));
        addAccount(new Borrower(name, "BSIT", "DCIS", 131313, 456789));
        addAccount(new Borrower(name1, "BSIT", "DCIS", 414141, 567890));
        addAccount(new Borrower(name2, "BSIT", "DCIS", 232323, 678901));
        addAccount(new Borrower(name3, "BSBK", "DICC", 343434, 789012));
        addAccount(new Borrower(name4, "BSIT", "DCIS", 545454, 890123));
    }

    public void populateShelves() {
        addBook(new Book("English I", "Literature", "Anderson, Ryan", 2012, 600));
        addBook(new Book("English II", "Literature", "Abrines, Alex", 2012, 600));
        addBook(new Book("Mother Tounge", "Literature", "Acy, Quincy", 2012, 600));
        addBook(new Book("Language II", "Literature", "Adams, Jaylen", 2012, 600));
        addBook(new Book("Language III", "Literature", "Adams, Steven", 2012, 600));
        addBook(new Book("Geometry", "Mathematics", "Knight, Brandon", 2015, 500));
        addBook(new Book("Trigonometry", "Mathematics", "Nowitzki, Dirk", 2015, 500));
        addBook(new Book("Calculus", "Mathematics", "Parker, Tony", 2015, 500));
        addBook(new Book("Calculus 2", "Mathematics", "Thompson, Klay", 2015, 500));
        addBook(new Book("Calculus 3", "Mathematics", "Thompson, Tristan", 2015, 500));
        addBook(new Book("Physics 1", "Science", "Wade, Dwyane", 2013, 1000));
        addBook(new Book("Physics 2", "Science", "Adebayo, Bam", 2013, 1000));
        addBook(new Book("Physics 3", "Science", "Bogut, Andrew", 2013, 1000));
        addBook(new Book("Physics 4", "Science", "Jobs, Steven", 2013, 1000));
        addBook(new Book("Physics 5", "Science", "Clarkson, Jordan", 2013, 1000));
        addBook(new Book("Communication", "Literature", "Derrickson, Marcus", 2011, 300));
        addBook(new Book("Communication 2", "Literature", "Hayward, Gordon", 2011, 300));
        addBook(new Book("Pagbasa", "Filipino", "Curry, Stephen", 2011, 300));
        addBook(new Book("Wika", "Filipino", "Curry, Seth", 2011, 300));
        addBook(new Book("Wika at Kultura 2", "Filipino", "Cousins, DeMarcus", 2011, 300));
        addBook(new Book("Wika at Kultura", "Filipino", "Paul, Chris", 2011, 300));
        addBook(new Book("Java I", "Computer Science", "Lopez, Brook", 2000, 400));
        addBook(new Book("Java II", "Computer Science", "Leonard, Kawhi", 2000, 400));
        addBook(new Book("Java III", "Computer Science", "Wallace, Tyrone", 2000, 400));
        addBook(new Book("Java IIII", "Computer Science", "James, LeBron", 2000, 400));
    }

    public void viewAllBooksByCategory() {
        String lastCategory = "";
        for (int i = 0; i < this.numberOfBooksAdded; ++i) {
            if (!lastCategory.contains(bookShelves[i].getCategory())) {
                lastCategory += bookShelves[i].getCategory();
                viewBooks(bookShelves[i].getCategory());
            }
        }
    }

    public void viewBooks(String category) {
        String display = ("Display all".equals(category)) ? String.format("LIST OF BOOKS\n\n%-18s %-18s %-17s %-24s %-15s %-18s", "TITLE", "AUTHOR", "YEAR PUBLISHED", "CATEGORY", "STATUS", "TO BE RETURNED ON") : String.format("\n%s\n%-18s %-18s %-17s %-15s %-18s", category.toUpperCase() + " CATEGORY\n", "TITLE", "AUTHOR", "YEAR PUBLISHED", "STATUS", "TO BE RETURNED ON");
        System.out.println(display);
        for (int i = 0; i < numberOfBooksAdded; ++i) {
            Book book = bookShelves[i];
            String status, dateToBeReturned;
            if (!book.getIsBorrowed()) {
                status = "available"; dateToBeReturned = "---------";
            } else if(book.isIsReturned()){
                status = "available"; dateToBeReturned = "---------";
            }else {
                status =  "BORROWED"; dateToBeReturned = book.getDuedate().toString();
            }
            String statdisplay = String.format("%-15s %-15s", status,dateToBeReturned);
            String cat = book.getCategory().toLowerCase();
            if (cat.equals(category.toLowerCase())) {
                System.out.println(bookShelves[i].tabularize() + statdisplay);
            } else if (category.equals("Display all")) {
                statdisplay = String.format("%-25s", bookShelves[i].getCategory()) + statdisplay;
                System.out.println(bookShelves[i].tabularize() + statdisplay);
            }
        }
    }

    public void viewBooks() {
        viewBooks("Display all");
    }

    public Book searchBook(String title) {
        Book book = new Book("NO RELATED BOOK FOUND!");
        for (int i = 0; i < numberOfBooksAdded; ++i) {
            if (bookShelves[i].getTitle().equals(title)) {
                return bookShelves[i];
            }
        }
        return book;
    }

    public void searchRelatedBooks(String title) {
        String statdisplay;
        int count = 0;
        String result = String.format("\n%-18s %-18s %-17s %-24s %-17s\n", "TITLE", "AUTHOR", "YEAR PUBLISHED", "CATEGORY", "STATUS");
        for (int i = 0; i < numberOfBooksAdded; ++i) {
            String bookName = bookShelves[i].getTitle().toLowerCase();
            title = title.toLowerCase();
            if (bookName.contains(title) || title.contains(bookName)) {
                String status = (bookShelves[i].getIsBorrowed() == false) ? "available" : "BORROWED";
                statdisplay = String.format("%-24s %-15s\n", bookShelves[i].getCategory(), status);
                result += bookShelves[i].tabularize() + statdisplay;
                ++count;
            }
        }
        System.out.println((count>0)? result:"No related books found!");
    }

    public boolean removeBook(UserAccount user, String title) {
        if (user instanceof Administrator) {
            for (int i = 0; i < numberOfBooksAdded; ++i) {
                if (bookShelves[i].getTitle().equals(title) && bookShelves[i].getIsBorrowed() == false) {
                    for (int j = i; j < numberOfBooksAdded-1; ++j) {
                        bookShelves[j] = bookShelves[j + 1];
                    }
                    --numberOfBooksAdded;
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public boolean borrowBook(UserAccount user, String title) {
        boolean result = false;
        Book book = searchBook(title);
        if (user instanceof Borrower) {
            result = ((Borrower) user).addBookToBorrowedBooksList(book);
        }
        if (result == true) {
            book.setDateBorrowed(dateNow);
            book.setIsBorrowed(true);
            ++numOfBorrowedBooks;
            return true;
        }
        return false;
    }

    public boolean returnBook(UserAccount user, String title) {
        Book book;
        book = searchBook(title);
        if (user instanceof Borrower) {
            book.setIsBorrowed(false);
            --numOfBorrowedBooks;
            boolean result = ((Borrower) user).removeBookToBorrowedBooksList(title);
            this.chargesCollected += (result == true) ? ((Borrower) user).getCharge() : this.chargesCollected;
        }
        return false;
    }

    public boolean returnBook(UserAccount user) {
        if (user instanceof Borrower) {
            numOfBorrowedBooks -= ((Borrower) user).getNumOfBooksBorrowed();
            boolean result = ((Borrower) user).removeBookToBorrowedBooksList();
            this.chargesCollected += (result == true) ? ((Borrower) user).getCharge() : this.chargesCollected;
        }
        return false;
    }

    public void viewUserBorrowedBooks(UserAccount user) {
        if (user instanceof Borrower) {
            System.out.println(((Borrower) user).viewBorrowedBooks());
        }
    }

    public boolean addAccount(UserAccount newAccount) {
        if (NumberOfAccountAdded < maxNumberOfAccounts) {
            this.accounts[NumberOfAccountAdded++] = newAccount;
            return true;
        }
        return false;
    }

    public UserAccount[] getAccounts() {
        return accounts;
    }

    public boolean isRegistered(String name) {
        UserAccount result = new UserAccount();
        for (int i = 0; i < this.NumberOfAccountAdded; ++i) {
            String accountName = accounts[i].getName().getFirstName();
            if (accountName.equals(name)) {
                result = accounts[i];
                return true;
            }
        }
        return false;
    }
    
    public UserAccount searchAccount(String name) {
        UserAccount result = new UserAccount();
        for (int i = 0; i < this.NumberOfAccountAdded; ++i) {
            String accountName = accounts[i].getName().getFirstName();
            if (accountName.equals(name)) {
                result = accounts[i];
                break;
            }
        }
        return result;
    }
    
   
    public UserAccount[] searchRelatedAccount(String name) {
        UserAccount[] result = new UserAccount[1000];
        for (int i = 0; i < this.NumberOfAccountAdded; ++i) {
            String accountName = accounts[i].getName().getFirstName().toLowerCase();
            if (accountName.contains(name.toLowerCase()) || name.toLowerCase().contains(accountName)) {
                result[this.relatedAcountFound++] = accounts[i];
            }
        }
        return result;
    }
        
    public void viewAllBorrower(UserAccount admin) {
        if (admin instanceof Administrator) {
            System.out.printf("LIST OF ALL BORROWER:\n%-30s %-15s %-15s %-20s\n", "NAME", "ID NUMBER", "COURSE", "BORROWED BOOKS");
            for (int i = 0; i < this.NumberOfAccountAdded; ++i) {
                if (accounts[i] instanceof Borrower) {
                    Borrower user = ((Borrower) accounts[i]);
                    System.out.printf("%-30s %-15s %-15s %-20s\n", user.getName(), user.getIdNumber(), user.getCourse(), user.getNumOfBooksBorrowed());
                }
            }
        }
    }

    public void viewAllBorrowedBooks(UserAccount admin) {
        if (admin instanceof Administrator) {
            System.out.printf("LIST OF ALL BORROWED BOOKS\n\n%-18s %-25s %-18s %-18s\n", "TITLE", "BORROWER", "DATE BORROWED", "DUE DATE");
            for (int i = 0; i < this.NumberOfAccountAdded; ++i) {
                if (accounts[i] instanceof Borrower) {
                    Borrower acc = ((Borrower) accounts[i]);
                    if (acc.getNumOfBooksBorrowed() != 0) {
                        for (int j = 0; j < acc.getNumOfBooksBorrowed(); ++j) {
                            Book book = acc.getBooksBorrowed()[j];
                            System.out.printf("%-18s %-25s %-18s %-18s\n", book.getTitle(), acc.getName(), book.getDateBorrowed(), book.getDuedate());
                        }
                    }
                }
            }
            System.out.println("\nTOTAL NUMBER OF BORROWED BOOKS: "+this.numOfBorrowedBooks);
        } else {
            System.out.println("Access not allowed, you are not an administrator!");
        }
    }

    public LocalDate getDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Calendar cal = Calendar.getInstance();
        return cal.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }
}

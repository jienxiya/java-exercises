
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;
import java.util.Arrays;

//import java.text.SimpleDateFormat;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.util.Calendar;
//import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Renan Bargaso|Mary Jane Paller|Lealyn Eulin|Princess Duran
 */
public class Main {

    public static void main(String[] args) {
        Scanner intInput = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);
        Library a = new Library();
        Borrower b = new Borrower();
        a.populateAccountList();
        a.populateShelves();
        int numberInput, userName, passCode;
        System.out.println("--------------------------Learning Resource Center-----------------------\n");
        while (true) {
            System.out.print("--------------------------\n|ID Number: ");
            userName = intInput.nextInt();
            System.out.print("|PassCode: ");
            passCode = intInput.nextInt();
            System.out.println("--------------------------");
            UserAccount user = null;
            String verif = "Account Doesn't Exist";
            String categ, title, category, author = "";
            int year = 0;
            int noPage = 0;
            for (int i = 0; i < a.getAccounts().length; ++i) {
                if (a.getAccounts()[i] != null) {
                    if (a.getAccounts()[i].getIdNumber() == userName && a.getAccounts()[i].getPin() == passCode) {
                        verif = "Account Verified!";
                        user = a.getAccounts()[i];
                    }
                };
            }
            if (verif == "Account Verified!") {
                if (user instanceof Administrator) {
                    while (true) {
                        System.out.println("\n\t" + verif + "\n");
                        System.out.println("\t1 >>> addBook() \n\t"
                                + "2 >>> viewAllBooksByCategory() \n\t"
                                + "3 >>> viewBooksByCategory() \n\t"
                                + "4 >>> viewAllBooks() \n\t"
                                + "5 >>> searchBook()\n\t"
                                + "6 >>> searchRelatedBooks() \n\t"
                                + "7 >>> removeBook()\n\t"
                                + "8 >>> searchAccount()\n\t"
                                + "9 >>> viewAllBorrower()\n\t"
                                + "0 >>> addAccount()\n\t"
                                + "11 >>> Log Out\n");
                        System.out.print("Input Your Choice: ");
                        numberInput = intInput.nextInt();
                        switch (numberInput) {
                            case 1:
                                System.out.print("Book Title: ");
                                title = stringInput.nextLine();
                                System.out.print("Book Category: ");
                                category = stringInput.nextLine();
                                System.out.print("Book Author: ");
                                author = stringInput.nextLine();
                                System.out.print("Book Year Publish: ");
                                year = intInput.nextInt();
                                System.out.print("Book Number of Pages: ");
                                noPage = intInput.nextInt();
                                a.addBook(new Book(title, category, author, year, noPage));
                                break;
                            case 2:
                                a.viewAllBooksByCategory();
                                break;
                            case 3:
                                System.out.print("Input Category: ");
                                categ = stringInput.nextLine();
                                a.viewBooks(categ);
                                break;
                            case 4:
                                a.viewBooks();
                                break;
                            case 5:
                                System.out.print("Input Title: ");
                                categ = stringInput.nextLine();
                                System.out.println(a.searchBook(categ));
                                break;
                            case 6:
                                System.out.print("Input Title: ");
                                categ = stringInput.nextLine();
                                a.searchRelatedBooks(categ);
                                break;
                            case 7:
                                System.out.print("Input Title: ");
                                categ = stringInput.nextLine();
                                a.removeBook(user, categ);
                                break;
                            case 8:
                                System.out.print("Input First Name: ");
                                categ = stringInput.nextLine();
                                System.out.println(a.searchAccount(categ));
                                break;
                            case 9:
                                a.viewAllBorrower(user);
                                break;
                            case 0:
                                System.out.print("Input First Name: ");
                                author = stringInput.nextLine();
                                System.out.print("Input Middle Name: ");
                                title = stringInput.nextLine();
                                System.out.print("Input Last Name: ");
                                category = stringInput.nextLine();
                                System.out.print("Input ID Number: ");
                                year = intInput.nextInt();
                                System.out.print("Input Pin: ");
                                noPage = intInput.nextInt();
                                a.addAccount(new UserAccount(new Name(author, title, category), noPage, year));
                                break;
                        }
                        if (numberInput == 11) {
                            break;
                        }
                    }
                } else {
                    while (true) {
                        System.out.println("\n\t" + verif + "\n");
                        System.out.println("\t1. >>> viewAllBooksByCategory() \n\t"
                                + "2. >>> viewBooksByCategory() \n\t"
                                + "3. >>> viewBooks() \n\t"
                                + "4. >>> searchBook(String title)\n\t"
                                + "5. >>> searchRelatedBooks()\n\t"
                                + "6. >>> borrowBook()\n\t"
                                + "7. >>> returnSpecificBook()\n\t"
                                + "8. >>> returnAllBook()\n\t"
                                + "9. >>> viewBorrowedBooks()\n\t"
                                + "10. >>> Log Out\n");
                        System.out.print("Input Your Choice: ");
                        numberInput = intInput.nextInt();
                        switch (numberInput) {
                            case 1:
                                a.viewAllBooksByCategory();
                                break;
                            case 2:
                                System.out.print("Input Category: ");
                                categ = stringInput.nextLine();
                                a.viewBooks(categ);
                                break;
                            case 3:
                                a.viewBooks();
                                break;
                            case 4:
                                System.out.print("Input Title: ");
                                categ = stringInput.nextLine();
                                System.out.println(a.searchBook(categ));
                                break;
                            case 5:
                                System.out.print("Input Title: ");
                                categ = stringInput.nextLine();
                                a.searchRelatedBooks(categ);
                                break;
                            case 6: 
                                System.out.print("Input Title: ");
                                categ = stringInput.nextLine();
                                a.borrowBook(user, categ);
                                break;
                            case 7: 
                                System.out.print("Input Title: ");
                                categ = stringInput.nextLine();
                                a.returnBook(user, categ);
                                System.out.println("Return Success!");
                                break;
                            case 8:
                                a.returnBook(user);
                                break;
                            case 9:
                                b.viewBorrowedBooks();
                                break;
                        }
                        if (numberInput == 10) {
                            break;
                        }
                    }
                }
            } else {
                System.out.println(verif);
            }
            System.out.println("Would Like to Continue?\n1 >>> YES\n0 >>>NO");
            System.out.print("Make Choice: ");
            year = stringInput.nextInt();
            if(year == 1){
                continue;
            }else{
                break;
            }
        }
    }
}

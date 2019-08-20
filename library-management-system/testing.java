
import java.util.Arrays;
import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1styrGroupA
 */
public class testing {
    public static void main(String[] args){
//        userAccount[] : accounts;
//        accounts = administrator,borrower;
        UserAccount[] accounts = new UserAccount[3];
        UserAccount a = new UserAccount();
        
        a = new Administrator(new Name("Renan","Cañete","Bargaso"));
        accounts[0]=a;
        
        a = new Borrower(new Name("Mary Jane","Cajes","Paller"));
        accounts[1]=a;
        
        System.out.println(Arrays.toString(accounts));
        
        
    }
}

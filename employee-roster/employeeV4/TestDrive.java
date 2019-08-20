/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeV4;

import employeeV3.*;
import java.util.Arrays;

/**
 *
 * @author pallerma_sd1022
 */
public class TestDrive {

    public static void main(String[] args) {
        EmployeeRoster n = new EmployeeRoster();
        Employee e = new Employee();
        Employee he = new HourlyEmployee(45, 100, 1, "Mary Jane", "PN", "05/05/19", "12/29/99");
        n.addEmployee(he);
        he.computeSalary();
        
        Employee pwe = new PieceWorkerEmployee(110, 20, 2, "Lealyn", "Accenture", "09/18/99", "06/06/19");
        n.addEmployee(pwe);
        pwe.computeSalary();
        
        Employee ce = new CommissionEmployee(15000, 3, "Princess Joy", "JPMorgan", "07/17/00", "07/07/19");
        n.addEmployee(ce);
        ce.computeSalary();        
        
        Employee bpce = new BasedPlusCommissionEmployee(500, 1000, 4, "Mary Grace", "Knowles", "12/29/99", "08/08/19");
        n.addEmployee(bpce);
        bpce.computeSalary();
        
        Employee jude = new HourlyEmployee(45, 100, 5, "Maria Judelyn", "PN", "05/05/19", "12/29/99");
        n.addEmployee(jude);
        jude.computeSalary();
        
        Employee bel = new PieceWorkerEmployee(110, 20, 10, "Mibel", "Accenture", "09/18/99", "06/06/19");
        n.addEmployee(bel);
        bel.computeSalary();
        
        Employee mon = new CommissionEmployee(15000, 9, "Monica", "JPMorgan", "07/17/00", "07/07/19");
        n.addEmployee(mon);
        mon.computeSalary();        
        
        Employee vie = new BasedPlusCommissionEmployee(500, 1000, 8, "Marvie", "Knowles", "12/29/99", "08/08/19");
        n.addEmployee(vie);
        vie.computeSalary();
        
        Employee men = new CommissionEmployee(15000, 7, "Sharmen", "JPMorgan", "07/17/00", "07/07/19");
        n.addEmployee(men);
        men.computeSalary();        
        
        Employee mar = new BasedPlusCommissionEmployee(500, 1000, 6, "Marie", "Knowles", "12/29/99", "08/08/19");
        n.addEmployee(mar);
        mar.computeSalary();

//        n.summary();
//        n.populate();
//        n.sortById();
        n.searchEmp("Marie");
//        n.displayEmpList();
//        System.out.println(Arrays.toString(n.getEmpList()));
//        System.out.println(n.countBasedPlusCommissionEmployee());
//        System.out.println(n.countCommissionEmployee());
//        System.out.println(n.countHourlyEmployee());
//        System.out.println(n.countPieceWorkerEmployee());



    }
}

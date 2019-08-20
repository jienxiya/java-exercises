/*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
 */
package employeeV4;

import employeeV3.*;

/**
 *
 * @author pallerma_sd1022
 */
public class EmployeeRoster {

    private Employee[] empList;
    private int count = 0;
    private int max;

    public EmployeeRoster() {
        this(10);
    }

    public EmployeeRoster(int max) {
        this.max = max;
        empList = new Employee[this.max];
    }

    //Getters
    public Employee[] getEmpList() {
        return empList;
    }

    public int getCount() {
        return count;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setEmpList(Employee[] empList) {
        this.empList = empList;
    }

    public boolean addEmployee(Employee e) {
        empList[count] = e;
        ++count;
        if (empList[count - 1] != null) {
            return true;
        }
        return false;
    }

    public Employee removeEmployee(int id) {
        Employee name = new Employee();
        for (int i = 0; i < empList.length; ++i) {
            if (empList[i].getId() == id) {
                name = empList[i];
                empList[i] = null;
            } else {
                return name;
            }
        }
        return name;
    }

    public Employee removeEmployee(String name) {
        Employee empName = new Employee();
        for (int i = 0; i < empList.length; ++i) {
            if (name == empList[i].getName()) {
                empName = empList[i];
                empList[i] = null;
            } else {
                return empName;
            }
        }
        return empName;
    }

    public int countHourlyEmployee() {
        int count = 0;

        for (int i = 0; i < empList.length; i++) {
            if (empList[i] instanceof HourlyEmployee) {
                count++;
            }
        }

        return count;
    }

    public int countPieceWorkerEmployee() {
        int count = 0;

        for (int i = 0; i < empList.length; i++) {
            if (empList[i] instanceof PieceWorkerEmployee) {
                count++;
            }
        }
        return count;
    }

    public int countCommissionEmployee() {
        int count = 0;

        for (int i = 0; i < empList.length; i++) {
            if (empList[i] instanceof CommissionEmployee) {
                count++;
            }
        }
        return count;
    }

    public int countBasedPlusCommissionEmployee() {
        int count = 0;

        for (int i = 0; i < empList.length; i++) {
            if (empList[i] instanceof BasedPlusCommissionEmployee) {
                count++;
            }
        }
        return count;
    }

    public void summary() {
        int i;

        System.out.printf("%20s | %30s | %10s\n", "NAME", "TYPE", "SALARY");

        for (i = 0; i < count; ++i) {
            System.out.printf("%20s | %30s | %10s\n", empList[i].getName(), empList[i].getClass().getSimpleName(), empList[i].computeSalary());
        }
    }

    public void populate() {
        addEmployee(new HourlyEmployee(45, 100, 001, "Mary Jane", "PN", "05/05/19", "12/29/99"));
        addEmployee(new PieceWorkerEmployee(110, 20, 001, "Lealyn", "Accenture", "09/18/99", "06/06/19"));
        addEmployee(new CommissionEmployee(15000, 003, "Princess Joy", "JPMorgan", "07/17/00", "07/07/19"));
        addEmployee(new BasedPlusCommissionEmployee(500, 1000, 004, "Mary Grace", "Knowles", "12/29/99", "08/08/19"));
    }

    public void displayEmpList() {
        for (int i = 0; i < count; i++) {
            System.out.println(empList[i]);
        }
    }

/////////////////////////////////////////////////////////////////////////////////////
    public Employee[] sortById() {
        int n = empList.length;
        Employee temp = new Employee();
        for (int i = 0; i < n; i++) {
            if (empList[i] != null) {
                for (int j = 1; j < (n - i); j++) {
                    if (empList[j - 1].getId() > empList[j].getId()) {
                        temp = empList[j - 1];
                        empList[j - 1] = empList[j];
                        empList[j] = temp;
                    }
                }
            } else {
                return empList;
            }
        }
        return empList;
    }

    public int searchEmp(int id) {
        int index = -1;
        for (int i = 0; i < empList.length; i++) {
            if (empList[i].getId() == id) {
                index = i;
                break;
            }
        }
        return index;
    }

    public int searchEmp(String name) {
        int index = -1;
        for (int i = 0; i < empList.length; i++) {
            if (empList[i].getName() == name) {
                index = i;
                break;
            }
        }
        return index;
    }

}

package bai10_TongHop.run;

import bai10_TongHop.desgine.Method;
import bai10_TongHop.deshineIPL.DepartmenIPL;
import bai10_TongHop.deshineIPL.EmployeeIPL;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManageDepartment manageDepartment = new ManageDepartment();
        ManageEmployee manageEmployee = new ManageEmployee();
        Scanner sc = new Scanner(System.in);
      out:  while (true) {
        System.out.println("1\tQuản trị phòng ban \n" +
                "2\tQuản trị nhân viên\n");
        int choose = Integer.parseInt(sc.nextLine());

            switch (choose) {
                case 2:
                    manageEmployee.displayMenu();
                    break;
                case 1:
                    manageDepartment.displayMenu();
                    break;
                case 3:
                    break out;
            }
        }
    }
}

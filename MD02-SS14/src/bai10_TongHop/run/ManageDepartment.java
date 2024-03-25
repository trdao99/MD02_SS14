package bai10_TongHop.run;

import bai10_TongHop.desgine.Dmethod;
import bai10_TongHop.desgine.Method;
import bai10_TongHop.deshineIPL.DepartmenIPL;

import java.util.Scanner;

public class ManageDepartment {
    public static Dmethod departmenMethod = new DepartmenIPL();

    public static void displayMenu() {
        Scanner sc = new Scanner(System.in);
      out:  while (true) {
            System.out.println("-\tQuản trị phòng ban : \n" +
                    "1\tHiển thị danh sách phòng ban\n" +
                    "2\tThêm mới phòng ban\n" +
                    "3\tChỉnh sửa phòng ban\n" +
                    "4\tHiển thị danh sách nhân viên của phòng ban theo mã phòng\n" +
                    "5\tXóa phòng ban (chỉ xóa khi ko có nhân viên nào)\n"
            );
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    departmenMethod.display();
                    break;
                case 2:
                    departmenMethod.add();
                    break;
                case 3:
                    departmenMethod.edit();
                    break;
                case 4:
                    departmenMethod.ShowEmploy();
                    break;
                case 5:
                    departmenMethod.delete();
                    break;
                case 6:
                    break out;
            }
        }
    }
}

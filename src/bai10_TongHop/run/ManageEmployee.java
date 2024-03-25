package bai10_TongHop.run;

import bai10_TongHop.desgine.Emethod;
import bai10_TongHop.desgine.Method;
import bai10_TongHop.deshineIPL.EmployeeIPL;

import java.util.Scanner;

public class ManageEmployee {
    public static Emethod employeeMethod = new EmployeeIPL();

    public static void displayMenu() {
        Scanner sc = new Scanner(System.in);
        out:    while (true) {
            System.out.println("-\tQuản trị nhân viên\n" +
                    "1\tHIển thị danh sách thông tin tất cả nhân viên(mã nhân viên và tên)\n" +
                    "2\tXem chi tiết thông tin nhân viên theo mã nhân viên (toàn bộ thông tin)\n" +
                    "3\tThêm mới nhân viên\n" +
                    "4\tChỉnh sửa thông tin nhân viên\n" +
                    "5\tXóa nhân viên \n" +
                    "6\tThống kê số lượng nhân viên trung bình của mỗi phòng \n" +
                    "7\tTìm ra 5 phòng có số lượng nhân viên đông nhất\n" +
                    "8\tTìm ra người quản lý nhiều  nhân viên nhất\n" +
                    "9\tTìm ra 5 nhân viên có tuổi cao nhất công ty\n" +
                    "10\tTìm ra 5 nhân viên hưởng lương cao nhất");
            int choose = Integer.parseInt(sc.nextLine());
           switch (choose) {
                case 1:
                    employeeMethod.display();
                    break;
                case 2:
                    employeeMethod.FindBaseonID();
                    break;
                case 3:
                    employeeMethod.add();
                    break;
                case 4:
                    employeeMethod.edit();
                    break;
                case 5:
                    employeeMethod.delete();
                    break;
                case 6:
                    break out;
            }
        }
    }
}

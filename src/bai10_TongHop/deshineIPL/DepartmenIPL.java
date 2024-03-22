package bai10_TongHop.deshineIPL;

import bai10_TongHop.Department;
import bai10_TongHop.desgine.Method;
import bai10_TongHop.config.InputMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DepartmenIPL implements Method {
    public static List<Department> departmentList = new ArrayList<>();

    public Department input() {
        Department departmentNew = new Department();
        System.out.println("Nhập tên :");
        departmentNew.setDepartmentName(InputMethods.getString());
        System.out.println("Nhập id :");
        departmentNew.setDepartmentId(InputMethods.getString());
        return departmentNew;
    }

    @Override
    public void add() {
        System.out.println("nhập số phòng ban muốn thêm:");
        byte count = InputMethods.getByte();
        for (int i = 1; i <= count; i++) {
            System.out.println("Nhập thông tin cho văn phòng thứ " + i);
            Department department = input();
            // thêm vào list
            departmentList.add(department);
        }
        System.out.println("Đa thêm thanh công " + count + " phòng ban");
    }

    @Override
    public void display() {
        departmentList.stream().forEach(System.out::println);
    }

    @Override
    public void edit() {
        Scanner sc =new Scanner(System.in);
        System.out.println("nhập ID phòng ban muốn thay đổi");
        String id = sc.nextLine();
        for (Department d : departmentList){
            if (d.getDepartmentId().equals(id)){
               d =  input();
            }
        }
    }

    @Override
    public void delete() {
    
    }
}

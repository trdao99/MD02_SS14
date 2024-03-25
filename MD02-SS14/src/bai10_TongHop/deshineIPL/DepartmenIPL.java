package bai10_TongHop.deshineIPL;

import bai10_TongHop.desgine.Dmethod;
import bai10_TongHop.entity.Department;
import bai10_TongHop.desgine.Method;
import bai10_TongHop.config.InputMethods;
import bai10_TongHop.entity.Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import static bai10_TongHop.deshineIPL.EmployeeIPL.employeeList;

public class DepartmenIPL implements Dmethod {
    public static List<Department> departmentList = new ArrayList<>();

    @Override
    public void add() {
        System.out.println("nhập số phòng ban muốn thêm:");
        byte count = InputMethods.getByte();
        for (int i = 1; i <= count; i++) {
            System.out.println("Nhập thông tin cho văn phòng thứ " + i);
            Department department = new Department();
            department.inputData(departmentList);
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
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập ID phòng ban muốn thay đổi");
        String id = sc.nextLine();
        for (Department d : departmentList) {
            if (d.getDepartmentId().equals(id)) {
                d.inputData(departmentList);
            }
        }
    }

    @Override
    public void delete() {
        List<Department> departmentsToRemove = new ArrayList<>();
        for (Department department : departmentList) {
            boolean hasEmployee = false;
            for (Employee employee : employeeList) {
                if (employee.getDepartment().equals(department)) {
                    hasEmployee = true;
                    break;
                }
            }
            if (!hasEmployee) {
                departmentsToRemove.add(department);
            }
        }

        for (Department department : departmentsToRemove) {
            departmentList.remove(department);
            System.out.println("Đã xóa phòng ban có ID " + department.getDepartmentId());
        }
    }

    @Override
    public void ShowEmploy() {
        for (Department department : departmentList) {
            String departmentId = department.getDepartmentId();
            System.out.println("Danh sách nhân viên của phòng ban có mã phòng " + departmentId + ":");
            employeeList.stream()
                    .filter(employee -> employee.getDepartment().getDepartmentId().equals(departmentId))
                    .forEach(System.out::println);
            System.out.println();
        }
    }
}


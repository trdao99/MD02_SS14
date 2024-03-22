package bai10_TongHop.deshineIPL;

import bai10_TongHop.Department;
import bai10_TongHop.config.InputMethods;
import bai10_TongHop.desgine.Method;
import bai10_TongHop.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static bai10_TongHop.deshineIPL.DepartmenIPL.departmentList;

public class EmployeeIPL implements Method {

    public static List<Employee> employeeList = new ArrayList<>();

    @Override
    public void add() {
        System.out.println("Nhập số nhân viên muốn thêm:");
        byte count = InputMethods.getByte();
        for (int i = 1; i <= count; i++) {
            System.out.println("Nhập thông tin cho nhân viên thứ " + i);
            Employee employee = input();
            // Thêm vào list
            employeeList.add(employee);
        }
        System.out.println("Đã thêm thành công " + count + " nhân viên");
    }

    @Override
    public void display() {
        employeeList.forEach(System.out::println);
    }

    @Override
    public void edit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ID nhân viên muốn thay đổi:");
        String id = sc.nextLine();
        for (Employee d : employeeList) {
            if (d.getEmployeeId().equals(id)) {
                System.out.println("Nhập thông tin mới cho nhân viên:");
                Employee newEmployee = input();
                // Update the properties of the employee
                d.setEmployeeName(newEmployee.getEmployeeName());
                d.setBirthday(newEmployee.getBirthday());
                d.setSex(newEmployee.isSex());
                d.setSalary(newEmployee.getSalary());
                System.out.println("Cập nhật thành công");
                break;
            }
        }
    }

    @Override
    public void delete() {
        System.out.println("Nhập ID của nhân viên cần xóa:");
        int idDel = InputMethods.getInteger();
        boolean found = false;
        for (Employee d : employeeList) {
            if (d.getEmployeeId().equals(String.valueOf(idDel))) {
                employeeList.remove(d);
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Xóa thành công");
        } else {
            System.out.println("Không tìm thấy nhân viên");
        }
    }

    public Employee input() {
        Employee employeeNew = new Employee();
        System.out.println("Nhập tên:");
        employeeNew.setEmployeeName(InputMethods.getString());
        System.out.println("Nhập ID:");
        employeeNew.setEmployeeId(InputMethods.getString());
        System.out.println("Nhập dob:");
        employeeNew.setBirthday(InputMethods.getDate());
        System.out.println("Nhập gender (true/false):");
        employeeNew.setSex(InputMethods.getBoolean());
        System.out.println("Nhập Salary:");
        employeeNew.setSalary(InputMethods.getDouble());
        Scanner sc = new Scanner(System.in);
        departmentList.forEach(System.out::println);
        System.out.println("Chọn ID phòng ban:");
        String id = sc.nextLine();
        for (Department d : departmentList) {
            if (d.getDepartmentId().equals(id)) {
                employeeNew.setDepartment(d);
                break;
            }
        }
        return employeeNew;
    }
}
package bai10_TongHop.deshineIPL;

import bai10_TongHop.desgine.Emethod;
import bai10_TongHop.config.InputMethods;
import bai10_TongHop.entity.Department;
import bai10_TongHop.entity.Employee;


import java.time.Duration;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

import static bai10_TongHop.deshineIPL.DepartmenIPL.departmentList;

public class EmployeeIPL implements Emethod {

    public static List<Employee> employeeList = new ArrayList<>();

    @Override
    public void add() {
        System.out.println("Nhập số nhân viên muốn thêm:");
        byte count = InputMethods.getByte();
        for (int i = 1; i <= count; i++) {
            System.out.println("Nhập thông tin cho nhân viên thứ " + i);
            Employee employee = new Employee();
            employee.inputData(employeeList, departmentList);
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
                Employee newEmployee = new Employee();
                newEmployee.inputData(employeeList, departmentList);
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

    @Override
    public void calculateAverageEmployees() {
        System.out.println("số lượng nhân viên trung bình: " + (employeeList.size() / departmentList.size()));
//        int totalEmployees = 0;
//        for (Department department : departmentList) {
//            String departmentId = department.getDepartmentId();
//            long employeeCount = employeeList.stream()
//                    .filter(employee -> employee.getDepartment().getDepartmentId().equals(departmentId))
//                    .count();
//            totalEmployees += employeeCount;
//            System.out.println(totalEmployees);
//        }
    }

    public void FindBaseonID() {
        System.out.println("Nhập ID của nhân viên muuốn xem:");
        String findID = InputMethods.getString();
        employeeList.stream().filter(v -> v.getEmployeeId().equals(findID)).forEach(System.out::println);
    }

//        int max = departmentList.stream().mapToInt(Department::getTotalMembers).filter(department -> department >= 0).max().orElse(0);
//        departmentList.stream()
//                .filter(department -> department.getTotalMembers() == max)
//                .forEach(department -> System.out.println(department + " (max)"));

    @Override
    public void findCrowdestRoom() {
        List<Department> sortedDepartments = departmentList.stream()
                .sorted(Comparator.comparingInt(Department::getTotalMembers).reversed())
                .collect(Collectors.toList());

        System.out.println("5phòng nhièu nhân viên nhất:");
        for (int i = 0; i < 5; i++) {
            System.out.println(sortedDepartments.get(i));
        }
    }


    public void findMostManager() {
     
    }

    @Override
    public void _5OldestPP() {
        // Lấy ngày hiện tại
        LocalDate currentDate = LocalDate.now();


        // Lặp qua danh sách nhân viên
        for (Employee employee : employeeList) {
            // Tính toán thời gian từ ngày sinh đến ngày hiện tại
            Duration duration = Duration.between(employee.getBirthday().atStartOfDay(), currentDate.atStartOfDay());


        }
    }
}
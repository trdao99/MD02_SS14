package bai10_TongHop.entity;

import bai10_TongHop.config.InputMethods;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

import static bai10_TongHop.deshineIPL.EmployeeIPL.employeeList;

public class Employee {
    private String employeeId;
    private String employeeName;
    private LocalDate birthday;
    private boolean sex;
    private double salary;
    private Employee manager;
    private Department department;

    public Employee(String employeeId, String employeeName, LocalDate birthday, boolean sex, double salary, Employee manager, Department department) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.birthday = birthday;
        this.sex = sex;
        this.salary = salary;
        this.manager = manager;
        this.department = department;
    }

    public Employee() {
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department d) {
        this.department = department;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public void inputData(List<Employee> employeeList, List<Department> departmentList){
        this.employeeId = getInputEmployeeId(employeeList);
        this.employeeName = getInputEmployeeName();
        this.birthday = getInputBirthDay();
        System.out.println("nhập lương nhân viên");
        this.salary = new Scanner(System.in).nextDouble();
        System.out.println("nhập giới tính(true/false)");
        this.sex=new Scanner(System.in).nextBoolean();
        System.out.println("có chon quản lí hay không ?");
        System.out.println("1. Có");
        System.out.println("2. Không");
        while (true){
            System.out.println("Nhap lựa chọn");
            byte choice = new Scanner(System.in).nextByte();
            switch (choice){
                case 1:
                    this.manager= getInputManager(employeeList);
                    break;
                case 2:
                    break;
                default:
                    System.err.println("ko hợp lệ, nhập la");
            }
            if (choice==1 || choice ==2){
                break;
            }
        }
        this.department = getInputDepartment(departmentList);


    }
    private String getInputEmployeeId(List<Employee> employeeList){
        final String regex= "^E\\w{4}$";
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Nhập vào mã nhân viên");
            String employeeIdInput = sc.nextLine();
            if (employeeIdInput.matches(regex)){
                // đúng định dạng -> kiểm tra trùng lặp
                if (employeeList.stream().noneMatch(t->t.getEmployeeId().equals(employeeIdInput))){
                    // trùng lặp
                    return employeeIdInput;
                }
                System.err.println("Id đã tồn tại, vui long nhập giá trị khác");
            }else {
                System.err.println("Không đúng định dạng (E____)");
            }
        }
    }
    public static final DateTimeFormatter DTF = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate getInputBirthDay(){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Nhập vào ngày sinh dd/MM/yyyy");
            String employeeDateInput = sc.nextLine();
            try {
                return LocalDate.parse(employeeDateInput,DTF);
            }catch (DateTimeParseException e){
                System.err.println("Koong dung dinh dang");
            }
        }
    }
    private Department getInputDepartment(List<Department> departmentList){
        Scanner sc = new Scanner(System.in);
        // hiển thị danh sách phòng ban
        System.out.println("Danh sach phòng ban");
        for (int i = 0; i < departmentList.size(); i++) {
            System.out.printf("| STT : %d | Name : %-15s |\n",i+1,departmentList.get(i).getDepartmentName());
        }
        while (true){
            System.out.println("Nhập vào vị trí phòng ban (theo STT)");
            int index = sc.nextInt();
            if (index>=1 && index<= departmentList.size()){
                departmentList.get(index-1).setTotalMembers( departmentList.get(index-1).getTotalMembers()+1);
                return departmentList.get(index-1);
            }
            System.err.println("Vi tri nhap khong hơp lẹ, vui lòng chọn lại");
        }
    }
    private Employee getInputManager(List<Employee> managerList){
        Scanner sc = new Scanner(System.in);
        // hiển thị danh sách người quan lí
        System.out.println("Danh sach quan li");
        for (int i = 0; i < managerList.size(); i++) {
            System.out.printf("| STT : %d | Name : %-15s |\n",i+1,managerList.get(i).employeeName);
        }

        while (true){
            System.out.println("Nhập vào quản lí của nhân viên (theo STT)");
            int index = sc.nextInt();
            if (index>=1 && index<= managerList.size()){
                return managerList.get(index-1);
            }
            System.err.println("Vi tri nhap khong hơp lẹ, vui lòng chọn lại");
        }
    }
    private String getInputEmployeeName(){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Nhập vào tên nhân veen");
            String departmentNameInput = sc.nextLine();
            if (!departmentNameInput.isBlank()){
                return departmentNameInput;
            }else {
                System.err.println("Không được để trống");
            }
        }
    }


    @Override
    public String toString()
    {return "|ID : "+employeeId+" | fullName : "+employeeName+"  | birthday : "+ InputMethods.sdf.format(birthday)+"\n"
            +"|Sex : "+(sex?"nam":"nữ")+" | salary : "+salary+" | manager: "+ manager+ " |department : "+department;
    }
}

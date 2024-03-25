package bai10_TongHop.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Department {
   private String DepartmentId;
   private String DepartmentName;
   private int totalMembers ;

    public Department(String departmentId, String departmentName, int totalMembers) {
        DepartmentId = departmentId;
        DepartmentName = departmentName;
        this.totalMembers = totalMembers;
    }

    public Department() {
    }

    public String getDepartmentId() {
        return DepartmentId;
    }

    public void setDepartmentId(String departmentId) {
        DepartmentId = departmentId;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }

    public int getTotalMembers() {
        return totalMembers;
    }

    public void setTotalMembers(int totalMembers) {
        this.totalMembers = totalMembers;
    }

    public void inputData(List<Department> departmentList){
        this.DepartmentId = getInputDepartmentId(departmentList);
        this.DepartmentName = getInputDepartmentName(departmentList);
    }
    private String getInputDepartmentId(List<Department> departmentList){
        final String regex= "^D\\w{3}$";
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Nhập vào mã phòng ban");
            String departmentIdInput = sc.nextLine();
            if (departmentIdInput.matches(regex)){
                // đúng định dạng -> kiểm tra trùng lặp
                if (departmentList.stream().noneMatch(t->t.getDepartmentId().equals(departmentIdInput))){
                    // trùng lặp
                    return departmentIdInput;
                }
                System.err.println("Id đã tồn tại, vui long nhập giá trị khác");
            }else {
                System.err.println("Không đúng định dạng (D___)");
            }
        }
    }
    private String getInputDepartmentName(List<Department> departmentList){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Nhập vào tên phòng ban");
            String departmentNameInput = sc.nextLine();
            if (!departmentNameInput.isBlank()){
                // đúng định dạng -> kiểm tra trùng lặp
                if (departmentList.stream().noneMatch(t->t.getDepartmentName().equals(departmentNameInput))){
                    // trùng lặp
                    return departmentNameInput;
                }
                System.err.println("Tên đã tồn tại, vui long nhập giá trị khác");
            }else {
                System.err.println("Không được để trống");
            }
        }
    }
    @Override
    public String toString() {
        return "|ID : "+getDepartmentId()+" | Name : "+getDepartmentName()+
                "\n --------------------------------------------------------";
    }
}

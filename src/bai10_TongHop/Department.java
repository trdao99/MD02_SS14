package bai10_TongHop;

public class Department {
   private String DepartmentId;
   private String DepartmentName;
   private int totalMembers;

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

    @Override
    public String toString() {
        return super.toString();
    }
}

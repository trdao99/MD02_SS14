package bai10_TongHop.entity;

import bai10_TongHop.deshineIPL.EmployeeIPL;

import java.time.LocalDate;

import static bai10_TongHop.deshineIPL.EmployeeIPL.employeeList;

public class Manager extends Employee{
    public int totalManager;

    public Manager(String employeeId, String employeeName, LocalDate birthday, boolean sex, double salary, Employee manager, Department department, int totalManager) {
        super(employeeId, employeeName, birthday, sex, salary, manager, department);
        this.totalManager = totalManager;
    }

    public Manager(int totalManager) {
        this.totalManager = totalManager;
    }

    public int getTotalManager() {
        return totalManager;
    }

    public void setTotalManager(int totalManager) {
        this.totalManager = totalManager;
    }
    static int count = 0;

}

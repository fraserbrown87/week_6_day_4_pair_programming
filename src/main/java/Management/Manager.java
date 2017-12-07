package Management;

import Staff.Employee;

public class Manager extends Employee{

    String deptName;

    public Manager(String name, String NINumber, int salary, String deptName) {
        super(name, NINumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}

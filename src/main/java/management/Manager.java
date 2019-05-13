package management;

import staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, double salary, String nino, String deptName){
        super(name, salary, nino);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}

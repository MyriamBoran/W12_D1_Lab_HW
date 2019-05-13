package staff;

public abstract class Employee {
    private String name;
    private double salary;
    private String nino;

    public Employee(String name, double salary, String nino){
        this.name = name;
        this.salary = salary;
        this.nino = nino;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {

        return salary;
    }

    public String getNino() {
        return nino;
    }

    public double increaseSalary(double amount){
        if (amount > 0) {
            return salary * amount;
        }
        return 0;
    }

    public double payBonus(){
        return salary / 100;
    }
}

package management;

public class Director extends Manager {

    private double budget;

    public Director (String name, double salary, String nino, String deptName, double budget) {
        super(name, salary, nino, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }
}

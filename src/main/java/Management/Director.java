package Management;

public class Director extends Manager{

    private int budget;

    public Director(String name, String NINumber, int salary, String deptName, int budget) {
        super(name, NINumber, salary, deptName);
        this.budget = budget;
    }

    public int getBudget(){
        return this.budget;
    }

    public int payBonus(){
        int bonus = this.salary / 50;
        return bonus;
    }
}

package Staff;



public class Employee {

    private String name;
    private String NINumber;
    public int salary;

    public Employee(String name, String NINumber, int salary){
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNINumber() {
        return NINumber;
    }

    public void setNINumber(String NINumber) {
        this.NINumber = NINumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public void raiseSalary(double inputRaise){
            this.salary *= inputRaise;
    }


    public int payBonus(){
        int bonus = this.salary / 100;
        return bonus;
    }

}

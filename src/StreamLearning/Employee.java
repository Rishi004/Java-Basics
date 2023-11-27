package StreamLearning;

public class Employee {
    private String name;
    private int empId, exp, salary;

    public Employee(String name, int empId, int exp, int salary) {
        this.name = name;
        this.empId = empId;
        this.exp = exp;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                ", exp=" + exp +
                ", salary=" + salary +
                '}';
    }
}

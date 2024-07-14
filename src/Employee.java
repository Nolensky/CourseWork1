import java.util.Objects;

public class Employee {
    private final String fullName;
    private int department;
    private int salary;
    private final int id;

    private static int counter;

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = ++counter;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null || getClass() != otherObject.getClass()) return false;
        Employee otherEmployee = (Employee) otherObject;
        return  id == otherEmployee.id && fullName.equals(otherEmployee.fullName) && department == otherEmployee.department && salary == otherEmployee.salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, department, salary, id);
    }

    @Override
    public String toString() {
        return "Id:" + id + " Сотрудник: " + fullName + ", Отдел: " + department + ", Зарплата: " + salary;
    }
}

public class Main {
    public static void main(String[] args) {
        EmployeeBook Book = new EmployeeBook();

        Employee employee1 = new Employee("Иванов Александр Иванович", 4, 20000);
        Book.addToList(employee1);

        Employee employee2 = new Employee("Сулимов Алексей Васильевич", 4, 11000);
        Book.addToList(employee2);

        Employee employee3 = new Employee("Васин Игорь Викторович", 5, 16000);
        Book.addToList(employee3);

        Employee employee4 = new Employee("Попов Евгений Валерьевич", 4, 18000);
        Book.addToList(employee4);

        Employee employee5 = new Employee("Орлов Влерий Иванович", 3, 17000);
        Book.addToList(employee5);

        Employee employee6 = new Employee("Иванов Андрей Андреевич", 1, 13000);
        Book.addToList(employee6);

        Employee employee7 = new Employee("Комов Игорь Алексеевич", 1, 16000);
        Book.addToList(employee7);

        Employee employee8 = new Employee("Илюшин Алексей Валерьевич", 2, 14000);
        Book.addToList(employee8);

        Employee employee9 = new Employee("Павлов Евгений Иванович", 2, 18000);
        Book.addToList(employee9);

        Employee employee10 = new Employee("Шишкин Олег Петрович", 3, 19000);
        Book.addToList(employee10);

        Employee employee11 = new Employee("Васин Василий Генадиевич", 3, 18000);
        Book.addToList(employee11);

        System.out.println();
        Book.printListEmployees();
        System.out.println();

        Book.sumSalaryPerMonth(4);
        System.out.println();

        Book.findEmployeeWithMinSalary(4);
        System.out.println();

        Book.findEmployeeWithMaxSalary(4);
        System.out.println();

        Book.calculateAverageSalary(4);
        System.out.println();


        Book.printFullNameEmployees(4);
        System.out.println();

        Book.indexSalary(10);
        System.out.println();

        Book.printListEmployeesOfDepartment(4);
        System.out.println();

        Book.deleteEmployeeFromList(4);
        System.out.println();


        Book.addToList(employee11);
        System.out.println();

        Book.findEmployeeById(4);
        System.out.println();

        Book.printListEmployees();
    }


}
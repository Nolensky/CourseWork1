public class EmployeeBook {
    private final Employee[] employees = new Employee[10];


    //Добавить сотрудника в список
    public void  addToList(Employee employee) {

        int quantityElementsArray = 0;
        for (Employee element : employees) {
            if (element != null) {
                quantityElementsArray++;
            }
            if (quantityElementsArray == employees.length) {
                System.out.println("Нет возможности добавить струдника: " + employee.getFullName() + " - список заполнен!");
            }
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return;
            }
        }
    }

    //Удалить сотрудника из списка по Id
    public void deleteEmployeeFromList(int Id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == Id) {
                employees[i] = null;
            }
            System.out.println(employees[i]);
        }
    }

    //Распечатать всех сотрудников
    public void  printListEmployees() {
        for (Employee element: employees) {
            if (element == null) {
                continue;
            }
            System.out.println(element);
        }
    }

    //Распечатать всех сотрудников по отделу
    public void  printListEmployeesOfDepartment(int department) {
        for (Employee element: employees) {
            if (element == null || element.getDepartment() != department) {
                continue;
            }
            System.out.println("Id: " + element.getId() + ". Сотрудник: " + element.getFullName()  + ", Зарплата: " + element.getSalary());
        }
    }

    //Найти сумму затрат на ЗП по отделу
    public  void  sumSalaryPerMonth(int department) {
        int totalSalary = 0;
        for (Employee employee : employees) {
            if (employee == null || employee.getDepartment() != department) {
                continue;
            }
            totalSalary += employee.getSalary();
        }
        System.out.println("Сумма затрат на ЗП по отделу за месяц " + totalSalary);
    }

    //Найти сотрудника с минимальной зарплатой
    public void   findEmployeeWithMinSalary(int department) {
        int employeeWithMinSalary = 1000000;
        Employee employee2 = employees[0];
        for (Employee employee : employees) {
            if (employee == null || employee.getDepartment() != department) continue;

            if (employee.getSalary() < employeeWithMinSalary) {
                employeeWithMinSalary = employee.getSalary();
                employee2 = employee;

            }
        }
        System.out.println("Сотрудник с минимальной зарплатой по отделу равной " + employeeWithMinSalary + " является " +employee2.getFullName());
    }

    //Найти сотрудника с максимальной зарплатой
    public void  findEmployeeWithMaxSalary(int department) {
        int employeeWithMaxSalary = 0;
        Employee employee2 = employees[0];
        for (Employee employee : employees) {
            if (employee == null || employee.getDepartment() != department) continue;

            if (employee.getSalary() > employeeWithMaxSalary) {
                employeeWithMaxSalary = employee.getSalary();
                employee2 = employee;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой по отделу равной " + employeeWithMaxSalary + " является " + employee2.getFullName());
    }

    //Найти срднюю зарплату по отделу
    public void   calculateAverageSalary(int department) {
        int countEmployee = 0;
        int totalSumSalary = 0;

        for (Employee employee : employees) {
            if (employee == null || employee.getDepartment() != department) continue;
            totalSumSalary += employee.getSalary();
            countEmployee++;
        }
        System.out.println("Средняя зарплата по отделу: " + (double) totalSumSalary / countEmployee + " рублей");
    }

    //распечатать Ф.И.О. сотрудников отдела
    public void printFullNameEmployees(int department) {
        if (department < 1 & department < 5) {
            System.out.println("Такого отдела не существует");
            return;
        }
        System.out.println("Ф.И.О. сотрудиков отдела");
        for (Employee employee : employees) {
            if (employee == null || employee.getDepartment() != department) continue;
            System.out.println(employee.getFullName());
        }
    }

    //Проиндексировать зарплату на определенный процент
    public void indexSalary(int percent) {
        for (Employee employee : employees) {
           employee.setSalary(employee.getSalary() / 100 * percent + employee.getSalary());
            System.out.println("Теперь у " + employee.getFullName() + " зарплата стала выше на " + percent + " процентов " + " и составляет " + employee.getSalary() + " рублей");
        }
    }

    //Найти сотрудника с зарплатой меньше определенного числа
    public void findEmployeeWithSalaryLessThanNumber(int number) {
        for (Employee employee : employees) {
            if (employee == null || employee.getSalary() >= number) continue;
            System.out.println(employee.getId() + " " + employee.getFullName() + " " + employee.getSalary());
        }
    }

    //Найти сотрудника с зарплатой меньше определенного числа
    public void findEmployeeWithSalaryMoreThanNumber(int number) {
        for (Employee employee : employees) {
            if (employee == null || employee.getSalary() < number) continue;
            System.out.println(employee.getId() + " " + employee.getFullName() + " " + employee.getSalary());
        }
    }

    //Найти сотрудника по Id
    public void findEmployeeById(int Id) {
        for(Employee employee : employees) {
           if (employee == null){
               continue;
           }
           if (employee.getId() == Id){
                System.out.println(employee.getFullName());
           }
        }
    }
}

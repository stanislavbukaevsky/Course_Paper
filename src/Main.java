public class Main {
    public static void main(String[] args) {

        Employee[] listOfEmployee = {
                new Employee("Соколов", "Артем", "Денисович", 1, 20500),
                new Employee("Панкратова", "Ангелина", "Владимировна", 2, 22500),
                new Employee("Орлов", "Дмитрий", "Игоревич", 3, 24500),
                new Employee("Кузнецова", "Софья", "Андреевна", 4, 26500),
                new Employee("Соловьев", "Вячеслав", "Федорович", 5, 28500),
                new Employee("Иванова", "Ярослава", "Андреевна", 2, 30500),
                new Employee("Зиновьев", "Никита", "Николаевич", 4, 32500),
                new Employee("Маслова", "Софья", "Максимовна", 1, 34500),
                new Employee("Трофимов", "Роман", "Михайлович", 3, 36500),
                new Employee("Яковлева", "Мария", "Максимовна", 5, 38500)
        };
        getsListOfEmployee(listOfEmployee);
        salaryAmount(listOfEmployee);
        maxSalary(listOfEmployee);
        minSalary(listOfEmployee);
        listOfEmployeeFIO(listOfEmployee);


    }

    public static void getsListOfEmployee(Employee[] listOfEmployee) {
        for (int i = 0; i < listOfEmployee.length; i++) {
            System.out.println(listOfEmployee[i]);
        }
    }

    public static void salaryAmount(Employee[] listOfEmployee) {
        int sum = 0;
        for (int i = 0; i < listOfEmployee.length; i++) {
            sum = sum + listOfEmployee[i].getSalary();
        }
        int averageSalaryAmount = sum / listOfEmployee.length;
        System.out.println("Общая сумма зарплат всех сотрудников: " + sum + " рублей");
        System.out.println("Средняя сумма зарплат всех сотрудников: " + averageSalaryAmount + " рублей");
    }

    public static void maxSalary(Employee[] listOfEmployee) {
        int maxSalaryAmount = listOfEmployee[0].getSalary();
        for (int i = 0; i < listOfEmployee.length; i++) {
            if (maxSalaryAmount < listOfEmployee[i].getSalary()) {
                maxSalaryAmount = listOfEmployee[i].getSalary();
            }
        }
        System.out.println("Максимальная зарплата сотрудника составляет " + maxSalaryAmount + " рублей");
    }

    public static void minSalary(Employee[] listOfEmployee) {
        int minSalaryAmount = listOfEmployee[0].getSalary();
        for (int i = 0; i < listOfEmployee.length; i++) {
            if (minSalaryAmount > listOfEmployee[i].getSalary()) {
                minSalaryAmount = listOfEmployee[i].getSalary();
            }
        }
        System.out.println("Минимальная зарплата сотрудника составляет " + minSalaryAmount + " рублей");
    }

    public static void listOfEmployeeFIO(Employee[] listOfEmployee) {
        String fullName = "";
        for (int i = 0; i < listOfEmployee.length; i++) {
            fullName = listOfEmployee[i].getLastName() + " " + listOfEmployee[i].getFirstName() + " " + listOfEmployee[i].getMiddleName();
            System.out.println("ФИО сотрудника: " + fullName);
        }

    }


}
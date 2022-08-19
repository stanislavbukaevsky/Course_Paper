public class Employee {
    private String lastName;
    private String firstName;
    private String middleName;
    private int department;
    private int salary;
    private int id;
    private static int count = 1;


    public Employee(String lastName, String firstName, String middleName, int department, int salary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
        this.id = count++;
    }


    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Данные о сотруднике: " + lastName + " " + firstName + " " + middleName + " Отдел: " + department + " Зарплата: " + salary;
    }

}

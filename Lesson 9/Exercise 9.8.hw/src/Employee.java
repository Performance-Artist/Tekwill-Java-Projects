public class Employee {
    String name = "unknown" ;
    int salary = 0;
    String address = "unknown" ;

    public Employee() {
        this.name = "unknown";
        this.salary = 0;
        this.address = "unknown";
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(String name, int salary, String address) {
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}

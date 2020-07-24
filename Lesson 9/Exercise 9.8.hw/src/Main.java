public class Main {

    public static void main(String[] args) {
        System.out.println("Employee 1");
        Employee employee1 = new Employee();
        System.out.println("The name is " + employee1.name);
        System.out.println("The salary is " + employee1.salary);
        System.out.println("The address is " + employee1.address);

        System.out.println("Employee 2");
        Employee employee2 = new Employee("Charles", 10000);
        System.out.println("The name is " + employee2.name);
        System.out.println("The salary is " + employee2.salary);
        System.out.println("The address is " + employee2.address);

        System.out.println("Employee 3");
        Employee employee3 = new Employee("Aureliu", 25000, "Rome");
        System.out.println("The name is " + employee3.name);
        System.out.println("The salary is " + employee3.salary);
        System.out.println("The address is " + employee3.address);
    }
}

public class PolymorphismApp {
    public static void main(String[] args) {

        // Merubah bentuk object ke object lain
        Employee employee = new Employee("Raihan");
        employee.sayHello("Budi");

        employee = new Manager("Raihan");
        employee.sayHello("Budi");

        employee = new VicePresident("Raihan");
        employee.sayHello("Budi");

        sayHello(new Employee("Raihan"));
        sayHello(new Manager("Raihan"));
        sayHello(new VicePresident("Raihan"));

    }

    // Type Check and Casts
    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
}

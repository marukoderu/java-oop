class VicePresident extends Manager {
    // SUPER CONSTRUCTOR
    VicePresident(String name) {
        super(name);
    }

    // Method Overriding
    void sayHello(String name) {
        System.out.println("Hello " + name + ", My name is VP " + this.name);
    }
}

class Person {
    // FIELD
    String name;
    String address;
    final String country = "Indonesia";

    // CONSTRUCTOR
    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // CONSTRUCTOR OVERLOADING
    Person(String paramName) {
        // Manggil constructor lain
        this(paramName, null);
    }
    Person() {
        this(null);
    }

    // METHOD
    void sayHello(String name) {
        System.out.println("Hello " + name + ", My name is " + this.name);
    }
    void sayHello() {
        this.sayHello("Bos");
    }
}

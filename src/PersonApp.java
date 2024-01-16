public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("Raihan", "Bandung");
        var person2 = new Person("Andi");
        var person3 = new Person();

        System.out.println(person1.name);
        System.out.println(person1.address);
        person1.sayHello("Budi");

        System.out.println(person2.name);
    }
}

package programmer.application;

import programmer.annotation.Fancy;
import programmer.data.Animal;
import programmer.data.Cat;

@Fancy(name = "AnimalApp", tags = {"application", "java"})
public class AnimalApp {
    public static void main(String[] args) {

        Animal animal = new Cat();
        animal.name = "Neko";
        animal.run();

    }
}

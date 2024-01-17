package programmer.data;

import programmer.annotation.Fancy;

@Fancy(name = "Car", tags = {"application", "java"})
public interface Car extends HasBrand, IsMaintenance {

    void drive();

    int getTier();

    default boolean isBig() {
        return false;
    }

}

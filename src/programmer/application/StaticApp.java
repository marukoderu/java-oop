package programmer.application;

import static programmer.data.Application.PROCESSORS;
import static programmer.data.Constant.*;
import programmer.data.Country;
import programmer.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(
                MathUtil.sum(1,1,1,1,1)
        );

        Country.City city = new Country.City();
        city.setName("Bandung");

        System.out.println(city.getName());

        System.out.println(PROCESSORS);
    }
}

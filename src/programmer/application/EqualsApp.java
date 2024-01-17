package programmer.application;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "Raihan";
        first = first + " " + "Pratama";

        System.out.println(first);

        String second = "Raihan Pratama";
        System.out.println(second);

        System.out.println(first == second); // memandingkan object yg sama atau bukan
        System.out.println(first.equals(second));
    }
}

package programmer.application;

import programmer.data.LoginRequest;
import programmer.error.ValidationException;
import programmer.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest(null, "Java123");

//        ValidationUtil.validate(loginRequest); ERROR
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        } catch (ValidationException | NullPointerException exception) {
            System.out.println("Data Tidak Valid : " + exception.getMessage());
        } finally {
            System.out.println("Error atau enggak, pesan ini selalu muncul!");
        }

        LoginRequest loginRequest2 = new LoginRequest(null, null);
        ValidationUtil.validateRuntime(loginRequest2);
    }
}

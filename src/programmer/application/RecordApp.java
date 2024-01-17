package programmer.application;

import programmer.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("raihan", "java123");

        System.out.println(loginRequest.name());
        System.out.println(loginRequest.password());
        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("Raihan"));
        System.out.println(new LoginRequest("Raihan", "Java123"));
    }
}

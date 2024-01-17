package programmer.application;

import programmer.data.CreateUserRequest;
import programmer.util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {
        CreateUserRequest request = new CreateUserRequest();

        ValidationUtil.validationReflection(request);
    }
}

package programmer.util;

import programmer.annotation.NotBlank;
import programmer.data.LoginRequest;
import programmer.error.BlankException;
import programmer.error.ValidationException;

import java.lang.reflect.Field;

public class ValidationUtil {

    public static void validate(LoginRequest loginRequest) throws ValidationException {
        if (loginRequest.name() == null) {
            throw new NullPointerException("Username is null!");
        } else if (loginRequest.name().isBlank()) {
            throw new ValidationException("Username is blank!");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password is blank!");
        } else if (loginRequest.password().isBlank()) {
            throw new ValidationException("Password is blank!");
        }
    }

    public static void validateRuntime(LoginRequest loginRequest) {
        if (loginRequest.name() == null) {
            throw new NullPointerException("Username is null!");
        } else if (loginRequest.name().isBlank()) {
            throw new BlankException("Username is blank!");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password is blank!");
        } else if (loginRequest.password().isBlank()) {
            throw new BlankException("Password is blank!");
        }
    }

    public static void validationReflection(Object object) {
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for (var field : fields) {
            field.setAccessible(true);

            if (field.getAnnotations(NotBlank.class) != null) {
                try {
                    String value = (String) field.get(object);
                    if (value == null || value.isBlank()) {
                        throw new BlankException("Field " + field.getName() + " is blank!");
                    }
                } catch (IllegalAccessException exception) {
                    System.out.println("Tidak bisa mengakses field " + field.getName());
                }
            }
        }
    }

}

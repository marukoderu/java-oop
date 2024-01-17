package programmer.data;

public record LoginRequest(String name, String password) {
    public LoginRequest {
        System.out.println("Membuat object LoginRequest");
    }

    public LoginRequest(String name) {
        this(name, "");
    }

    public LoginRequest() {
        this("", "");
    }

}

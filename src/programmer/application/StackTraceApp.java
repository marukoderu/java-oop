package programmer.application;

public class StackTraceApp {
    public static void main(String[] args) {

//        try {
//            String[] names = {
//                  "Raihan", "Pratama"
//            };
//
//            System.out.println(names[10]);
//        } catch (Throwable throwable) {
//            StackTraceElement[] stackTraceElements = throwable.getStackTrace();
//            throwable.printStackTrace();
//        }
        try {
            sampleError();
        } catch (RuntimeException exception) {
            exception.printStackTrace();
        }

    }

    public static void sampleError() {
        try {
            String[] names = {
                    "Raihan", "Pratama"
            };

            System.out.println(names[10]);
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }
}

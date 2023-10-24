package L_Exception;

public class Main {
    public static void main(String[] args) {
        try {
            int j = 0;
            int a = 100 / j;
            System.out.println(a);
        } catch (Exception e) {
            if (e instanceof ArithmeticException) {
                System.out.println("Error");
            } else {
                System.out.println(e);
            }
        }


    }
}

class Test {
    void add() throws Exception {
        throw new Exception("Custom Exception");
    }
}
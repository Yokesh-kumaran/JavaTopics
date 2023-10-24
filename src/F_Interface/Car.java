package F_Interface;

public class Car implements Vehicle {
    void success() {
        System.out.println("Success");
    }

    @Override
    public void failure() {
        System.out.println("Failure");
    }
}

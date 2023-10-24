package I_Casting;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.color();

        Car car = (Car) new Vehicle();
        car.model();
        car.color();
    }
}

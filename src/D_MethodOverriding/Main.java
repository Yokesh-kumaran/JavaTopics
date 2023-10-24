package D_MethodOverriding;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.wheel();
        vehicle.color();

        Bike bike = new Bike();
        bike.wheel();
        bike.color();

        //UPCASTING
        Vehicle object1 = new Bike();
        object1.color();
        object1.wheel();


    }
}

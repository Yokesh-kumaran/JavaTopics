package H_Encapsulation;

public class Main {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.setWheels(1001);
        obj.setName("Sanjay");
        System.out.println(obj.getName());
        System.out.println(obj.getWheels());
    }
}

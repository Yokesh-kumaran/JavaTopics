package H_Encapsulation;

public class Car {
    private int wheels = 4;
    private String name = "Yokesh";

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int newWheel) {
        this.wheels = newWheel;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }
}

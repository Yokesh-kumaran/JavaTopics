package A_Object;

public class A_Object {
    String firstname = "Yokesh";

    public static void main(String[] args) {
        A_Object object = new A_Object();
        System.out.println(object);
        object.firstname = "Sanjay";
        System.out.println(object.firstname);
    }
}

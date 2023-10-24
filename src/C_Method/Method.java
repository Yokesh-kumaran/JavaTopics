package C_Method;

public class Method {
    void method1() {
        System.out.println("Runs");
    }


    public static void main(String[] args) {
        Method object1 = new Method();
        object1.method1();
        MethodInt object2 = new MethodInt();
        System.out.println(object2.integerReturn());
        MethodString object3 = new MethodString();
        System.out.println(object3.msg("Yokesh"));
        MethodBoolean object4 = new MethodBoolean();
        Boolean var = object4.bool();
        System.out.println(var);
    }
}

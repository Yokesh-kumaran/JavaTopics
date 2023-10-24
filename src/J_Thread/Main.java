package J_Thread;

public class Main extends Thread{

    public void run(){
        System.out.println("Running");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.start();
    }
}

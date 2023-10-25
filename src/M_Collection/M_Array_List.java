package M_Collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class M_Array_List {
    public static void main(String[] args) {
        ArrayList<Student> arrayList= new ArrayList<>();

        //USING CONSTRUCTOR
        Student std = new Student(3,"Yokesh");
        arrayList.add(std);
        for(Student student: arrayList){
            System.out.println(student.getName());
        }
        System.out.println("------------------------");

        //USING SETTER
        Student stdSetter = new Student();
        stdSetter.setRollNo(101);
        stdSetter.setName("Sanjay");
        arrayList.add(stdSetter);
        for(Student student: arrayList){
            System.out.println(student.getName());
        }
        System.out.println("------------------------");

        //ARRAYLIST UPDATION
        arrayList.set(1, new Student(2, "Updated"));
        for(Student student: arrayList){
            System.out.println(student.getName());
        }
        System.out.println("------------------------");

        //REMOVING OBJECT
        arrayList.remove(0);
        for(Student student: arrayList){
            System.out.println(student.getName());
        }
        System.out.println("------------------------");

        //GETTING SIZE
        int size = arrayList.size();
        System.out.println(size);
        System.out.println("------------------------");

        //LINKED LIST
        LinkedList<Student> linkedList = new LinkedList<>();
        linkedList.add(new Student(10, "Abcd"));
        for(Student student: linkedList){
            System.out.println(student.getName());
        }
        System.out.println("------------------------");
    }
}

package SingletonClass;
import java.util.Scanner;

 class Basic {
     private String name;
     private int age;
    private static Basic instance;
    private Basic() {
        System.out.println("Basic constructor called");
    }
    public static Basic getInstance(){
        if(instance==null){
            instance = new Basic();
        }
        return instance;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
     }
     public String getName(){
        return name;
     }
     public int getAge(){
         return age;
     }
}

public class Main_Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     Basic obj1 = Basic.getInstance();
     System.out.println("Set the name of object 1");
     String name = sc.nextLine();

     obj1.setName(name);
     System.out.println("Set the age of object 1");
     int age = sc.nextInt();
     sc.nextLine();
     obj1.setAge(age);
     System.out.println(obj1.getName());
     System.out.println(obj1.getAge());

     Basic obj2 = Basic.getInstance();
     System.out.println("Set the name of object 2");
     name = sc.nextLine();
     obj2.setName(name);
     System.out.println("Set the age of object 2");
     age = sc.nextInt();
     sc.nextLine();
     obj2.setAge(age);
        System.out.println(obj2.getName());
        System.out.println(obj2.getAge());

        System.out.println("displaying both the created instance");
        System.out.println(obj1.getName());
        System.out.println(obj1.getAge());
        System.out.println(obj2.getName());
        System.out.println(obj2.getAge());
        // here at the end it only shows the 2nd obj values 2 times since only one instance can be created

    }
}
// Make the constructor private → Prevents direct instantiation.
// Create a private static instance variable → Holds the single instance.
// Provide a public static method → Returns the instance.

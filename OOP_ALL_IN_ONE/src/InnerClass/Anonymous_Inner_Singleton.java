package InnerClass;

abstract class Greeting {
    abstract void sayHello();
}

public class Anonymous_Inner_Singleton {
    public static void main(String[] args) {
        Greeting g = new Greeting() { // Anonymous inner class
            @Override
            void sayHello() {
                System.out.println("Hello from Anonymous Inner Class");
                // Anonymous Inner Class is used when there is instantiation of only one new type of inner class
                // here the original method gets overriden by the new subclass
                // in Anonymous there is no need to create a new inner class
            }
        };
        g.sayHello();
    }
}


//public class Main {
//    public static void main(String[] args) {
//        Greeting g = new Greeting() { // Anonymous inner class
//            void sayHello() {
//                System.out.println("Hello from Anonymous Inner Class");
//            }
//        };
//        g.sayHello();
//    }
//}

package InnerClass;

public class Member_Inner {
    // Member Inner Singleton Class
    //A class defined inside another class but outside any method. It can access all members of the outer class, including private ones.
}
class Outer1 {
    private String message = "Hello from Outer class";

    class Inner {
        void display() {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        Outer1 outer = new Outer1();
        Outer1.Inner inner = outer.new Inner(); // Creating inner class object
        inner.display();
    }
}

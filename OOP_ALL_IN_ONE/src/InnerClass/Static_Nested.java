package InnerClass;

public class Static_Nested {
}
class Outer {
    static class Inner {
        void display() {
            System.out.println("Static Nested Class");
        }
    }

    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner(); // No need for an Outer instance
        inner.display();
    }
}

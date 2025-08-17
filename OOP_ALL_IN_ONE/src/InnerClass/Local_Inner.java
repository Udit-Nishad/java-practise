package InnerClass;

public class Local_Inner {
}
//class Outer2 {
//    void outerMethod() {
//        class Inner {
//            void display() {
//                System.out.println("Local Inner Class");
//
//            }
//            String n = "This is string N";
//        }
//        Inner inner = new Inner();
//        inner.display();
//        System.out.println(inner.n);
//    }
//    public static void main(String[] args) {
//        Outer2 outer = new Outer2();
//        outer.outerMethod();
//
//    }
//}

class Outer2 {
    String outerMethod() { // Change return type to String
        class Inner { // Local inner class
            void display() {
                System.out.println("Local Inner Class");
            }

            String n = "This is string N"; // Variable inside Inner class
        }
        Inner inner = new Inner();
        inner.display();
        return inner.n; // Return value of n
    }

    public static void main(String[] args) {
        Outer2 outer = new Outer2();
        String value = outer.outerMethod(); // Call method and store returned value
        System.out.println(value); // Print n
    }
}































































package XY;

class Outer {
    String name= "My name is ABCD";
    static void message(){
        System.out.println("Hello World");
    }
    class Inner {
       void display(){
           System.out.println("Inner Display!");
    }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        //Outer.Inner inner = new Outer.Inner(); // No need for an Outer instance
        inner.display();
        System.out.println(outer.name);
        message();
    }
}

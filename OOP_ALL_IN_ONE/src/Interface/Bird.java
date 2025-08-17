package Interface;

public interface Bird {
    default void eat() {
        System.out.println("bird eats");
    }
    void fly();// it is abstract by default in interface and cannot have a body
    default void sleep() {
        System.out.println("bird sleeps"); // using default you dont have the need to override it in subclass
    }
    static void bird() {
        System.out.println("bird");
    }

}

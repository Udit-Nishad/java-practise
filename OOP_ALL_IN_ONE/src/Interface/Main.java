package Interface;

public class Main {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        sparrow.eat();
        sparrow.sleep();// here using default sleep method
        Animal.sleep(); //here using static sleep method
        int a = sparrow.age; // since it is static it can be accessed by all instance,
        int b = Sparrow.age; // Subclass,
        System.out.println(Animal.age); // as well as interface
//        Animal animal = new Sparrow();
//        animal.eat();
//        animal.fly();
             

    }



}

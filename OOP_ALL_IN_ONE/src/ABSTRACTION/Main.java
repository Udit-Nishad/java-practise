package ABSTRACTION;

public class Main {
    public static void main(String[] args) {
        Son son = new Son("beta",15);
        System.out.println(Parent.no); // Statics method in abstract classes can be used
                                       // without calling the instance of abstract class since abstract classes cannot be called

        System.out.println(son.pi);// final methods in abstract classes can be used by calling the instances of subclass
       son.show();   // non abstract method cab be called from instance of subclass

        
    }
}

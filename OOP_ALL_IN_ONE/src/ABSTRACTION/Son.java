package ABSTRACTION;

public class Son extends Parent{

    @Override
    void career() {
        System.out.println("Son career");
    }

    @Override
    void partner() {
        System.out.println("Son partner");

    }
    Son(String name, int age) {
        super(name, age);
   }
}

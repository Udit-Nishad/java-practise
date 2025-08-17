package Interface;

public interface Animal {
    int age=10; //this is by default public,static and final hence cannot be modified anywhere

default void eat(){ //using default keyword you could give body to a method in interfaces

    System.out.println("eat");// using default you dont have the need to override it in subclass
                              // you cant have more two or more default methods without
                              // mentioning in subclass which default to use
}
void fly(); //more than one method of same name in different interfaces can be used
             //since it has to be overidden in subclass compulsorily
    static void sleep(){
        System.out.println("Animal sleep");
    }

}

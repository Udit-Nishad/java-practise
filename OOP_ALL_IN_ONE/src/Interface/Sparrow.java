package Interface;

public  class Sparrow implements Animal,Bird{


    @Override
    public void eat() {
        Bird.super.eat();  // here i'm using bird default method
    }

    @Override
    public void fly() {
        System.out.println("Bird flys");
    }
    //here sleep method is not required since it is default no need to override it

    static void bird(){
        System.out.println("Sparrow");
        Bird.bird();
    }

}

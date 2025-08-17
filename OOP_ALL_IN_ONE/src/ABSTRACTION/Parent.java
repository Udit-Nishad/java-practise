package ABSTRACTION;

public abstract class Parent { //if there is one or more abstract method in a class the the class has to be abstract
   static int no=10;
   final double pi=3.14;
    String name;
    int age;
   abstract void career();// no abstract method can have a body
   abstract void partner();
   Parent(String name, int age) {
    this.name = name;
    this.age = age;
     }
    void show() {
       System.out.println(name);
       System.out.println(age);
   }


}


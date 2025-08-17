package POLYMORPHISM;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Shapes circle = new Circle();   // here Shapes is the ref type and and Circle is object type
        Shapes square = new Square();    // Shapes decide which method to call and the method called is from the object
        Shapes triangle = new Triangle(); // ARea of square can be printed because area is in shape but perimeter can't
                                          // Since perimeter method is not in Shapes
        //square.perimeter;   //it cannot be printed since perimeter is not in shapes
        square.area();    //it can be used since area is in Shapes
        triangle.area();
        circle.area();
        // here there are multiple methods of the same name in different class this is due to polymorphism
        //here it is done due to method overriding which is runtime/dynamic polymorphism
        //compile time polymorphism is done due to method overloading
    }
}

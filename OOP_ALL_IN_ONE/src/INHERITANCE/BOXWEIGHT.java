package INHERITANCE;
import javax.swing.*;
public class BOXWEIGHT extends BOX {
    int weight;

     BOXWEIGHT(){
        super();
        weight = 0;
    }

     BOXWEIGHT(int l,int b,int h,int weight) {
        super(l,b,h);
        this.weight = weight;

    }
    void Display(){
        super.Display();
        System.out.println("weight: "+weight);
    }
}

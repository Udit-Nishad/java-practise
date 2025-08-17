package INHERITANCE;

public class BOX {
    private int l;
    private int b;
    private int h;
    BOX(int l,int b,int h){
        this.l=l;
        this.b=b;
        this.h=h;
    }
    BOX(BOX box){
        this.l=box.l;
        this.b=box.b;
        this.h=box.h;
    }
    BOX(){
        this.l=0;
        this.b=0;
        this.h=0;
    }
    void  Display(){
        System.out.println("LENGTH:"+l);
        System.out.println("BREADTH:"+b);
        System.out.println("HEIGHT:"+h);
    }
    int getL() { // Getter
        return l;
    }
    void setL(int l) { //Setter
        this.l = l;
    }

}

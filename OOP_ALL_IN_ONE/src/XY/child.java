package XY;

import java.util.Arrays;

public class child {

        public static void main(String[] args) {
            Dad dad = new Dad();
            Mom mom = new Mom();
            char[] child = new char[2];
            for (int i = 0; i < 2; i++) {
                child[0]=mom.ch[i];
                for (int j = 0; j <2;j++){
                    child[1]=dad.ch[j];
                    System.out.println(Arrays.toString(child));
                }
            }

        }
    }


package Try_Catch;

public class Main {
    public static void main(String[] args) {
        try{          // In try we put the code where exception might occur
            getInt(); // here it throws an exception since "XYZ" cannot be turned into int
        }                                       //In such case we use exception handling
        catch(Exception e){   // In catch we put the code to do in such cases with parameters of exception class and its object
                               // the exception in catch block uses exception heirarchy where it only catches that exception or its subclass
            System.out.println(e);
        }
        finally { //finally block always gets executed whether try or catch block gets executed
            System.out.println("finally block always gets executed whether try or catch block gets executed");
        }

    }

    private static void getInt() {
        int n = Integer.parseInt("XYZ");
    }
}

package pl.waw.sgh;

public class Switch {

    //constant
    private final static String CONST_A = "A";
    private final static String CONST_B = "B";
    private final static String CONST_C = "C";

    public static void main(String[] args) {

        //CONST = "B"; // usually capital letters for constants

     String s = "A";

     switch (s) {
         case CONST_A :
             System.out.println("s is A");// here can have multiple parts of code in case
             //System.out.println("asdas");
             break;
             // BREAK ?????
         case CONST_B:
             System.out.println("s is B");
         case CONST_C:
             System.out.println("s is C");
             break;
         default:
             System.out.println("s is not A nor B nor C");


     }






    }

}

package pl.waw.sgh;

public class Conditions {

    // blocks of code -- local variable vs global variable
    // static variables = global variables (???)
    // public static int myInt = 7; //available everywhere, global variable
    // public = visible for all classes, private = only for that class
    // { block of code } variables defined in it are only in it, outside of it they are erased from memory

    public static void main(String[] args) {

        int a = 5;
        {
            int b = 6;
            System.out.println(a);
            System.out.println(b);

            {
                System.out.println(a);
                System.out.println(b);
            }

        }
        //int b = 6;

        System.out.println(a);
        //System.out.println(b); // WOULD NOT WORK
        // make variables as local as possible

        // we usually use blocks with conditions
        if (a == 5) System.out.println("a=5");

        if (a == 5) {
            int c = 7; // only to show local variable
            System.out.println("a=5");
        } else if (a == 6){
            System.out.println("a=6");
        } else {
            System.out.println("a=other");
        }


        int c = a == 5 ? 10 : 0;
        //is the same as
        if (a == 5) {
            c = 10;
        } else {
            c = 0;
        }


    }


}

package pl.waw.sgh;

public class Booleans {


    public static void main(String[] args) {

        boolean p = true;
        boolean q = false;

        //AND
        boolean res = p && q;

        //OR
        boolean res1 = p || q;

        //XOR
        boolean res2 = p ^ q;

        System.out.println("res=" + res);
        System.out.println("res1=" + res1);
        System.out.println("res2=" + res2);

        boolean res3 = !res2; // ! - negation
        // or boolean res3 = !(p ^ q)

        // Shift+End, Shift+Down, Home Button, End Button, Ctrl+Arrows


        if (res) { // (res==true) that way with numbers, with booleans (res) also works
            System.out.println("res is true");
        }




    }
    // logical operators AND OR XOR table
    //XOR - true only if one is different than the other 1.F, 2.T or 1.T, 2.F

}

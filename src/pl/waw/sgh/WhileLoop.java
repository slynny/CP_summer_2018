package pl.waw.sgh;

//while vs do while
// first check statement, then execute
// first execute, then check statement
// do while will execute atleast once

public class WhileLoop {

    public static void main(String[] args) {

        int j = 0;

        while (j < 8) {
            System.out.println("j= " + j);
            j++;
        }
        System.out.println(); // space, blank line is printed

        Integer k = 1;
        do {
            System.out.println("k= " + k);
            k++;
        } while (k < 5);

        // int j = 10;

        //while (j < 8) {
            //System.out.println("j= " + j);
            //j++;
       // }
        // this would not run even once






       // Integer k = 9;
       // do {
        //    System.out.println("k= " + k);
          //  k++;
        //} while (k <= 5);
        // it will run once
    }



}

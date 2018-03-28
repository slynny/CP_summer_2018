package pl.waw.sgh;
//  loops
//  for and while
//  for - usually when we know how many iterations
//while - usually when we do not know the number of iterations upfront

public class ForLoop {

    public static void main(String[] args) {

        for (int i=0; i<5 ; i++) {

            System.out.println("i= " + i);

        }

        System.out.println();

        for (int i=6; i>1 ; i--){

            System.out.println("i= " + i);
        }

        System.out.println();


       // for (int i=6; i<7 ; i--) { // INFINITE LOOP

         //   System.out.println("i= " + i);
       // }

        // stopping from a common line: ctrl + C


        for (int i=6; i<7 ; i--) {
            if (i==3) continue; // skips i = 3
            System.out.println("i= " + i);
            if (i==0) break;  //ends infinite loop
        }

        System.out.println();

        int i = 0; // still visible even after the loop
        for (i=0; i<5 ; i++){

           System.out.println("i= " + i);
        }





    }

}

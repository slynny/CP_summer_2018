package pl.waw.sgh;
//Exe1
// write a program that prints first 100 prime numbers or that will check first prime numbers until 1000 or 10 000
//loops, modulo(%)
// also count them = 168


public class Exercise1 {

    public static void main(String[] args) {
        //int n = 1000;
        System.out.println("All prime numbers below 1000 are: ");
        //for (n = 1000; n>0; n--) {
        //int n1 = n % 2;
        //if (n1!=0) {
        //  System.out.println(n);
        // }
        // }
        int n1 = 1000;
        int countPrime = 0;
        // print all prime numbers below 1000;
        for (int n = 1000; n > 0; n--) {
            int countDiv = 0;
            for (n1 = n; n1 > 0; n1--) {
                if (n % n1 == 0) {
                    countDiv = countDiv + 1;
                }
            }

            if (countDiv == 2) {
                System.out.println(n);
                countPrime = countPrime + 1;
                // counting them
            }


        }

        System.out.println("There is " + countPrime + " prime numbers below 1000");
    }
}

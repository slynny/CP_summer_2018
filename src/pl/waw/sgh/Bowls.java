package pl.waw.sgh;

import java.util.Scanner;

public class Bowls {

    public static void main(String[] args) {

        int n;
        int sum = 0;
        System.out.println("What is your n? :");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        scanner.close();
        System.out.println();
        /*
        OR
        int n = 6;
        int sum = 0;
         */

        for (int i=0; i <= n; i++ ) {

            sum = sum + i; // sum += i;

        }
        System.out.println(sum);


    }

}

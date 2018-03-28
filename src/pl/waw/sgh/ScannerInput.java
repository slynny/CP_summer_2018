package pl.waw.sgh;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerInput {

    public static void main(String[] args) {
        //can be used to read text files, code lines
        //System.out.println()
        //3 streams of data
        //Input stream - reading from console, system.in
        //2 output stream - system.out and system.err
        // err and out stream work simultanously
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give your name: ");
        String name = scanner.next();
        System.out.println("Hello " + name);

        //System.out.println("Please give your age: ");
        //int age = scanner.nextInt();
        //System.out.println("age: " + age);

        int age = 0;
        boolean success = false;

        while (!success) { // the same as (success!=true)
            try {
                System.out.println("Please give your age: ");
                scanner = new Scanner(System.in);
                age = scanner.nextInt();
                success = true;
            } catch (InputMismatchException ie) {
                System.out.println("try again ");
            }
        }
        System.out.println("age: " + age);

    }

}

package pl.waw.sgh;

import java.util.Scanner;

public class Exercise0mailverify {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give your email: ");
        String email = scanner.next();
        System.out.println("Your email is: " + email);

        char c = email.charAt(email.length() - 1);
            /*  System.out.println(c); */
            if (!Character.isLetter(c) || !email.contains("@") || !email.contains(".")|| email.contains("..") || email.contains(".@") || email.contains("@.") || email.contains("._.")) {
                System.out.println("Invalid email address");
            } else {
                System.out.println("Valid email address");
            }

            /*
            if (email.endsWith(lastChar) || email.endsWith("!") || email.endsWith("@") || email.endsWith("#") || email.endsWith("$") ) {
                System.out.println("Invalid email address");
            }
            */
/*
            if (email.contains("..") || email.contains(".@") || email.contains("@.") || email.contains("._.")){
            System.out.println("Invalid email address");
            }

            // if (email.endsWith(".")) {
            //System.out.println("Invalid email address");
            // }

*/
/*
            if (!email.contains("@") || !email.contains("."))
            {
                System.out.println("Invalid email address");
            }
*/






    }


}
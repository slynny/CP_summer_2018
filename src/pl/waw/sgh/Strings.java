package pl.waw.sgh;

public class Strings {

    public static void main(String[] args) {

        char c = 'a'; // use '' for characters, and "" for strings
        char d = 68;
        char e = 33636;


        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        // String is a table of chars
        //all arrays are objects in Java
        //

        String s1 = "abc";
        System.out.println(s1);

        String s2 = s1;
        //System.out.println(s2);

        s2 = s2 + "d";
        System.out.println(s2);

        String s3 = s1.concat(s2); //s1 + s2
        String s4 = s1.replace('b','B');
        System.out.println(s4);
        char c1 = s1.charAt(2);
        System.out.println(c1);

        int i = "Hello World".indexOf("l"); // returns the first appearance of l
        System.out.println(i);

        int j = "Hello World".lastIndexOf("l"); // returns the last appearance of l
        System.out.println(j);

        // testing whether it starts with ...
        boolean sw = "Hello World".startsWith("Hell");

        System.out.println("s1 len = " + s1.length());

        // porównywanie strings

        s1 = "abc";
        System.out.println(s1);

        //s2 = s1; // creating new pointer to existing object in memory (???)
        s2 = new String("abc"); // creating new string in memory
        System.out.println(s2);

        if (s2==s1) { // comparison by pointers, this method for comparing primitives only, NOT FOR OBJECTS!!!
            System.out.println("s2==s1");
        }

        if (s2.equals(s1)) { // comparison by content, this method for comparing objects
            System.out.println("s2 equals s1");
        }
        // comparing values vs comparing pointers
        //ctr+shift+/ (or \ ???) - comments ??

        // cuting strings into parts

        String s6 = "Hello World";

        String s7 = s6.substring(7);

        System.out.println(s6);
        System.out.println(s7);

        String s8 = s6.substring(0,5); //from char 1 to ochar 2
        System.out.println(s8);







    }

}

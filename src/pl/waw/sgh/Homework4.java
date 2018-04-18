package pl.waw.sgh;

import java.io.File;

public class Homework4 {

    public static long countFilesInFolder(File myFile, long count) {
        //long count;
        //long sizeTotal;
        for (File file : myFile.listFiles()) {
            if (file.isFile()) {
                //System.out.println(file.getName() + " " + file.length());
                count++;
            }
            if (file.isDirectory()) {
                count += countFilesInFolder(file, count);
            }
        }
        //System.out.println(count);
        return count;
    }
// static needed here for functions
// static - means shared by all objects in the class

    public static long countSizeOfFolder(File myFile, long sizeTotal) {

        for (File file : myFile.listFiles()) {
            if (file.isFile()) {
               // System.out.println(file.getName() + " " + file.length());
                sizeTotal += file.length();
            }
            if (file.isDirectory()) {
                sizeTotal += countSizeOfFolder(file, sizeTotal);
            }
        }
        //System.out.println(sizeTotal);
        return sizeTotal;

    }

    public static void main(String[] args) {
        long count = 0;
        long sizeTotal = 0;

        File myFile = new File("H:/Comp.Prog/Nowy Folder");
        countFilesInFolder(myFile, count);
        countSizeOfFolder(myFile, sizeTotal);

        System.out.println("Folder has size of " + countSizeOfFolder(myFile, sizeTotal) + " byte(s)");
        System.out.println("There are " + countFilesInFolder(myFile, count) + " file(s) in your folder");

    }
}

// function vs method

//String in = "abc";
// function -> String out1 = toUpperCase(in);
// method   -> String out2 = in.toUpperCase();

// "new" operator
// for most objects it it needed when creating a new object
// it is not needed only for odpowiedniki primitive values, such as String, Integer etc.
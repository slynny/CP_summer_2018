package pl.waw.sgh;

import java.io.File;

public class Homework4 {

    public static long countFilesInFolder(File myFile, long count) {
        //long count;
        //long sizeTotal;
        for (File file : myFile.listFiles()) {
            if (file.isFile()) {
                count++;
                //System.out.println(file.getName() + " " + file.length());
            }
            if (file.isDirectory()) {
                count += countFilesInFolder(file, count);
            }
        }
        //System.out.println(count);
        return count;
    }

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

        File myFile = new File("I:/Archer");
        countFilesInFolder(myFile, count);
        countSizeOfFolder(myFile, sizeTotal);

        System.out.println("Folder has size of " + countSizeOfFolder(myFile, sizeTotal) + " bytes");
        System.out.println("There are " + countFilesInFolder(myFile, count) + " files in your folder");

    }
}
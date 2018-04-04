package pl.waw.sgh;
// file manipulation - start


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadText {

    final static String FILE = "h:\\Comp.Prog\\myFile.txt";


    public static void main(String[] args) {

        //System.out.println("File separator: " + File.separator);



        File myFile = new File(FILE); //absolute or relative path? -->
        // Here it is absolute path, only one path, (because it starts with "h" - it contains the root)

        // How are files organized?
        // Files and folders form hierarchy (directories, sub-directories) - a tree
        // tree = root 'h', branches 'folder', leaves 'files
        //difference Windows vs Unix --> different root of the file system
        // in Unix "/" is the root
        //Unix file system has always one root = '/' --> one tree
        // for Windows multiple trees system


        // how to refer to a file with a relative path?

        //you cut out the root ('h:\\') - if in the same folder as the file

        //if in other folder on the same drive - '..\\' instead of root
        // ..\\..\\ for more than 1 level up

        // two dots bring us up, 1 level up to a folder 1 up in hierarchy

        //relative to what? - location(?)
        // in Windows relative path only in the same tree(drive)
        //


        try {
            Scanner scanner = new Scanner(myFile);
            int i=0;

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                i++;
                System.out.println("Line " + i +": " + line);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}


// HOMEWORK
// a program that will take from the CSV file the state of a tic-tac-toe game (kółko i krzyżyk)
// interpret that file, tell if over and what is the outcome if so
// do it the way, so it can also by used for larger boards, not only 3 by 3 (to jest takie trochę dodatkowe)
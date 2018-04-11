package pl.waw.sgh;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {


    public static void main(String[] args) {

        try {
            File file = new File("h:/fw.txt");
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);


            bw.write("My first linee");
            bw.newLine();
            bw.write("Second line");

            bw.close();
            fw.close();



        } catch (IOException io) {
            System.out.println(io.getMessage());
        }


    }


}

//how to check SSD lifetime

//homework
//code that sums up the total size of a folder and a number of files

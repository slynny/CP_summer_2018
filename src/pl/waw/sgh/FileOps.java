package pl.waw.sgh;

//set command in cmd
// it will show ...
//Path =
//how does system looks for executables in Windows
// by Path and PATHTXT
//PATHTXT - extensions of executables
//where does it look for files with those extensions?
// Firstly, working directory
//Secondly, directories in Path

//HOMEDRIVE  -  on which drive is system installed

//system-wide and user-wide variables


import java.util.Map;

public class FileOps {

    public static void main(String[] args) {

        String curDir = System.getProperty("user.dir");
        String tmpDir = System.getProperty("java.io.tmpdir");
        System.out.println("TMP: " + tmpDir);


        String mySysProp = System.getProperty("wh72814.myprop"); //something to be changed here
        System.out.println("myprop " + mySysProp);



        String user = System.getenv("USERNAME");
        Map<String, String> env = System.getenv();
        System.out.println(user);


    }




}


//VM options
// -Dname_of_the_variable -- no space => -Dvariable
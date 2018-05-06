package pl.waw.sgh;


import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
//import java.util.Scanner;

public class Hoework6CSVStock {

    public static void main(String[] args) throws IOException {

        String target_file ;
        String path = "I:\\JAVA PD6";

    File folder = new File("I:\\JAVA PD6");
    File[] listOfFiles = folder.listFiles();

        for (int i=0; i < listOfFiles.length; i++) {

        if (listOfFiles[i].isFile()) {

            // System.out.println("File " + listOfFiles[i].getName());

            target_file = listOfFiles[i].getName();
            if (target_file.startsWith("stock") && target_file.endsWith(".csv")) {
                //You can add these files to fileList by using "list.add" here
                System.out.println("Found" + " " + target_file);
                addColumn(path, target_file);

            }
        } else if (listOfFiles[i].isDirectory()) {
            System.out.println("Directory " + listOfFiles[i].getName());
        }
    }
}
 /*    for (int i = 0; i < listOfFiles.length; i++) {
        if (listOfFiles[i].isFile()) {
        target_file = listOfFiles[i].getName();
        if (target_file.startsWith("billing")
        && target_file.endsWith(".csv")) {
        //You can add these files to fileList by using "list.add" here
        System.out.println("found" + " " + target_file);
        }
        }
        }
        */

    public static void addColumn(String path,String target_file) throws IOException {
        BufferedReader br=null;
        BufferedWriter bw=null;
        final String lineSep=System.getProperty("line.separator");


      /*  Scanner scanner = new Scanner(target_file);


        while(scanner.hasNext()) {
            String line = scanner.next();
            String[] columns = line.split(",");

            String open = columns[1];
            String close = columns[4];
            int openNum = Integer.parseInt(open);
            int closeNum = Integer.parseInt(close);

            int changeNum = (closeNum - openNum) / openNum;
            String change = Integer.toString(changeNum);

        } */

        try {
            File file = new File(path, target_file);
            File file2 = new File(path+"\\V2", "v2."+target_file);//so the
            //names don't conflict or just use different folders

            br = new BufferedReader(new InputStreamReader(new FileInputStream(file))) ;
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2)));
            String line = null;
            int i=0;
            for ( line = br.readLine(); line != null; line = br.readLine(),i++)
            {

                    String[] columns = line.split(",");
                    if (i==0) {
                        String change = "Change";
                        bw.write(line+","+change+lineSep);
                    } else {
                    String open = columns[1];
                    String close = columns[4];
                    double openNum = Double.parseDouble(open);
                    double closeNum = Double.parseDouble(close);

                    Double changeNum = ((closeNum - openNum) / openNum)*100;
                        Double changeNumPrecise = BigDecimal.valueOf(changeNum).setScale(3, RoundingMode.HALF_UP).doubleValue();
                    String change = Double.toString(changeNumPrecise);
                    bw.write(line+","+change+"%"+lineSep);
                }

                /*
                  while(scanner.hasNext()) {
                    String line2 = scanner.next();
                    String[] columns = line2.split(",");
                    if

                    String open = columns[1];
                    String close = columns[4];
                    int openNum = Integer.parseInt(open);
                    int closeNum = Integer.parseInt(close);

                    int changeNum = (closeNum - openNum) / openNum;
                    String change = Integer.toString(changeNum);
                    bw.write(line+","+change+lineSep);
                }
                 */

                //String addedColumn = "1";
                //bw.write(line+","+addedColumn+lineSep);
            }

        }catch(Exception e){
            System.out.println(e);
        }finally  {
            if(br!=null)
                br.close();
            if(bw!=null)
                bw.close();
        }

    }
}
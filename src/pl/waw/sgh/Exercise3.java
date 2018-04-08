package pl.waw.sgh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise3 {

    final static String FILE = "I:\\ticktacktoe.csv";

    public static void main(String[] args) {

        int[][] arr = new int[3][3];

        File myFile = new File(FILE);

        try {
            Scanner scanner = new Scanner(myFile);
            int i=0;
            int col = 0;
            int row = 0;

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] cells = line.split(";");
                for (String e1 : cells) {
                    //System.out.println(e1+ "\t");
                    arr[col][row] = Integer.parseInt(e1);
                    col++;
                }
                //System.out.println();
                i++;
                row++;
                col = 0;

            }
            System.out.println(arr[0][0] + " " + arr[1][0] + " " + arr[2][0]);
            System.out.println(arr[0][1] + " " + arr[1][1] + " " + arr[2][1]);
            System.out.println(arr[0][2] + " " + arr[1][2] + " " + arr[2][2]);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        if (arr[0][0] == 1 && arr[0][1] == 1 && arr[0][2] == 1 || // 1st row
                arr[1][0] == 1 && arr[1][1] == 1 && arr[1][2] == 1 || // 2nd row
                arr[2][0] == 1 && arr[2][1] == 1 && arr[2][2] == 1 || // 3rd row
                arr[0][0] == 1 && arr[1][0] == 1 && arr[2][0] == 1 || // 1st col.
                arr[0][1] == 1 && arr[1][1] == 1 && arr[2][1] == 1 || // 2nd col.
                arr[0][2] == 1 && arr[1][2] == 1 && arr[2][2] == 1 || // 3rd col.
                arr[0][0] == 1 && arr[1][1] == 1 && arr[2][2] == 1 || // Diagonal
                arr[2][0] == 1 && arr[1][1] == 1 && arr[0][2] == 1)
        {
            System.out.println("X WINS");
        } else if (arr[0][0] == -1 && arr[0][1] == -1 && arr[0][2] == -1 || // 1st row
                arr[1][0] == -1 && arr[1][1] == -1 && arr[1][2] == -1 || // 2nd row
                arr[2][0] == -1 && arr[2][1] == -1 && arr[2][2] == -1 || // 3rd row
                arr[0][0] == -1 && arr[1][0] == -1 && arr[2][0] == -1 || // 1st col.
                arr[0][1] == -1 && arr[1][1] == -1 && arr[2][1] == -1 || // 2nd col.
                arr[0][2] == -1 && arr[1][2] == -1 && arr[2][2] == -1 || // 3rd col.
                arr[0][0] == -1 && arr[1][1] == -1 && arr[2][2] == -1 || // Diagonal
                arr[2][0] == -1 && arr[1][1] == -1 && arr[0][2] == -1)
        {
            System.out.println("O WINS");
        } else {
            System.out.println("NO WINNER");
        }

    }
}
















































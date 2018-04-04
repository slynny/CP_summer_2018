package pl.waw.sgh;
//ARRAY CAN CONTAIN OTHER ARRAYS - MULTIDIMENSIONAL ARRAY
// often nested loops - loop in another loop
//multidimensional lists, every row can have a different length


public class Arrays2D {

    public static void main(String[] args) {

        int[][] arr2D = new int[3][4];
        arr2D[0][0] = 42;
        arr2D[0][1] = 465;
        arr2D[0][2] = 787;

        arr2D[1] = new int [] {234, 2124, 6534, 234};

        for (int r=0; r<arr2D.length; r++) { // r = row

            for (int c=0; c<arr2D[r].length; c++) { // c = column

                System.out.print(arr2D[r][c] + "\t"); // \t = tabulator

            }
            System.out.println();
        }
    }

}

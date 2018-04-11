package pl.waw.sgh;

//recursion may be problematic as it needs very large amount of stack memory


public class BowlsRecurs {

    public static int sumBowls(int row) {

        if (row==1) return 1;
        else return sumBowls(row-1) + row;

    }

    public static void main(String[] args) {

        int n = 2000;
        long startTime = System.currentTimeMillis();
        System.out.println(sumBowls(n));
        long stopTime = System.currentTimeMillis();
        System.out.println(stopTime - startTime + " ms");


    }


}

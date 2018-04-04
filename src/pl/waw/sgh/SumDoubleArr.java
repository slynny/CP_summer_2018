package pl.waw.sgh;

public class SumDoubleArr {

    public static double sumDoubles(double[] array) {

        double sum = 0;

        for (double e1: array) {
            sum += e1; // same as sum= sum+i;
        }

        return sum;
    }

    public static void main(String[] args) {
        // static arguments, manually written in array
        //double[] arr = new double[] { 1.1, 2.23, 3 };
        //double sum = sumDoubles(arr);
        //System.out.println(sum);

        double[] dArr = new double[args.length];
        for (int i =0; i< args.length; i++) {

            dArr[i] = Double.parseDouble(args[i]);

        }

        double sum = sumDoubles(dArr);
        System.out.println(sum);

    }

}

//codingbat.com/prob/p101230

//ARRAY CAN CONTAIN OTHER ARRAYS - MULTIDIMENSIONAL ARRAY

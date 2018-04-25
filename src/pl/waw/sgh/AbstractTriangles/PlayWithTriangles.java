package pl.waw.sgh.AbstractTriangles;

import pl.waw.sgh.AbstractTriangles.NormalTriangle;
import pl.waw.sgh.AbstractTriangles.EquilateralTriangle;

public class PlayWithTriangles {

    public static void main(String[] args) {

        NormalTriangle nt1 = new NormalTriangle(3,4, 5);
        // calls toString automatically
        System.out.println(nt1);
        System.out.println(nt1.calcSurface());

        System.out.println();

        EquilateralTriangle et1 = new EquilateralTriangle(5);
        System.out.println(et1);
        System.out.println(et1.calcSurface());


    }

}

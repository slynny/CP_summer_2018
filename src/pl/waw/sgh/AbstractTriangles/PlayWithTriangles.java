package pl.waw.sgh.AbstractTriangles;

import pl.waw.sgh.AbstractTriangles.ScaleneTriangle;
import pl.waw.sgh.AbstractTriangles.EquilateralTriangle;

public class PlayWithTriangles {

    public static void main(String[] args) {

        ScaleneTriangle st1 = new ScaleneTriangle(3,4, 5);
        // calls toString automatically
        System.out.println(st1);
        //System.out.println(nt1.toString());
        System.out.println("Surface: " + st1.calcSurface());

        System.out.println();

        EquilateralTriangle et1 = new EquilateralTriangle(5);
        // calls toString automatically
        System.out.println(et1);
        //System.out.println(et1.toString());
        System.out.println("Surface: " + et1.calcSurface());

        System.out.println();

        IsoscelesTriangle it1 = new IsoscelesTriangle(5, 2);
        // calls toString automatically
        System.out.println(it1);
        //System.out.println(et1.toString());
        System.out.println("Surface: " + it1.calcSurface());


    }

}

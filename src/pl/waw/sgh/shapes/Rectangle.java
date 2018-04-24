/* package pl.waw.sgh.shapes;

public class Rectangle extends Shape {

// ------------------

    //public Rectangle() {

        //  //call superclass (Shape) constructor
        //  //super(1,2);

   // }

   // public Rectangle(double sideA, double sideB) {
   //     super(sideA, sideB);
   // }

// ------------------------------


    public Rectangle(double sideA, double sideB) {
        setParams(sideA, sideB);
    }


    public double calcSurface() {

        return parA*parB;

    }


    public String toString() {

        return "My Rectangle" + " [parA= " + parA + " parB= " + parB + "]\n" + super.toString();

    }
    //comment out to use the one in Shapes

}
 */

package pl.waw.sgh.shapes;

public class Rectangle extends Shape {

    public Rectangle() {
        // call superclass (Shape) constructor
        super(1,2);
    }

    public Rectangle(double sideA, double sideB) {
        super(sideA, sideB);
    }

    @Override
    public double calcSurface() {
        return parA*parB;
    }

    @Override
    public String toString() {
        return "My " + super.toString();
    }

}



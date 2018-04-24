/*
package pl.waw.sgh.obj;

public class Rectangle {

    double sideA; //primitives - have 0 as a default value
    double sideB;
    // Double sideC; - for objects there is no default value, we only declare them like that, but we do not initialize them, so there is no value = null
    // so for Double:
    // Double sideA = 0d; == double sideA; or double sideA = 0; but Double - object, double - primitive data


    // instead of r1.setParams(2,4); in PlayWithRect
    public Rectangle() {

        sideA = 5;
        sideB = 7;

    }

    public Rectangle(double sideA, double sideB) {

        this.sideA = sideA; //this.sideA -- refers to sideA defined in the whole class
        this.sideB = sideB;

    }

    void setParams (double a, double b) {

        sideA = a;
        sideB = b;

    }

    double calcSurface() {

        return sideA*sideB;

    }



}

// visibilities in JAVA
// 1. unspecified - only for inside it's package, packagewide
// 2. protected   - also for inherited structure, packagewide + inheritance
// 3. public      - doesn't matter where it is, for all packages, classes etc., the least strict
// 4. private     - only access within the class, the most strict - !recommended!

*/

package pl.waw.sgh.obj;

public class Rectangle {

    private Double sideA = 0d;
    private Double sideB = 0d;

/*    public Rectangle() {
        sideA = 5;
        sideB = 7;
    }*/

    public Rectangle(double sideA, double sideB) {
        setParams(sideA, sideB);
/*
        this.sideA = sideA;
        this.sideB = sideB;
*/
    }

    public void setParams(double a, double b) {
        sideA = a;
        sideB = b;
    }

    public double calcSurface() {
        return sideA*sideB;
    }
}
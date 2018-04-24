/*
package pl.waw.sgh.obj;


public class PlayWithRect {


    public static void main(String[] args) {


        //when both constructors are commented out the surface is 0, when we use Rectangle r1 = new Rectangle();
        Rectangle r1 = new Rectangle(); //empty constructor, only creates a new object
        //Rectangle r1 = new Rectangle(3,8);
        //r1.setParams(2,4);
        double surface = r1.calcSurface();
        System.out.println(surface);

    }


}
*/

package pl.waw.sgh.obj;

public class PlayWithRect {

    public static void main(String[] args) {
        //Rectangle r1 = new Rectangle();
        Rectangle r1 = new Rectangle(3,8);
        //r1.sideA = 54d;
        r1.setParams(2,4);
        double surface = r1.calcSurface();
        System.out.println(surface);
    }
}
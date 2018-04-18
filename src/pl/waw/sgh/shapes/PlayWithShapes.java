package pl.waw.sgh.shapes;

public class PlayWithShapes {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4,5);
        System.out.println(r1.calcSurface());
        System.out.println(r1.toString());
        //System.out.println(r1);
        // .println --> automatically does .toString

        Circle c1 = new Circle(4);
        System.out.println(c1);
        System.out.println(c1.calcSurface());

        //Shape s1 = new Shape(2,23);
        //System.out.println(s1);
        // we do not need Shape as a class

        Shape [] myShapes = new Shape[3];
        myShapes[0] = new Rectangle(3,4);
        myShapes[1] = new Circle(5);
        myShapes[2] = new Rectangle(6,7);


        for (Shape s : myShapes) {

            System.out.println(s.toString());
            // System.out.println("Surface: " + ((Rectangle)s).calcSurface()); //casting Rectangle in shape s
            System.out.println("Surface: " + s.calcSurface());

        }




    }

}







// in JAVA every object has a parent - Java.lang.object
// so certain methods are always inherited


//hashcode
//hash function - used mostly for security, idea to generate something like a digital fingerprint of a function
//usually alphanumeric combination of signs that defines an object
//part of it from the contents of the object, other part is random
// you can generate hashcode from objects
// not possible to reconstruct an object from the hashcode

//storing passwords --> in hashcodes, storing output hashcodes of your password

// .println --> automatically does .toString



//HOMEWORK

//create more shapes
//create triangles
// (Abs) Shape --> (Rectangle, Circle, (Abs)Triangle)
// (Abs) Triangle --> (Rownoboczne, Inne)
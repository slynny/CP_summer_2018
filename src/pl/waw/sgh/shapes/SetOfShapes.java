package pl.waw.sgh.shapes;
// ctrl + N = list of possible actions

// SET vs LIST
// 2 MAIN DIFFERENCES

//1.
// set only unique objects, object cannot be referenced in set more then once
// in a list there are multiple references to a object

//2.
//list is ordered, set is not

import java.util.HashSet;
import java.util.Set;

public class SetOfShapes {

    public static void main(String[] args) {
        ShapeCalculation s1 = new Rectangle(5, 4);
        ShapeCalculation s2 = new Circle(4);
        ShapeCalculation s3 = new Rectangle(5, 6);

        Set<ShapeCalculation> shapeSet = new HashSet<>();

        shapeSet.add(s1);
        shapeSet.add(s2);
        shapeSet.add(s3);
        shapeSet.add(s2); // will not work, cause s2 was already used


        // SET doesnt have an index, so u can't use GET with and a for loop
        // u need to use foreach loop


        for (ShapeCalculation s: shapeSet) {
            System.out.println(s);
        }
        System.out.println();

        //prints out in random order - REMEMBER


    }


}

// there exist TreeSet
// u can sort there

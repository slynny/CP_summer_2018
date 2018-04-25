package pl.waw.sgh.shapes;
// associated array
// dictionary
// map
import java.util.HashMap;
import java.util.Map;

public class MapsOfShapes {


    public static void main(String[] args) {

        Map<String, ShapeCalculation> myMap = new HashMap<>();

        myMap.put("Rect 1 ", new Rectangle(4,6));
        myMap.put("Circle 1 ", new Circle(4));
        myMap.put("Rect 2 ", new Rectangle(2,3));
        //myMap.put("Rect 2 ", new Rectangle(6,9)); //replaces the first Rect 2


        //myMap.values();
        //myMap.keySet();

        for (String idx : myMap.keySet()) { //alphabetical order ?????

            ShapeCalculation s = myMap.get(idx);
            System.out.println(s);

        }

    }
    //what is the limitation of the key
    // values of the key should be always different
    // if you put the new value to the same key it will probably overwrite



}

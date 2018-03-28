package pl.waw.sgh;

import javax.swing.*;

public class GuiInput {

    public static void main(String[] args) {
        //JOptionPane.showMessageDialog( null,  "Hello!" );
        //String myText = JOptionPane.showInputDialog("What is your name?");
        //JOptionPane.showMessageDialog(null,"Hello! " + myText + " !!!" );



          //  int res = JOptionPane.showConfirmDialog(null, "Are you sure?");
       // JOptionPane.showMessageDialog(null,"Result: " + res);


        int res = -1;
        while (res!=0) {
            res = JOptionPane.showConfirmDialog(null, "Are you sure?");
            JOptionPane.showMessageDialog(null, "Result: " + res);
        }


        JOptionPane.showMessageDialog( null,  "Hello!" );
        String sHeight = JOptionPane.showInputDialog("what is your height in cm?");

        // this is modification

        //Double height = null; // null - pointer without an object

       // while (height==null) {
          //  try {
           //     String sHeight = JOptionPane.showInputDialog("what is your height in cm?");
            //    height = Double.parseDouble(sHeight);
           // } catch (NumberFormatException ne) {
             //   JOptionPane.showMessageDialog(null, ne.getMessage());
           // } catch (NumberFormatException nee) {
            //
          //  }
       // }

        // end of modification


        Double height = Double.parseDouble(sHeight); //(that will not be here for modification )
        //Integer.parseInt(sHeight);
        //Long.parseLong(sHeight);
        JOptionPane.showMessageDialog(null,"Your height in m:  " + height/100 );


        //Double height = null; // null - pointer without an object

        // while (height==null) {
        //  try {
        //     String sHeight = JOptionPane.showInputDialog("what is your height in cm?");
        //    height = Double.parseDouble(sHeight);
        // } catch (NumberFormatException ne) {
        //   JOptionPane.showMessageDialog(null, ne.getMessage());
        // } catch (Exception nee) { // this will take into account everything - it is parent class of all the exceptions
        //
        //  }
        // }


    }




}

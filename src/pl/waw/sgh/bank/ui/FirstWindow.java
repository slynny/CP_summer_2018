package pl.waw.sgh.bank.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstWindow {

    public static void main(String[] args) {
        JFrame myFrame = new JFrame("My Window");
        myFrame.setSize(400, 600);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // allows to close the window
        //myFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); // changes visibility to false, so we do not see it anymore, but it is still working
        //myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // causes the object(window) to be disposed, but the application does not stop working
        myFrame.setLayout(new FlowLayout());
        //layout manager so the panels(etc) do not cover each other

        JPanel firstNamePanel = new JPanel();
        JLabel label1 = new JLabel("First Name");
        JTextField firstName = new JTextField(25); //25 is a number of length of a text field here
        firstNamePanel.add(label1);
        firstNamePanel.add(firstName);
        myFrame.add(firstNamePanel);

        JPanel lastNamePanel = new JPanel();
        JLabel label2 = new JLabel("Last Name");
        JTextField lastName = new JTextField(25); //25 is a number of length of a text field here
        lastNamePanel.add(label2);
        lastNamePanel.add(lastName);
        myFrame.add(lastNamePanel);

        JPanel buttonsPanel = new JPanel();
        JButton okButton = new JButton("OK");
        // External class to handle event
        //okButton.addActionListener(new OkButtonListener());
        // Anonymous inner class to handle event
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(myFrame,
                        "Hello: " + firstName.getText() + " " + lastName.getText());
            }
        });

        buttonsPanel.add(okButton);
        myFrame.add(buttonsPanel);

        myFrame.setVisible(true); // usually at the very end
    }
}

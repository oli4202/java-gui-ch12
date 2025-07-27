// Fig. 12.10: TextFieldTest.java
// Testing TextFieldFrame.

import javax.swing.JFrame;

public class TextFieldTest {
    public static void main(String[] args) {
        TextFieldFrame textFieldFrame = new TextFieldFrame(); // create frame
        textFieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit on close
        textFieldFrame.setSize(350, 100); // set frame size
        textFieldFrame.setVisible(true); // display frame
    }
}


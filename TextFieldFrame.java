import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TextFieldFrame extends JFrame {
    private final JTextField textField1; // text field with set size
    private final JTextField textField2; // text field with default text
    private final JTextField textField3; // uneditable text field with default text
    private final JPasswordField passwordField; // password field with default text

    public TextFieldFrame() {
        super("Testing JTextField and JPasswordField");
        setLayout(new FlowLayout());

        // construct text field with 10 columns
        textField1 = new JTextField(10);
        add(textField1);

        // construct text field with default text
        textField2 = new JTextField("Enter text here");
        add(textField2);

        // construct text field with default text and 21 columns
        textField3 = new JTextField("Uneditable text field", 21);
        textField3.setEditable(false); // disable editing
        add(textField3);

        // construct password field with default text
        passwordField = new JPasswordField("Hidden text");
        add(passwordField);

        // register event handlers
        TextFieldHandler handler = new TextFieldHandler();
        textField1.addActionListener(handler);
        textField2.addActionListener(handler);
        textField3.addActionListener(handler);
        passwordField.addActionListener(handler);
    }

    // private inner class for event handling
    private class TextFieldHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            String string = "";

            // user pressed Enter in textField1
            if (event.getSource() == textField1)
                string = String.format("textField1: %s", event.getActionCommand());

            // user pressed Enter in textField2
            else if (event.getSource() == textField2)
                string = String.format("textField2: %s", event.getActionCommand());

            // user pressed Enter in textField3
            else if (event.getSource() == textField3)
                string = String.format("textField3: %s", event.getActionCommand());

            // user pressed Enter in passwordField
            else if (event.getSource() == passwordField)
                string = String.format("passwordField: %s", new String(passwordField.getPassword()));

            // display JTextField content
            JOptionPane.showMessageDialog(null, string);
        }
    }
}

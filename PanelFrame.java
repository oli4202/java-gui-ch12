import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelFrame extends JFrame {
    private final JButton[] buttons;
    private final JPanel buttonJPanel;

    public PanelFrame() {
        super("Panel Demo");
        buttons = new JButton[5];
        buttonJPanel = new JPanel();
        buttonJPanel.setLayout(new GridLayout(1, buttons.length));

        for (int count = 0; count < buttons.length; count++) {
            buttons[count] = new JButton("Button " + (count + 1));
            buttonJPanel.add(buttons[count]);
        }

        add(buttonJPanel, BorderLayout.SOUTH);
    }
}

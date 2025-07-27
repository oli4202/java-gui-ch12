import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelFrame extends JFrame {
    private final JLabel label1;
    private final JLabel label2;
    private final JLabel label3;

    public LabelFrame() {
        super("Testing JLabel");
        setLayout(new FlowLayout());

        label1 = new JLabel("Label with text");
        add(label1);

        Icon bug = new ImageIcon("bug1.png");
        label2 = new JLabel("Label with text and icon", bug, SwingConstants.LEFT);
        add(label2);

        label3 = new JLabel();
        label3.setText("Label with icon and text at bottom");
        label3.setIcon(bug);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        add(label3);
    }
}

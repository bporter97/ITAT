import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
public class Gui
{


    public Gui()
    {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton button = new JButton("Click me");
    JLabel label = new JLabel("Number of clicks: ");

    panel.setBorder(BorderFactory.createEmptyBorder(300, 300, 500, 500));
    panel.setLayout(new GridLayout(0, 1));
    panel.add(button);

    frame.add(panel, BorderLayout.CENTER);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("ITAT");
    frame.pack();
    frame.setVisible(true);

    }
}
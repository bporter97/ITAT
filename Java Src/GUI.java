package src;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import jdk.tools.jlink.internal.Jlink;

import javax.swing.BorderFactory;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//Beginning of GUI interface


public class GUI implements ActionListener
{
    private JLabel serial;
    private JLabel makeModel;
    private JLabel name;
    private JLabel status; // Active/Inactive/Decomissioned: Green/yellow/red
    private JFrame frame;
    private JPanel panel;

    public GUI()
    {
        frame = new JFrame();
        serial = new JLabel("Serial Number");
        makeModel = new JLabel("Make and Model");
        name = new JLabel("Computer Name");
        status = new JLabel("Status");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(serial);
        panel.add(makeModel);
        panel.add(name);
        panel.add(status);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Basic Gui");
        frame.pack();
        frame.setVisible(true);


    }

}
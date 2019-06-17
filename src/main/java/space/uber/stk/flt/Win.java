package space.uber.stk.flt;

/*
import javax.swing.SwingUtilities;

import java.awt.*;
import java.awt.event.*;
import net.miginfocom.layout.Grid;
*/
import javax.swing.*;
import net.miginfocom.swing.MigLayout;


public class Win {

    private static final int height = 500;
    private static final int width = 500;

    Win(String name) {

        MigLayout layout = new MigLayout("fillx", "[right]rel[grow,fill]", "[]10[]");
        JPanel panel = new JPanel(layout);

        panel.add(new JLabel("Enter size:"), "");
        panel.add(new JTextField(""), "wrap");
        panel.add(new JLabel("Enter weight:"), "");
        panel.add(new JTextField(""), "");

        JFrame f = new JFrame(); 

        f.add(panel);

        
        f.setSize(width, height);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.pack();
        f.setVisible(true);
        /*
         * JFrame f = new JFrame(); JButton b = new JButton(name);
         * 
         * final JTextArea ta = new JTextArea(); ta.setBounds(50,50,150,20);
         * 
         * b.setBounds(130, 100, 100, 40); b.addActionListener(new ActionListener(){
         * public void actionPerformed(ActionEvent e){ ta.getText();
         * System.out.println(ta.getText()); ta.setText("Penis"); } });
         * 
         * f.add(ta); f.add(b); f.setSize(width, height); f.setLayout(null);
         * f.setVisible(true);
         */
    }
}
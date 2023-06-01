package GUI;

import javax.swing.*;

public class Welcome {
    private JPanel panel2;
    private JButton customerButton;
    private JButton adminButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Welcome");
        frame.setContentPane(new Welcome().panel2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500,500);
    }
}

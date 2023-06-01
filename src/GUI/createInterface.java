package GUI;

import javax.swing.*;

public class createInterface extends JFrame {
    private JPanel loginframe;
    private JPasswordField passwordField1;
    private JTextField textField1;
    private JButton CANCELButton;
    private JButton LOGINButton;







    public static void main(String[] args) {
        JFrame frame = new JFrame("createInterface");
        frame.setContentPane(new createInterface().loginframe);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500,500);


    }
}

package GUI;

import javax.swing.*;


public class CustomerForm {
    private JTextField textField1;
    private JTextField textField2;
    private JButton submitButton;
    private JPanel customerForm;
    private JComboBox comboBox1;


    public static void main(String[] args) {
        JFrame frame = new JFrame("CustomerForm");
        frame.setContentPane(new CustomerForm().customerForm);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500,500);
    }
}

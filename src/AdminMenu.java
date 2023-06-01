import javax.swing.*;

public class AdminMenu {
    private JPanel adminMenu;
    private JButton bookHallButton;
    private JButton editBookingButton;
    private JButton searchHallButton;
    private JButton deleteBookingButton;
    private JButton addAdminButton;


    public static void main(String[] args) {
        JFrame frame = new JFrame("AdminMenu");
        frame.setContentPane(new AdminMenu().adminMenu);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500,500);
    }


}

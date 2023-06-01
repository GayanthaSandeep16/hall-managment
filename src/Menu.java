import javax.swing.*;

public class Menu {
    private JButton bookHallButton;
    private JButton editBookingButton;
    private JButton searchHallButton;
    private JButton deleteBookingButton;
    private JPanel menu;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu");
        frame.setContentPane(new Menu().menu);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500,500);
    }
}

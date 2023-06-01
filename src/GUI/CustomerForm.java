package GUI;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import javax.swing.*;
import java.awt.*;
import java.util.Properties;

public class CustomerForm extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JButton submitButton;
    private JPanel customerForm;
    private JComboBox<String> comboBox1;
    private JPanel calander;

    private UtilDateModel model;
    private JDatePanelImpl datePanel;
    private static JDatePickerImpl datePicker;

    public CustomerForm() {
        Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
        model = new UtilDateModel();
        datePanel = new JDatePanelImpl(model, p);
        datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());

        calander = new JPanel();
        calander.add(datePicker);

        customerForm = new JPanel();
        customerForm.setLayout(new BorderLayout());
        customerForm.add(calander, BorderLayout.NORTH);

        // Add other components to customerForm panel

        // Set customerForm as the content pane
        setContentPane(customerForm);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CustomerForm frame = new CustomerForm();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 500);
            frame.setVisible(true);
        });
    }
}

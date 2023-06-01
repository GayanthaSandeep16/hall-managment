package GUI;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;


public class BookingGui extends JFrame {


    private JLabel doctorName;
    private JLabel date;
    private JLabel startTime;
    private JLabel endTime;

    private JTextField showPanel;


    private JButton book;
    private JButton back;

    private UtilDateModel model;
    private JDatePanelImpl datePanel;
    private JDatePickerImpl datePicker;
    private JComboBox showStartTime;
    private JComboBox showEndTime;

    private Date selectedDate;
    private JComboBox jComboBox1;


    public BookingGui() throws ParseException {

        book = new JButton("Book");
        back = new JButton("Back");

        doctorName = new JLabel("Select Doctor");
        date = new JLabel("Date");
        startTime = new JLabel("Start Time");
        endTime = new JLabel("Enter how much Time do You need ");
        showPanel = new JTextField(10);


// date model
        Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
        model = new UtilDateModel();
        datePanel = new JDatePanelImpl(model, p);
        datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());


        jComboBox1 = new JComboBox();
        DefaultComboBoxModel mod = new DefaultComboBoxModel();
        jComboBox1.setModel(mod);


        showStartTime = new JComboBox();
        showEndTime = new JComboBox();
        showEndTime.setMaximumRowCount(5);
        showStartTime.setMaximumRowCount(5);


// panel create
        JPanel jPanel = new JPanel();
        JPanel jPanel1 = new JPanel();
        JPanel jPanel2 = new JPanel();
        JPanel jPanel3 = new JPanel();

        jPanel.setLayout(new BorderLayout(20, 20));
        jPanel.add(jPanel3, BorderLayout.CENTER);


        jPanel3.setLayout(new GridLayout(2, 0, 10, 10));

        jPanel3.add(jPanel2);


        jPanel2.setLayout(new GridLayout(5, 2, 10, 10));
        jPanel2.add(doctorName);
        jPanel2.add(jComboBox1);
        jPanel2.add(date);
        jPanel2.add(datePicker);
        jPanel2.add(startTime);
        jPanel2.add(showStartTime);
        jPanel2.add(endTime);
        jPanel2.add(showEndTime);


        jPanel1.setLayout(new FlowLayout(FlowLayout.CENTER));
        jPanel1.add(book);
        add(jPanel1, BorderLayout.SOUTH);
        jPanel.add(jPanel2, BorderLayout.WEST);
        jPanel.add(showPanel, BorderLayout.CENTER);


        add(jPanel);

        book.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == book) {
                    if (datePicker.getJFormattedTextField().getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Required filed missing");
                    } else {
                        selectedDate = (Date) datePicker.getModel().getValue();
                        String selectedStartTime = showStartTime.getItemAt(showStartTime.getSelectedIndex()).toString();
                        String hours = showEndTime.getItemAt(showEndTime.getSelectedIndex()).toString();
                        String[] parts = hours.split(" ");
                        int hourCount = Integer.parseInt(parts[0]);

                        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a");
                        Calendar calendar = Calendar.getInstance();

                        try {
                            Date RSTime = sdf.parse(selectedStartTime);
                            calendar.setTime(RSTime);
                            calendar.set(Calendar.YEAR, selectedDate.getYear());
                            calendar.set(Calendar.MONTH, selectedDate.getMonth());
                            calendar.set(Calendar.DAY_OF_MONTH, selectedDate.getDate());
                            Date combinedDateTime = calendar.getTime();
                            System.out.println(combinedDateTime);
                            calendar.setTime(combinedDateTime);
                            ArrayList<Date> times = new ArrayList<Date>();
                            times.add(combinedDateTime);
                            if (hourCount > 1) {
                                for (int i = 0; i < hourCount; i++) {
                                    calendar.add(Calendar.HOUR_OF_DAY, 1);
                                    Date anotherTime = calendar.getTime();
                                    times.add(anotherTime);
                                }
                            }


                        } catch (ParseException parseException) {
                            parseException.printStackTrace();
                        }
                    }
                }
            }
        });
    }

    ;


//    public void bookingGuiOpen() throws ParseException {
//
//                        BookingGui frame = new BookingGui();
//                        frame.setSize(1000, 700);
//                        frame.setVisible(true);
//                        frame.setTitle("Booking doctor");
//                        frame.setLocationRelativeTo(null);
//                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//                    }};
public static void main(String[] args) {
    try {
        BookingGui frame = new BookingGui();
        frame.setSize(1000, 700);
        frame.setVisible(true);
        frame.setTitle("Booking doctor");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } catch (ParseException e) {
        e.printStackTrace();
}
}}
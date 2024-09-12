/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotelreservationsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HotelReservationSystem extends JFrame {
    // Components for the GUI
    private JComboBox<String> roomCategoryComboBox;
    private JTextArea bookingDetailsTextArea;
    private JTextField nameField, paymentField;
    private JButton searchButton, bookButton;

    // Sample data
    private String[] roomCategories = {"Single", "Double", "Suite"};
    private boolean[] roomAvailability = {true, false, true}; // true = available, false = booked

    public HotelReservationSystem() {
        // Set up the frame
        setTitle("Hotel Reservation System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel for search and booking
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        // Room category selection
        panel.add(new JLabel("Select Room Category:"));
        roomCategoryComboBox = new JComboBox<>(roomCategories);
        panel.add(roomCategoryComboBox);

        // Name field for booking
        panel.add(new JLabel("Your Name:"));
        nameField = new JTextField();
        panel.add(nameField);

        // Payment field
        panel.add(new JLabel("Payment:"));
        paymentField = new JTextField();
        panel.add(paymentField);

        // Search button
        searchButton = new JButton("Search Availability");
        panel.add(searchButton);

        // Book button
        bookButton = new JButton("Book Room");
        panel.add(bookButton);

        add(panel, BorderLayout.NORTH);

        // Text area to show booking details
        bookingDetailsTextArea = new JTextArea();
        bookingDetailsTextArea.setEditable(false);
        add(new JScrollPane(bookingDetailsTextArea), BorderLayout.CENTER);

        // Action listeners for buttons
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchAvailability();
            }
        });

        bookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bookRoom();
            }
        });
    }

    private void searchAvailability() {
        int selectedIndex = roomCategoryComboBox.getSelectedIndex();
        if (roomAvailability[selectedIndex]) {
            bookingDetailsTextArea.setText("Room is available for booking.");
        } else {
            bookingDetailsTextArea.setText("Room is not available.");
        }
    }

    private void bookRoom() {
        int selectedIndex = roomCategoryComboBox.getSelectedIndex();
        if (roomAvailability[selectedIndex]) {
            String name = nameField.getText();
            String payment = paymentField.getText();

            if (name.isEmpty() || payment.isEmpty()) {
                bookingDetailsTextArea.setText("Please fill in all fields.");
                return;
            }

            // Process payment (simulation)
            bookingDetailsTextArea.setText("Processing payment...\n");
            bookingDetailsTextArea.append("Room booked successfully for " + name + " in " + roomCategories[selectedIndex] + " category.\n");
            bookingDetailsTextArea.append("Payment: " + payment + "\n");

            // Mark room as booked
            roomAvailability[selectedIndex] = false;
        } else {
            bookingDetailsTextArea.setText("Room is not available.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new HotelReservationSystem().setVisible(true);
            }
        });
    }
}


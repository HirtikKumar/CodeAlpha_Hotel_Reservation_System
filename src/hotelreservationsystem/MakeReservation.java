/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotelreservationsystem;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class MakeReservation extends javax.swing.JFrame {
String payment = null;
    private String[] roomCategories = {"Single", "Double", "Deluxe", "Suite"};
    private boolean[] room_Availability = {true, false, false, true};

    /**
     * Creates new form MakeReservation
     */
    public MakeReservation() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        heading = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        BookRoomButton = new javax.swing.JButton();
        roomComboBox = new javax.swing.JComboBox<>();
        roomType = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ReservationtextArea = new javax.swing.JTextArea();
        Name = new javax.swing.JLabel();
        nameInput = new javax.swing.JTextField();
        Name1 = new javax.swing.JLabel();
        cnicInput = new javax.swing.JTextField();
        CreditNumber = new javax.swing.JLabel();
        Cvv = new javax.swing.JLabel();
        CCInput = new javax.swing.JTextField();
        CvvInput = new javax.swing.JTextField();
        Payment = new javax.swing.JLabel();
        PaymentInput = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel13.setBackground(new java.awt.Color(47, 79, 79));

        jPanel14.setBackground(new java.awt.Color(28, 28, 28));

        heading.setBackground(new java.awt.Color(135, 206, 250));
        heading.setFont(new java.awt.Font("Sitka Heading", 1, 36)); // NOI18N
        heading.setForeground(new java.awt.Color(245, 245, 245));
        heading.setText("Make Reservation");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(heading)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(heading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        back.setBackground(new java.awt.Color(0, 255, 255));
        back.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        back.setForeground(new java.awt.Color(28, 28, 28));
        back.setText("Back");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        BookRoomButton.setBackground(new java.awt.Color(0, 255, 255));
        BookRoomButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        BookRoomButton.setForeground(new java.awt.Color(28, 28, 28));
        BookRoomButton.setText("Book Room");
        BookRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookRoomButtonActionPerformed(evt);
            }
        });

        roomComboBox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        roomComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single Room ", "Double Room", "Deluxe Room", "Suite" }));
        roomComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomComboBoxActionPerformed(evt);
            }
        });

        roomType.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        roomType.setForeground(new java.awt.Color(255, 255, 255));
        roomType.setText("Room Type :");

        ReservationtextArea.setEditable(false);
        ReservationtextArea.setColumns(20);
        ReservationtextArea.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ReservationtextArea.setRows(5);
        jScrollPane1.setViewportView(ReservationtextArea);

        Name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Name.setForeground(new java.awt.Color(255, 255, 255));
        Name.setText("Name :");

        nameInput.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        Name1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Name1.setForeground(new java.awt.Color(255, 255, 255));
        Name1.setText("CNIC :");

        cnicInput.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        CreditNumber.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CreditNumber.setForeground(new java.awt.Color(255, 255, 255));
        CreditNumber.setText("Credit Card No:");

        Cvv.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Cvv.setForeground(new java.awt.Color(255, 255, 255));
        Cvv.setText("CVV :");

        CCInput.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        CvvInput.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        Payment.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Payment.setForeground(new java.awt.Color(255, 255, 255));
        Payment.setText("Payment :");

        PaymentInput.setEditable(false);
        PaymentInput.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(back)
                                .addGap(122, 122, 122)
                                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(roomType)
                                            .addComponent(Name)
                                            .addComponent(Name1)
                                            .addComponent(Payment))
                                        .addGap(31, 31, 31))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createSequentialGroup()
                                        .addComponent(Cvv)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addComponent(CreditNumber)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(roomComboBox, 0, 165, Short.MAX_VALUE)
                                    .addComponent(nameInput)
                                    .addComponent(cnicInput, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(CCInput, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(PaymentInput, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(CvvInput))))
                        .addGap(39, 139, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BookRoomButton)
                        .addGap(229, 229, 229))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back))
                .addGap(47, 47, 47)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomType))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Name)
                    .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cnicInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name1))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PaymentInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Payment))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreditNumber)
                    .addComponent(CCInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cvv)
                    .addComponent(CvvInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BookRoomButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        this.dispose();
        new Hotel_main().setVisible(true);
    }//GEN-LAST:event_backMouseClicked

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Hotel_main().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void BookRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookRoomButtonActionPerformed
        // TODO add your handling code here
        int selectedIndex = roomComboBox.getSelectedIndex();
        if (room_Availability[selectedIndex]) {
            if (nameInput.getText().isEmpty() || cnicInput.getText().isEmpty() || CCInput.getText().isEmpty() || CvvInput.getText().isEmpty()) {
                ReservationtextArea.setText("Please fill in all fields.");
            } else {
//                ReservationtextArea.setText
                ReservationtextArea.setText("Room booked successfully for " + nameInput.getText() + " in " + roomCategories[selectedIndex] + " category.\n");
            ReservationtextArea.append("Payment: " + payment + "\n");
            FileWriter importWriter = null;

            try {
                importWriter = new FileWriter("roomDetails.txt", false);
                importWriter.write(nameInput.getText() + ",");
                importWriter.write(cnicInput.getText()+ ",");
                importWriter.write(PaymentInput.getText()+ ",");
                importWriter.write(CCInput.getText()+ ",");
                importWriter.write(CvvInput.getText()+ "\n");
                importWriter.close();
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            }

        } else {
            ReservationtextArea.setText("The room is currently unavailable for booking.\n");
            ReservationtextArea.append("Please choose a different room or check back later");
        }
        
         
            nameInput.setText("");
            cnicInput.setText("");
            CCInput.setText("");
            CvvInput.setText("");


    }//GEN-LAST:event_BookRoomButtonActionPerformed

    private void roomComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomComboBoxActionPerformed
        // TODO add your handling code here:
        payment = null;
        int selectedIndex = roomComboBox.getSelectedIndex();
        if (selectedIndex == 0) {
            payment = "2000 Rs";
        } else if (selectedIndex == 1) {
            payment = "3000 Rs";
        } else if (selectedIndex == 2) {
            payment = "4000 Rs";
        } else if (selectedIndex == 3) {
            payment = "6000 Rs";
        }
        PaymentInput.setText(payment);
    }//GEN-LAST:event_roomComboBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MakeReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MakeReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MakeReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MakeReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MakeReservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BookRoomButton;
    private javax.swing.JTextField CCInput;
    private javax.swing.JLabel CreditNumber;
    private javax.swing.JLabel Cvv;
    private javax.swing.JTextField CvvInput;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Name1;
    private javax.swing.JLabel Payment;
    private javax.swing.JTextField PaymentInput;
    private javax.swing.JTextArea ReservationtextArea;
    private javax.swing.JButton back;
    private javax.swing.JTextField cnicInput;
    private javax.swing.JLabel heading;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameInput;
    private javax.swing.JComboBox<String> roomComboBox;
    private javax.swing.JLabel roomType;
    // End of variables declaration//GEN-END:variables
}
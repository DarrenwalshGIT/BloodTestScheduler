/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bloodtestscheduler;

//Imports
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 * 14 - 16 March 2025
 *
 * @author Darren Walsh x23140003 Data Structures & Algorithms CA1
 */
public class BTSGUI extends javax.swing.JFrame {

    //Creating models for my list boxes
    private final DefaultListModel<String> currentListModel = new DefaultListModel<>();
    private final DefaultListModel<String> noShowListModel = new DefaultListModel<>();
    PatientPQ patientQueue = new PatientPQ(); //Instance of PatientPQ
    int MAX_NO_SHOWS = 5; // Giving max number of No Shows to 5

    /**
     * Creates new form BTSGUI
     */
    public BTSGUI() {
        initComponents();

        //Initializing Models
        currentLIST.setModel(currentListModel);
        noShowLIST.setModel(noShowListModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerLBl = new javax.swing.JLabel();
        nameLBL = new javax.swing.JLabel();
        ageLBL = new javax.swing.JLabel();
        priorityLBL = new javax.swing.JLabel();
        wardLBL = new javax.swing.JLabel();
        gpLBL = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        ageTF = new javax.swing.JTextField();
        gpTF = new javax.swing.JTextField();
        requestBTN = new javax.swing.JButton();
        noShowBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        noShowLIST = new javax.swing.JList<>();
        noShowListLBL = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        currentLIST = new javax.swing.JList<>();
        currentLBL = new javax.swing.JLabel();
        priorityCB = new javax.swing.JComboBox<>();
        wardCB = new javax.swing.JComboBox<>();
        completedBTN = new javax.swing.JButton();
        showFullListBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headerLBl.setText("Blood Test Scheduler");

        nameLBL.setText("Name");

        ageLBL.setText("Age");

        priorityLBL.setText("Priority");

        wardLBL.setText("From Ward");

        gpLBL.setText("GP Details");

        requestBTN.setText("Request Test");
        requestBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestBTNActionPerformed(evt);
            }
        });

        noShowBTN.setText("No Show");
        noShowBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noShowBTNActionPerformed(evt);
            }
        });

        noShowLIST.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(noShowLIST);

        noShowListLBL.setText("No Show List");

        currentLIST.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(currentLIST);

        currentLBL.setText("Current Queue");

        priorityCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Low", "Medium", "Urgent" }));

        wardCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));

        completedBTN.setText("Completed Blood test");
        completedBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completedBTNActionPerformed(evt);
            }
        });

        showFullListBTN.setText("Show Full List");
        showFullListBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showFullListBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(headerLBl)
                .addGap(290, 290, 290))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLBL)
                            .addComponent(ageLBL)
                            .addComponent(priorityLBL)
                            .addComponent(gpLBL))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(requestBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(nameTF, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ageTF, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(priorityCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(31, 31, 31)
                                    .addComponent(wardLBL)
                                    .addGap(18, 18, 18)
                                    .addComponent(wardCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(gpTF))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(currentLBL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(showFullListBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(noShowListLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(175, 175, 175)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(noShowBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(completedBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerLBl)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLBL)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLBL)
                    .addComponent(ageTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priorityLBL)
                    .addComponent(priorityCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wardLBL)
                    .addComponent(wardCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gpLBL)
                    .addComponent(gpTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(requestBTN)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(noShowListLBL)
                            .addComponent(currentLBL)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(completedBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(noShowBTN)
                        .addGap(5, 5, 5)
                        .addComponent(showFullListBTN)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void requestBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestBTNActionPerformed
        // TODO add your handling code here:
        //Method that retrieves Patient info and adds them to List
        String name = nameTF.getText();
        int age = Integer.parseInt(ageTF.getText());
        String priority = (String) priorityCB.getSelectedItem();
        boolean fromWard = wardCB.getSelectedItem().equals("Yes");
        String gpDetails = gpTF.getText();

        //Create a new patient
        Patient newPatient = new Patient(name, age, priority, fromWard, gpDetails);

        //Add patient to the persistent priority queue
        patientQueue.enqueue(newPatient);

        //Update the current list model with sorted queue
        updateCurrentListModel();

        //Clear input fields
        nameTF.setText("");
        ageTF.setText("");
        gpTF.setText("");
    }

    // Method to update GUI list
    private void updateCurrentListModel() {
        currentListModel.clear(); //Removes all items from list
        for (Patient patient : patientQueue.getQueue()) { //Loops through each Patient in PQ ArrayList
            currentListModel.addElement(patient.toString()); //Adds Patient to the List on the GUI
            updateSizeLabel(); //Updates Queue size after adding to list action
        }
    }//GEN-LAST:event_requestBTNActionPerformed

    private void noShowBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noShowBTNActionPerformed
        // TODO add your handling code here:
        Patient removedPatient = patientQueue.dequeue(); //Remove highest-priority patient
        if (removedPatient != null) {
            String patientString = removedPatient.toString(); //Creates String of Patient
            currentListModel.removeElement(patientString); //Removes Patient as a String
            if (noShowListModel.size() >= MAX_NO_SHOWS) { //Checks list to see if @ max capacity
                noShowListModel.removeElementAt(0);
            }
            noShowListModel.addElement(patientString);//Adds Patient to 'No Show' List on the GUI
            updateSizeLabel(); //Updates Queue size after No Show action
        }
    }//GEN-LAST:event_noShowBTNActionPerformed

    private void updateSizeLabel() {
        // Assuming a new JLabel sizeLBL is added to the GUI
        currentLBL.setText("Queue Size: " + patientQueue.size());
    }

    private void completedBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completedBTNActionPerformed
        // TODO add your handling code here:
        Patient completedPatient = patientQueue.dequeue(); //Dequeue removes Patient from list, upon 'Completed' button action
        currentListModel.removeElement(completedPatient.toString()); //Removes Patient from GUI Interface
        updateSizeLabel(); //Updates Queue size after deQueueing from list
    }//GEN-LAST:event_completedBTNActionPerformed

    private void showFullListBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showFullListBTNActionPerformed
        // TODO add your handling code here:
        //Added JOptionPane to display patient list, calling recursion methods
        JOptionPane.showMessageDialog(this, patientQueue.printPQueue(), "Full Patient List", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_showFullListBTNActionPerformed

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
            java.util.logging.Logger.getLogger(BTSGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BTSGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BTSGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BTSGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BTSGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLBL;
    private javax.swing.JTextField ageTF;
    private javax.swing.JButton completedBTN;
    private javax.swing.JLabel currentLBL;
    private javax.swing.JList<String> currentLIST;
    private javax.swing.JLabel gpLBL;
    private javax.swing.JTextField gpTF;
    private javax.swing.JLabel headerLBl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nameLBL;
    private javax.swing.JTextField nameTF;
    private javax.swing.JButton noShowBTN;
    private javax.swing.JList<String> noShowLIST;
    private javax.swing.JLabel noShowListLBL;
    private javax.swing.JComboBox<String> priorityCB;
    private javax.swing.JLabel priorityLBL;
    private javax.swing.JButton requestBTN;
    private javax.swing.JButton showFullListBTN;
    private javax.swing.JComboBox<String> wardCB;
    private javax.swing.JLabel wardLBL;
    // End of variables declaration//GEN-END:variables
}

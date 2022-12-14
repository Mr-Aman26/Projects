/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;


/**
 *
 * @author amanjain
 */
public class Personality extends javax.swing.JFrame {

    //ArrayList<String> data = new ArrayList<String>();

    /**
     * Creates new form Personality
     */
    public Personality() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabelOpen = new javax.swing.JLabel();
        txtUserInputOpen = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jlabelAgree = new javax.swing.JLabel();
        txtUserInputAgree = new javax.swing.JTextField();
        jlabelNeuro = new javax.swing.JLabel();
        jlabelConsi = new javax.swing.JLabel();
        jlabelExtra = new javax.swing.JLabel();
        txtUserInputNeuro = new javax.swing.JTextField();
        txtUserInputConsi = new javax.swing.JTextField();
        txtUserInputExtra = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel2.setText("-> Openness");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(265, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Personality");

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Rate Yourself ! (1-10)");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabelOpen.setText("-> Openness");

        txtUserInputOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserInputOpenActionPerformed(evt);
            }
        });

        jButton1.setText("submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jlabelAgree.setText("-> Agreeableness");

        txtUserInputAgree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserInputAgreeActionPerformed(evt);
            }
        });

        jlabelNeuro.setText("-> Neuroticism");

        jlabelConsi.setText("-> Conscientiousness");

        jlabelExtra.setText("-> Extraversion");

        txtUserInputNeuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserInputNeuroActionPerformed(evt);
            }
        });

        txtUserInputConsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserInputConsiActionPerformed(evt);
            }
        });

        txtUserInputExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserInputExtraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlabelAgree, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(txtUserInputAgree, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlabelNeuro, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(txtUserInputNeuro))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlabelConsi, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(txtUserInputConsi))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlabelExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(txtUserInputExtra))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabelOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUserInputOpen))))
                .addGap(247, 247, 247))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelOpen)
                    .addComponent(txtUserInputOpen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabelAgree)
                    .addComponent(txtUserInputAgree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserInputNeuro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabelNeuro))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserInputConsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabelConsi))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserInputExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabelExtra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(81, 81, 81))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void txtUserInputOpenActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        
    }                                                

    public void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(txtUserInputOpen.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(Personality.this, "Enter correct details");
            txtUserInputOpen.grabFocus();
            return;
        }
        if(txtUserInputAgree.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(Personality.this, "Enter correct details");
            txtUserInputAgree.grabFocus();
            return;
        }
        
        if(txtUserInputNeuro.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(Personality.this, "Enter correct details");
            txtUserInputNeuro.grabFocus();
            return;
        }
        
        if(txtUserInputConsi.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(Personality.this, "Enter correct details");
            txtUserInputConsi.grabFocus();
            return;
        }
        
        if(txtUserInputExtra.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(Personality.this, "Enter correct details");
            txtUserInputExtra.grabFocus();
            return;
        }
        
       
        String n1 = Personal_Details.n1;
        String n2 = Personal_Details.n2;
        String n3 = txtUserInputOpen.getText();
        String n4 = txtUserInputAgree.getText();
        String n5 = txtUserInputNeuro.getText();
        String n6 = txtUserInputConsi.getText();
        String n7 = txtUserInputExtra.getText();

        //ArrayList<String> data = new ArrayList<String>();
        String[] data ={n1,n2,n3,n4,n5, n6, n7};
        // data.add(n1);
        // data.add(n2);
        // data.add(n3);
        // data.add(n4);
        // data.add(n5);

        csvfile obj = new csvfile();
        
        obj.csvinput(data);
       
        //VOYAGER.personality1();
        //String persona = VOYAGER.personality;
        // new Search().setVisible(true);
      
        
        if(Integer.valueOf(n3)>10 || Integer.valueOf(n4)>10||Integer.valueOf(n5)>10||Integer.valueOf(n6)>10||Integer.valueOf(n7)>10){
        JOptionPane.showMessageDialog(Personality.this, "WRONG INPUT");
        
        }
        else{
            new Search().setVisible(true);
        }
        //JOptionPane.showMessageDialog(Personality.this, "Data: " + data);
        
        
        
        
    }  
    
    

    private void txtUserInputAgreeActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void txtUserInputNeuroActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void txtUserInputConsiActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void txtUserInputExtraActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Personality.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Personality.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Personality.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Personality.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Personality().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelOpen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel jlabelAgree;
    private javax.swing.JLabel jlabelConsi;
    private javax.swing.JLabel jlabelExtra;
    private javax.swing.JLabel jlabelNeuro;
    private javax.swing.JTextField txtUserInputAgree;
    private javax.swing.JTextField txtUserInputConsi;
    private javax.swing.JTextField txtUserInputExtra;
    private javax.swing.JTextField txtUserInputNeuro;
    private javax.swing.JTextField txtUserInputOpen;
    // End of variables declaration                   
}
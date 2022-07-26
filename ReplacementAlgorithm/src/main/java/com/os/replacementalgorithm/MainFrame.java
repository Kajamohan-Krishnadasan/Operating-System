
/*
 * Author : KAJAMOHAN K. (2018/E/055)
 */

package com.os.replacementalgorithm;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }
    
    // Mouse pointer Position
    private int posX = 0, posY = 0;

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        CloseButton = new javax.swing.JButton();
        Heading = new javax.swing.JLabel();
        InputLabel = new javax.swing.JLabel();
        Calculate = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        InputValidInfo = new javax.swing.JLabel();
        InputField = new javax.swing.JTextField();
        FrameLabel = new javax.swing.JLabel();
        FrameField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 0));
        setBounds(new java.awt.Rectangle(0, 0, 10, 20));
        setUndecorated(true);
        setResizable(false);

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 255), new java.awt.Color(0, 51, 255)));
        MainPanel.setPreferredSize(new java.awt.Dimension(500, 500));
        MainPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MainPanelMouseDragged(evt);
            }
        });
        MainPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MainPanelMousePressed(evt);
            }
        });

        CloseButton.setBackground(new java.awt.Color(153, 153, 255));
        CloseButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CloseButton.setForeground(new java.awt.Color(51, 0, 51));
        CloseButton.setText("X");
        CloseButton.setToolTipText("Exit");
        CloseButton.setAlignmentY(1.0F);
        CloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });

        Heading.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        Heading.setForeground(new java.awt.Color(0, 51, 51));
        Heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Heading.setText("Replacement Algorithm");
        Heading.setToolTipText("Replacement Algorithm");
        Heading.setAlignmentY(0.0F);
        Heading.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Heading.setInheritsPopupMenu(false);
        Heading.setRequestFocusEnabled(false);
        Heading.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeadingMouseDragged(evt);
            }
        });
        Heading.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeadingMousePressed(evt);
            }
        });

        InputLabel.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        InputLabel.setText("Input   : ");
        InputLabel.setToolTipText("Input");

        Calculate.setBackground(new java.awt.Color(102, 102, 102));
        Calculate.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        Calculate.setForeground(new java.awt.Color(255, 255, 255));
        Calculate.setText("Calculate");
        Calculate.setToolTipText("Calculate");
        Calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateActionPerformed(evt);
            }
        });

        Reset.setBackground(new java.awt.Color(153, 153, 153));
        Reset.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        Reset.setForeground(new java.awt.Color(255, 255, 255));
        Reset.setText("Reset");
        Reset.setToolTipText("Reset");
        Reset.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        Cancel.setBackground(new java.awt.Color(102, 102, 102));
        Cancel.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        Cancel.setForeground(new java.awt.Color(255, 255, 255));
        Cancel.setText("Cancel");
        Cancel.setToolTipText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        InputValidInfo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        InputValidInfo.setForeground(new java.awt.Color(255, 51, 0));
        InputValidInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InputValidInfo.setText("(*Input the String without Spaces*)");

        InputField.setColumns(2);
        InputField.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        InputField.setForeground(java.awt.Color.lightGray);
        InputField.setText("Enter the String without Space");
        InputField.setToolTipText("Input");
        InputField.setName("Name"); // NOI18N
        InputField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                InputFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                InputFieldFocusLost(evt);
            }
        });
        InputField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                InputFieldKeyPressed(evt);
            }
        });

        FrameLabel.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        FrameLabel.setText("Frame Size : ");
        FrameLabel.setToolTipText("Input");

        FrameField.setColumns(2);
        FrameField.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        FrameField.setForeground(java.awt.Color.lightGray);
        FrameField.setText("Enter the Frame Size");
        FrameField.setToolTipText("Frame Size");
        FrameField.setName("Name"); // NOI18N
        FrameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FrameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FrameFieldFocusLost(evt);
            }
        });
        FrameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FrameFieldKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(Calculate)
                        .addGap(60, 60, 60)
                        .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(FrameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(FrameField, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(InputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(InputField)
                                    .addComponent(InputValidInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE))))))
                .addGap(90, 96, Short.MAX_VALUE))
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(Heading, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Heading, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InputValidInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FrameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FrameField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_CloseButtonActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        InputField.setText("");
        this.dispose();
    }//GEN-LAST:event_CancelActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        InputField.setText("Enter the String without Space");
        FrameField.setText("Enter the Frame Size");
        InputField.setForeground(Color.GRAY);
        FrameField.setForeground(Color.GRAY);
    }//GEN-LAST:event_ResetActionPerformed

    private void MainPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainPanelMousePressed
        // Get Mouse Position X,Y Co-Ordinates
        posX = evt.getX();
        posY = evt.getY();
    }//GEN-LAST:event_MainPanelMousePressed

    private void MainPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainPanelMouseDragged
        // Move all Frame using Mouse 
        setLocation(evt.getXOnScreen()-posX,evt.getYOnScreen()-posY);
    }//GEN-LAST:event_MainPanelMouseDragged

    private void CalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateActionPerformed
        String input = InputField.getText();
        String frame = FrameField.getText();
 
        int frameSize;
        
        if(isValidInput(input) && isValidInput(frame)){
            frameSize = Integer.parseInt(FrameField.getText());
            calculate(frameSize, input);
        }else{
            JOptionPane.showMessageDialog(this,"Please Check Your Input !!!");
        }
    }//GEN-LAST:event_CalculateActionPerformed

    private void InputFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InputFieldFocusGained
        if(InputField.getText().contentEquals("Enter the String without Space")){
            InputField.setText("");
            InputField.setForeground(Color.black);
        }
        
    }//GEN-LAST:event_InputFieldFocusGained

    private void HeadingMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeadingMousePressed
        // Get Mouse Position X,Y Co-Ordinates
        posX = evt.getX();
        posY = evt.getY();
    }//GEN-LAST:event_HeadingMousePressed

    private void HeadingMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeadingMouseDragged
        // Move all Frame using Mouse 
        setLocation(evt.getXOnScreen()-posX,evt.getYOnScreen()-posY);
    }//GEN-LAST:event_HeadingMouseDragged

    private void FrameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FrameFieldFocusGained
        if(FrameField.getText().contentEquals("Enter the Frame Size")){
            FrameField.setText("");
            FrameField.setForeground(Color.black);
        }
    }//GEN-LAST:event_FrameFieldFocusGained

    private void InputFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InputFieldFocusLost
        if(InputField.getText().isEmpty()){
            InputField.setText("Enter the String without Space");
            InputField.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_InputFieldFocusLost

    private void FrameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FrameFieldFocusLost
        if(FrameField.getText().isEmpty()){
            FrameField.setText("Enter the Frame Size");
            FrameField.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_FrameFieldFocusLost

    private void InputFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InputFieldKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           FrameField.requestFocus();
        }
    }//GEN-LAST:event_InputFieldKeyPressed

    private void FrameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FrameFieldKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            String input = InputField.getText();
            String frame = FrameField.getText();

            int frameSize;

            if(isValidInput(input) && isValidInput(frame)){
                frameSize = Integer.parseInt(FrameField.getText());
                calculate(frameSize, input);
            }else{
                JOptionPane.showMessageDialog(this,"Please Check Your Input !!!");
            }
        }
    }//GEN-LAST:event_FrameFieldKeyPressed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calculate;
    private javax.swing.JButton Cancel;
    private javax.swing.JButton CloseButton;
    private javax.swing.JTextField FrameField;
    private javax.swing.JLabel FrameLabel;
    private javax.swing.JLabel Heading;
    private javax.swing.JTextField InputField;
    private javax.swing.JLabel InputLabel;
    private javax.swing.JLabel InputValidInfo;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton Reset;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    private boolean isValidInput(String inputString){
        String regex = "[0-9]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputString);
        
        return matcher.matches();    
    }
    
    private void calculate(int frameSize, String inputString){
        DisplayOutput disp = new DisplayOutput();
        disp.setInputValue(frameSize, inputString);
        disp.setVisible(true);
    }
    
}



package com.os.replacementalgorithm;

import com.os.replacementalgorithm.Algorithms.*;
/**
 * Author : KAJAMOHAN K. (2018/E/055)
 */
public class DisplayOutput extends javax.swing.JFrame {

    /**
     * Creates new form DisplayOutput
     */
    public DisplayOutput() {
        initComponents();
    }
    private int posX = 0, posY = 0;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        HeadingLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        CloseButton = new javax.swing.JButton();
        FIFO = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        FIFO1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        FIFO2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        FIFO3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        Cancel = new javax.swing.JButton();
        FrameSizeLabel = new javax.swing.JLabel();
        InputLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));
        MainPanel.setPreferredSize(new java.awt.Dimension(900, 500));
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

        HeadingLabel.setFont(new java.awt.Font("Bahnschrift", 0, 48)); // NOI18N
        HeadingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HeadingLabel.setText("Replacement Algorithm Output");
        HeadingLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        HeadingLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        HeadingLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeadingLabelMouseDragged(evt);
            }
        });
        HeadingLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeadingLabelMousePressed(evt);
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

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(2);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jTextArea1.setRows(2);
        jTextArea1.setTabSize(7);
        jTextArea1.setText("   First In First Out \n        Algorithm");
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setBorder(null);
        jTextArea1.setEnabled(false);
        jTextArea1.setFocusable(false);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout FIFOLayout = new javax.swing.GroupLayout(FIFO);
        FIFO.setLayout(FIFOLayout);
        FIFOLayout.setHorizontalGroup(
            FIFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FIFOLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        FIFOLayout.setVerticalGroup(
            FIFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FIFOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(325, Short.MAX_VALUE))
        );

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(2);
        jTextArea2.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jTextArea2.setRows(2);
        jTextArea2.setTabSize(7);
        jTextArea2.setText("   Least Frequently \n   Used Algorithm");
        jTextArea2.setAutoscrolls(false);
        jTextArea2.setBorder(null);
        jTextArea2.setEnabled(false);
        jTextArea2.setFocusable(false);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout FIFO1Layout = new javax.swing.GroupLayout(FIFO1);
        FIFO1.setLayout(FIFO1Layout);
        FIFO1Layout.setHorizontalGroup(
            FIFO1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FIFO1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        FIFO1Layout.setVerticalGroup(
            FIFO1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FIFO1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(325, Short.MAX_VALUE))
        );

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(2);
        jTextArea3.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jTextArea3.setRows(2);
        jTextArea3.setTabSize(7);
        jTextArea3.setText("    Least Recently\n   Used Algorithm");
        jTextArea3.setAutoscrolls(false);
        jTextArea3.setBorder(null);
        jTextArea3.setCaretColor(new java.awt.Color(255, 51, 51));
        jTextArea3.setEnabled(false);
        jTextArea3.setFocusable(false);
        jScrollPane3.setViewportView(jTextArea3);

        javax.swing.GroupLayout FIFO2Layout = new javax.swing.GroupLayout(FIFO2);
        FIFO2.setLayout(FIFO2Layout);
        FIFO2Layout.setHorizontalGroup(
            FIFO2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FIFO2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        FIFO2Layout.setVerticalGroup(
            FIFO2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FIFO2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(325, Short.MAX_VALUE))
        );

        jTextArea4.setEditable(false);
        jTextArea4.setColumns(2);
        jTextArea4.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jTextArea4.setRows(2);
        jTextArea4.setTabSize(7);
        jTextArea4.setText("   Most Frequently\n   Used Algorithm");
        jTextArea4.setBorder(null);
        jTextArea4.setCaretColor(new java.awt.Color(255, 255, 0));
        jTextArea4.setEnabled(false);
        jTextArea4.setFocusable(false);
        jTextArea4.setOpaque(false);
        jTextArea4.setRequestFocusEnabled(false);
        jScrollPane4.setViewportView(jTextArea4);

        javax.swing.GroupLayout FIFO3Layout = new javax.swing.GroupLayout(FIFO3);
        FIFO3.setLayout(FIFO3Layout);
        FIFO3Layout.setHorizontalGroup(
            FIFO3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FIFO3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        FIFO3Layout.setVerticalGroup(
            FIFO3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FIFO3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(325, Short.MAX_VALUE))
        );

        Cancel.setBackground(new java.awt.Color(0, 204, 204));
        Cancel.setFont(new java.awt.Font("Segoe UI", 1, 34)); // NOI18N
        Cancel.setText("Cancel");
        Cancel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        FrameSizeLabel.setBackground(new java.awt.Color(204, 204, 204));
        FrameSizeLabel.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        FrameSizeLabel.setText("Frame Size : ");
        FrameSizeLabel.setEnabled(false);

        InputLabel.setBackground(new java.awt.Color(204, 204, 204));
        InputLabel.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        InputLabel.setText("Input : ");
        InputLabel.setEnabled(false);

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(HeadingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(CloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                            .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(354, 354, 354))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                            .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(FrameSizeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(MainPanelLayout.createSequentialGroup()
                                    .addComponent(FIFO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(FIFO1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(FIFO2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(FIFO3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(58, 58, 58)))))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(HeadingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FrameSizeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FIFO1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FIFO2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FIFO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FIFO3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(Cancel)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_CloseButtonActionPerformed

    private void HeadingLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeadingLabelMousePressed
        // TODO add your handling code here:// Get Mouse Position X,Y Co-Ordinates
        posX = evt.getX();
        posY = evt.getY();
    }//GEN-LAST:event_HeadingLabelMousePressed

    private void MainPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainPanelMousePressed
       // Get Mouse Position X,Y Co-Ordinates
        posX = evt.getX();
        posY = evt.getY();
    }//GEN-LAST:event_MainPanelMousePressed

    private void HeadingLabelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeadingLabelMouseDragged
        // Move all Frame using Mouse 
        setLocation(evt.getXOnScreen()-posX,evt.getYOnScreen()-posY);
    }//GEN-LAST:event_HeadingLabelMouseDragged

    private void MainPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainPanelMouseDragged
        // Move all Frame using Mouse 
        setLocation(evt.getXOnScreen()-posX,evt.getYOnScreen()-posY);
    }//GEN-LAST:event_MainPanelMouseDragged

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_CancelActionPerformed

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
            java.util.logging.Logger.getLogger(DisplayOutput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayOutput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayOutput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayOutput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayOutput().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JButton CloseButton;
    private javax.swing.JPanel FIFO;
    private javax.swing.JPanel FIFO1;
    private javax.swing.JPanel FIFO2;
    private javax.swing.JPanel FIFO3;
    private javax.swing.JLabel FrameSizeLabel;
    private javax.swing.JLabel HeadingLabel;
    private javax.swing.JLabel InputLabel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    // End of variables declaration//GEN-END:variables
    public void setInputValue(int frameSize, String Input){
        MFU_function MFU = new MFU_function();
        int pageFault = MFU.functionMFU(frameSize, Input);
        InputLabel.setText("Input : " + Input);
        FrameSizeLabel.setText("Frame Size : " + frameSize);
    }

}

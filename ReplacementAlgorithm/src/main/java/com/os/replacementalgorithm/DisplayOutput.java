
/*
 * Author : KAJAMOHAN K. (2018/E/055)
 */

package com.os.replacementalgorithm;

import com.os.replacementalgorithm.Algorithms.*;
import java.awt.event.KeyEvent;


public class DisplayOutput extends javax.swing.JFrame {

    /**
     * Creates new form DisplayOutput
     */
    public DisplayOutput() {
        initComponents();
    }
    private int posX = 0, posY = 0;
   

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        HeadingLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        FIFO = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        FIFO_Area = new javax.swing.JTextArea();
        pageFault1 = new javax.swing.JLabel();
        LFU = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        LFU_Area = new javax.swing.JTextArea();
        pageFault2 = new javax.swing.JLabel();
        LRU = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        LRU_Area = new javax.swing.JTextArea();
        pageFault3 = new javax.swing.JLabel();
        MRU = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane11 = new javax.swing.JScrollPane();
        MFU_Area = new javax.swing.JTextArea();
        pageFault4 = new javax.swing.JLabel();
        Cancel = new javax.swing.JButton();
        FrameSizeLabel = new javax.swing.JLabel();
        InputLabel = new javax.swing.JLabel();
        bestPage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));
        MainPanel.setPreferredSize(new java.awt.Dimension(970, 710));
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
        MainPanel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                MainPanelKeyPressed(evt);
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

        FIFO.setBackground(new java.awt.Color(255, 255, 255));
        FIFO.setPreferredSize(new java.awt.Dimension(200, 402));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(2);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jTextArea1.setRows(2);
        jTextArea1.setTabSize(7);
        jTextArea1.setText("    First In First Out \n        Algorithm");
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setBorder(null);
        jTextArea1.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        jTextArea1.setEnabled(false);
        jTextArea1.setFocusable(false);
        jTextArea1.setSelectionColor(new java.awt.Color(140, 140, 140));
        jScrollPane1.setViewportView(jTextArea1);

        FIFO_Area.setEditable(false);
        FIFO_Area.setColumns(10);
        FIFO_Area.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        FIFO_Area.setRows(5);
        FIFO_Area.setTabSize(5);
        jScrollPane9.setViewportView(FIFO_Area);

        pageFault1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pageFault1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pageFault1.setText("Page Fault is ");

        javax.swing.GroupLayout FIFOLayout = new javax.swing.GroupLayout(FIFO);
        FIFO.setLayout(FIFOLayout);
        FIFOLayout.setHorizontalGroup(
            FIFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FIFOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FIFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FIFOLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(pageFault1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        FIFOLayout.setVerticalGroup(
            FIFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FIFOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pageFault1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        LFU.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(2);
        jTextArea2.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jTextArea2.setRows(2);
        jTextArea2.setTabSize(7);
        jTextArea2.setText("   Least Frequently \n   Used Algorithm");
        jTextArea2.setAutoscrolls(false);
        jTextArea2.setBorder(null);
        jTextArea2.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        jTextArea2.setEnabled(false);
        jTextArea2.setFocusable(false);
        jTextArea2.setSelectionColor(new java.awt.Color(140, 140, 140));
        jScrollPane2.setViewportView(jTextArea2);

        LFU_Area.setEditable(false);
        LFU_Area.setColumns(10);
        LFU_Area.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LFU_Area.setRows(5);
        LFU_Area.setTabSize(5);
        jScrollPane6.setViewportView(LFU_Area);

        pageFault2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pageFault2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pageFault2.setText("Page Fault is ");

        javax.swing.GroupLayout LFULayout = new javax.swing.GroupLayout(LFU);
        LFU.setLayout(LFULayout);
        LFULayout.setHorizontalGroup(
            LFULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LFULayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LFULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(LFULayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pageFault2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        LFULayout.setVerticalGroup(
            LFULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LFULayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(pageFault2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        LRU.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(2);
        jTextArea3.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jTextArea3.setRows(2);
        jTextArea3.setTabSize(7);
        jTextArea3.setText("    Least Recently\n   Used Algorithm");
        jTextArea3.setAutoscrolls(false);
        jTextArea3.setBorder(null);
        jTextArea3.setCaretColor(new java.awt.Color(255, 51, 51));
        jTextArea3.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        jTextArea3.setEnabled(false);
        jTextArea3.setFocusable(false);
        jTextArea3.setSelectionColor(new java.awt.Color(140, 140, 140));
        jScrollPane3.setViewportView(jTextArea3);

        LRU_Area.setEditable(false);
        LRU_Area.setColumns(10);
        LRU_Area.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LRU_Area.setRows(5);
        LRU_Area.setTabSize(5);
        jScrollPane10.setViewportView(LRU_Area);

        pageFault3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pageFault3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pageFault3.setText("Page Fault is ");

        javax.swing.GroupLayout LRULayout = new javax.swing.GroupLayout(LRU);
        LRU.setLayout(LRULayout);
        LRULayout.setHorizontalGroup(
            LRULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LRULayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LRULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LRULayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(pageFault3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        LRULayout.setVerticalGroup(
            LRULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LRULayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pageFault3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        MRU.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea4.setEditable(false);
        jTextArea4.setColumns(2);
        jTextArea4.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jTextArea4.setRows(2);
        jTextArea4.setTabSize(7);
        jTextArea4.setText("   Most Frequently\n   Used Algorithm");
        jTextArea4.setAutoscrolls(false);
        jTextArea4.setBorder(null);
        jTextArea4.setCaretColor(new java.awt.Color(255, 255, 0));
        jTextArea4.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        jTextArea4.setEnabled(false);
        jTextArea4.setFocusable(false);
        jTextArea4.setRequestFocusEnabled(false);
        jTextArea4.setSelectionColor(new java.awt.Color(140, 140, 140));
        jScrollPane4.setViewportView(jTextArea4);

        MFU_Area.setEditable(false);
        MFU_Area.setColumns(10);
        MFU_Area.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MFU_Area.setRows(5);
        MFU_Area.setTabSize(5);
        jScrollPane11.setViewportView(MFU_Area);

        pageFault4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pageFault4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pageFault4.setText("Page Fault is ");

        javax.swing.GroupLayout MRULayout = new javax.swing.GroupLayout(MRU);
        MRU.setLayout(MRULayout);
        MRULayout.setHorizontalGroup(
            MRULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MRULayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MRULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MRULayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(pageFault4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        MRULayout.setVerticalGroup(
            MRULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MRULayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pageFault4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
        Cancel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CancelKeyPressed(evt);
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

        bestPage.setBackground(new java.awt.Color(255, 255, 51));
        bestPage.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        bestPage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bestPage.setText("Best Replacement Algorithm is ");
        bestPage.setToolTipText("");
        bestPage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bestPage.setOpaque(true);

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(362, 362, 362)
                        .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(FIFO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LFU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LRU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MRU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HeadingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(InputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FrameSizeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(bestPage, javax.swing.GroupLayout.PREFERRED_SIZE, 891, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(HeadingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FrameSizeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(FIFO, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                    .addComponent(LFU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LRU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MRU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bestPage, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Cancel)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HeadingLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeadingLabelMousePressed
        // Get Mouse Position X,Y Co-Ordinates
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

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           this.dispose();
        }
    }//GEN-LAST:event_formKeyPressed

    private void MainPanelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MainPanelKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           this.dispose();
        }
    }//GEN-LAST:event_MainPanelKeyPressed

    private void CancelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CancelKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           this.dispose();
        }
    }//GEN-LAST:event_CancelKeyPressed

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
    private javax.swing.JPanel FIFO;
    private javax.swing.JTextArea FIFO_Area;
    private javax.swing.JLabel FrameSizeLabel;
    private javax.swing.JLabel HeadingLabel;
    private javax.swing.JLabel InputLabel;
    private javax.swing.JPanel LFU;
    private javax.swing.JTextArea LFU_Area;
    private javax.swing.JPanel LRU;
    private javax.swing.JTextArea LRU_Area;
    private javax.swing.JTextArea MFU_Area;
    private javax.swing.JPanel MRU;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel bestPage;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JLabel pageFault1;
    private javax.swing.JLabel pageFault2;
    private javax.swing.JLabel pageFault3;
    private javax.swing.JLabel pageFault4;
    // End of variables declaration//GEN-END:variables
    public void setInputValue(int frameSize, String Input){
        
        // input 70120304230323
        // frame size 4
        InputLabel.setText("Input : " + Input);
        FrameSizeLabel.setText("Frame Size : " + frameSize);
        int MFU_PageFault, FIFO_PageFault, LFU_PageFault, LRU_PageFault;
        
        MFU_function MFU = new MFU_function();
        MFU_PageFault = MFU.functionMFU(frameSize, Input);
        
        FIFO_function FIFO = new FIFO_function();
        FIFO_PageFault = FIFO.functionFIFO(frameSize, Input);
        
        LFU_Function LFU = new LFU_Function();
        LFU_PageFault = LFU.functionLFU(frameSize, Input);
        
        LRU_Function LRU = new LRU_Function();
        LRU_PageFault = LRU.functionLRU(frameSize, Input);
        
        int[] PageFaults = {FIFO_PageFault, LFU_PageFault, LRU_PageFault, MFU_PageFault};
        
        String text;
        text = "";
        for (String e : FIFO.getReplaceOrder()) {
            text += e +"\n";
        }
        FIFO_Area.setText(text);
        pageFault1.setText("Page Fault is "+ PageFaults[0]);
        
        
         text = "";
        for (String e : LFU.getReplaceOrder()) {
            text += e +"\n";
        }
        LFU_Area.setText(text);
        pageFault2.setText("Page Fault is "+ PageFaults[1]);
        
        
         text = "";
        for (String e : LRU.getReplaceOrder()) {
            text += e+"\n";
        }
        LRU_Area.setText(text);
         pageFault3.setText("Page Fault is "+ PageFaults[2]);
        
        
        text = "";
        for (String e : MFU.getReplaceOrder()) {
            text += e+"\n";
        }
        MFU_Area.setText(text);
        pageFault4.setText("Page Fault is "+ PageFaults[3]);
        
        int min = FIFO_PageFault;
        String[] algorthm ={"First In First Out", "Least Frequently Used", "Least Recently Used", "Most Frequently Used"};
   
        String algorthmName = algorthm[0];
        for (int i = 1; i < 4; i++) {
            if(min > PageFaults[i]){
                min = PageFaults[i];
                algorthmName = algorthm[i];
            }else if (min == PageFaults[i]){
                
                algorthmName +=", " +algorthm[i];
            }
        }
        bestPage.setText("Best Replacement Algorithm is "+ algorthmName);
    }

}

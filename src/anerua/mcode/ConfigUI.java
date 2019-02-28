/*
 * Copyright © 2018 Martins Anerua
 */
package anerua.mcode;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JTextArea;
import javax.swing.UIManager;

/**
 *
 * @author MARTINS
 */
public class ConfigUI extends javax.swing.JFrame {
    
    JTextArea view;
    // String file_name = "prop.txt";
    
    String fore, back;
    
    /**
     * Creates new form ConfigUI
     * @param v
     */
    public ConfigUI(JTextArea v) {
        this.fore = MPreterUI.class.getResource("/anerua/mcode/text.txt").getFile();
        this.back = MPreterUI.class.getResource("/anerua/mcode/bg.txt").getFile();
        view = v;
        initComponents();
    }

    private ConfigUI() {
        this.fore = MPreterUI.class.getResource("/anerua/mcode/text.txt").getFile();
        this.back = MPreterUI.class.getResource("/anerua/mcode/bg.txt").getFile();
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void writeTo(String file_name, String line) {
        try {

            FileWriter fw = new FileWriter(file_name);
            
            try (BufferedWriter bf = new BufferedWriter(fw)) {
                
                bf.write(line);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block

        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlePanel = new javax.swing.JPanel();
        comboBox = new javax.swing.JComboBox<>();
        colorPanel = new javax.swing.JPanel();
        colorChooser = new javax.swing.JColorChooser();
        btnPanel = new javax.swing.JPanel();
        btnCancel = new javax.swing.JButton();
        btnOk = new javax.swing.JButton();
        btnDefault = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Customize your shell");
        setAlwaysOnTop(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Text", "Background" }));

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(comboBox, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout colorPanelLayout = new javax.swing.GroupLayout(colorPanel);
        colorPanel.setLayout(colorPanelLayout);
        colorPanelLayout.setHorizontalGroup(
            colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colorPanelLayout.createSequentialGroup()
                .addComponent(colorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        colorPanelLayout.setVerticalGroup(
            colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colorPanelLayout.createSequentialGroup()
                .addComponent(colorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnDefault.setText("Default");
        btnDefault.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefaultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btnPanelLayout = new javax.swing.GroupLayout(btnPanel);
        btnPanel.setLayout(btnPanelLayout);
        btnPanelLayout.setHorizontalGroup(
            btnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDefault)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancel)
                .addGap(18, 18, 18)
                .addComponent(btnOk)
                .addGap(7, 7, 7))
        );
        btnPanelLayout.setVerticalGroup(
            btnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPanelLayout.createSequentialGroup()
                .addGroup(btnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnOk)
                    .addComponent(btnDefault))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(colorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(colorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        Color col = colorChooser.getColor();
        int combo = comboBox.getSelectedIndex();
        switch(combo){
            case 0:
                view.setForeground(col);
                writeTo(fore, Integer.toString(col.getRGB()));
                break;
            case 1:
                view.setBackground(col);
                writeTo(back, Integer.toString(col.getRGB()));
                break;
        }
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnDefaultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefaultActionPerformed
        view.setBackground(Color.BLACK);
        view.setForeground(new java.awt.Color(0, 153, 255));
        writeTo(fore, Integer.toString(new java.awt.Color(0, 153, 255).getRGB()));
        writeTo(back, Integer.toString(Color.BLACK.getRGB()));
    }//GEN-LAST:event_btnDefaultActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Windows look and feel */
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfigUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ConfigUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDefault;
    private javax.swing.JButton btnOk;
    private javax.swing.JPanel btnPanel;
    private javax.swing.JColorChooser colorChooser;
    private javax.swing.JPanel colorPanel;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables
}
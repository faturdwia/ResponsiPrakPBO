/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import static java.lang.Double.parseDouble;
import modeldatabase.Konektor;
import model.Model;
import controller.Controller;

/**
 *
 * @author User
 */
public class MovieView extends javax.swing.JFrame {
static Konektor DB;
    Controller movie;
    
    /** Creates new form MovieView */
    public MovieView(Konektor DB) {
        initComponents();
        this.DB = DB;
        this.movie = new Controller(new Model(DB));
        DefaultTableModel model = (DefaultTableModel)this.tbl_movie.getModel();
        Object[] row = new Object[5];
        model.setRowCount(0);
        
        for (int i = 0; movie.index()[i][0] != null; i++) {
            row[0] = movie.index()[i][0];
            row[1] = movie.index()[i][1];
            row[2] = movie.index()[i][2];
            row[3] = movie.index()[i][3];
            row[4] = movie.index()[i][4];
            model.addRow(row);
        }
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_movie = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        tx_judul = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tx_alur = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tx_penokohan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tx_akting = new javax.swing.JTextField();
        btn_tambah = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl_movie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Judul", "Alur", "Penokohan", "Akting", "Nilai"
            }
        ));
        jScrollPane1.setViewportView(tbl_movie);

        jLabel1.setText("Judul");

        jLabel2.setText("Alur");

        jLabel3.setText("Penokohan");

        jLabel4.setText("Akting");

        tx_akting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_aktingActionPerformed(evt);
            }
        });

        btn_tambah.setText("Tambah");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tx_judul)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(tx_alur)
                    .addComponent(tx_penokohan)
                    .addComponent(tx_akting)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tx_judul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tx_alur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tx_penokohan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tx_akting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btn_tambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_update)
                        .addGap(11, 11, 11)
                        .addComponent(btn_delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_clear)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tx_aktingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_aktingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx_aktingActionPerformed

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        // TODO add your handling code here:
        try{
            String judul = tx_judul.getText();
            double alur = parseDouble(tx_alur.getText());
            double penokohan= parseDouble(tx_penokohan.getText());
            double akting = parseDouble(tx_akting.getText());

            movie.simpan(judul, alur, penokohan, akting);
        } catch(Exception err){
            JOptionPane.showMessageDialog(null,"Mohon isi Semua Kolom");
        }

        DefaultTableModel model = (DefaultTableModel)this.tbl_movie.getModel();
        Object[] row = new Object[5];
        model.setRowCount(0);
        for (int i = 0; movie.index()[i][0] != null; i++) {
            row[0] = movie.index()[i][0];
            row[1] = movie.index()[i][1];
            row[2] = movie.index()[i][2];
            row[3] = movie.index()[i][3];
            row[4] = movie.index()[i][4];
            model.addRow(row);
        }
        this.tx_judul.setText("");
        this.tx_alur.setText("");
        this.tx_penokohan.setText("");
        this.tx_akting.setText("");
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        try{
            String judul = tx_judul.getText();
            double alur = parseDouble(tx_alur.getText());
            double penokohan = parseDouble(tx_penokohan.getText());
            double akting = parseDouble(tx_akting.getText());

            movie.update(judul, alur, penokohan, akting);

        }catch(Exception err){
            JOptionPane.showMessageDialog(null,"Mohon isi Semua Kolom");
        }
        DefaultTableModel model = (DefaultTableModel)this.tbl_movie.getModel();
        Object[] row = new Object[5];
        model.setRowCount(0);
        for (int i = 0; movie.index()[i][0] != null; i++) {
            row[0] = movie.index()[i][0];
            row[1] = movie.index()[i][1];
            row[2] = movie.index()[i][2];
            row[3] = movie.index()[i][3];
            row[4] = movie.index()[i][4];
            model.addRow(row);
        }
        this.tx_judul.setText("");
        this.tx_alur.setText("");
        this.tx_penokohan.setText("");
        this.tx_akting.setText("");
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        try{
            String judul = tx_judul.getText();
            movie.delete(judul);
        } catch(Exception err){
            JOptionPane.showMessageDialog(null,"Movie Tidak Ada");
        }

        DefaultTableModel model = (DefaultTableModel)this.tbl_movie.getModel();
        Object[] row = new Object[5];
        model.setRowCount(0);
        for (int i = 0; movie.index()[i][0] != null; i++) {
            row[0] = movie.index()[i][0];
            row[1] = movie.index()[i][1];
            row[2] = movie.index()[i][2];
            row[3] = movie.index()[i][3];
            row[4] = movie.index()[i][4];
            model.addRow(row);
        }
        this.tx_judul.setText("");
        this.tx_alur.setText("");
        this.tx_penokohan.setText("");
        this.tx_akting.setText("");
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
        this.tx_judul.setText("");
        this.tx_alur.setText("");
        this.tx_penokohan.setText("");
        this.tx_akting.setText("");
    }//GEN-LAST:event_btn_clearActionPerformed
  private void tbl_movieMouseClicked(java.awt.event.MouseEvent evt) {                                       
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)this.tbl_movie.getModel();
        Object judull = model.getValueAt(this.tbl_movie.getSelectedRow(), 0);
        Object alurr = model.getValueAt(this.tbl_movie.getSelectedRow(), 1);
        Object penokohann = model.getValueAt(this.tbl_movie.getSelectedRow(), 2);
        Object aktingg = model.getValueAt(this.tbl_movie.getSelectedRow(), 3);

        this.tx_judul.setText(judull.toString());
        this.tx_alur.setText(alurr.toString());
        this.tx_penokohan.setText(penokohann.toString());
        this.tx_akting.setText(aktingg.toString());
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MovieView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MovieView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MovieView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MovieView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MovieView(MovieView.DB).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_movie;
    private javax.swing.JTextField tx_akting;
    private javax.swing.JTextField tx_alur;
    private javax.swing.JTextField tx_judul;
    private javax.swing.JTextField tx_penokohan;
    // End of variables declaration//GEN-END:variables
}

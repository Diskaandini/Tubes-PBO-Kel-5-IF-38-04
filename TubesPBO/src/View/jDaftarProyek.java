/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author USER
 */
public class jDaftarProyek extends javax.swing.JFrame {

    /**
     * Creates new form jDaftarProyek
     */
    public jDaftarProyek() {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProyek = new javax.swing.JTable();
        btnInsertProyek = new javax.swing.JButton();
        btnUpdateProyek = new javax.swing.JButton();
        btnDeleteProyek = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Daftar Proyek");

        jTableProyek.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1111", "abcd", "blalablaa", "Oldi"},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Proyek", "Nama Proyek", "Deskripsi", "Programmer"
            }
        ));
        jScrollPane1.setViewportView(jTableProyek);

        btnInsertProyek.setText("insert");
        btnInsertProyek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertProyekActionPerformed(evt);
            }
        });

        btnUpdateProyek.setText("update");

        btnDeleteProyek.setText("delete");
        btnDeleteProyek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteProyekActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnInsertProyek)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdateProyek)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteProyek)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertProyek)
                    .addComponent(btnUpdateProyek)
                    .addComponent(btnDeleteProyek))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertProyekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertProyekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInsertProyekActionPerformed

    private void btnDeleteProyekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteProyekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteProyekActionPerformed

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
            java.util.logging.Logger.getLogger(jDaftarProyek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jDaftarProyek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jDaftarProyek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jDaftarProyek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jDaftarProyek().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteProyek;
    private javax.swing.JButton btnInsertProyek;
    private javax.swing.JButton btnUpdateProyek;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProyek;
    // End of variables declaration//GEN-END:variables

    

    public javax.swing.JButton getBtnDeleteProyek() {
        return btnDeleteProyek;
    }

    public void setBtnDeleteProyek(javax.swing.JButton btnDeleteProyek) {
        this.btnDeleteProyek = btnDeleteProyek;
    }

    public javax.swing.JButton getBtnInsertProyek() {
        return btnInsertProyek;
    }

    public void setBtnInsertProyek(javax.swing.JButton btnInsertProyek) {
        this.btnInsertProyek = btnInsertProyek;
    }

    public javax.swing.JButton getBtnUpdateProyek() {
        return btnUpdateProyek;
    }

    public void setBtnUpdateProyek(javax.swing.JButton btnUpdateProyek) {
        this.btnUpdateProyek = btnUpdateProyek;
    }
}

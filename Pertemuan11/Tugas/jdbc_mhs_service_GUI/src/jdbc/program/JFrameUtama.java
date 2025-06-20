/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jdbc.program;

import javax.swing.DefaultListModel;
import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;

/**
 *
 * @author asus
 */
public class JFrameUtama extends javax.swing.JFrame {
    DefaultListModel<String> listID;
    DefaultListModel<String> listNama;
    static MysqlMahasiswaService service = new MysqlMahasiswaService();
    

    /**
     * Creates new form JFrameUtama
     */
    public JFrameUtama() {
        initComponents();
        this.listID = new DefaultListModel<>();
        this.listNama = new DefaultListModel<>();
        this.jListID.setModel(listID);
        this.jListNama.setModel(listNama);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jListID = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListNama = new javax.swing.JList<>();
        jLabelID = new javax.swing.JLabel();
        jLabelNama1 = new javax.swing.JLabel();
        jLabelHeader = new javax.swing.JLabel();
        jButtonAmbilSemuaData = new javax.swing.JButton();
        jLabelNama2 = new javax.swing.JLabel();
        jTextFieldNama = new javax.swing.JTextField();
        jButtonTambahkan = new javax.swing.JButton();
        jTextFieldIDEdit = new javax.swing.JTextField();
        jTextFieldIDHapus = new javax.swing.JTextField();
        jTextFieldNamaEdit = new javax.swing.JTextField();
        jTextFieldNamaHapus = new javax.swing.JTextField();
        jButtonEdit = new javax.swing.JButton();
        jButtonHapus = new javax.swing.JButton();
        jButtonResetIndeks = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jListID.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListID);

        jListNama.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jListNama);

        jLabelID.setText("ID");

        jLabelNama1.setText("NAMA");

        jLabelHeader.setText("Kelola Data Mahasiswa");

        jButtonAmbilSemuaData.setText("Ambil Semua Data");
        jButtonAmbilSemuaData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAmbilSemuaDataActionPerformed(evt);
            }
        });

        jLabelNama2.setText("Nama: ");

        jTextFieldNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNamaActionPerformed(evt);
            }
        });

        jButtonTambahkan.setText("Tambahkan");
        jButtonTambahkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTambahkanActionPerformed(evt);
            }
        });

        jTextFieldIDEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDEditActionPerformed(evt);
            }
        });

        jTextFieldIDHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDHapusActionPerformed(evt);
            }
        });

        jTextFieldNamaEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNamaEditActionPerformed(evt);
            }
        });

        jTextFieldNamaHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNamaHapusActionPerformed(evt);
            }
        });

        jButtonEdit.setText("Edit");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jButtonHapus.setText("Hapus");
        jButtonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHapusActionPerformed(evt);
            }
        });

        jButtonResetIndeks.setText("Reset Indeks");
        jButtonResetIndeks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetIndeksActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNama1))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldIDEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jTextFieldIDHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNamaEdit)
                            .addComponent(jTextFieldNamaHapus, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonEdit)
                            .addComponent(jButtonHapus)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelHeader)
                            .addComponent(jButtonAmbilSemuaData)
                            .addComponent(jTextFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonTambahkan)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabelNama2))
                            .addComponent(jButtonResetIndeks))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHeader)
                    .addComponent(jLabelNama1)
                    .addComponent(jLabelID))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAmbilSemuaData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelNama2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonTambahkan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldIDEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNamaEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEdit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldNamaHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonHapus))
                            .addComponent(jTextFieldIDHapus))
                        .addGap(36, 36, 36)
                        .addComponent(jButtonResetIndeks)
                        .addContainerGap(40, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNamaEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNamaEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNamaEditActionPerformed

    private void jButtonAmbilSemuaDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAmbilSemuaDataActionPerformed
        java.util.List<Mahasiswa> allMhs = service.getAll();
        listID.clear();
        listNama.clear();
        for (Mahasiswa mhs : allMhs) {
            listID.addElement(String.valueOf(mhs.getId()));
            listNama.addElement(mhs.getNama());
        }
    }//GEN-LAST:event_jButtonAmbilSemuaDataActionPerformed

    private void jTextFieldNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNamaActionPerformed

    private void jButtonTambahkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTambahkanActionPerformed
        listID.addElement(String.valueOf(listID.size() + 1));
        listNama.addElement(jTextFieldNama.getText());
        
        Mahasiswa mhsAdd = new Mahasiswa(listID.size() ,jTextFieldNama.getText());
        service.add(mhsAdd);
        jTextFieldNama.setText("");
        service.displayAllMahasiswa();
    }//GEN-LAST:event_jButtonTambahkanActionPerformed

    private void jTextFieldNamaHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNamaHapusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNamaHapusActionPerformed

    private void jTextFieldIDEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDEditActionPerformed

    private void jTextFieldIDHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDHapusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDHapusActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        int index = jListID.getSelectedIndex();
        if (index != -1){
            String selectedNama = jTextFieldNamaEdit.getText();
            
            String id = listID.getElementAt(index);
            Mahasiswa mhsUpdate = service.getById(Integer.parseInt(id));
            
            mhsUpdate.setNama(selectedNama);
            service.update(mhsUpdate);
            
            listNama.setElementAt(selectedNama, index);

            jTextFieldNamaEdit.setText("");  
            jTextFieldIDEdit.setText("");
        }
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jButtonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHapusActionPerformed
        int index = jListID.getSelectedIndex();
        if (index != -1) {
            
            String id = listID.getElementAt(index);
            String nama = listNama.getElementAt(index);
            jTextFieldIDHapus.setText(id);
            jTextFieldNamaHapus.setText(nama);

            service.delete(Integer.parseInt(id));

            listID.remove(index);
            listNama.remove(index);
        }
    }//GEN-LAST:event_jButtonHapusActionPerformed

    private void jButtonResetIndeksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetIndeksActionPerformed
        service.resetIndeks();
        java.util.List<Mahasiswa> allMhs = service.getAll();
        listID.clear();
        listNama.clear();
        for (Mahasiswa mhs : allMhs) {
            listID.addElement(String.valueOf(mhs.getId()));
            listNama.addElement(mhs.getNama());
        }
    }//GEN-LAST:event_jButtonResetIndeksActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAmbilSemuaData;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonHapus;
    private javax.swing.JButton jButtonResetIndeks;
    private javax.swing.JButton jButtonTambahkan;
    private javax.swing.JLabel jLabelHeader;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelNama1;
    private javax.swing.JLabel jLabelNama2;
    private javax.swing.JList<String> jListID;
    private javax.swing.JList<String> jListNama;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldIDEdit;
    private javax.swing.JTextField jTextFieldIDHapus;
    private javax.swing.JTextField jTextFieldNama;
    private javax.swing.JTextField jTextFieldNamaEdit;
    private javax.swing.JTextField jTextFieldNamaHapus;
    // End of variables declaration//GEN-END:variables
}

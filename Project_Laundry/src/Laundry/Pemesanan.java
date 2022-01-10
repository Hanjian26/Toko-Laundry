/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laundry;

import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hanjian Listanto
 */
public final class Pemesanan extends javax.swing.JDialog {

    dtPemesanan pemesan = new dtPemesanan();
    ArrayList<dtPemesanan> pemesanList = new ArrayList<>();
    int no = 0;

    /**
     * Creates new form Transaksi
     */
    public Pemesanan(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tambahData();

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
        jEditorPane1 = new javax.swing.JEditorPane();
        jDialog1 = new javax.swing.JDialog();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        namaInput = new javax.swing.JTextField();
        totalInput = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        telponInput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pemesananInput = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        beratInput = new javax.swing.JTextField();
        hargaInput = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        keluarButton1 = new javax.swing.JButton();
        tambahButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        comboBox = new javax.swing.JComboBox<>();
        pemesananBox = new javax.swing.JCheckBox();
        namaBox = new javax.swing.JCheckBox();
        noBox = new javax.swing.JCheckBox();
        refresh = new javax.swing.JButton();

        jScrollPane1.setViewportView(jEditorPane1);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel13.setText("- Cuci Bersih");

        jLabel14.setText("- Pewangi");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 102));

        namaInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaInputActionPerformed(evt);
            }
        });
        namaInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                namaInputKeyReleased(evt);
            }
        });

        totalInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalInputActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Total Harga");

        resetButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("PEMESANAN");

        telponInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telponInputActionPerformed(evt);
            }
        });
        telponInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                telponInputKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Tanggal Pemesanan (DD-MM-YYYY)");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Nama Pelanggan");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("No Telpon");

        pemesananInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pemesananInputActionPerformed(evt);
            }
        });
        pemesananInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pemesananInputKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setText("Berat Pakaian (kg)");

        beratInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beratInputActionPerformed(evt);
            }
        });
        beratInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                beratInputKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                beratInputKeyReleased(evt);
            }
        });

        hargaInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargaInputActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setText("Harga (/kg)");

        keluarButton1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        keluarButton1.setText("Keluar");
        keluarButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarButton1ActionPerformed(evt);
            }
        });

        tambahButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tambahButton.setText("Tambah");
        tambahButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahButtonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tanggal Pemesanan", "Nama", "No Telepon", "Paket", "Berat (kg)", "Harga (kg)", "Total Harga"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Paket", "Reguler (Rp.5000)", "Kilat (Rp. 8000)" }));
        comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });

        pemesananBox.setText("Format Benar");
        pemesananBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pemesananBoxKeyReleased(evt);
            }
        });

        namaBox.setText("Format Benar");
        namaBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                namaBoxKeyReleased(evt);
            }
        });

        noBox.setText("Format Benar");
        noBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                noBoxKeyReleased(evt);
            }
        });

        refresh.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(namaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(namaBox, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(telponInput, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(noBox, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(pemesananInput, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(pemesananBox, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(totalInput, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(hargaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(beratInput, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(420, 420, 420)
                                .addComponent(jLabel4)))
                        .addGap(0, 51, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(keluarButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tambahButton, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel4)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel9)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel10)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(41, 41, 41)
                                .addComponent(jLabel2)
                                .addGap(41, 41, 41)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pemesananInput, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pemesananBox))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(namaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(namaBox))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(telponInput, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(noBox))))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(beratInput, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(hargaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(totalInput, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambahButton)
                    .addComponent(resetButton)
                    .addComponent(refresh))
                .addGap(107, 107, 107)
                .addComponent(keluarButton1)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //.....Table Data
    public void tambahData() {
        Koneksi p = new Koneksi();
        Connection conn = null;
        PreparedStatement ps = null;
        Statement st = null;
        ResultSet rs = null;
        DefaultTableModel Data = (DefaultTableModel) jTable1.getModel();
        Data.setRowCount(0);

        conn = p.getConnection();
        try {

            st = conn.createStatement();
            rs = st.executeQuery("select * from pemesan");

            while (rs.next()) {
                String tglPemesan = rs.getString(1);
                String Nama = rs.getString(2);
                String telepon = rs.getString(3);
                String paket = rs.getString(4);
                int berat = rs.getInt(5);
                int harga = rs.getInt(6);
                int hargaTotal = rs.getInt(7);

                Data.addRow(new Object[]{tglPemesan, Nama, telepon, paket, berat, harga, hargaTotal});
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                rs.close();
                st.close();
                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }

    }

    private void telponInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telponInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telponInputActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        pemesananInput.setText(null);
        namaInput.setText(null);
        telponInput.setText(null);
        beratInput.setText(null);
        hargaInput.setText(null);
        totalInput.setText(null);
        pemesananBox.setSelected(false);
        namaBox.setSelected(false);
        noBox.setSelected(false);
        comboBox.setSelectedIndex(0);
    }//GEN-LAST:event_resetButtonActionPerformed

    public void reset() {
        pemesananInput.setText(null);
        namaInput.setText(null);
        telponInput.setText(null);
        beratInput.setText(null);
        hargaInput.setText(null);
        totalInput.setText(null);
        pemesananBox.setSelected(false);
        namaBox.setSelected(false);
        noBox.setSelected(false);
        comboBox.setSelectedIndex(0);
    }

    private boolean isEmpty() {
        return pemesananInput.getText().isBlank() || namaInput.getText().isBlank() || telponInput.getText().isBlank() || comboBox.getSelectedIndex() == 0 || beratInput.getText().isBlank();
    }


    private void keluarButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_keluarButton1ActionPerformed
    static int x = 0;

    //....Method Simpan
    Koneksi p = new Koneksi();
    private void tambahButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahButtonActionPerformed
        Koneksi p = new Koneksi();
        Connection conn = null;
        PreparedStatement ps = null;

        conn = p.getConnection();
        try {
            conn.setAutoCommit(false);

            pemesan.setTglPesan(pemesananInput.getText());
            pemesan.setNama(namaInput.getText());
            pemesan.setNoTelpon(telponInput.getText());

            try {
                if (isEmpty()) {

                    JOptionPane.showMessageDialog(null, "Input Tidak Boleh ada yang kosong");
                } else {

                    if (comboBox.getSelectedIndex() == 1) {
                        pemesan.setBerat(Integer.parseInt(beratInput.getText()));
                        pemesan.setHarga(Integer.parseInt(hargaInput.getText()));
                        ps = conn.prepareStatement("insert into pemesan values(?,?,?,?,?,?,?)");
                        pemesan.setPaket("Reguler");

                        ps.setString(1, pemesan.getTglPesan());
                        ps.setString(2, pemesan.getNama());
                        ps.setString(3, pemesan.getNoTelpon());
                        ps.setString(4, pemesan.getPaket());
                        ps.setInt(5, pemesan.getBerat());
                        ps.setInt(6, pemesan.getHarga());
                        ps.setInt(7, pemesan.getTotalHarga());
                        ps.executeUpdate();

                        conn.commit();
                        tambahData();
                        reset();

                        x = x + 1;
                        JOptionPane.showMessageDialog(null, "Pemesanan Berhasil");
                        pemesanList.add(pemesan);
                    }

                    if (comboBox.getSelectedIndex() == 2) {
                        pemesan.setPaket("Kilat");
                        pemesan.setBerat(Integer.parseInt(beratInput.getText()));
                        pemesan.setHarga(Integer.parseInt(hargaInput.getText()));
                        ps = conn.prepareStatement("insert into pemesan values(?,?,?,?,?,?,?)");

                        ps.setString(1, pemesan.getTglPesan());
                        ps.setString(2, pemesan.getNama());
                        ps.setString(3, pemesan.getNoTelpon());
                        ps.setString(4, pemesan.getPaket());
                        ps.setInt(5, pemesan.getBerat());
                        ps.setInt(6, pemesan.getHarga());
                        ps.setInt(7, pemesan.getTotalHarga());
                        ps.executeUpdate();

                        conn.commit();
                        tambahData();
                        reset();
                        x = x + 1;
                        JOptionPane.showMessageDialog(null, "Pemesanan Berhasil");
                        pemesanList.add(pemesan);
                    }
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Input Harga Hanya boleh angka");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

//        for (int i = 0; i < pemesanList.size(); i++) {
//            jTable1.setValueAt(i, i, i);
//            jTable1.setValueAt(pemesanList.get(i).getTglPesan(), i, 1);
//             jTable1.setValueAt(pemesanList.get(i).getNama(), i, 2);
//               jTable1.setValueAt(pemesanList.get(i).getNoTelpon(), i, 3);
//        jTable1.setValueAt(pemesanList.get(i).getPaket(), i, 4);
//        jTable1.setValueAt(pemesanList.get(i).getBerat(), i, 5);
//        jTable1.setValueAt(pemesanList.get(i).getHarga(), i, 6);
//        jTable1.setValueAt(pemesanList.get(i).getTotalHarga(), i, 7);
//        }
//        
//        jTable1.setValueAt(x, x, 0);
//        jTable1.setValueAt(pemesananInput.getText(), x, 1);
//        jTable1.setValueAt(pemesan.getNama(), x, 2);
//        jTable1.setValueAt(pemesan.getNoTelpon(), x, 3);
//        jTable1.setValueAt(pemesan.getPaket(), x, 4);
//        jTable1.setValueAt(pemesan.getBerat(), x, 5);
//        jTable1.setValueAt(pemesan.getHarga(), x, 6);
//        jTable1.setValueAt(pemesan.getTotalHarga(), x, 7);
//        for (int i = 0; i < 10; i++) {
//            JOptionPane.showConfirmDialog(null, Teknis.PemesanList.get(i).getNama());
//        }

    }//GEN-LAST:event_tambahButtonActionPerformed

    private void hargaInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargaInputActionPerformed


    }//GEN-LAST:event_hargaInputActionPerformed

    private void totalInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalInputActionPerformed


    }//GEN-LAST:event_totalInputActionPerformed

    private void pemesananInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pemesananInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pemesananInputActionPerformed

    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxActionPerformed
        if (comboBox.getSelectedIndex() == 0) {
            hargaInput.setEnabled(false);
            totalInput.setEnabled(false);
        } else if (comboBox.getSelectedIndex() == 1) {
            hargaInput.setEnabled(false);
            totalInput.setEnabled(false);
        } else if (comboBox.getSelectedIndex() == 2) {
            hargaInput.setEnabled(false);
            totalInput.setEnabled(false);
        }
    }//GEN-LAST:event_comboBoxActionPerformed

    private void beratInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_beratInputKeyPressed
        int totHarga = 0;
        int regulerKilo = 5000;
        int kilatKilo = 8000;

        pemesan.setBerat(Integer.parseInt(beratInput.getText()));
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            if (comboBox.getSelectedIndex() == 1) {

                pemesan.setHarga(regulerKilo);
                totHarga = regulerKilo * pemesan.getBerat();

                pemesan.setTotalHarga(totHarga);

                pemesan.setTotalHarga(totHarga);
                hargaInput.setText(Integer.toString(regulerKilo));
                totalInput.setText(Integer.toString(pemesan.getTotalHarga()));

            } else if (comboBox.getSelectedIndex() == 2) {

                pemesan.setHarga(kilatKilo);
                totHarga = kilatKilo * pemesan.getBerat();
                pemesan.setTotalHarga(totHarga);
                pemesan.setTotalHarga(totHarga);

                hargaInput.setText(Integer.toString(kilatKilo));
                totalInput.setText(Integer.toString(pemesan.getTotalHarga()));

            }
        }


    }//GEN-LAST:event_beratInputKeyPressed

    private void beratInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beratInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_beratInputActionPerformed

    private void pemesananBoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pemesananBoxKeyReleased

    }//GEN-LAST:event_pemesananBoxKeyReleased

    private void pemesananInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pemesananInputKeyReleased
        String tanggalMasuk = pemesananInput.getText();

        if (tanggalMasuk.matches("\\d{2}-\\d{2}-\\d{4}")) {
            pemesananBox.setSelected(true);
        } else {
            pemesananBox.setSelected(false);

        }
    }//GEN-LAST:event_pemesananInputKeyReleased

    private void namaBoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_namaBoxKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_namaBoxKeyReleased

    private void noBoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_noBoxKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_noBoxKeyReleased

    private void telponInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telponInputKeyReleased
        String noTelpon = telponInput.getText();

        if (noTelpon.matches("\\d{4}-\\d{4}-\\d{4}")) {
            noBox.setSelected(true);
        } else if (noTelpon.matches("\\d{12}")) {
            noBox.setSelected(true);
        } else {
            noBox.setSelected(false);

        }
    }//GEN-LAST:event_telponInputKeyReleased

    private void beratInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_beratInputKeyReleased

    }//GEN-LAST:event_beratInputKeyReleased

    private void namaInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaInputActionPerformed

    }//GEN-LAST:event_namaInputActionPerformed

    private void namaInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_namaInputKeyReleased
        String nama = namaInput.getText();
        if (nama.matches(".*\\d.*")) {
            JOptionPane.showMessageDialog(this, "Nama kamu mengandung angka: " + nama);
            namaBox.setSelected(false);
        } else {
            namaBox.setSelected(true);
        }
    }//GEN-LAST:event_namaInputKeyReleased

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        tambahData();

    }//GEN-LAST:event_refreshActionPerformed

    private void SystemExit() {
        WindowEvent winClosing = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
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
            java.util.logging.Logger.getLogger(Pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Pemesanan dialog = new Pemesanan(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField beratInput;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JTextField hargaInput;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton keluarButton1;
    private javax.swing.JCheckBox namaBox;
    private javax.swing.JTextField namaInput;
    private javax.swing.JCheckBox noBox;
    private javax.swing.JCheckBox pemesananBox;
    private javax.swing.JTextField pemesananInput;
    private javax.swing.JButton refresh;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton tambahButton;
    private javax.swing.JTextField telponInput;
    private javax.swing.JTextField totalInput;
    // End of variables declaration//GEN-END:variables
}

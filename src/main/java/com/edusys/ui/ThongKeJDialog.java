/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.edusys.ui;

import com.edusys.dao.ThongKeDAO;


/**
 *
 * @author tinhn
 */
public class ThongKeJDialog extends javax.swing.JDialog {

    /**
     * Creates new form ThongKeJDialog
     */
    public ThongKeJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        tabs = new javax.swing.JTabbedPane();
        pnlKhachHang = new javax.swing.JPanel();
        lblThongKeKhachHang = new javax.swing.JLabel();
        cboNam1 = new javax.swing.JComboBox<>();
        lblThang1 = new javax.swing.JLabel();
        lblNam1 = new javax.swing.JLabel();
        cboThang1 = new javax.swing.JComboBox<>();
        lblTongSoKH2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblThongKeKhachHang = new javax.swing.JTable();
        btnExportExcelKH = new javax.swing.JButton();
        pnlGiaoDich = new javax.swing.JPanel();
        lblThongKeGiaoDich = new javax.swing.JLabel();
        lblThang2 = new javax.swing.JLabel();
        cboThang2 = new javax.swing.JComboBox<>();
        lblNam2 = new javax.swing.JLabel();
        cboNam2 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblThongKeGiaoDich = new javax.swing.JTable();
        btnExportExcelGD = new javax.swing.JButton();
        pnlTaiKhoan = new javax.swing.JPanel();
        lblThang3 = new javax.swing.JLabel();
        cboThang3 = new javax.swing.JComboBox<>();
        lblNam3 = new javax.swing.JLabel();
        cboNam3 = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblThongKeTaiKhoan = new javax.swing.JTable();
        lblThongKeGiaoDich1 = new javax.swing.JLabel();
        btnExportExcelTK = new javax.swing.JButton();
        pnlVayTien = new javax.swing.JPanel();
        lblThongKeVayTien = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblVayTien = new javax.swing.JTable();
        lblThang4 = new javax.swing.JLabel();
        cboThang4 = new javax.swing.JComboBox<>();
        lblNam4 = new javax.swing.JLabel();
        cboNam4 = new javax.swing.JComboBox<>();
        btnExportExcelVT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("THỐNG KÊ ");

        lblThongKeKhachHang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblThongKeKhachHang.setForeground(new java.awt.Color(51, 51, 255));
        lblThongKeKhachHang.setText("THỐNG KÊ KHÁCH HÀNG");

        cboNam1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024", "2025", " " }));

        lblThang1.setText("Tháng:");

        lblNam1.setText("Năm:");

        cboThang1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " " }));

        tblThongKeKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "MÃ KH", "HỌ TÊN", "NGÀY SINH", "GIỚI TÍNH", "SỐ CCCD", "ĐỊA CHỈ", "SĐT", "EMAIL", "MẬT KHẨU", "MÃ NV", "NGÀY TẠO"
            }
        ));
        jScrollPane1.setViewportView(tblThongKeKhachHang);

        btnExportExcelKH.setText("Export to Excel");
        btnExportExcelKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportExcelKHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlKhachHangLayout = new javax.swing.GroupLayout(pnlKhachHang);
        pnlKhachHang.setLayout(pnlKhachHangLayout);
        pnlKhachHangLayout.setHorizontalGroup(
            pnlKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKhachHangLayout.createSequentialGroup()
                .addGroup(pnlKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlKhachHangLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1))
                    .addGroup(pnlKhachHangLayout.createSequentialGroup()
                        .addGroup(pnlKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlKhachHangLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(pnlKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlKhachHangLayout.createSequentialGroup()
                                        .addGap(124, 124, 124)
                                        .addComponent(lblTongSoKH2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlKhachHangLayout.createSequentialGroup()
                                        .addComponent(lblThang1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)
                                        .addComponent(cboThang1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(72, 72, 72)
                                        .addComponent(lblNam1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(cboNam1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(pnlKhachHangLayout.createSequentialGroup()
                                .addGap(217, 217, 217)
                                .addComponent(lblThongKeKhachHang)))
                        .addGap(0, 119, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKhachHangLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExportExcelKH)))
                .addGap(15, 15, 15))
        );
        pnlKhachHangLayout.setVerticalGroup(
            pnlKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKhachHangLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblThongKeKhachHang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(pnlKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboNam1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblThang1)
                    .addComponent(lblNam1)
                    .addComponent(cboThang1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTongSoKH2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExportExcelKH, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabs.addTab("KHÁCH HÀNG", pnlKhachHang);

        lblThongKeGiaoDich.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblThongKeGiaoDich.setForeground(new java.awt.Color(51, 51, 255));
        lblThongKeGiaoDich.setText("THỐNG KÊ GIAO DỊCH");

        lblThang2.setText("Tháng:");

        cboThang2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " " }));

        lblNam2.setText("Năm:");

        cboNam2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024", "2025", " " }));

        tblThongKeGiaoDich.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "MÃ GD", "LOẠI GD", "SỐ TIỀN", "NGÀY GD", "TRẠNG THÁI", "TK NGƯỜI GỬI", "TÊN NGƯỜI GỬI", "TK NGƯỜI NHẬN", "TÊN NGƯỜI NHẬN"
            }
        ));
        jScrollPane2.setViewportView(tblThongKeGiaoDich);

        btnExportExcelGD.setText("Export to Excel");
        btnExportExcelGD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportExcelGDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlGiaoDichLayout = new javax.swing.GroupLayout(pnlGiaoDich);
        pnlGiaoDich.setLayout(pnlGiaoDichLayout);
        pnlGiaoDichLayout.setHorizontalGroup(
            pnlGiaoDichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGiaoDichLayout.createSequentialGroup()
                .addGroup(pnlGiaoDichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlGiaoDichLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(pnlGiaoDichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(pnlGiaoDichLayout.createSequentialGroup()
                                .addComponent(lblThang2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(cboThang2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(lblNam2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(cboNam2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 119, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGiaoDichLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExportExcelGD)))
                .addGap(15, 15, 15))
            .addGroup(pnlGiaoDichLayout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(lblThongKeGiaoDich)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlGiaoDichLayout.setVerticalGroup(
            pnlGiaoDichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGiaoDichLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblThongKeGiaoDich)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlGiaoDichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboNam2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblThang2)
                    .addComponent(lblNam2)
                    .addComponent(cboThang2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExportExcelGD, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabs.addTab("GIAO DỊCH", pnlGiaoDich);

        lblThang3.setText("Tháng:");

        cboThang3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " " }));

        lblNam3.setText("Năm:");

        cboNam3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024", "2025", " " }));

        tblThongKeTaiKhoan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "MÃ TK", "SỐ TK", "LOẠI TK", "SỐ DƯ", "NGÀY MỞ", "TRẠNG THÁI", "MÃ KH"
            }
        ));
        jScrollPane4.setViewportView(tblThongKeTaiKhoan);

        lblThongKeGiaoDich1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblThongKeGiaoDich1.setForeground(new java.awt.Color(51, 51, 255));
        lblThongKeGiaoDich1.setText("THỐNG KÊ TÀI KHOẢN");

        btnExportExcelTK.setText("Export to Excel");

        javax.swing.GroupLayout pnlTaiKhoanLayout = new javax.swing.GroupLayout(pnlTaiKhoan);
        pnlTaiKhoan.setLayout(pnlTaiKhoanLayout);
        pnlTaiKhoanLayout.setHorizontalGroup(
            pnlTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTaiKhoanLayout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(lblThongKeGiaoDich1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlTaiKhoanLayout.createSequentialGroup()
                .addGroup(pnlTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTaiKhoanLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExportExcelTK))
                    .addGroup(pnlTaiKhoanLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(pnlTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlTaiKhoanLayout.createSequentialGroup()
                                .addComponent(lblThang3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(cboThang3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(lblNam3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(cboNam3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 119, Short.MAX_VALUE))
                            .addComponent(jScrollPane4))))
                .addGap(15, 15, 15))
        );
        pnlTaiKhoanLayout.setVerticalGroup(
            pnlTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTaiKhoanLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblThongKeGiaoDich1)
                .addGap(15, 15, 15)
                .addGroup(pnlTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboNam3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblThang3)
                    .addComponent(lblNam3)
                    .addComponent(cboThang3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExportExcelTK, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );

        tabs.addTab("TÀI KHOẢN", pnlTaiKhoan);

        lblThongKeVayTien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblThongKeVayTien.setForeground(new java.awt.Color(51, 51, 255));
        lblThongKeVayTien.setText("THỐNG KÊ VAY TIỀN");

        tblVayTien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "MÃ VAY", "MÃ KH", "HỌ TÊN", "SỐ TIỀN VAY", "LÃI SUẤT", "THỜI GIAN VAY", "NGÀY VAY", "TRẠNG THÁI"
            }
        ));
        jScrollPane3.setViewportView(tblVayTien);

        lblThang4.setText("Tháng:");

        cboThang4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " " }));

        lblNam4.setText("Năm:");

        cboNam4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024", "2025", " " }));

        btnExportExcelVT.setText("Export to Excel");

        javax.swing.GroupLayout pnlVayTienLayout = new javax.swing.GroupLayout(pnlVayTien);
        pnlVayTien.setLayout(pnlVayTienLayout);
        pnlVayTienLayout.setHorizontalGroup(
            pnlVayTienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVayTienLayout.createSequentialGroup()
                .addGroup(pnlVayTienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlVayTienLayout.createSequentialGroup()
                        .addGroup(pnlVayTienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlVayTienLayout.createSequentialGroup()
                                .addGap(217, 217, 217)
                                .addComponent(lblThongKeVayTien))
                            .addGroup(pnlVayTienLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(lblThang4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(cboThang4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(lblNam4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(cboNam4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 119, Short.MAX_VALUE))
                    .addGroup(pnlVayTienLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlVayTienLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExportExcelVT)))
                .addGap(15, 15, 15))
        );
        pnlVayTienLayout.setVerticalGroup(
            pnlVayTienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVayTienLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblThongKeVayTien)
                .addGap(15, 15, 15)
                .addGroup(pnlVayTienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboNam4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblThang4)
                    .addComponent(lblNam4)
                    .addComponent(cboThang4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExportExcelVT, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabs.addTab("VAY TIỀN", pnlVayTien);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExportExcelKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportExcelKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExportExcelKHActionPerformed

    private void btnExportExcelGDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportExcelGDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExportExcelGDActionPerformed

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
            java.util.logging.Logger.getLogger(ThongKeJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongKeJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongKeJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongKeJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ThongKeJDialog dialog = new ThongKeJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnExportExcelGD;
    private javax.swing.JButton btnExportExcelKH;
    private javax.swing.JButton btnExportExcelTK;
    private javax.swing.JButton btnExportExcelVT;
    private javax.swing.JComboBox<String> cboNam1;
    private javax.swing.JComboBox<String> cboNam2;
    private javax.swing.JComboBox<String> cboNam3;
    private javax.swing.JComboBox<String> cboNam4;
    private javax.swing.JComboBox<String> cboThang1;
    private javax.swing.JComboBox<String> cboThang2;
    private javax.swing.JComboBox<String> cboThang3;
    private javax.swing.JComboBox<String> cboThang4;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblNam1;
    private javax.swing.JLabel lblNam2;
    private javax.swing.JLabel lblNam3;
    private javax.swing.JLabel lblNam4;
    private javax.swing.JLabel lblThang1;
    private javax.swing.JLabel lblThang2;
    private javax.swing.JLabel lblThang3;
    private javax.swing.JLabel lblThang4;
    private javax.swing.JLabel lblThongKeGiaoDich;
    private javax.swing.JLabel lblThongKeGiaoDich1;
    private javax.swing.JLabel lblThongKeKhachHang;
    private javax.swing.JLabel lblThongKeVayTien;
    private javax.swing.JLabel lblTongSoKH2;
    private javax.swing.JPanel pnlGiaoDich;
    private javax.swing.JPanel pnlKhachHang;
    private javax.swing.JPanel pnlTaiKhoan;
    private javax.swing.JPanel pnlVayTien;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblThongKeGiaoDich;
    private javax.swing.JTable tblThongKeKhachHang;
    private javax.swing.JTable tblThongKeTaiKhoan;
    private javax.swing.JTable tblVayTien;
    // End of variables declaration//GEN-END:variables

    ThongKeDAO dao = new ThongKeDAO();
    void init(){
        this.setLocationRelativeTo(null);       
    }
    
    public void selectTab(int index){
        tabs.setSelectedIndex(index);
    }
}

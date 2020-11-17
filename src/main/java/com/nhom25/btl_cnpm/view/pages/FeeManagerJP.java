/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhom25.btl_cnpm.view.pages;

import com.nhom25.btl_cnpm.controller.FeeController;
import com.nhom25.btl_cnpm.controller.HouseholdController;
import com.nhom25.btl_cnpm.dao.ConnectionController;
import com.nhom25.btl_cnpm.entity.Fee;
import com.nhom25.btl_cnpm.entity.Household;
import com.nhom25.btl_cnpm.view.IndexView;
import java.awt.BorderLayout;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hungn
 */
public class FeeManagerJP extends javax.swing.JPanel {

    /**
     * Creates new form FeeManagerJP
     */
    
    DefaultTableModel model;
    List<Fee> feeList = new ArrayList<>();
    
    public FeeManagerJP() {
        initComponents();
        model = (DefaultTableModel) feeTable.getModel();
        showFee();
    }
    
    private void showFee(){
        try {
            ConnectionController con = new ConnectionController();
            feeList = con.findAllFee();
            model.setRowCount(0);
            for(Fee f : feeList){
                model.addRow(new Object[]{model.getRowCount() + 1, 
                    f.getName(), f.getNumOfHousehold(), f.getTotalMoney()*1000});
            }
        } catch (SQLException ex) {
            Logger.getLogger(FeeManagerJP.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        feeTable = new javax.swing.JTable();
        btnInfo = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnAdjust = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Tìm kiếm:");

        btnSearch.setText("Tìm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        feeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Tên khoản phí", "Số hộ đóng góp", "Tổng tiền đã được đóng góp"
            }
        ));
        jScrollPane1.setViewportView(feeTable);

        btnInfo.setText("Xem");
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });

        btnInsert.setText("Thêm");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnAdjust.setText("Sửa");
        btnAdjust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdjustActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtName))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInsert, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(btnInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdjust, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(btnSearch)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(btnInsert)
                        .addGap(54, 54, 54)
                        .addComponent(btnInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdjust)
                        .addGap(33, 33, 33)
                        .addComponent(btnDelete)
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        new AddFeeJF().setVisible(true);
        showFee();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int r = feeTable.getSelectedRow();
        if(r > -1){
            if(r == 0){
                JOptionPane.showMessageDialog(jPanel1, "Không thể xoá khoản này!", "Thông báo", 0);
            } 
            else {
                int input = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xoá khoản này không?\nKhông thể hoàn lại thao tác này.", "Xác nhận", 0);
                if(input == 0){
                    try {
                        FeeController hcon = new FeeController();/*
                        boolean correct = hcon.removeFee(feeList.get(r));
                        if(correct){
                            JOptionPane.showMessageDialog(this, "Xoá thành công!", "Thông báo", 1);
                        }
                        else{
                            JOptionPane.showMessageDialog(this, "Đã có lỗi xảy ra!", "Thông báo", 0);
                        }*/
                        showFee();
                    } catch (SQLException ex) {
                        Logger.getLogger(HouseholdManageJP.class.getName()).log(Level.SEVERE, null, ex);
                    }                
                }
            }
        } else JOptionPane.showMessageDialog(jPanel1, "Chọn hàng để xóa!", "Thông báo", 0);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        // TODO add your handling code here:        
        int r = feeTable.getSelectedRow();
        if(r > -1){
            IndexView.jpnContent.removeAll();    
            IndexView.jpnContent.setLayout(new BorderLayout());
            IndexView.jpnContent.add(new InfoFeeJP(feeList.get(r)));
            IndexView.jpnContent.validate();
            IndexView.jpnContent.repaint();
        } else JOptionPane.showMessageDialog(jPanel1, "Chọn hàng để xem!", "Thông báo", 0);
        
    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try {
            // TODO add your handling code here:
            String s = txtName.getText();
            FeeController fcon = new FeeController();
            List<Fee> result = fcon.findFee(s);
            model.setRowCount(0);
            for(Fee f : result){
                model.addRow(new Object[]{model.getRowCount() + 1, 
                    f.getName(), f.getNumOfHousehold(), f.getTotalMoney()*1000});
            }
        } catch (SQLException ex) {
            Logger.getLogger(FeeManagerJP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAdjustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdjustActionPerformed
        // TODO add your handling code here:
        int r = feeTable.getSelectedRow();
        if(r > -1){
            if(r == 0){
                JOptionPane.showMessageDialog(jPanel1, "Không thể sửa khoản đóng góp này!", "Thông báo", 0);
            }
            else{
                new AdjustNameFeeJF(feeList.get(r)).setVisible(true);
            }
        } else JOptionPane.showMessageDialog(jPanel1, "Chọn hàng để chỉnh sửa!", "Thông báo", 0);
        showFee();
    }//GEN-LAST:event_btnAdjustActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdjust;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnSearch;
    private javax.swing.JTable feeTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}

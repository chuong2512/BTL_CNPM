/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhom25.btl_cnpm.view.pages;

import com.nhom25.btl_cnpm.controller.FeeController;
import com.nhom25.btl_cnpm.dao.ConnectionController;
import com.nhom25.btl_cnpm.entity.Fee;
import com.nhom25.btl_cnpm.entity.Household;
import com.nhom25.btl_cnpm.view.IndexView;
import static com.nhom25.btl_cnpm.view.IndexView.jpnContent;
import static com.nhom25.btl_cnpm.view.pages.ChangeFeeOfHouseholdJF.fId;
import java.awt.BorderLayout;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hung Mai
 */
public class InfoFeeJP extends javax.swing.JPanel {

    /**
     * Creates new form InfoFeeJP
     */
    Fee fee;
    DefaultTableModel model;
    public InfoFeeJP(Fee fee) {
        initComponents();
        model = (DefaultTableModel) tbHousehold.getModel();
        this.fee = fee;
        lbName.setText(fee.getName());
        lbMoney.setText("" + fee.getTotalMoney()*1000);
        lbNumOfHousehold.setText("" + fee.getNumOfHousehold());
        showHouseholdOfFee();
    }
    
    public void showHouseholdOfFee(){
        try {
            ConnectionController con = new ConnectionController();
            model.setRowCount(0);
            for(int hId: fee.getListOfHousehold()){
                Household h = con.findHousehold(hId);
                model.addRow(new Object[]{model.getRowCount() + 1,
                    h.getHouseholder(), h.getNumOfPeople(), fee.listOfHousehold.get(hId)*1000});
            }
        } catch (SQLException ex) {
            Logger.getLogger(InfoHouseholdJP.class.getName()).log(Level.SEVERE, null, ex);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHousehold = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbMoney = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lbNumOfHousehold = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("THÔNG TIN KHOẢN THU");

        tbHousehold.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "2", "đ", "1"},
                {"2", "2", "ff", "3"},
                {"22", "đá", "3", "2"},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "STT", "Tên chủ hộ", "Số nhân khẩu", "Số tiền"
            }
        ));
        jScrollPane1.setViewportView(tbHousehold);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Tên khoản thu:");

        lbName.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        lbName.setText("Tiền ủng hộ miền Trung lũ lụt ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Tổng cộng:");

        lbMoney.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbMoney.setText("5 000 000 ");

        jButton1.setText("Thay đổi đóng góp của hộ dân");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Số hộ đóng góp:");

        lbNumOfHousehold.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbNumOfHousehold.setText("25");

        jButton2.setText("Quay lại");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnDelete.setText("Xoá");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnAdd.setText("Thêm hộ dân đóng góp");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(259, 259, 259)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbNumOfHousehold, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbMoney))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jButton2)
                .addGap(153, 153, 153)
                .addComponent(jButton1)
                .addGap(38, 38, 38)
                .addComponent(btnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDelete)
                .addGap(100, 100, 100))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbName))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lbNumOfHousehold))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbMoney))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(btnDelete)
                    .addComponent(btnAdd))
                .addGap(31, 31, 31))
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

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if(fee.getfId() != 1){
            int r = tbHousehold.getSelectedRow();
            if(r > -1){
                String[] options = {"Có", "Không"};
                int input = JOptionPane.showOptionDialog(null, "Bạn có chắc chắn muốn xoá đóng góp này không?\nKhông thể hoàn lại thao tác này.", "Xác nhận", 0, JOptionPane.INFORMATION_MESSAGE, null, options, null);   
                if(input == 0){
                    try {
                        FeeController con = new FeeController();
                        boolean correct = con.removeFeeOfHousehold(fee.getListOfHousehold().get(input), fee.getfId());
                        if(correct){
                            JOptionPane.showMessageDialog(this, "Xoá thành công!", "Thông báo", 1);
                            jpnContent.removeAll();    
                            jpnContent.setLayout(new BorderLayout());
                            jpnContent.add(new InfoFeeJP(new ConnectionController().findFee(fee.getfId())));
                            jpnContent.validate();
                            jpnContent.repaint();
                        }
                        else{
                            JOptionPane.showMessageDialog(this, "Đã có lỗi xảy ra!", "Thông báo", 0);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(HouseholdManageJP.class.getName()).log(Level.SEVERE, null, ex);
                    }  
                    showHouseholdOfFee();
                }
                showHouseholdOfFee();
            } else JOptionPane.showMessageDialog(jPanel1, "Chọn hàng để xoá!", "Thông báo", 0);
        }
        else{
            JOptionPane.showMessageDialog(jPanel1, "Không thể xoá khoản đóng góp này!", "Thông báo", 0);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        IndexView.jpnContent.removeAll();    
        IndexView.jpnContent.setLayout(new BorderLayout());
        IndexView.jpnContent.add(new FeeManagerJP());
        IndexView.jpnContent.validate();
        IndexView.jpnContent.repaint();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int r = tbHousehold.getSelectedRow();
        if(r > -1){
            if(fee.getfId() == 1){
                JOptionPane.showMessageDialog(jPanel1, "Không thể sửa khoản đóng góp này!", "Thông báo", 0);
            } 
            else {
                new ChangeFeeOfHouseholdJF(fee.getListOfHousehold().get(r), fee.getfId()).setVisible(true);
                showHouseholdOfFee();
            }
        } else JOptionPane.showMessageDialog(jPanel1, "Chọn hàng để chỉnh sửa!", "Thông báo", 0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            // TODO add your handling code here:
            new AddMoneyInFeeJF(fee).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(InfoFeeJP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbMoney;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbNumOfHousehold;
    private javax.swing.JTable tbHousehold;
    // End of variables declaration//GEN-END:variables
}

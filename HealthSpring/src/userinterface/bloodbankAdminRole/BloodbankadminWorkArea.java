/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.bloodbankAdminRole;

import Business.Blood.BloodGroup;
import Business.BloodBankWorkQueue.BloodbankWorkRequest;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.BloodBankStaffOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.AdministrativeRole.ManageEmployeeJPanel;
import userinterface.AdministrativeRole.ManageOrganizationJPanel;
import userinterface.AdministrativeRole.ManageUserAccountJPanel;

/**
 *
 * @author mihir
 */
public class BloodbankadminWorkArea extends javax.swing.JPanel {
   private JPanel userProcessContainer;
    private BloodBankStaffOrganization bldorg;
      private EcoSystem business;
    private UserAccount userAccount;
    private Enterprise enterprise;

    /**
     * Creates new form BloodbankadminWorkArea
     */
    public BloodbankadminWorkArea(JPanel userProcessContainer, UserAccount account, BloodBankStaffOrganization organization, EcoSystem business, Enterprise enterprise) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.bldorg=organization;
        this.business = business;
        this.userAccount=account;
        this.enterprise=enterprise;
       enterpriseLabel.setText(enterprise.getName());
        
       populateTable();
     
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
        enterpriseLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        request = new javax.swing.JButton();
        assign = new javax.swing.JButton();
        enterpriseLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("My Work Area -Adminstrative Role");

        enterpriseLabel.setBackground(new java.awt.Color(255, 255, 255));
        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Blood Group", "Sender", "Status", "Volume", "Receiver", "Messege"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        request.setBackground(new java.awt.Color(255, 102, 102));
        request.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        request.setForeground(new java.awt.Color(255, 255, 255));
        request.setText("Respond to request");
        request.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestActionPerformed(evt);
            }
        });

        assign.setBackground(new java.awt.Color(255, 102, 102));
        assign.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        assign.setForeground(new java.awt.Color(255, 255, 255));
        assign.setText("Assign to me");
        assign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignActionPerformed(evt);
            }
        });

        enterpriseLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel1.setForeground(new java.awt.Color(255, 102, 102));
        enterpriseLabel1.setText("Blood Bank :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jButton1)
                        .addGap(29, 29, 29)
                        .addComponent(assign)
                        .addGap(77, 77, 77)
                        .addComponent(request))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enterpriseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(enterpriseLabel1)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(request)
                    .addComponent(assign))
                .addContainerGap(126, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        model.setRowCount(0);
         for(Network network :business.getNetworkList() ){
           for(Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()){
                 for (Organization organization : ent.getOrganizationDirectory().getOrganizationList()){
                    if (organization instanceof BloodBankStaffOrganization){
        for(WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[6];
            BloodbankWorkRequest bld=(BloodbankWorkRequest)request;
                         System.out.println(bld);
            row[0] = bld;
            String vol=String.valueOf(((BloodbankWorkRequest)request).getVolume());
                         System.out.println(vol);
            row[3] = vol;
            row[2] =request.getStatus();
            row[4]=request.getReceiver();
            row[5]=request.getMessage();
            row[1]=request.getSender();
            model.addRow(row);
        }
                    
        }}}}
}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void requestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestActionPerformed
       int selectedRow = jTable1.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
       
        BloodbankWorkRequest request = (BloodbankWorkRequest)jTable1.getValueAt(selectedRow, 0);
        
      if(request.getReceiver()== userAccount && (request.getStatus().equalsIgnoreCase("Pending") || request.getStatus().equalsIgnoreCase("Processing"))){
        request.setStatus("Processing");
        
        ProcessBloodReq ProcessBloodReq = new ProcessBloodReq(userProcessContainer, request, bldorg);
        userProcessContainer.add("ProcessBloodReq", ProcessBloodReq);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);   
      }
      else{
      JOptionPane.showMessageDialog(null, "You are not authorized to access this request or this request is already completed");}// TODO add your handling code here:
    }//GEN-LAST:event_requestActionPerformed

    private void assignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignActionPerformed
          int selectedRow = jTable1.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        WorkRequest request = (WorkRequest)jTable1.getValueAt(selectedRow, 0);
      if(request.getStatus().equalsIgnoreCase("New Request"))
      {
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        populateTable();
      }
      else{
      JOptionPane.showMessageDialog(null, "This request is already assigned");}
                // TODO add your handling code here:
    }//GEN-LAST:event_assignActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assign;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton request;
    // End of variables declaration//GEN-END:variables
}
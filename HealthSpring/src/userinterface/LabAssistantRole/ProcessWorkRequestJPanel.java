/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LabAssistantRole;

import Business.EmailNotify.EmailSender;
import Business.Patient.LabTestReport;
import Business.Patient.Patient;
import Business.Utility.LabMailTemplate;
import Business.Utility.LabReportTemplate;
import Business.Utility.PdfGenerator;
import Business.WorkQueue.LabTestRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

// Author: Sunil M. Yadav
public class ProcessWorkRequestJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    LabTestRequest labTestRequest;
    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public ProcessWorkRequestJPanel(JPanel userProcessContainer, LabTestRequest labTestRequest) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.labTestRequest = labTestRequest;
        PopulateData();
    }
    
    // Populate Data
    public void PopulateData(){
        txtPatientName.setText(labTestRequest.getObjPatient().getName());
        txtAge.setText(String.valueOf(labTestRequest.getObjPatient().getAge()));
        txtDoctorName.setText(labTestRequest.getDoctorName());
        if(labTestRequest.isReportGenerated()){
            chkReportGenerated.setSelected(true);
        }
        
        txtReportSummary.setText(labTestRequest.getReportDetails());
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSubmit = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        chkReportGenerated = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReportSummary = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtDoctorName = new javax.swing.JTextField();
        lblError = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 102, 102));

        btnSubmit.setBackground(new java.awt.Color(255, 102, 102));
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Submit Result & Send Email");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        backJButton.setBackground(new java.awt.Color(255, 102, 102));
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("UPDATE REPORT");

        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("Patient Name:");

        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("Age:");

        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setText("Doctor Name:");

        chkReportGenerated.setForeground(new java.awt.Color(255, 102, 102));
        chkReportGenerated.setText(" Report Generated");
        chkReportGenerated.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkReportGeneratedActionPerformed(evt);
            }
        });

        txtReportSummary.setColumns(20);
        txtReportSummary.setRows(5);
        jScrollPane1.setViewportView(txtReportSummary);

        jLabel5.setForeground(new java.awt.Color(255, 102, 102));
        jLabel5.setText("Report Summury:");

        txtPatientName.setEditable(false);
        txtPatientName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPatientName.setEnabled(false);
        txtPatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientNameActionPerformed(evt);
            }
        });

        txtAge.setEditable(false);
        txtAge.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAge.setEnabled(false);

        txtDoctorName.setEditable(false);
        txtDoctorName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDoctorName.setEnabled(false);

        lblError.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblError.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel5))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(chkReportGenerated, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                            .addComponent(txtPatientName)
                            .addComponent(txtAge)
                            .addComponent(txtDoctorName))
                        .addGap(18, 18, 18)
                        .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(chkReportGenerated)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(lblError)))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSubmit)
                            .addComponent(backJButton)))
                    .addComponent(jLabel5))
                .addContainerGap(163, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        LabAssistantWorkAreaJPanel labJPanel = (LabAssistantWorkAreaJPanel) component;
        labJPanel.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        if(chkReportGenerated.isSelected())
        {
            if(!txtReportSummary.getText().trim().equals("")){
                labTestRequest.setReportDetails(txtReportSummary.getText());
                labTestRequest.setReportGenerated(true);
                
                // add report to patient list
                LabTestReport objLabTestReport = new LabTestReport();
                
                objLabTestReport.setTestName(labTestRequest.getTestName());
                objLabTestReport.setCompletionDate(new Date());
                objLabTestReport.setDoctorName(labTestRequest.getDoctorName());
                objLabTestReport.setRequestDate(labTestRequest.getRequestedDate());
                objLabTestReport.setReportGenerated(true);
                objLabTestReport.setReportDetails(labTestRequest.getReportDetails());
                
                labTestRequest.getObjPatient().getLabTestReportList().add(objLabTestReport);
                
                JOptionPane.showMessageDialog(null, "Report generated successfully ");
                if(SendMail(labTestRequest)){
                    JOptionPane.showMessageDialog(null, "Email sent successfully !!");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Please add report summary !!");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select report generated check box");
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientNameActionPerformed

    private void chkReportGeneratedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkReportGeneratedActionPerformed
        if(chkReportGenerated.isSelected()){
            txtReportSummary.setEditable(true);
            txtReportSummary.setEnabled(true);
            btnSubmit.setEnabled(true);
        }
        else{
            txtReportSummary.setEditable(false);
            txtReportSummary.setEnabled(false);
            btnSubmit.setEnabled(false);
        }
    }//GEN-LAST:event_chkReportGeneratedActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JCheckBox chkReportGenerated;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblError;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtDoctorName;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextArea txtReportSummary;
    // End of variables declaration//GEN-END:variables

    // fucntion to send mail and report.
    public boolean SendMail(LabTestRequest objLabTestRequest){
        boolean isMailSend = false;
        try {
            String patientEmail = objLabTestRequest.getObjPatient().getEmail();
            String mailSubject = "Your Lab Test Reports are generated - Available Now(HealthSpring Labs)";
            Patient p = objLabTestRequest.getObjPatient();
            
            // Lab pdf template
            LabReportTemplate template = new LabReportTemplate();
            String reportTemplate = template.getReportTemplate(p.getName(),p.getAge(),objLabTestRequest.getDoctorName(),objLabTestRequest.getRequestedDate(),objLabTestRequest.getTestName(),objLabTestRequest.getReportDetails());
            
            String fileName = p.getName() + "-" + (int)(Math.random()*1000)+".pdf";
            
            PdfGenerator pdfGenerator = new PdfGenerator();
            pdfGenerator.GeneratePDF(reportTemplate, fileName);
            
            // Lab report email template
            LabMailTemplate objLabMailTemplate = new LabMailTemplate();
            String labMailTemplate = objLabMailTemplate.getMailTemplate(p.getName());
            
            EmailSender objEmailSender = new EmailSender(patientEmail, mailSubject, labMailTemplate, fileName);
           objEmailSender.sendMail();
            
            isMailSend = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cant' send email to this time. Please try again");
            e.printStackTrace();
        }
        
        return isMailSend;
    }
}
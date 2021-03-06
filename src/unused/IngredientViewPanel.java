/*
 *  © 2017 by Patrick Matthew Chan
 *  File: IngredientViewPanel.java
 *  Package: cpeprog
 *  Description: The IngredientViewPanel class.
 */
package unused;

import java.awt.event.ActionListener;

/**
 *
 * @author Patrick Matthew J. Chan
 */
public class IngredientViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public IngredientViewPanel() {
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

        txtQty = new javax.swing.JTextField();
        txtUnit = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtIng = new javax.swing.JTextArea();

        txtQty.setEditable(false);
        txtQty.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtQty.setText("1");

        txtUnit.setEditable(false);
        txtUnit.setText("big helping");
        txtUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnitActionPerformed(evt);
            }
        });

        txtIng.setEditable(false);
        txtIng.setBackground(new java.awt.Color(240, 240, 240));
        txtIng.setColumns(20);
        txtIng.setLineWrap(true);
        txtIng.setRows(5);
        txtIng.setText("food");
        txtIng.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtIng);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 24, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtIng;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtUnit;
    // End of variables declaration//GEN-END:variables
    
    
    //---------------User Methods---------------------//
    //--TEXTS
    public String getQty(){
        return txtQty.getText().trim();
    }
    public String getUnit(){
        return txtUnit.getText().trim();
    }
    public String getIng(){
        return txtIng.getText().trim();
    }    
    
    public void setQty(String txt){
        txtQty.setText(txt);
    }
    public void setUnit(String txt){
        txtUnit.setText(txt);
    }
    public void setIng(String txt){
        txtIng.setLineWrap(true);
        txtIng.setWrapStyleWord(true);
        txtIng.setText(txt);
    }
}

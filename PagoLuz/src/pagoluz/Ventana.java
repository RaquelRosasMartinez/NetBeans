/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.// entrar al wifi del vecino 
        
 */
package pagoluz;

import javax.swing.JOptionPane;


public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        this.setLocationRelativeTo(null);
        cmbDescuento.setEnabled(false);
        btnAplicar.setEnabled(false);
        btnPagar.setEnabled(false);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCons = new javax.swing.JTextField();
        btnCalcular2 = new javax.swing.JButton();
        txtTarifa = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JLabel();
        txtIVA = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        cmbDescuento = new javax.swing.JComboBox();
        btnAplicar = new javax.swing.JButton();
        txtPagar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCambio = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnPagar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnReiniciar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pagoluz/images (1).jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel3.setText("jLabel3");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pagoluz/images (1).jpg"))); // NOI18N
        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Ingrese el total de Watts:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 150, 20));
        getContentPane().add(txtCons, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 60, -1));

        btnCalcular2.setText("Calcular");
        btnCalcular2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcular2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        txtTarifa.setText("Tarifa:");
        getContentPane().add(txtTarifa, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 120, 30));

        txtSubtotal.setText("Subtotal:");
        getContentPane().add(txtSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 120, -1));

        txtIVA.setText("IVA:");
        getContentPane().add(txtIVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 110, 30));

        lblTotal.setText("Total:");
        getContentPane().add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, -1, -1));

        cmbDescuento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Descuento", "- 10%", "- 20%", "- 30%", "- 40%", "- 50%" }));
        getContentPane().add(cmbDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 103, -1));

        btnAplicar.setText("Aplicar");
        btnAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));
        getContentPane().add(txtPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 60, -1));

        jLabel8.setText("Pagar con: $");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, 20));

        txtCambio.setText("Cambio:");
        getContentPane().add(txtCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 110, -1));
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 72, -1));

        btnPagar.setText("Pagar");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(255, 0, 0));
        jTextArea1.setRows(5);
        jTextArea1.setText("Este programa calcula el total de luz a pagar recibiendo como dato principal\nel total de Watts consumidos por el cliente, una vez que se generan los\ndatos del pago, se presenta la opción de aplicar descuento e ingresar la \ncantidad con la que se pagará para mostrar el cambio.");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 450, 100));

        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btnReiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, -1, -1));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 670, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcular2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcular2ActionPerformed
        try{

            String an=txtCons.getText();
            if(txtCons.getText().isEmpty()){throw new Excepciones("Campo vacio");}

            for(int i=0; i<an.length(); i++){
                if(txtCons.getText().charAt(i)<45 || txtCons.getText().charAt(i)>57){ txtCons.setText(""); throw new Excepciones("Solo Números");}}

            int ant= Integer.parseInt(txtCons.getText());

            if(ant<0){ throw new Excepciones("Solo cantidades positivas");
            }else{
                btnPagar.setEnabled(true);
                cmbDescuento.setEnabled(true);}
            btnAplicar.setEnabled(true);

            int tarifa=10;
            int consumo= ant; 

            txtTarifa.setText("Tarifa:  $10/Watt");

            int subtotal= consumo*tarifa; txtSubtotal.setText("Subtotal:   "+subtotal);
            double p=subtotal*1.16; double IVA= p-subtotal; txtIVA.setText("IVA:   "+IVA);
            double total= subtotal+IVA; txtTotal.setText(total+"");
            cmbDescuento.setEnabled(true);
            btnAplicar.setEnabled(true);
            btnPagar.setEnabled(true);
          

        }catch(Excepciones e){JOptionPane.showMessageDialog(null,e.getMessage());}

    }//GEN-LAST:event_btnCalcular2ActionPerformed

    private void btnAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarActionPerformed
        try{
            int d =-1;
            if(cmbDescuento.getSelectedItem().toString().equals("Descuento")){throw new Excepciones("Seleccione el descuento");}
            float total= Float.parseFloat(txtTotal.getText());
            if(cmbDescuento.getSelectedIndex()!=0){
                d = cmbDescuento.getSelectedIndex();}

            if(d==1){total=(float) (total*.1);}
            else if(d==2){total=(float) (total*.2);}
            else if(d==3){total=(float) (total*.3);}
            else if(d==4){total=(float) (total*.4);}
            else if(d==5){total=(float) (total*.5);}
            txtTotal.setText(total+"");
            btnCalcular2.setEnabled(false);
            btnAplicar.setEnabled(false);
            cmbDescuento.setEnabled(false);
        }catch(Excepciones e){JOptionPane.showMessageDialog(null,e.getMessage());}
    }//GEN-LAST:event_btnAplicarActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        try{
            if(txtPagar.getText().isEmpty()){throw new Excepciones("Campo vacio");}
            String an=txtPagar.getText();

            for(int i=0; i<an.length(); i++){
                if(txtPagar.getText().charAt(i)<45 || txtPagar.getText().charAt(i)>57){ txtPagar.setText(""); throw new Excepciones("Solo Números");}}

            float total= Float.parseFloat(txtTotal.getText());
            int pagar= Integer.parseInt(txtPagar.getText());
            if(pagar<total){ throw new Excepciones("Pago Insuficiente");}
            for(int i=0; i<txtPagar.getText().length(); i++){
                if(txtPagar.getText().charAt(i)<45 || txtPagar.getText().charAt(i)>57){ txtPagar.setText(""); throw new Excepciones("Solo Números");}}
            if(pagar<0){ throw new Excepciones("Solo números positivos");}

            float cambio= pagar-total; txtCambio.setText("Cambio:   "+cambio);

        }catch(Excepciones e){JOptionPane.showMessageDialog(null,e.getMessage());}
    }//GEN-LAST:event_btnPagarActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
            btnAplicar.setEnabled(false);
            cmbDescuento.setSelectedIndex(0);
            cmbDescuento.setEnabled(false);
            btnCalcular2.setEnabled(true);
            btnPagar.setEnabled(false);
            txtTotal.setText("");
            txtCons.setText("");
            txtPagar.setText("");
            txtSubtotal.setText("Subtotal:   ");
            txtIVA.setText("IVA:   ");
            txtCambio.setText("Cambio:   ");
    }//GEN-LAST:event_btnReiniciarActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAplicar;
    private javax.swing.JButton btnCalcular2;
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JComboBox cmbDescuento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel txtCambio;
    private javax.swing.JTextField txtCons;
    private javax.swing.JLabel txtIVA;
    private javax.swing.JTextField txtPagar;
    private javax.swing.JLabel txtSubtotal;
    private javax.swing.JLabel txtTarifa;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}

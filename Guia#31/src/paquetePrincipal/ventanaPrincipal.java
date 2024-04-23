/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package paquetePrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


/**
 *
 * @author Usuario
 */
public class ventanaPrincipal extends javax.swing.JFrame {
    
    BotonContador botonA;
    BotonContador botonB;
    BotonContador botonC;
    

    
    public ventanaPrincipal() {
        initComponents();
        creacionVentana();
    }
    
    public void creacionVentana(){
        
        this.setTitle("Ejercicio de Herencia");
        this.setSize(250,300);
        
        botonA = new BotonContador();
        botonA.setText("Boton A");
        botonA.setBounds(10, 10, 100, 30);
        this.getContentPane().add(botonA);
        
        botonB = new BotonContador();
        botonB.setText("Boton B");
        botonB.setBounds(130, 10, 100, 30);
        this.getContentPane().add(botonB);
        
        botonC = new BotonContador();
        botonC.setText("Boton C");
        botonC.setBounds(70, 70, 100, 30);
        this.getContentPane().add(botonC);
        
        botonA.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent evt){ 
         pulsacionBotonA(evt);
        }
        
    });
        
    botonB.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent evt){
     pulsacionBotonB(evt);   
    }
    });

    botonC.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent evt){
     pulsacionBotonC(evt);   
    }
    });
    }
    
    public void pulsacionBotonA(ActionEvent evt){
    botonA.incrementa();
    }
    
    public void pulsacionBotonB(ActionEvent evt){
    botonB.incrementa();
    }
    
    public void pulsacionBotonC(ActionEvent evt){
    botonC.aumenta(2);
    }
     
    
    
      
    
    
    
    
    
    
    
    
    
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonverPulsaciones = new javax.swing.JButton();
        botonReiniciar = new javax.swing.JButton();
        txtNumeros = new javax.swing.JTextField();
        botonIniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonverPulsaciones.setText("Ver Pulsaciones");
        botonverPulsaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonverPulsacionesActionPerformed(evt);
            }
        });

        botonReiniciar.setText("Reiniciar");
        botonReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReiniciarActionPerformed(evt);
            }
        });

        botonIniciar.setText("Iniciar");
        botonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonIniciar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonverPulsaciones)
                        .addGap(40, 40, 40)
                        .addComponent(botonReiniciar)))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(174, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonverPulsaciones)
                    .addComponent(botonReiniciar))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonverPulsacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonverPulsacionesActionPerformed
    String info, dato;
    
    info = "El boton A se ha pulsado " + botonA.getPulsaciones()+"\n";
    info = info + "El boton B se ha pulsado "  + botonB.getPulsaciones()+"\n";
    dato = "El boton C se ha pulsado " + botonC.getPulsaciones()+"\n";
    JOptionPane.showMessageDialog(null,info + dato);
    }//GEN-LAST:event_botonverPulsacionesActionPerformed

    private void botonReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReiniciarActionPerformed
    botonA.reiniciar();
    botonB.reiniciar(); 
    botonC.reiniciar();
    }//GEN-LAST:event_botonReiniciarActionPerformed

    private void botonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarActionPerformed
        String pulsaciones =txtNumeros.getText();
        int pulsaEntero= Integer.parseInt(pulsaciones);
        botonA.setPulsaciones(pulsaEntero);
        botonB.setPulsaciones(pulsaEntero);
        botonC.setPulsaciones(pulsaEntero);
    }//GEN-LAST:event_botonIniciarActionPerformed

    
    
    
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
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIniciar;
    private javax.swing.JButton botonReiniciar;
    private javax.swing.JButton botonverPulsaciones;
    private javax.swing.JTextField txtNumeros;
    // End of variables declaration//GEN-END:variables
}

/************************************************
 * Ventanita.java * @author  Santiago
 * Created on 12 de marzo de 2008, 03:54 PM
 ************************************************/
public class Ventanita extends javax.swing.JFrame {
    public Ventanita() {
        initComponents();
    }
    /***************************************
     *    Declaración de Variables          *
     ****************************************/
     Hilito hilo,hilo2;
    //***************************************
     
     public void Mueve_Boton(javax.swing.JButton elBoton){
         if ( elBoton.getLocation().y >= 0){
            elBoton.setLocation(elBoton.getX(), elBoton.getY()-2);
         }
    }//Mueve_Boton
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Boton1 = new javax.swing.JButton();
        Boton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Boton1.setText("#1");
        Boton1.setAlignmentY(0.0F);
        Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1ActionPerformed(evt);
            }
        });

        Boton2.setText("#2");
        Boton2.setAlignmentY(0.0F);
        Boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Boton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(Boton2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 223, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton1)
                    .addComponent(Boton2)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
//AQUI INSTANCIAMOS UN OBJETO DE NUESTRA CLASE QUE FUNCIONA COMO HILO
   	hilo = new Hilito(this, Boton1);
        hilo.start(); 
        
        hilo2 = new Hilito(this, Boton2);
        hilo2.start(); 
    }//GEN-LAST:event_formWindowActivated

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton1ActionPerformed

    private void Boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton2ActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventanita().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton1;
    private javax.swing.JButton Boton2;
    // End of variables declaration//GEN-END:variables
    
}

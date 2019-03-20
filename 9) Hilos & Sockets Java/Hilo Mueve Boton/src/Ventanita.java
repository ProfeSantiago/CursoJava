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
     Hilito hilo;
    //***************************************
     
     public void Mueve_Boton(){
         if ( Botoncito.getLocation().y >= 0){
            Botoncito.setLocation(Botoncito.getX(), Botoncito.getY()-2);
         }
    }//Mueve_Boton
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Botoncito = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Botoncito.setText("Me muevo");
        Botoncito.setAlignmentY(0.0F);
        Botoncito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotoncitoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Botoncito)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 223, Short.MAX_VALUE)
                .addComponent(Botoncito))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
//AQUI INSTANCIAMOS UN OBJETO DE NUESTRA CLASE QUE FUNCIONA COMO HILO
   	hilo = new Hilito(this);
        hilo.start();  
    }//GEN-LAST:event_formWindowActivated

    private void BotoncitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotoncitoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotoncitoActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventanita().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botoncito;
    // End of variables declaration//GEN-END:variables
    
}

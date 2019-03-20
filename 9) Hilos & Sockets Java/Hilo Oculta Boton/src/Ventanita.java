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
     
     public void Oculta_Boton(){
         Botoncito.setVisible(false);
     }
     
     public void Muestra_Boton(){
         Botoncito.setVisible(true);
     }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Botoncito = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Botoncito.setText("Cancelar");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Formateando su Llave maya");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(Botoncito)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Botoncito)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
//AQUI INSTANCIAMOS UN OBJETO DE NUESTRA CLASE QUE FUNCIONA COMO HILO
   	hilo = new Hilito(this);
        hilo.start();  
    }//GEN-LAST:event_formWindowActivated
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventanita().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botoncito;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    
}

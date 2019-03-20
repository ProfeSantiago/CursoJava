/*****************************************************************
 * Hola Mundo.java - Ing.Santiago Rodríguez Paniagua
 * Created on 27 de septiembre de 2007, 09:40 PM
 *****************************************************************/
package holamundojava;
// Es necesario importar esta librería para el JOptionPane
import javax.swing.JOptionPane; 
public class Principal extends javax.swing.JFrame {
    public Principal() {
        initComponents();
    }
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Saluda_Btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Nombre_Txt = new javax.swing.JTextField();
        Saludo_Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Saluda_Btn.setText("Saludar");
        Saluda_Btn.setName(""); // NOI18N
        Saluda_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Saluda_BtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Digite su Nombre:");

        Saludo_Label.setText("Hola!!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nombre_Txt, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(Saludo_Label)
                    .addComponent(Saluda_Btn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Nombre_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Saludo_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(Saluda_Btn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Saluda_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Saluda_BtnActionPerformed
        // Declaración de Variables
        String nombre;
        
        //Leemos de pantalla
        nombre = Nombre_Txt.getText();
         
         //Desplegamos el mensaje en el campo de texto.
         Saludo_Label.setText( "Hola "+nombre+" !");
         
         //Desplegamos un Pop-Up con el saludo.
         JOptionPane.showMessageDialog(null, "Hola\n"+nombre+" !");
         
         //Sale del Programa.
         System.exit( 0 ); 
    }//GEN-LAST:event_Saluda_BtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Nombre_Txt;
    private javax.swing.JButton Saluda_Btn;
    private javax.swing.JLabel Saludo_Label;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    
}

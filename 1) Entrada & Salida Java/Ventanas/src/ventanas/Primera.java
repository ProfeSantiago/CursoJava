/************************************************
 * Primera.java
 * @author Ing.  Santiago Rodríguez Paniagua
 * Created on 17 de abril de 2008, 05:36 PM
 ************************************************/

package ventanas;
public class Primera extends javax.swing.JFrame {
    public Primera() {
        initComponents();
    }
    /***************************************
     *    Declaración de Variables          *
     ****************************************/
    
    //***************************************
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Segunda_Btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Esta es la primera Ventana");

        Segunda_Btn.setText("Ir a la Segunda");
        Segunda_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Segunda_BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Segunda_Btn)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Segunda_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Segunda_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Segunda_BtnActionPerformed
        new Segunda().setVisible(true);
}//GEN-LAST:event_Segunda_BtnActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Primera().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Segunda_Btn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    
}

/************************************************
 * Primera.java
 * @author Ing.  Santiago Rodríguez Paniagua
 * Created on 17 de abril de 2008, 05:36 PM
 ************************************************/

package ventanas;
public class Segunda extends javax.swing.JFrame {
    public Segunda() {
        initComponents();
    }
    /***************************************
     *    Declaración de Variables          *
     ****************************************/
    
    //***************************************
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Primera_Btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Esta es la Segunda Ventana");

        Primera_Btn.setText("Ir a la Primera");
        Primera_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Primera_BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(Primera_Btn))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Primera_Btn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Primera_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Primera_BtnActionPerformed
        new Primera().setVisible(true);
}//GEN-LAST:event_Primera_BtnActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Segunda().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Primera_Btn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    
}

/************************************************
 * Principal.java
 * @author Ing.  Santiago Rodríguez Paniagua
 * Created on 17 de abril de 2008, 05:54 PM
 ************************************************/

package ventanas;
public class Principal extends javax.swing.JFrame {
    public Principal() {
        initComponents();
    }
    /***************************************
     *    Declaración de Variables          *
     ****************************************/
    
    //***************************************
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Segunda_Btn = new javax.swing.JButton();
        Primera_Btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Segunda_Btn.setText("Ir a la Segunda");
        Segunda_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Segunda_BtnActionPerformed(evt);
            }
        });

        Primera_Btn.setText("Ir a la Primera");
        Primera_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Primera_BtnActionPerformed(evt);
            }
        });

        jTextArea1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(2);
        jTextArea1.setText(" Esta ventana es cargada automáticamente \n gracias a que es llamada dentro la clase main");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Primera_Btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(Segunda_Btn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Segunda_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(Primera_Btn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Segunda_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Segunda_BtnActionPerformed
        new Segunda().setVisible(true);
    }//GEN-LAST:event_Segunda_BtnActionPerformed

    private void Primera_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Primera_BtnActionPerformed
        new Primera().setVisible(true);
    }//GEN-LAST:event_Primera_BtnActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Primera_Btn;
    private javax.swing.JButton Segunda_Btn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
    
}

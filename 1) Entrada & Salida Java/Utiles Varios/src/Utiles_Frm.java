/************************************************
 * Utiles_Frm.java  * @author  Santiago
 * Created on 27 de febrero de 2008, 10:07 PM
 ************************************************/
import java.util.Date;   //Necesaria para las Fechas
import java.util.Random; //Necesaria para los Aleatorios

public class Utiles_Frm extends javax.swing.JFrame {
    public Utiles_Frm() {
        initComponents();
    }
    
    //---------------------------------------------
    // Declaración de Variables
    //---------------------------------------------
    Date Fecha = new Date();
    Random Aleatorio = new Random();
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fecha_Lab = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        Aleatorio_Lab = new javax.swing.JLabel();
        Genera_Btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Fecha_Lab.setText("Fecha");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel1.setForeground(java.awt.Color.blue);
        jLabel1.setText("La fecha Actual es:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel2.setForeground(java.awt.Color.blue);
        jLabel2.setText("Números Aleatorios");

        Aleatorio_Lab.setText("Aleatorio");

        Genera_Btn.setText("Generar");
        Genera_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Genera_BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(94, Short.MAX_VALUE))
                    .addComponent(Fecha_Lab)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(88, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Aleatorio_Lab)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(Genera_Btn)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addComponent(Fecha_Lab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Aleatorio_Lab)
                    .addComponent(Genera_Btn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //Mostramos la Fecha en pantalla
        Fecha_Lab.setText(String.valueOf(Fecha));
       //Mostramos el primer Aleatorio en pantalla
        Aleatorio_Lab.setText(String.valueOf(Aleatorio.nextInt()));
    }//GEN-LAST:event_formWindowActivated

    private void Genera_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Genera_BtnActionPerformed
        Aleatorio_Lab.setText(String.valueOf(Aleatorio.nextInt()));
    }//GEN-LAST:event_Genera_BtnActionPerformed
    

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Utiles_Frm().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Aleatorio_Lab;
    private javax.swing.JLabel Fecha_Lab;
    private javax.swing.JButton Genera_Btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
    
}

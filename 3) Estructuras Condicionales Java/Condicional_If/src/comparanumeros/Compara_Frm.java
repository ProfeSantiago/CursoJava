/*****************************************************************
 * Compara Números.java - Ing.Santiago Rodríguez Paniagua
 * Created on 28 de enero de 2008, 10:17 PM
 *****************************************************************/
package comparanumeros;
public class Compara_Frm extends javax.swing.JFrame {
    public Compara_Frm() {
        initComponents();
    }
    //Declaración de Variables Globales
    int Num1, Num2;
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Num1_txt = new javax.swing.JTextField();
        Num2_txt = new javax.swing.JTextField();
        Resultado_Lab = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Compara_Btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Compara_Frm"); // NOI18N

        Num2_txt.setEditable(false);

        Resultado_Lab.setText("...............");

        jLabel1.setText("Digite 2 números para compraralos");

        Compara_Btn.setText("Comparar");
        Compara_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Compara_BtnActionPerformed(evt);
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
                        .addComponent(Num1_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Compara_Btn)
                        .addGap(5, 5, 5)
                        .addComponent(Num2_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(Resultado_Lab))
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Num1_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Num2_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Compara_Btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Resultado_Lab)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Compara_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Compara_BtnActionPerformed
        //Leemos de Pantalla
        Num1 = Integer.valueOf(Num1_txt.getText());
        Num2 = Integer.valueOf(Num2_txt.getText());
        
        if (Num1 == Num2){
            Resultado_Lab.setText("Los Números son iguales");
        }
        if (Num1 > Num2){
            Resultado_Lab.setText("El primer número es mayor");
        }
        if (Num1 < Num2){
            Resultado_Lab.setText("El segundo número es mayor");
        }
    }//GEN-LAST:event_Compara_BtnActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compara_Frm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Compara_Btn;
    private javax.swing.JTextField Num1_txt;
    private javax.swing.JTextField Num2_txt;
    private javax.swing.JLabel Resultado_Lab;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

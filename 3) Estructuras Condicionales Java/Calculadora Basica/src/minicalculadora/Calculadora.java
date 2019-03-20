/*****************************************************************
 * Calculadora Básica.java - Ing.Santiago Rodríguez Paniagua
 * Created on 28 de enero de 2008, 09:17 PM
 *****************************************************************/
package minicalculadora;
public class Calculadora extends javax.swing.JFrame {
    public Calculadora() {
        initComponents();
    }
    //Declaración de Variables Globales
    int Numero1, Numero2, Resultado;
    
    public int Evaluador(int Num1, int Num2, String Signo) {
        int Result=0;
        if (Signo == "+") {
            Result= Num1+Num2;
        }
        if (Signo == "-") {
            Result= Num1-Num2;
        }
        if (Signo == "/") {
            Result= Num1/Num2;
        }
        if (Signo == "*") {
            Result= Num1*Num2;
        }
        return Result; //Devuelve el valor de Result
    }//Fin Evaluador
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Num1_txt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Num2_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Result_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Mas_Btn = new javax.swing.JButton();
        Menos_Btn = new javax.swing.JButton();
        Por_Btn = new javax.swing.JButton();
        Div_Btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Digite el primer número:");

        jLabel2.setText("Digite el primer número:");

        jLabel3.setText("Resultado:");

        Mas_Btn.setText("+");
        Mas_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mas_BtnActionPerformed(evt);
            }
        });

        Menos_Btn.setText("-");
        Menos_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menos_BtnActionPerformed(evt);
            }
        });

        Por_Btn.setText("*");
        Por_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Por_BtnActionPerformed(evt);
            }
        });

        Div_Btn.setText("/");
        Div_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Div_BtnActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Num1_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Num2_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(Result_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Mas_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Menos_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                            .addComponent(Por_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                            .addComponent(Div_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)))
                    .addComponent(jLabel1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Num1_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Num2_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Result_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Mas_Btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Menos_Btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Por_Btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Div_Btn)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Mas_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mas_BtnActionPerformed
        Numero1 = Integer.valueOf(Num1_txt.getText());
        Numero2 = Integer.valueOf(Num2_txt.getText());
        Resultado = Evaluador(Numero1,Numero2,"+");
        Result_txt.setText(String.valueOf(Resultado));        
    }//GEN-LAST:event_Mas_BtnActionPerformed

    private void Menos_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos_BtnActionPerformed
        Numero1 = Integer.valueOf(Num1_txt.getText());
        Numero2 = Integer.valueOf(Num2_txt.getText());
        Resultado = Evaluador(Numero1,Numero2,"-");
        Result_txt.setText(String.valueOf(Resultado));     
    }//GEN-LAST:event_Menos_BtnActionPerformed

    private void Por_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Por_BtnActionPerformed
        Numero1 = Integer.valueOf(Num1_txt.getText());
        Numero2 = Integer.valueOf(Num2_txt.getText());
        Resultado = Evaluador(Numero1,Numero2,"*");
        Result_txt.setText(String.valueOf(Resultado));     
    }//GEN-LAST:event_Por_BtnActionPerformed

    private void Div_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Div_BtnActionPerformed
        Numero1 = Integer.valueOf(Num1_txt.getText());
        Numero2 = Integer.valueOf(Num2_txt.getText());
        Resultado = Evaluador(Numero1,Numero2,"/");
        Result_txt.setText(String.valueOf(Resultado));     
    }//GEN-LAST:event_Div_BtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Div_Btn;
    private javax.swing.JButton Mas_Btn;
    private javax.swing.JButton Menos_Btn;
    private javax.swing.JTextField Num1_txt;
    private javax.swing.JTextField Num2_txt;
    private javax.swing.JButton Por_Btn;
    private javax.swing.JTextField Result_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
    
}

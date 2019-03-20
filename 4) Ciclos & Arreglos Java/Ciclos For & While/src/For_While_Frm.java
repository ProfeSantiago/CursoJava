/************************************************
 * For_While_Frm.java
 * @author Ing.  Santiago Rodríguez Paniagua
 * Created on 28 de marzo de 2008, 08:27 AM
 ************************************************/
public class For_While_Frm extends javax.swing.JFrame {
    public For_While_Frm() {
        initComponents();
    }
    /***************************************
     *    Declaración de Variables          *
     ****************************************/
    int num1, num2;
    //***************************************
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Mul5_Btn = new javax.swing.JButton();
        Lista = new java.awt.List();
        Mul2_Btn = new javax.swing.JButton();
        Inicio_txt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Final_txt = new javax.swing.JTextField();
        Mul2_Btn2 = new javax.swing.JButton();
        Mul5_Btn2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Mul5_Btn.setText("Multiplos de 5");
        Mul5_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mul5_BtnActionPerformed(evt);
            }
        });

        Mul2_Btn.setText("Multiplos de 2");
        Mul2_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mul2_BtnActionPerformed(evt);
            }
        });

        Inicio_txt.setText("3");

        jLabel1.setText("Iniciar en:");

        jLabel2.setText("Terminar en:");

        Final_txt.setText("43");

        Mul2_Btn2.setText("Multiplos de 2");
        Mul2_Btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mul2_Btn2ActionPerformed(evt);
            }
        });

        Mul5_Btn2.setText("Multiplos de 5");
        Mul5_Btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mul5_Btn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lista, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Mul2_Btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Mul5_Btn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Mul2_Btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addComponent(Inicio_txt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(Mul5_Btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Final_txt))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lista, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Mul2_Btn)
                            .addComponent(Mul5_Btn))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Inicio_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Final_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Mul2_Btn2)
                            .addComponent(Mul5_Btn2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Mul2_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mul2_BtnActionPerformed
        Lista.clear();
        //Imprimimos numeros contando o aumentando de 2 en 2
        for(int Contador = 2; Contador <=10; Contador=Contador+2){
            Lista.add(String.valueOf(Contador));
        }
}//GEN-LAST:event_Mul2_BtnActionPerformed

    private void Mul5_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mul5_BtnActionPerformed
        Lista.clear();        
        int Contador2=5;
       //Imprimimos numeros contando o aumentando de 5 en 5
        while(Contador2 <= 25){
           Lista.add(String.valueOf(Contador2));
           Contador2=Contador2+5;
       }
}//GEN-LAST:event_Mul5_BtnActionPerformed

    private void Mul2_Btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mul2_Btn2ActionPerformed
        Lista.clear();
        
        num1=Integer.valueOf(Inicio_txt.getText());
        num2=Integer.valueOf(Final_txt.getText());
        //Aumentamos el inicio y el fin hasta que sean multiplos de 2        
        while ((num1 % 2) != 0){ num1++;}
        while ((num2 % 2) != 0){ num2++;}
        //Imprimimos numeros contando o aumentando de 2 en 2
        for(int Contador = num1; Contador <=num2; Contador=Contador+2){
            Lista.add(String.valueOf(Contador));
        }
}//GEN-LAST:event_Mul2_Btn2ActionPerformed

    private void Mul5_Btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mul5_Btn2ActionPerformed
        Lista.clear();
        num1=Integer.valueOf(Inicio_txt.getText());
        num2=Integer.valueOf(Final_txt.getText());
        //Aumentamos el inicio y el fin hasta que sean multiplos de 2
        while ((num1 % 5) != 0){ num1++;}
        while ((num2 % 5) != 0){ num2++;}
        int Contador2=num1;
        
        //Imprimimos numeros contando o aumentando de 5 en 5
        do{
           Lista.add(String.valueOf(Contador2));
           Contador2=Contador2+5;
       }while(Contador2 <= num2);
}//GEN-LAST:event_Mul5_Btn2ActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new For_While_Frm().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Final_txt;
    private javax.swing.JTextField Inicio_txt;
    private java.awt.List Lista;
    private javax.swing.JButton Mul2_Btn;
    private javax.swing.JButton Mul2_Btn2;
    private javax.swing.JButton Mul5_Btn;
    private javax.swing.JButton Mul5_Btn2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
    
}

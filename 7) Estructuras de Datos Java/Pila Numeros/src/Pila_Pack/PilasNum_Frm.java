package Pila_Pack;

import javax.swing.JOptionPane;

public class PilasNum_Frm extends javax.swing.JFrame {

    public PilasNum_Frm() {
        initComponents();
    }

   NodoPila Pila, Actual, Aux;

   public void Muestra_Pila(){
              
       Listilla.clear();
       Actual = Pila;
        while (Actual != null){
            Listilla.add(String.valueOf(Actual.Info));            
            Actual = Actual.Sgte;
        }//Fin While
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Num_txt = new javax.swing.JTextField();
        Push_Btn = new javax.swing.JButton();
        Listilla = new java.awt.List();
        Pop_Btn = new javax.swing.JButton();
        Extrae_Btn = new javax.swing.JButton();
        Primero_Btn = new javax.swing.JButton();
        Siguiente_Btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        BuscaNum_Txt = new javax.swing.JTextField();
        Busca_Btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pila de Números");

        jLabel1.setText("Digite un número:");

        Push_Btn.setText("Push");
        Push_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Push_BtnActionPerformed(evt);
            }
        });

        Listilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListillaActionPerformed(evt);
            }
        });

        Pop_Btn.setText("Pop");
        Pop_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pop_BtnActionPerformed(evt);
            }
        });

        Extrae_Btn.setText("Último");
        Extrae_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Extrae_BtnActionPerformed(evt);
            }
        });

        Primero_Btn.setText("Primero");
        Primero_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Primero_BtnActionPerformed(evt);
            }
        });

        Siguiente_Btn.setText("Siguiente >>");
        Siguiente_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Siguiente_BtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Buscar:");

        BuscaNum_Txt.setName(""); // NOI18N

        Busca_Btn.setText("Buscar");
        Busca_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Busca_BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Siguiente_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(Listilla, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BuscaNum_Txt)
                        .addGap(18, 18, 18)
                        .addComponent(Busca_Btn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                .addComponent(Num_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(Push_Btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                        .addComponent(Primero_Btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                                    .addGap(19, 19, 19)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(Pop_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                        .addComponent(Extrae_Btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))))
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Num_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Push_Btn)
                    .addComponent(Pop_Btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Extrae_Btn)
                    .addComponent(Primero_Btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Siguiente_Btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Listilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BuscaNum_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Busca_Btn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Push_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Push_BtnActionPerformed
        Pila = Pila.Push(Pila,Integer.valueOf(Num_txt.getText()));
        Muestra_Pila();
        Num_txt.setText("");
        Aux = Pila;
    }//GEN-LAST:event_Push_BtnActionPerformed

    private void ListillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListillaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListillaActionPerformed

    private void Pop_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pop_BtnActionPerformed
        Num_txt.setText(String.valueOf(Pila.Extrae(Pila)));
        Pila = Pila.Pop(Pila);
        Muestra_Pila();
    }//GEN-LAST:event_Pop_BtnActionPerformed

    private void Extrae_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Extrae_BtnActionPerformed
        JOptionPane.showMessageDialog(rootPane, Pila.Extrae(Pila));
    }//GEN-LAST:event_Extrae_BtnActionPerformed

    private void Primero_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Primero_BtnActionPerformed
        JOptionPane.showMessageDialog(rootPane, Pila.Info);
    }//GEN-LAST:event_Primero_BtnActionPerformed

    private void Siguiente_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Siguiente_BtnActionPerformed
        if (Aux != null){
            Num_txt.setText(String.valueOf(Aux.Info));
            Aux = Aux.Sgte;
        }else{
            Aux = Pila;
            Num_txt.setText(String.valueOf(Aux.Info));
            Aux = Aux.Sgte;
        }
    }//GEN-LAST:event_Siguiente_BtnActionPerformed

    private void Busca_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Busca_BtnActionPerformed
        boolean encontrado = false;
        encontrado = Pila.BuscaNumero(Pila,Integer.valueOf(BuscaNum_Txt.getText()));
        
        if (encontrado){
            JOptionPane.showMessageDialog(rootPane, "Si está!!");
        } else{
             JOptionPane.showMessageDialog(rootPane, "No está!!");
        }
    }//GEN-LAST:event_Busca_BtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PilasNum_Frm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BuscaNum_Txt;
    private javax.swing.JButton Busca_Btn;
    private javax.swing.JButton Extrae_Btn;
    private java.awt.List Listilla;
    private javax.swing.JTextField Num_txt;
    private javax.swing.JButton Pop_Btn;
    private javax.swing.JButton Primero_Btn;
    private javax.swing.JButton Push_Btn;
    private javax.swing.JButton Siguiente_Btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

}

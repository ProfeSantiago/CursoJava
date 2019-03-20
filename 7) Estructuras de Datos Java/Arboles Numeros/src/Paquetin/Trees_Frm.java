package Paquetin;

public class Trees_Frm extends javax.swing.JFrame {

    public Trees_Frm() {
        initComponents();
    }

    Arbol Palo = new Arbol();                   //Palo es una instancia de Arbol
    Arbol Arbusto =  new Arbol();            //Arbusto es una instancia de Arbol
    int numero=0;
    String Texto = "";

    public void EnOrden(Arbol Raiz){
        if (Raiz == null) return;
        EnOrden(Raiz.izq);
        Lista_Consulta.add(String.valueOf(Raiz.numero));
        EnOrden(Raiz.der);
    }

    public void PreOrden(Arbol Raiz){
        if (Raiz == null) return;
        Lista_Consulta.add(String.valueOf(Raiz.numero));
        EnOrden(Raiz.izq);
        EnOrden(Raiz.der);
    }

    public void PosOrden(Arbol Raiz){
        if (Raiz == null) return;
        EnOrden(Raiz.izq);
        EnOrden(Raiz.der);
        Lista_Consulta.add(String.valueOf(Raiz.numero));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Numero_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Lista_Consulta = new java.awt.List();
        Lista_Original = new java.awt.List();
        Orden_Btn = new javax.swing.JButton();
        Inserta_Btn = new javax.swing.JButton();
        PreOrden_Btn = new javax.swing.JButton();
        PosOrden_Btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Digite un número:");

        Numero_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Numero_txtKeyReleased(evt);
            }
        });

        jLabel3.setText("Números en el Árbol:");

        jLabel2.setText("Números ingresados");

        Orden_Btn.setText("EnOrden");
        Orden_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Orden_BtnActionPerformed(evt);
            }
        });

        Inserta_Btn.setText("Insertar");
        Inserta_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Inserta_BtnActionPerformed(evt);
            }
        });

        PreOrden_Btn.setText("PreOrden");
        PreOrden_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreOrden_BtnActionPerformed(evt);
            }
        });

        PosOrden_Btn.setText("PosOrden");
        PosOrden_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PosOrden_BtnActionPerformed(evt);
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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Numero_txt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lista_Original, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lista_Consulta, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PreOrden_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Orden_Btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(PosOrden_Btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Inserta_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                        .addGap(19, 19, 19)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Numero_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lista_Original, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Inserta_Btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PreOrden_Btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Orden_Btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PosOrden_Btn))
                            .addComponent(Lista_Consulta, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Numero_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Numero_txtKeyReleased
        if  ((evt.getKeyCode() >= 48 && evt.getKeyCode() <= 57) || (evt.getKeyCode() == 46 || evt.getKeyCode() == 8)){
        }else{
            Texto = Numero_txt.getText();
            Numero_txt.setText(Texto.substring(0, (Texto.length()-1)));
        }
}//GEN-LAST:event_Numero_txtKeyReleased

    private void Orden_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Orden_BtnActionPerformed
         Lista_Consulta.clear();
        EnOrden(Arbusto);
}//GEN-LAST:event_Orden_BtnActionPerformed

    private void Inserta_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Inserta_BtnActionPerformed
       numero = Integer.valueOf(Numero_txt.getText());
       Palo = Palo.Inserta(Palo, numero);
       Lista_Original.add(Numero_txt.getText());
       Numero_txt.setText("");
    }//GEN-LAST:event_Inserta_BtnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Arbusto = Palo;
    }//GEN-LAST:event_formWindowOpened

    private void PreOrden_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreOrden_BtnActionPerformed
        Lista_Consulta.clear();
        PreOrden(Arbusto);
    }//GEN-LAST:event_PreOrden_BtnActionPerformed

    private void PosOrden_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PosOrden_BtnActionPerformed
        Lista_Consulta.clear();
        PosOrden(Arbusto);
    }//GEN-LAST:event_PosOrden_BtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Trees_Frm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Inserta_Btn;
    private java.awt.List Lista_Consulta;
    private java.awt.List Lista_Original;
    private javax.swing.JTextField Numero_txt;
    private javax.swing.JButton Orden_Btn;
    private javax.swing.JButton PosOrden_Btn;
    private javax.swing.JButton PreOrden_Btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

}

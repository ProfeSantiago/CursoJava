package MessengerPack;
public class Messenger_Frm extends javax.swing.JFrame {
    public Messenger_Frm() {
        initComponents();
    }

    /***************************************
    *    Declaración de Variables          *
    ****************************************/
    Socket_Cliente Cliente;
    Socket_Server Servidor;
    MiHilo Hilo;
    //***************************************

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Lista_Mensajes = new java.awt.List();
        jLabel1 = new javax.swing.JLabel();
        Send_txt = new javax.swing.JTextField();
        Enviar_Btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Mensaje a Enviar:");

        Enviar_Btn.setText("Enviar");
        Enviar_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Enviar_BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lista_Mensajes, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Send_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Enviar_Btn)
                        .addGap(4, 4, 4)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lista_Mensajes, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Enviar_Btn)
                    .addComponent(Send_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Envia(){
        Servidor.Set_Mensaje(Send_txt.getText());
        Servidor.Envia_Mensaje();
        Send_txt.setText("");
        //Servidor.Desconecta();
    }//Fin Envia

    private void Recibe(){
        Cliente.Recibe_Mensaje();
        Lista_Mensajes.add(Cliente.Get_Mensaje());
        //Cliente.Desconecta();
    }//Fin Recibe
    
    public void Repite_Recibe(){
        if (!Cliente.Get_Mensaje().equals("")){
             Recibe();
             Cliente.Limpia_Mensaje();
        }//Fin If
    }//Fin Repite_Recibe

    private void Enviar_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Enviar_BtnActionPerformed
       if(!Send_txt.getText().equals("")){
           Envia();
           Recibe();
       }//Fin If
}//GEN-LAST:event_Enviar_BtnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Cliente = new Socket_Cliente();
        Servidor = new Socket_Server();
        //Hilo = new MiHilo(this);
        //Hilo.start();
    }//GEN-LAST:event_formWindowOpened


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Messenger_Frm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Enviar_Btn;
    private java.awt.List Lista_Mensajes;
    private javax.swing.JTextField Send_txt;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}

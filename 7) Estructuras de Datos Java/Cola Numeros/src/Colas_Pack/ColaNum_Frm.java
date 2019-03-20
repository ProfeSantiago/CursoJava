package Colas_Pack;

import javax.swing.JOptionPane;

public class ColaNum_Frm extends javax.swing.JFrame {

    public ColaNum_Frm() {
        initComponents();
    }

   NodoCola Cola, Actual;

   public void Muestra_Cola(){
              
       Listilla.clear();
       Actual = Cola;
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Colas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Push_Btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(Listilla, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(Pop_Btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(Num_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
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
                .addComponent(Push_Btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pop_Btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Listilla, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Push_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Push_BtnActionPerformed
        Cola = Cola.Push(Cola,Integer.valueOf(Num_txt.getText()));
        Muestra_Cola();
        Num_txt.setText("");
    }//GEN-LAST:event_Push_BtnActionPerformed

    private void ListillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListillaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListillaActionPerformed

    private void Pop_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pop_BtnActionPerformed
        Num_txt.setText(String.valueOf(Cola.Extrae(Cola)));
        Cola = Cola.Pop(Cola);
        Muestra_Cola();
    }//GEN-LAST:event_Pop_BtnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //JOptionPane.showMessageDialog(rootPane, "Hola");
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ColaNum_Frm().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.List Listilla;
    private javax.swing.JTextField Num_txt;
    private javax.swing.JButton Pop_Btn;
    private javax.swing.JButton Push_Btn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}

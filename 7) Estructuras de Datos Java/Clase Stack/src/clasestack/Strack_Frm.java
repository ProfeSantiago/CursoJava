/************************************************
 * Strack_Frm.java  * @author Ing. Santiago Rodríguez Paniagua.
 * Created on 10 de febrero de 2008, 12:30 PM
 ************************************************/
package clasestack;
import java.awt.HeadlessException;
import java.util.Stack; //Para la definición de la Pila
import javax.swing.JOptionPane; //para Mensaje
public class Strack_Frm extends javax.swing.JFrame {
    public Strack_Frm() {
        initComponents();
    }
    // **************************************
    // Definición de Variables
    // **************************************
    Stack Pila = new Stack(); //Definición de una variable para la Pila
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Entrada_Txt = new javax.swing.JTextField();
        Push_Btn = new javax.swing.JButton();
        Pop_Btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Digite un Emento a insertar en la Pila");

        Push_Btn.setText("Push");
        Push_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Push_BtnActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Entrada_Txt, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Push_Btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Pop_Btn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Entrada_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Push_Btn)
                    .addComponent(Pop_Btn))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Push_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Push_BtnActionPerformed
        try {
            Pila.push(Entrada_Txt.getText());
            Entrada_Txt.setText("");
        } catch (Exception exception) {
        }
    }//GEN-LAST:event_Push_BtnActionPerformed

    private void Pop_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pop_BtnActionPerformed
        try {
            JOptionPane.showMessageDialog(null, Pila.pop());
        } catch (HeadlessException headlessException) {
            JOptionPane.showMessageDialog(null, "No hay más elementos que sacar de la Pila!!");
        }
    }//GEN-LAST:event_Pop_BtnActionPerformed
      
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Strack_Frm().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Entrada_Txt;
    private javax.swing.JButton Pop_Btn;
    private javax.swing.JButton Push_Btn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    
}

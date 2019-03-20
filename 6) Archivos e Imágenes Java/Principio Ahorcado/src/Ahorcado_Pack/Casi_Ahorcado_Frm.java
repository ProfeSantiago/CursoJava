/************************************************
 * Casi_Ahorcado_Frm.java
 * @author Ing.  Santiago Rodríguez Paniagua
 * Created on 3 de abril de 2008, 09:32 PM
 ************************************************/

package Ahorcado_Pack;
import javax.swing.ImageIcon; // Es necesaria para cargar una imagen en el Label
//(Ojo, sobre: ImageIcon, dar boton derecho, Fix Imports)
public class Casi_Ahorcado_Frm extends javax.swing.JFrame {
    public Casi_Ahorcado_Frm() {
        initComponents();
    }
    /***************************************
     *    Declaración de Variables          *
     ****************************************/
     int Contador= 1;
    //***************************************
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cambia_Btn = new javax.swing.JButton();
        Dibujo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Cambia_Btn.setText("Cambia Imagen");
        Cambia_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cambia_BtnActionPerformed(evt);
            }
        });

        Dibujo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ahorcado_Pack/Ahorcado0.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Dibujo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(Cambia_Btn)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Dibujo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cambia_Btn)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Cambia_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cambia_BtnActionPerformed
        Dibujo.setIcon(new ImageIcon(getClass().getResource("Ahorcado"+Contador+".gif")));
        if (Contador <6){
            Contador++;
        }else {
            Contador = 0;
        }
    }//GEN-LAST:event_Cambia_BtnActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Casi_Ahorcado_Frm().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cambia_Btn;
    private javax.swing.JLabel Dibujo;
    // End of variables declaration//GEN-END:variables
    
}

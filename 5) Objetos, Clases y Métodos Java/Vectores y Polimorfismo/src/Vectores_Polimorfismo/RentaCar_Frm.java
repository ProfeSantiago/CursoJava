/************************************************
 * RentaCar_Frm.java  * @author  Santiago
 * Created on 20 de febrero de 2008, 01:50 PM
 ************************************************/
package Vectores_Polimorfismo;
import java.util.Vector; //Necesario para los vectores
public class RentaCar_Frm extends javax.swing.JFrame {
    public RentaCar_Frm() {
        initComponents();
    }
    //--------------------------------------------
    // Declaración de Variables
    //--------------------------------------------
    // Creamos un Vector con una capacidad inicial de 1
    Vector Mivector = new Vector(1);
    Automovil Carro;
    int contador=0;
    //--------------------------------------------
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Placa_txt = new javax.swing.JTextField();
        Marca_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Modelo_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        Pasajeros_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Guarda_Btn = new javax.swing.JButton();
        Guarda_Btn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Placa");

        jLabel2.setText("Marca");

        jLabel3.setText("Modelo");

        jCheckBox1.setText("Automovil");

        jLabel4.setText("Pasajeros");

        Guarda_Btn.setText("Guardar");
        Guarda_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Guarda_BtnActionPerformed(evt);
            }
        });

        Guarda_Btn1.setText("Siguiente >>");
        Guarda_Btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Guarda_Btn1ActionPerformed(evt);
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
                            .addComponent(Placa_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Marca_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Guarda_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                            .addComponent(jCheckBox1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(Modelo_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Pasajeros_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Guarda_Btn1)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Placa_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Marca_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Guarda_Btn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Guarda_Btn1)
                            .addComponent(Pasajeros_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Modelo_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jCheckBox1)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void Limpiador(){
        Placa_txt.setText("");
        Marca_txt.setText("");
        Modelo_txt.setText("");
        Pasajeros_txt.setText("");  
    }
    
    private void Guarda_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Guarda_BtnActionPerformed
        Carro = new Automovil(Placa_txt.getText(),Marca_txt.getText(),Modelo_txt.getText(),Integer.valueOf(Pasajeros_txt.getText()));
        Mivector.addElement(Carro);
        Limpiador();
}//GEN-LAST:event_Guarda_BtnActionPerformed

    private void Guarda_Btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Guarda_Btn1ActionPerformed
        if (contador <  Mivector.size() ){
            Carro = (Automovil) Mivector.elementAt(contador);
            Placa_txt.setText(Carro.Placa);
            Marca_txt.setText(Carro.Marca);
            Modelo_txt.setText(Carro.Modelo);
            Pasajeros_txt.setText(String.valueOf(Carro.Pasajeros));        
            contador++;    
        }else{
            contador = 0;
        }
    }//GEN-LAST:event_Guarda_Btn1ActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RentaCar_Frm().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Guarda_Btn;
    private javax.swing.JButton Guarda_Btn1;
    private javax.swing.JTextField Marca_txt;
    private javax.swing.JTextField Modelo_txt;
    private javax.swing.JTextField Pasajeros_txt;
    private javax.swing.JTextField Placa_txt;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
    
}

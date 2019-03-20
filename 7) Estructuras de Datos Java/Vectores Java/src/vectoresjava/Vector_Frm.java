/****************************************************************
 * Vectores Java - Ing. Santiago Rodríguez Paniagua
 * Created on 9 de febrero de 2008, 02:52 PM
 * --------------------------------------------------
 * Nota: 
 *      La Clase Vector es una clase similar a un Arrglo
 * cuyos objetos pueden crecer y encogerse en respuesta a
 * los cambios en los requerimientos de almacenamiento del
 * programa o sistema a desarrollar.
 ****************************************************************/
package vectoresjava;  
import java.awt.HeadlessException;
import javax.swing.JOptionPane; //para Mensaje
import java.util.Vector; //Para la definición de vectores
public class Vector_Frm extends javax.swing.JFrame {
    public Vector_Frm() {
        initComponents();
    }
    // **************************************
    // Definición de Variables
    // **************************************
    // Creamos un Vector con una capacidad inicial de 1
    Vector Mivector = new Vector(1);
    // **************************************
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Entrada_Txt = new javax.swing.JTextField();
        MiLista = new java.awt.List();
        Ins_Btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Num_Elem = new javax.swing.JLabel();
        Del_Btn = new javax.swing.JButton();
        Pos_Txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Del_Btn2 = new javax.swing.JButton();
        Primero_Btn = new javax.swing.JButton();
        Ultimo_Btn = new javax.swing.JButton();
        Busca_Btn = new javax.swing.JButton();
        Busca_Btn2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Digite un elemento para agregarlo o Buscarlo");

        Ins_Btn.setText("Agregar");
        Ins_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ins_BtnActionPerformed(evt);
            }
        });

        jLabel2.setForeground(java.awt.Color.blue);
        jLabel2.setText("Número de Elementos en el Vector:");

        Num_Elem.setFont(new java.awt.Font("Tahoma", 1, 11));
        Num_Elem.setForeground(java.awt.Color.red);
        Num_Elem.setText("0");

        Del_Btn.setText("Eliminar");
        Del_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Del_BtnActionPerformed(evt);
            }
        });

        jLabel3.setText("Digite la posición del elemento a buscar");

        Del_Btn2.setForeground(java.awt.Color.blue);
        Del_Btn2.setText("Eliminar");
        Del_Btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Del_Btn2ActionPerformed(evt);
            }
        });

        Primero_Btn.setText("Primero");
        Primero_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Primero_BtnActionPerformed(evt);
            }
        });

        Ultimo_Btn.setText("Ultimo");
        Ultimo_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ultimo_BtnActionPerformed(evt);
            }
        });

        Busca_Btn.setText("Buscar");
        Busca_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Busca_BtnActionPerformed(evt);
            }
        });

        Busca_Btn2.setForeground(java.awt.Color.blue);
        Busca_Btn2.setText("Buscar");
        Busca_Btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Busca_Btn2ActionPerformed(evt);
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
                        .addComponent(MiLista, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Entrada_Txt, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Pos_Txt, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Num_Elem)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Busca_Btn, 0, 0, Short.MAX_VALUE)
                    .addComponent(Ins_Btn)
                    .addComponent(Busca_Btn2, 0, 0, Short.MAX_VALUE)
                    .addComponent(Del_Btn)
                    .addComponent(Del_Btn2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Ultimo_Btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Primero_Btn, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Ins_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Busca_Btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Busca_Btn2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Del_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(Del_Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Primero_Btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ultimo_Btn))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Entrada_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Pos_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MiLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Num_Elem))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Ins_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ins_BtnActionPerformed
            Mivector.addElement(Entrada_Txt.getText());
            MiLista.add(String.valueOf(Mivector.lastElement()));
            //Muestra en pantalla la cantidad de elementos que tiene el Vector
            Num_Elem.setText(String.valueOf(Mivector.size()));
            Entrada_Txt.setText("");
    }//GEN-LAST:event_Ins_BtnActionPerformed

    private void Del_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Del_BtnActionPerformed
            Mivector.remove(Entrada_Txt.getText());
            MiLista.removeAll();
            for (int i=0; i < Mivector.size(); i++){
                MiLista.add(String.valueOf(Mivector.elementAt(i))); 
            }
            //Muestra en pantalla la cantidad de elementos que tiene el Vector
            Num_Elem.setText(String.valueOf(Mivector.size()));
            Entrada_Txt.setText("");
}//GEN-LAST:event_Del_BtnActionPerformed

    private void Del_Btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Del_Btn2ActionPerformed
        try {//Borra siempre el último elemento del Vector
            Mivector.remove(Mivector.size() - 1);
            MiLista.removeAll();//Limpia el "ListBox"
            for (int i = 0; i < Mivector.size(); i++) {
                //Recorre el Vector para llenar de nuevo el "ListBox"
                MiLista.add(String.valueOf(Mivector.elementAt(i)));
            }
            //Muestra en pantalla la cantidad de elementos que tiene el Vector
            Num_Elem.setText(String.valueOf(Mivector.size()));
        } catch (Exception exception) {
        }
}//GEN-LAST:event_Del_Btn2ActionPerformed

    private void Primero_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Primero_BtnActionPerformed
         JOptionPane.showMessageDialog(null, "El primer elemento es:\n"+Mivector.firstElement());
    }//GEN-LAST:event_Primero_BtnActionPerformed

    private void Ultimo_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ultimo_BtnActionPerformed
         JOptionPane.showMessageDialog(null, "El ultimo elemento es:\n"+Mivector.lastElement());
    }//GEN-LAST:event_Ultimo_BtnActionPerformed

    private void Busca_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Busca_BtnActionPerformed
       //Busca el elemento digitado en: "Entrada_Txt"
        if (Mivector.contains(Entrada_Txt.getText())){
           JOptionPane.showMessageDialog(null, "El elemento buscado si está en el Vector");
       }else{
            JOptionPane.showMessageDialog(null, "El elemento buscado no está en el Vector");   
       }
    }//GEN-LAST:event_Busca_BtnActionPerformed

    private void Busca_Btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Busca_Btn2ActionPerformed
        try {
            //Busca el elemento digitado en: "Pos_Txt"
            int Pos = Integer.valueOf(Pos_Txt.getText());
            String Elemento = String.valueOf(Mivector.elementAt(Pos));
            JOptionPane.showMessageDialog(null, Elemento);
        } catch (HeadlessException headlessException) {
        }
}//GEN-LAST:event_Busca_Btn2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new RunnableImpl());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Busca_Btn;
    private javax.swing.JButton Busca_Btn2;
    private javax.swing.JButton Del_Btn;
    private javax.swing.JButton Del_Btn2;
    private javax.swing.JTextField Entrada_Txt;
    private javax.swing.JButton Ins_Btn;
    private java.awt.List MiLista;
    private javax.swing.JLabel Num_Elem;
    private javax.swing.JTextField Pos_Txt;
    private javax.swing.JButton Primero_Btn;
    private javax.swing.JButton Ultimo_Btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

    private static class RunnableImpl implements Runnable {

        public RunnableImpl() {
        }

        public void run() {
            new Vector_Frm().setVisible(true);
        }
    }
    
}

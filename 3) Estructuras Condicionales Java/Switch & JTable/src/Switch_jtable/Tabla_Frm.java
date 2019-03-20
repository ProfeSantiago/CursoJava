/************************************************
 * Tabla_Frm.java
 * @author Ing.  Santiago Rodríguez Paniagua
 * Created on 10 de abril de 2008, 06:30 PM
 ************************************************/

package Switch_jtable;

import javax.swing.JOptionPane;

public class Tabla_Frm extends javax.swing.JFrame {
    public Tabla_Frm() {
        initComponents();
    }
    /***************************************
     *    Declaración de Variables          *
     ****************************************/
     int Fila =0;
    //***************************************
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Col1_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Col2_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Col3_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Col4_txt = new javax.swing.JTextField();
        Cambia_Btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cedula", "Nombre", "Telefono", "Direccion"
            }
        ));
        jScrollPane1.setViewportView(Tabla);

        jLabel1.setText("Columna #1");

        Col1_txt.setText("Cedula");

        jLabel2.setText("Columna #2");

        Col2_txt.setText("Nombre");

        jLabel3.setText("Columna #3");

        Col3_txt.setText("Telefono");

        jLabel4.setText("Columna #4");

        Col4_txt.setText("Direccion");

        Cambia_Btn.setText("Modificar Tabla");
        Cambia_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cambia_BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Cambia_Btn)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Col1_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Col2_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Col3_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Col4_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Col1_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Col2_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Col3_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Col4_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(Cambia_Btn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Cambia_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cambia_BtnActionPerformed
        
        
        switch (Fila){
            case 0:
                JOptionPane.showMessageDialog(null,"Insertaste en la primera Fila");
                break;
            case 1:
                JOptionPane.showMessageDialog(null,"Insertaste en la segunda Fila");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Insertaste enla tercera Fila");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Insertaste en la cuarta Fila");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Insertaste en cualquier otra Fila");
                Fila = 3;
                break;
        }
        
        Tabla.setValueAt(Col1_txt.getText(),Fila,0);
        Tabla.setValueAt(Col2_txt.getText(),Fila,1);
        Tabla.setValueAt(Col3_txt.getText(),Fila,2);
        Tabla.setValueAt(Col4_txt.getText(),Fila,3);
        Fila++;
    }//GEN-LAST:event_Cambia_BtnActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabla_Frm().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cambia_Btn;
    private javax.swing.JTextField Col1_txt;
    private javax.swing.JTextField Col2_txt;
    private javax.swing.JTextField Col3_txt;
    private javax.swing.JTextField Col4_txt;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
}

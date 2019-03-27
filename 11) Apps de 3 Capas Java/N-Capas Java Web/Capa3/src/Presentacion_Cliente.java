/*************************************************************************
 *Principal.java - Primer Ejemplo de Base de Datos
 *Ing. Santiago Rodriguez P.
 *Creado: 10 de octubre de 2007, 10:30 PM
 **************************************************************************/

import java.sql.*;

public class Presentacion_Cliente extends javax.swing.JFrame {
//-----------------------------------
//Declaracion de Variables Globales
Logica_Negocios Objeto = new Logica_Negocios();
String Cedula,Nombre,Telefono; 
//----------------------------------

public void Limpiar(){
    Lista.clear();
    Cedula_txt.setText("");
    Nombre_txt.setText("");
    Telefono_txt.setText("");
}//-------------------------------------------------------------- 

public void Consulta(){
    Objeto.Consultar("Datos");
    try {
        while (Objeto.Registro.next()) {
            Cedula = Objeto.Registro.getString("Cedula");
            Nombre = Objeto.Registro.getString("Nombre");
            Telefono = Objeto.Registro.getString("Telefono");
            Lista.add(Cedula + " - " + Nombre + " - " + Telefono);
            Cedula_txt.setText(Cedula);
            Nombre_txt.setText(Nombre);
            Telefono_txt.setText(Telefono);
        }//While
    } catch (SQLException sQLException) { }
    Objeto.DesConectar();
}//-------------------------------------------------------------- 

    public Presentacion_Cliente() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Cedula_txt = new javax.swing.JTextField();
        Nombre_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Telefono_txt = new javax.swing.JTextField();
        Limpiar_btn = new javax.swing.JButton();
        Lista = new java.awt.List();
        Ins_btn = new javax.swing.JButton();
        Consulta_btn = new javax.swing.JButton();
        Up_btn = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ejemplo JDBC Access");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("Cedula");

        jLabel2.setText("Nombre");

        jLabel3.setText("Teléfono");

        Limpiar_btn.setText("Limpiar");
        Limpiar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Limpiar_btnActionPerformed(evt);
            }
        });

        Lista.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ListaItemStateChanged(evt);
            }
        });

        Ins_btn.setText("Insertar");
        Ins_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ins_btnActionPerformed(evt);
            }
        });

        Consulta_btn.setText("Consultar");
        Consulta_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consulta_btnActionPerformed(evt);
            }
        });

        Up_btn.setText("Modificar");
        Up_btn.setActionCommand("Modific.");
        Up_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Up_btnActionPerformed(evt);
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
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cedula_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(Telefono_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(Nombre_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)))
                    .addComponent(Lista, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Consulta_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Limpiar_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(Ins_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(Up_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Cedula_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre_txt)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Telefono_txt)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Consulta_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Limpiar_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ins_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Up_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                        .addGap(40, 40, 40))
                    .addComponent(Lista, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ListaItemStateChanged
        
    }//GEN-LAST:event_ListaItemStateChanged

    private void Up_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Up_btnActionPerformed
        Objeto.Actualizar(Cedula_txt.getText(), Nombre_txt.getText(), Telefono_txt.getText());
        Limpiar();
        Consulta();//GEN-LAST:event_Up_btnActionPerformed
    }                                      

    private void Ins_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ins_btnActionPerformed
        Objeto.Insertar(Cedula_txt.getText(), Nombre_txt.getText(), Telefono_txt.getText());
        Limpiar();
        Consulta();//GEN-LAST:event_Ins_btnActionPerformed
    }                                       

    private void Consulta_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consulta_btnActionPerformed
        Consulta();//GEN-LAST:event_Consulta_btnActionPerformed
    }                                            

    private void Limpiar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Limpiar_btnActionPerformed
       Limpiar();
    }//GEN-LAST:event_Limpiar_btnActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
            Objeto.Conectar("NCapas_ODBC");
            Consulta();//GEN-LAST:event_formWindowActivated
    }                                    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Presentacion_Cliente().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cedula_txt;
    private javax.swing.JButton Consulta_btn;
    private javax.swing.JButton Ins_btn;
    private javax.swing.JButton Limpiar_btn;
    private java.awt.List Lista;
    private javax.swing.JTextField Nombre_txt;
    private javax.swing.JTextField Telefono_txt;
    private javax.swing.JButton Up_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
}

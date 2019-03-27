/** ***********************************************************************
 *Principal.java - Primer Ejemplo de Base de Datos
 *Lic. Santiago Rodriguez P.
 ************************************************************************* */
package NCapas;

import java.sql.*;

public class Capa_3_Frm extends javax.swing.JFrame {

    public Capa_3_Frm() {
        initComponents();
    }

//-----------------------------------
//Declaracion de Variables Globales
    Capa_2 BDatos = new Capa_2();
    String Cedula, Nombre, Telefono;
//----------------------------------

    public void Limpiar() {
        Lista.clear();
        Cedula_txt.setText("");
        Nombre_txt.setText("");
        Direccion_txt.setText("");
        Telefono_txt.setText("");
    }//-------------------------------------------------------------- 

    public void Consulta() {
        BDatos.Conectar_ODBC("NCapas_ODBC");
        Lista.clear();
        BDatos.Consultar("Persona");
        try {
            while (BDatos.Registro.next()) {
                Cedula = BDatos.Registro.getString("Identificador");
                Nombre = BDatos.Registro.getString("Nombre");
                Telefono = BDatos.Registro.getString("Telefono");
                Lista.add(Cedula + " - " + Nombre + " - " + Telefono);
                Cedula_txt.setText(Cedula);
                Nombre_txt.setText(Nombre);
                Telefono_txt.setText(Telefono);
            }//While
        } catch (SQLException sQLException) {
        }
        BDatos.DesConectar();
    }//-------------------------------------------------------------- 

    public void Consulta_Proc() {
        BDatos.Conectar_ODBC("NCapas_ODBC");
        Lista.clear();
        BDatos.Buscar_Proc(" ");
        try {
            while (BDatos.Registro.next()) {
                Cedula = BDatos.Registro.getString("Identificador");
                Nombre = BDatos.Registro.getString("Nombre");
                Telefono = BDatos.Registro.getString("Telefono");
                Lista.add(Cedula + " - " + Nombre + " - " + Telefono);
                Cedula_txt.setText(Cedula);
                Nombre_txt.setText(Nombre);
                Telefono_txt.setText(Telefono);
            }//While
        } catch (SQLException sQLException) {
        }
        BDatos.DesConectar();
    }//-------------------------------------------------------------- 

    public void Actualiza() {
        BDatos.Conectar_ODBC("NCapas_ODBC");
        BDatos.Actualizar(Cedula_txt.getText(), Nombre_txt.getText(), Telefono_txt.getText());
    }//-------------------------------------------------------------- 

    public void Inserta() {
        BDatos.Conectar_ODBC("NCapas_ODBC");
        BDatos.Insertar(Cedula_txt.getText(), Nombre_txt.getText(), Telefono_txt.getText());
    }//-------------------------------------------------------------- 

    public void Actualiza_Proc() {
        BDatos.Conectar_ODBC("NCapas_ODBC");
        BDatos.Actualizar_Proc(Cedula_txt.getText(), Nombre_txt.getText(), Direccion_txt.getText(), Telefono_txt.getText());
    }//-------------------------------------------------------------- 

    public void Inserta_Proc() {
        BDatos.Conectar_ODBC("NCapas_ODBC");
        BDatos.Insertar_Proc(Cedula_txt.getText(), Nombre_txt.getText(), Direccion_txt.getText(), Telefono_txt.getText());
    }//-------------------------------------------------------------- 

    public void Busqueda() {
        BDatos.Conectar_ODBC("NCapas_ODBC");
        Lista.clear();
        BDatos.Buscar("Persona", Cedula_txt.getText());
        try {
            while (BDatos.Registro.next()) {
                Cedula = BDatos.Registro.getString("Identificador");
                Nombre = BDatos.Registro.getString("Nombre");
                Telefono = BDatos.Registro.getString("Telefono");
                Lista.add(Cedula + " - " + Nombre + " - " + Telefono);
                Cedula_txt.setText(Cedula);
                Nombre_txt.setText(Nombre);
                Telefono_txt.setText(Telefono);
            }//While
        } catch (SQLException sQLException) {
        }
        BDatos.DesConectar();
    }//-------------------------------------------------------------- 

    public void Busqueda_Proc() {
        BDatos.Conectar_ODBC("Prueba_ODBC");
        Lista.clear();
        BDatos.Buscar_Proc(Cedula_txt.getText());
        try {
            while (BDatos.Registro.next()) {
                Cedula = BDatos.Registro.getString("Identificador");
                Nombre = BDatos.Registro.getString("Nombre");
                Telefono = BDatos.Registro.getString("Telefono");
                Lista.add(Cedula + " - " + Nombre + " - " + Telefono);
                Cedula_txt.setText(Cedula);
                Nombre_txt.setText(Nombre);
                Telefono_txt.setText(Telefono);
            }//While
        } catch (SQLException sQLException) {
        }
        BDatos.DesConectar();
    }//-------------------------------------------------------------- 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Cedula_txt = new javax.swing.JTextField();
        Nombre_txt = new javax.swing.JTextField();
        Direccion_txt = new javax.swing.JTextField();
        Telefono_txt = new javax.swing.JTextField();
        Lista = new java.awt.List();
        Busca_Btn = new javax.swing.JButton();
        Inserta_Btn = new javax.swing.JButton();
        Actualiza_Btn = new javax.swing.JButton();
        Limpia_Btn = new javax.swing.JButton();
        Lista_Btn = new javax.swing.JButton();
        Busca_Proc_Btn = new javax.swing.JButton();
        Ins_Proc_Btn = new javax.swing.JButton();
        Lista_Proc_Btn = new javax.swing.JButton();
        Act_Proc_Btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("Cedula:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Dirección:");

        jLabel4.setText("Telefono:");

        Busca_Btn.setText("Buscar");
        Busca_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Busca_BtnActionPerformed(evt);
            }
        });

        Inserta_Btn.setText("Insertar");
        Inserta_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Inserta_BtnActionPerformed(evt);
            }
        });

        Actualiza_Btn.setText("Actualizar");
        Actualiza_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Actualiza_BtnActionPerformed(evt);
            }
        });

        Limpia_Btn.setText("Limpiar");
        Limpia_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Limpia_BtnActionPerformed(evt);
            }
        });

        Lista_Btn.setText("Listar");
        Lista_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lista_BtnActionPerformed(evt);
            }
        });

        Busca_Proc_Btn.setForeground(java.awt.Color.blue);
        Busca_Proc_Btn.setText("Buscar");
        Busca_Proc_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Busca_Proc_BtnActionPerformed(evt);
            }
        });

        Ins_Proc_Btn.setForeground(java.awt.Color.blue);
        Ins_Proc_Btn.setText("Insertar");
        Ins_Proc_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ins_Proc_BtnActionPerformed(evt);
            }
        });

        Lista_Proc_Btn.setForeground(java.awt.Color.blue);
        Lista_Proc_Btn.setText("Listar");
        Lista_Proc_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lista_Proc_BtnActionPerformed(evt);
            }
        });

        Act_Proc_Btn.setForeground(java.awt.Color.blue);
        Act_Proc_Btn.setText("Actualizar");
        Act_Proc_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Act_Proc_BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lista, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addGap(8, 8, 8)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Cedula_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                .addComponent(Nombre_txt)
                                .addComponent(Direccion_txt)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(10, 10, 10)
                            .addComponent(Telefono_txt))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Limpia_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Busca_Btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lista_Btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Inserta_Btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Actualiza_Btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Busca_Proc_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Act_Proc_Btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Ins_Proc_Btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lista_Proc_Btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Busca_Btn)
                            .addComponent(Busca_Proc_Btn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lista_Btn)
                            .addComponent(Lista_Proc_Btn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Inserta_Btn)
                            .addComponent(Ins_Proc_Btn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Actualiza_Btn)
                            .addComponent(Act_Proc_Btn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cedula_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nombre_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Direccion_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Telefono_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lista, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Limpia_Btn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void Actualiza_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Actualiza_BtnActionPerformed
    Actualiza();
    Limpiar();
    Consulta();
}//GEN-LAST:event_Actualiza_BtnActionPerformed

private void Inserta_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Inserta_BtnActionPerformed
    Inserta();
    Limpiar();
    Consulta();
}//GEN-LAST:event_Inserta_BtnActionPerformed

private void Limpia_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Limpia_BtnActionPerformed
    Limpiar();
}//GEN-LAST:event_Limpia_BtnActionPerformed

private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    Consulta();
}//GEN-LAST:event_formWindowActivated

private void Busca_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Busca_BtnActionPerformed
    Busqueda();
}//GEN-LAST:event_Busca_BtnActionPerformed

private void Lista_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lista_BtnActionPerformed
    Limpiar();
    Consulta();
}//GEN-LAST:event_Lista_BtnActionPerformed

private void Busca_Proc_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Busca_Proc_BtnActionPerformed
    Busqueda_Proc();
}//GEN-LAST:event_Busca_Proc_BtnActionPerformed

private void Ins_Proc_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ins_Proc_BtnActionPerformed
    Inserta_Proc();
    Limpiar();
    Consulta();
}//GEN-LAST:event_Ins_Proc_BtnActionPerformed

private void Lista_Proc_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lista_Proc_BtnActionPerformed
    Limpiar();
    Consulta_Proc();
}//GEN-LAST:event_Lista_Proc_BtnActionPerformed

private void Act_Proc_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Act_Proc_BtnActionPerformed
    Actualiza_Proc();
    Limpiar();
    Consulta();
}//GEN-LAST:event_Act_Proc_BtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Capa_3_Frm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Act_Proc_Btn;
    private javax.swing.JButton Actualiza_Btn;
    private javax.swing.JButton Busca_Btn;
    private javax.swing.JButton Busca_Proc_Btn;
    private javax.swing.JTextField Cedula_txt;
    private javax.swing.JTextField Direccion_txt;
    private javax.swing.JButton Ins_Proc_Btn;
    private javax.swing.JButton Inserta_Btn;
    private javax.swing.JButton Limpia_Btn;
    private java.awt.List Lista;
    private javax.swing.JButton Lista_Btn;
    private javax.swing.JButton Lista_Proc_Btn;
    private javax.swing.JTextField Nombre_txt;
    private javax.swing.JTextField Telefono_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables

}

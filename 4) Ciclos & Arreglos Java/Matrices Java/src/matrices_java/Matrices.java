/*************************************************************************
 * Matrices Java - Ing. Santiago Rodrํguez P.
 * Creado: 27 de octubre de 2007, 10:55 PM
 **************************************************************************/
package matrices_java;

public class Matrices extends javax.swing.JFrame {

    public Matrices() {
        initComponents();
    }

    /*บบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบ
      * Declaraci๓n de Variables
      บบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบ*/
    int Matriz[][] = new int[3][3]; //Matriz de 3 x 3
    int contador = 0;
    int temporal = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Celda1_Txt = new javax.swing.JTextField();
        Celda2_Txt = new javax.swing.JTextField();
        Celda3_Txt = new javax.swing.JTextField();
        Celda4_Txt = new javax.swing.JTextField();
        Celda5_Txt = new javax.swing.JTextField();
        Celda6_Txt = new javax.swing.JTextField();
        Celda7_Txt = new javax.swing.JTextField();
        Celda8_Txt = new javax.swing.JTextField();
        Celda9_Txt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Agrega_Btn = new javax.swing.JButton();
        Limpia_Btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Celda1_Txt.setText("0");

        Celda2_Txt.setText("0");

        Celda3_Txt.setText("0");

        Celda4_Txt.setText("0");

        Celda5_Txt.setText("0");

        Celda6_Txt.setText("0");

        Celda7_Txt.setText("0");

        Celda8_Txt.setText("0");

        Celda9_Txt.setText("0");

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "", "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabla);

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Digite los n๚meros que \ndesea agregar a las \nceldas de la tabla");
        jScrollPane2.setViewportView(jTextArea1);

        Agrega_Btn.setText("Agregar");
        Agrega_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agrega_BtnActionPerformed(evt);
            }
        });

        Limpia_Btn.setText("Limpiar");
        Limpia_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Limpia_BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Celda1_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Celda2_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Celda3_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(Agrega_Btn))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Celda4_Txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                            .addComponent(Celda7_Txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Celda5_Txt, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                            .addComponent(Celda8_Txt, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Celda9_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(Limpia_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
                            .addComponent(Celda6_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Celda2_Txt, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(Celda3_Txt, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(Celda1_Txt, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(Agrega_Btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Celda4_Txt)
                    .addComponent(Celda5_Txt)
                    .addComponent(Celda6_Txt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Celda9_Txt, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(Celda8_Txt, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(Celda7_Txt, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(Limpia_Btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Limpia_Matriz();
    }//GEN-LAST:event_formWindowOpened

    private void Limpia_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Limpia_BtnActionPerformed
        Limpia_Matriz();
    }//GEN-LAST:event_Limpia_BtnActionPerformed

    private void Agrega_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Agrega_BtnActionPerformed
         Tabla.setValueAt(Celda1_Txt.getText(), 0, 0);
         Tabla.setValueAt(Celda2_Txt.getText(), 0, 1);
         Tabla.setValueAt(Celda3_Txt.getText(), 0, 2);
         Tabla.setValueAt(Celda4_Txt.getText(), 1, 0);
         Tabla.setValueAt(Celda5_Txt.getText(), 1, 1);
         Tabla.setValueAt(Celda6_Txt.getText(), 1, 2);
         Tabla.setValueAt(Celda7_Txt.getText(), 2, 0);
         Tabla.setValueAt(Celda8_Txt.getText(), 2, 1);
         Tabla.setValueAt(Celda9_Txt.getText(), 2, 2);
    }//GEN-LAST:event_Agrega_BtnActionPerformed

    public void Limpia_Matriz(){
        
        for (int Fila = 0; Fila<3; Fila++){
            for (int Columna = 0; Columna<3; Columna++){
                Matriz[Columna][Fila] =0; //Limpiamos Matriz
                Tabla.setValueAt(0, Fila, Columna); //Limpiamos Tabla
            }//For #2
        }//For #1
        
        Celda1_Txt.setText("0");
        Celda2_Txt.setText("0");
        Celda3_Txt.setText("0");
        Celda4_Txt.setText("0");
        Celda5_Txt.setText("0");
        Celda6_Txt.setText("0");
        Celda7_Txt.setText("0");
        Celda8_Txt.setText("0");
        Celda9_Txt.setText("0");
    }//Fin Limpia_Matriz


    public void Llena_Tabla(){
        for (int Fila = 0; Fila<3; Fila++){
            for (int Columna = 0; Columna<3; Columna++){
                Tabla.setValueAt(0, Fila, Columna);
            }//For #2
        }//For #1
    }//Fin Llena_Tabla




    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Matrices().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agrega_Btn;
    private javax.swing.JTextField Celda1_Txt;
    private javax.swing.JTextField Celda2_Txt;
    private javax.swing.JTextField Celda3_Txt;
    private javax.swing.JTextField Celda4_Txt;
    private javax.swing.JTextField Celda5_Txt;
    private javax.swing.JTextField Celda6_Txt;
    private javax.swing.JTextField Celda7_Txt;
    private javax.swing.JTextField Celda8_Txt;
    private javax.swing.JTextField Celda9_Txt;
    private javax.swing.JButton Limpia_Btn;
    private javax.swing.JTable Tabla;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

}

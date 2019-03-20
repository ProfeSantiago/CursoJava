/*************************************************************************
 * Cosntructores Sobrecargados
 * Ing. Santiago Rodríguez P.
 * Creado: 01 de Enero de 2000, 01:30 AM
 **************************************************************************/

package Constructores;

import javax.swing.JOptionPane;

public class Articulos_Frm extends javax.swing.JFrame {
    public Articulos_Frm() {
        initComponents();
    }
    /* --------------------------------------------
     * Declaración de Variables "Globales"
     * --------------------------------------------
     * Declaración del Objeto Articulo de tipo Productos. Tambien lo 
     * inicializamos con el contructor sin parámetos (Ceros y Espacios)
     */ 
    Productos Articulo = new Productos();  // Constructor #2
    Productos Arreglo[] = new Productos[3];// Arreglo de Productos
    int contador=0;
    
    public void Limpiador(){
        Codigo_txt.setText("");
        Nombre_txt.setText("");
        Cantidad_txt.setText("0");
        Costo_txt.setText("0");
        Utilidad_txt.setText("0");
        Precio_txt.setText("0");
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Costo_txt = new javax.swing.JTextField();
        Cantidad_txt = new javax.swing.JTextField();
        Nombre_txt = new javax.swing.JTextField();
        Codigo_txt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Utilidad_txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Precio_txt = new javax.swing.JTextField();
        Guarda_Btn = new javax.swing.JButton();
        Next_Btn = new javax.swing.JButton();
        Limpia_btn = new javax.swing.JButton();
        Act_Btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Constructores Sobrecargados");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel4.setText("Registro de Productos");

        jLabel1.setText("Codigo");

        jLabel2.setText("Nombre");

        jLabel3.setText("Cantidad");

        jLabel5.setText("Costo");

        Costo_txt.setText("0");

        jLabel6.setText("Utilidad");

        Utilidad_txt.setText("0");

        jLabel7.setText("Precio");

        Precio_txt.setText("0");

        Guarda_Btn.setText("Guardar");
        Guarda_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Guarda_BtnActionPerformed(evt);
            }
        });

        Next_Btn.setText("Siguiente");
        Next_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Next_BtnActionPerformed(evt);
            }
        });

        Limpia_btn.setText("Limpiar");
        Limpia_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Limpia_btnActionPerformed(evt);
            }
        });

        Act_Btn.setText("Guardar2");
        Act_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Act_BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Precio_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(Utilidad_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(Costo_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(Cantidad_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(Nombre_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(Codigo_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Guarda_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Act_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Limpia_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Next_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Codigo_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Nombre_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Cantidad_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Costo_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Utilidad_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Precio_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Guarda_Btn)
                    .addComponent(Next_Btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Act_Btn)
                    .addComponent(Limpia_btn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // Para cargar los valores Utilizamos el Constructor #1
        Articulo = new Productos("123","Helados de Cebolla",24,1000,10,1100); 
        // Se muestra el registro del nuevo producto en pantalla
        Codigo_txt.setText(Articulo.Codigo);
        Nombre_txt.setText(Articulo.Nombre);
        Cantidad_txt.setText(String.valueOf(Articulo.Cantidad));
        Costo_txt.setText(String.valueOf(Articulo.Costo));    
        Utilidad_txt.setText(String.valueOf(Articulo.Utilidad));
        Precio_txt.setText(String.valueOf(Articulo.Precio_Venta));
    }//GEN-LAST:event_formWindowActivated

    private void Guarda_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Guarda_BtnActionPerformed
        //Guarda 1 a 1 nuevos "registros" de Productos en el arreglo    
        if (contador < 3){
             // Constructor #3
            Arreglo[contador] = new Productos(Codigo_txt.getText(),Nombre_txt.getText());
             contador++;
        }else{
            contador = 0; 
            JOptionPane.showMessageDialog(null, "Has exedido el limite del arreglo\n");
        }
}//GEN-LAST:event_Guarda_BtnActionPerformed

    private void Next_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Next_BtnActionPerformed
    //Recorre el arreglo de Productos y los muestra 1 a 1
        if (contador < 3){
             Codigo_txt.setText(Arreglo[contador].Codigo);
             Nombre_txt.setText(Arreglo[contador].Nombre);
             Cantidad_txt.setText(String.valueOf(Arreglo[contador].Cantidad));
             Costo_txt.setText(String.valueOf(Arreglo[contador].Costo));
             Utilidad_txt.setText(String.valueOf(Arreglo[contador].Utilidad));
             Precio_txt.setText(String.valueOf(Arreglo[contador].Precio_Venta));
             contador++;
        }else{
            contador = 0;
            Limpiador();
        }
    }//GEN-LAST:event_Next_BtnActionPerformed

    private void Limpia_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Limpia_btnActionPerformed
        Limpiador();
}//GEN-LAST:event_Limpia_btnActionPerformed

    private void Act_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Act_BtnActionPerformed
         //Guarda 1 a 1 nuevos "registros" de Productos en el arreglo    
        if (contador < 3){
            // Constructor #1
             Arreglo[contador] = new Productos(Codigo_txt.getText(),Nombre_txt.getText(),Integer.valueOf(Cantidad_txt.getText()), Integer.valueOf(Costo_txt.getText()),Integer.valueOf(Utilidad_txt.getText()),Integer.valueOf(Precio_txt.getText()));
             contador++;
        }else{
            contador = 0; 
            JOptionPane.showMessageDialog(null, "Has exedido el limite del arreglo\n");
        }
    }//GEN-LAST:event_Act_BtnActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Articulos_Frm().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Act_Btn;
    private javax.swing.JTextField Cantidad_txt;
    private javax.swing.JTextField Codigo_txt;
    private javax.swing.JTextField Costo_txt;
    private javax.swing.JButton Guarda_Btn;
    private javax.swing.JButton Limpia_btn;
    private javax.swing.JButton Next_Btn;
    private javax.swing.JTextField Nombre_txt;
    private javax.swing.JTextField Precio_txt;
    private javax.swing.JTextField Utilidad_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
    
}

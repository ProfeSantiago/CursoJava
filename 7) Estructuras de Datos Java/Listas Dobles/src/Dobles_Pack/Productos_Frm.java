/*************************************************************************
 * Listas Doblemente Enlazadas * Ing. Santiago Rodriguez Paniagua.
 **************************************************************************/
package Dobles_Pack;
public class Productos_Frm extends javax.swing.JFrame {
    public Productos_Frm() {
        initComponents();
    }
    //--------------------------------------------
    // Declaracion de Variables
    //--------------------------------------------
    Nodo_Producto Lista;
    Nodo_Producto Puntero_Actual; 
    Producto Nuevo_Producto = new Producto(); //Llamada del Contructor #2
    Clase_Archivos Archivo = new Clase_Archivos();
    int contador=0;
    //--------------------------------------------
    
    public void Abrir_Archivo(){
        int contador = 0;
        Archivo.Abrir_Archivo("Listas.txt");       
        while (contador < 4){             
            Codigo_txt.setText(Archivo.Leer_Texto());   
            Nombre_txt.setText(Archivo.Leer_Texto());  
            Precio_txt.setText(String.valueOf(Archivo.Leer_Numero()));
            Nuevo_Producto = new Producto(Codigo_txt.getText(),Nombre_txt.getText(),Integer.valueOf(Precio_txt.getText()));
            Lista = Lista.Inserta_Producto(Lista, Nuevo_Producto);           
            contador++;
        }//Fin While 
        Archivo.Cerrar_Flujo_Entrada();
    }//Fin Guarda_Archivo ------------------------------------------------------
    
    public void Guarda_Archivo(){
        Nodo_Producto Actual; 
        Archivo.Crear_Archivo("Listas.txt");
        Actual = Lista;        
        while (Actual != null){            
            Archivo.Escribir_Texto(Actual.Info.Codigo);   
            Archivo.Escribir_Texto(Actual.Info.Nombre);  
            Archivo.Escribir_Numero(Actual.Info.Precio);  
            Actual = Actual.Sigte;            
        }//Fin While 
        Archivo.Cerrar_Flujo_Salida();
    }//Fin Guarda_Archivo ------------------------------------------------------
    
     public void Limpiador(){ //Limpia la pantalla
        Codigo_txt.setText("");
        Nombre_txt.setText("");
        Precio_txt.setText("");
    }//Fin Limpiador -----------------------------------------------------------
    
        public void Llena_Lista(){
        Listbox.clear();
        Nodo_Producto Actual; 
        Actual = Lista;        
        while (Actual != null){   
            Listbox.add(Actual.Info.Codigo +" - "+ Actual.Info.Nombre+" - "+ Integer.valueOf(Actual.Info.Precio) );
            Actual = Actual.Sigte;            
        }//Fin While       
    }//Fin Llena_Lista -------------------------------------------------------
        
    public void Recorre_Lista(){     
        if (Puntero_Actual != null){             
            Codigo_txt.setText(Puntero_Actual.Info.Codigo);   
            Nombre_txt.setText(Puntero_Actual.Info.Nombre);  
            Precio_txt.setText(String.valueOf(Puntero_Actual.Info.Precio));
            Puntero_Actual = Puntero_Actual.Sigte;
        }else{
            Puntero_Actual = Lista;
            Codigo_txt.setText(Puntero_Actual.Info.Codigo);   
            Nombre_txt.setText(Puntero_Actual.Info.Nombre);  
            Precio_txt.setText(String.valueOf(Puntero_Actual.Info.Precio));
        }//Fin else
    }//Fin Recorre_Lista ------------------------------------------------------    
    
    public void Recorre_Atras(){
        if (Puntero_Actual.Ante != null){            
            Codigo_txt.setText(Puntero_Actual.Info.Codigo);   
            Nombre_txt.setText(Puntero_Actual.Info.Nombre);  
            Precio_txt.setText(String.valueOf(Puntero_Actual.Info.Precio));
            Puntero_Actual = Puntero_Actual.Ante;
        }else{
             while (Puntero_Actual.Sigte != null){   
                Puntero_Actual = Puntero_Actual.Sigte;            
            }//Fin While  
            // Ojo: esta no es la mejor solución pero al menos es "rápida y barata"
        }//Fin else
    }//Fin Recorre_Lista ------------------------------------------------------    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Codigo_txt = new javax.swing.JTextField();
        Nombre_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Precio_txt = new javax.swing.JTextField();
        Listbox = new java.awt.List();
        Ins_Btn = new javax.swing.JButton();
        Busca_Btn = new javax.swing.JButton();
        Limpia_Btn = new javax.swing.JButton();
        Abrir_Btn = new javax.swing.JButton();
        Archiva_Btn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Código:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Precio:");

        Ins_Btn.setText("Insertar");
        Ins_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ins_BtnActionPerformed(evt);
            }
        });

        Busca_Btn.setText("Buscar");
        Busca_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Busca_BtnActionPerformed(evt);
            }
        });

        Limpia_Btn.setText("Limpiar");
        Limpia_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Limpia_BtnActionPerformed(evt);
            }
        });

        Abrir_Btn.setText("Abrir");
        Abrir_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Abrir_BtnActionPerformed(evt);
            }
        });

        Archiva_Btn.setText("Archivar");
        Archiva_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Archiva_BtnActionPerformed(evt);
            }
        });

        jButton1.setText("<< Anterior");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Siguiente >>");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Abrir_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(Ins_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(Limpia_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Archiva_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(Busca_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addContainerGap(184, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Codigo_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addContainerGap(10, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addContainerGap(180, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Nombre_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addContainerGap(10, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addContainerGap(188, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Precio_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addContainerGap(10, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Listbox, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Codigo_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Nombre_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Precio_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Listbox, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ins_Btn)
                    .addComponent(Busca_Btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Abrir_Btn)
                    .addComponent(Archiva_Btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Limpia_Btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void Ins_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ins_BtnActionPerformed
        Nuevo_Producto = new Producto(Codigo_txt.getText(),Nombre_txt.getText(),Integer.valueOf(Precio_txt.getText()));
        Lista = Lista.Inserta_Producto(Lista, Nuevo_Producto);
        Puntero_Actual = Lista; //Nuevo: Para Recorrido
        Llena_Lista();
        Limpiador();
}//GEN-LAST:event_Ins_BtnActionPerformed

private void Limpia_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Limpia_BtnActionPerformed
    Limpiador();
}//GEN-LAST:event_Limpia_BtnActionPerformed

private void Busca_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Busca_BtnActionPerformed
    Nuevo_Producto = Lista.Busca_Producto(Lista, Nombre_txt.getText());
    Codigo_txt.setText(Nuevo_Producto.Codigo);
    Nombre_txt.setText(Nuevo_Producto.Nombre);
    Precio_txt.setText(String.valueOf(Nuevo_Producto.Precio));
}//GEN-LAST:event_Busca_BtnActionPerformed

private void Abrir_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Abrir_BtnActionPerformed
    Limpiador();
    Abrir_Archivo();
    Puntero_Actual = Lista; 
    Llena_Lista();  
}//GEN-LAST:event_Abrir_BtnActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    Recorre_Lista();
}//GEN-LAST:event_jButton2ActionPerformed

private void Archiva_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Archiva_BtnActionPerformed
    Guarda_Archivo();
}//GEN-LAST:event_Archiva_BtnActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Recorre_Atras();
}//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productos_Frm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Abrir_Btn;
    private javax.swing.JButton Archiva_Btn;
    private javax.swing.JButton Busca_Btn;
    private javax.swing.JTextField Codigo_txt;
    private javax.swing.JButton Ins_Btn;
    private javax.swing.JButton Limpia_Btn;
    private java.awt.List Listbox;
    private javax.swing.JTextField Nombre_txt;
    private javax.swing.JTextField Precio_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

}

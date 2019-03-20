/*************************************************************************
 *Principal.java - Primer Ejemplo de Listas Simples
 *Ing. Santiago Rodriguez Paniagua. Creado: 01 de Mayo de 2008, 10:30 PM
 **************************************************************************/
package Listas_Pack;
public class Principal extends javax.swing.JFrame {
    //--------------------------------------------
    // Declaracion de Variables
    //--------------------------------------------
    Nodo_Persona Lista;
    Nodo_Persona Puntero_Actual; //Nuevo: Para Recorrido
    Persona Personilla = new Persona(); //Contructor #2
    Clase_Archivos Archivo = new Clase_Archivos();
    int contador=0;
    //--------------------------------------------
       
    public Principal() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Cedula_txt = new javax.swing.JTextField();
        Nombre_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Telefono_txt = new javax.swing.JTextField();
        Guarda_Btn = new javax.swing.JButton();
        Busca_Btn = new javax.swing.JButton();
        Limpia_Btn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Listbox = new java.awt.List();
        jLabel5 = new javax.swing.JLabel();
        Archiva_Btn = new javax.swing.JButton();
        Abrir_Btn = new javax.swing.JButton();
        Next_Btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ejemplo Objetos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("Cedula");

        jLabel2.setText("Nombre");

        jLabel3.setText("Teléfono");

        Guarda_Btn.setText("Guardar");
        Guarda_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Guarda_BtnActionPerformed(evt);
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

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel4.setText("Persona:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel5.setText("Contenido de la Lista de Personas:");

        Archiva_Btn.setText("Archivar");
        Archiva_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Archiva_BtnActionPerformed(evt);
            }
        });

        Abrir_Btn.setText("Abrir");
        Abrir_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Abrir_BtnActionPerformed(evt);
            }
        });

        Next_Btn.setText("Next >>");
        Next_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Next_BtnActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cedula_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(Nombre_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(Telefono_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)))
                    .addComponent(Listbox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Abrir_Btn, 0, 0, Short.MAX_VALUE)
                            .addComponent(Limpia_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Guarda_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                            .addComponent(Archiva_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Next_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                            .addComponent(Busca_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cedula_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Telefono_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Listbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Limpia_Btn)
                    .addComponent(Guarda_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Busca_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Abrir_Btn)
                    .addComponent(Archiva_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Next_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Limpia_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Limpia_BtnActionPerformed
        Limpiador();
    }//GEN-LAST:event_Limpia_BtnActionPerformed

   public void Llena_Lista(){
        Listbox.clear();
        Nodo_Persona Actual; 
        Actual = Lista;
        
        if (Actual == Lista){   
            Listbox.add(Actual.Info.Cedula +" - "+ Actual.Info.Nombre+" - "+ Actual.Info.Telefono);      
        }//Fin if     
        
        while (Actual != Lista){   
            Listbox.add(Actual.Info.Cedula +" - "+ Actual.Info.Nombre+" - "+ Actual.Info.Telefono);
            Actual = Actual.Sgte;            
        }//Fin While       
    }//Fin Llena_Lista -------------------------------------------------------
    
    public void Recorre_Lista(){     
        if (Puntero_Actual != Lista){             
            Cedula_txt.setText(Puntero_Actual.Info.Cedula);   
            Nombre_txt.setText(Puntero_Actual.Info.Nombre);  
            Telefono_txt.setText(Puntero_Actual.Info.Telefono);
            Puntero_Actual = Puntero_Actual.Sgte;
        }//Fin If
    }//Fin Recorre_Lista ------------------------------------------------------
    
    public void Abrir_Archivo(){
        int contador = 0;
        Archivo.Abrir_Archivo("Listas.txt");       
        while (contador < 4){             
            Cedula_txt.setText(Archivo.Leer_Texto());   
            Nombre_txt.setText(Archivo.Leer_Texto());  
            Telefono_txt.setText(Archivo.Leer_Texto());
            Personilla = new Persona(Cedula_txt.getText(),Nombre_txt.getText(),Telefono_txt.getText());
            Lista = Lista.Inserta_Persona(Lista, Personilla);           
            contador++;
        }//Fin While 
        Archivo.Cerrar_Flujo_Entrada();
    }//Fin Guarda_Archivo ------------------------------------------------------
    
    public void Guarda_Archivo(){
        int contador = 0;
        Nodo_Persona Actual; 
        Archivo.Crear_Archivo("Listas.txt");
        Actual = Lista;        
        //while (Actual.Sgte != Lista){            
        while (contador < 4){ 
            Archivo.Escribir_Texto(Actual.Info.Cedula);   
            Archivo.Escribir_Texto(Actual.Info.Nombre);  
            Archivo.Escribir_Texto(Actual.Info.Telefono);  
            Actual = Actual.Sgte;  
            contador++;
        }//Fin While 
        Archivo.Cerrar_Flujo_Salida();
    }//Fin Guarda_Archivo ------------------------------------------------------
    
    public void Limpiador(){ //Limpia la pantalla
        Cedula_txt.setText("");
        Nombre_txt.setText("");
        Telefono_txt.setText("");
    }//Fin Limpiador -----------------------------------------------------------
    
    private void Busca_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Busca_BtnActionPerformed
        Personilla = Lista.Consulta_Persona(Lista, Nombre_txt.getText());
        Cedula_txt.setText(Personilla.Cedula);
        Nombre_txt.setText(Personilla.Nombre);
        Telefono_txt.setText(Personilla.Telefono);
    }//GEN-LAST:event_Busca_BtnActionPerformed

    //@SuppressWarnings("static-access")
    
    private void Guarda_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Guarda_BtnActionPerformed
        Personilla = new Persona(Cedula_txt.getText(),Nombre_txt.getText(),Telefono_txt.getText());
        Lista = Lista.Inserta_Persona(Lista, Personilla);
        Puntero_Actual = Lista; //Nuevo: Para Recorrido
        Llena_Lista();
        Limpiador();
    }//GEN-LAST:event_Guarda_BtnActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

private void Archiva_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Archiva_BtnActionPerformed
    Guarda_Archivo();
}//GEN-LAST:event_Archiva_BtnActionPerformed

private void Abrir_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Abrir_BtnActionPerformed
    Limpiador();
    Abrir_Archivo();
    Puntero_Actual = Lista; //Nuevo: Para Recorrido
    Llena_Lista();    
}//GEN-LAST:event_Abrir_BtnActionPerformed

private void Next_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Next_BtnActionPerformed
    Recorre_Lista();
}//GEN-LAST:event_Next_BtnActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Abrir_Btn;
    private javax.swing.JButton Archiva_Btn;
    private javax.swing.JButton Busca_Btn;
    private javax.swing.JTextField Cedula_txt;
    private javax.swing.JButton Guarda_Btn;
    private javax.swing.JButton Limpia_Btn;
    private java.awt.List Listbox;
    private javax.swing.JButton Next_Btn;
    private javax.swing.JTextField Nombre_txt;
    private javax.swing.JTextField Telefono_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
    
}

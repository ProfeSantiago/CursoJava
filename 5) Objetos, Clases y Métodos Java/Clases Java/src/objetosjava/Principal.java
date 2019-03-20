/*************************************************************************
 *Principal.java - Primer Ejemplo de Objetos
 *Ing. Santiago Rodríguez P.
 *Creado: 10 de octubre de 2007, 10:30 PM
 **************************************************************************/
package objetosjava;
import javax.swing.JOptionPane;
public class Principal extends javax.swing.JFrame {
    //--------------------------------------------
    // Declaración de Variables
    //--------------------------------------------
    Estudiante Alumno; // Declaración del Objeto Alumno de tipo Estudiante.
    Estudiante Arreglo[] = new Estudiante[3];// Arreglo de Estudiantes
    int contador=0;
            
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

        Busca_Btn.setText("Siguiente");
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
        jLabel4.setText("Guarde 3 Personas, luego consulte info.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(34, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Telefono_txt)
                                    .addComponent(Nombre_txt)
                                    .addComponent(Cedula_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Limpia_Btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Guarda_Btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Busca_Btn)))
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Cedula_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Nombre_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Telefono_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Busca_Btn)
                    .addComponent(Guarda_Btn)
                    .addComponent(Limpia_Btn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Limpia_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Limpia_BtnActionPerformed
        Limpiador();
    }//GEN-LAST:event_Limpia_BtnActionPerformed

    //Limpia la pantalla
    public void Limpiador(){ 
        Cedula_txt.setText("");
        Nombre_txt.setText("");
        Telefono_txt.setText("");
    }
    
    private void Busca_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Busca_BtnActionPerformed
        //Recorre el arreglo de estudiantes y los muestra 1 a 1
        if (contador < 3){
             Cedula_txt.setText(Arreglo[contador].Cedula);
             Nombre_txt.setText(Arreglo[contador].Nombre);
             Telefono_txt.setText(Arreglo[contador].Telefono);
             contador++;
        }else{
            contador = 0;
            Limpiador();
        }
    }//GEN-LAST:event_Busca_BtnActionPerformed

    private void Guarda_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Guarda_BtnActionPerformed
        //Guarda 1 a 1 nuevos "registros" de estudiantes en el arreglo
        if (contador < 3){
             Arreglo[contador]=new Estudiante(Cedula_txt.getText(),Nombre_txt.getText(), Telefono_txt.getText());
             contador++;
        }else{
            contador = 0; 
            JOptionPane.showMessageDialog(null, "Has exedido el limite del arreglo\n");
        }
    }//GEN-LAST:event_Guarda_BtnActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // Inicializa un objeto (Alumno) tipo estudiante 
        // Carga el registro del Estudiante en pantalla        
        Alumno = new Estudiante("1-1051-0540","Santiago Rodríguez Paniagua","833-7472");
        Cedula_txt.setText(Alumno.Cedula);
        Nombre_txt.setText(Alumno.Nombre);
        Telefono_txt.setText(Alumno.Telefono);
    }//GEN-LAST:event_formWindowActivated
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Busca_Btn;
    private javax.swing.JTextField Cedula_txt;
    private javax.swing.JButton Guarda_Btn;
    private javax.swing.JButton Limpia_Btn;
    private javax.swing.JTextField Nombre_txt;
    private javax.swing.JTextField Telefono_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
    
}

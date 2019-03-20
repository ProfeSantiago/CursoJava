/*************************************************************************
 *Profesor_Frame.java - Super Clases y Sub Clases
 *Ing. Santiago Rodríguez P.
 *Creado: 10 de octubre de 2007, 10:30 PM
 **************************************************************************/
package SuperClases;
import javax.swing.JOptionPane;
public class Profesor_Frame extends javax.swing.JFrame {        
    public Profesor_Frame() {
        initComponents();
    }
    Profesor_Frame(Estudiante_Frame aThis) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    //--------------------------------------------------------------------------
    // Declaración de Variables
    //--------------------------------------------------------------------------
    Profesor Profe;  // Declaración del Objeto Profe de tipo Estudiante.
    Profesor Arreglo[] = new Profesor[3];//      Arreglo de Estudiantes
    int contador=0;
    
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
        jLabel5 = new javax.swing.JLabel();
        Carrera_txt = new javax.swing.JTextField();
        Profe_Btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Super y Sub Clases");
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
        jLabel4.setText("Profesores");

        jLabel5.setText("Carrera");

        Profe_Btn.setText("Estudiantes");
        Profe_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Profe_BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Carrera_txt)
                            .addComponent(Telefono_txt)
                            .addComponent(Nombre_txt)
                            .addComponent(Cedula_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Limpia_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Guarda_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Busca_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Profe_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
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
                    .addComponent(jLabel5)
                    .addComponent(Carrera_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Busca_Btn)
                    .addComponent(Guarda_Btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Profe_Btn)
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
        Carrera_txt.setText("");
    }
    
    private void Busca_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Busca_BtnActionPerformed
    //Recorre el arreglo de profesores y los muestra 1 a 1
        if (contador < 3){
             Cedula_txt.setText(Arreglo[contador].Cedula);
             Nombre_txt.setText(Arreglo[contador].Nombre);
             Telefono_txt.setText(Arreglo[contador].Telefono);
             Carrera_txt.setText(Arreglo[contador].Carrera);
             contador++;
        }else{
            contador = 0;
            Limpiador();
        }
    }//GEN-LAST:event_Busca_BtnActionPerformed

    private void Guarda_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Guarda_BtnActionPerformed
    //Guarda 1 a 1 nuevos "registros" de profesores en el arreglo   
        if (contador < 3){
             Arreglo[contador] = new Profesor(Cedula_txt.getText(),Nombre_txt.getText(), Telefono_txt.getText(), Carrera_txt.getText());
             contador++;
        }else{
            contador = 0; 
            JOptionPane.showMessageDialog(null, "Has exedido el limite del arreglo\n");
        }
    }//GEN-LAST:event_Guarda_BtnActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // Inicializa un objeto (Profe) tipo profesor 
        // Carga el registro del Profesor en pantalla   
        Profe = new Profesor("1-1051-0540","Santiago Rodríguez Paniagua","833-7472","9723911"); 
        Cedula_txt.setText(Profe.Cedula);
        Nombre_txt.setText(Profe.Nombre);
        Telefono_txt.setText(Profe.Telefono);    
        Carrera_txt.setText(Profe.Carrera);
    }//GEN-LAST:event_formWindowActivated

    private void Profe_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Profe_BtnActionPerformed
        this.dispose();
        new Estudiante_Frame().setVisible(true);    
    }//GEN-LAST:event_Profe_BtnActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Profesor_Frame().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Busca_Btn;
    private javax.swing.JTextField Carrera_txt;
    private javax.swing.JTextField Cedula_txt;
    private javax.swing.JButton Guarda_Btn;
    private javax.swing.JButton Limpia_Btn;
    private javax.swing.JTextField Nombre_txt;
    private javax.swing.JButton Profe_Btn;
    private javax.swing.JTextField Telefono_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
    
}

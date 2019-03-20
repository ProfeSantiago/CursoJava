/*****************************************************************
 * Hola Mundo.java - Ing.Santiago Rodríguez Paniagua
 * Created 28 de enero de 2008, 04:35 PM
 *****************************************************************/
package BasicGui;
// Es necesario importar esta librería para el JOptionPane
import javax.swing.JOptionPane; 
public class Ventana extends javax.swing.JFrame {
    public Ventana() {
        initComponents();
    }
   //Definición Global de Variables
    String Textillo = "";
    String Edad = "";
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Nombre_txt = new javax.swing.JTextField();
        Acepta_Btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Mensaje_Label = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Mensaje_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Lista = new java.awt.List();
        jScrollPane1 = new javax.swing.JScrollPane();
        Area_Texto = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Digite su Nombre:");

        Acepta_Btn.setText("Aceptar");
        Acepta_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Acepta_BtnActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Imprime en un Label:");

        Mensaje_Label.setText("Hola!!");

        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Imprime en un TextField:");

        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Imprime en un List de AWT:");

        Area_Texto.setColumns(20);
        Area_Texto.setRows(5);
        jScrollPane1.setViewportView(Area_Texto);

        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Imprime en un TextArea:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Mensaje_Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lista, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Mensaje_txt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nombre_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(16, 16, 16)
                        .addComponent(Acepta_Btn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Acepta_Btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Mensaje_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Mensaje_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(2, 2, 2)
                .addComponent(Lista, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Acepta_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Acepta_BtnActionPerformed
        Textillo =  Nombre_txt.getText();
        Edad = JOptionPane.showInputDialog("Que edad tienes?");
        Mensaje_Label.setText("Hola " +Textillo+" Tienes "+Edad+" años");
        Mensaje_txt.setText("Hola " +Textillo+" Tienes "+Edad+" años");
        Lista.add("Hola: ");
        Lista.add(Textillo+" Tienes "+Edad+" años");
        Area_Texto.setText("Hola : \n"+Textillo+"\nTienes "+Edad+" años");
        JOptionPane.showMessageDialog(null, "Hola \n"+Textillo+" Tienes "+Edad+" años");
    }//GEN-LAST:event_Acepta_BtnActionPerformed
    

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Acepta_Btn;
    private javax.swing.JTextArea Area_Texto;
    private java.awt.List Lista;
    private javax.swing.JLabel Mensaje_Label;
    private javax.swing.JTextField Mensaje_txt;
    private javax.swing.JTextField Nombre_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
}

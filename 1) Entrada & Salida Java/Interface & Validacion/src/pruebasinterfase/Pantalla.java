package pruebasinterfase;
import javax.swing.JOptionPane;

public class Pantalla extends javax.swing.JFrame {
    public Pantalla() {
        initComponents();
    }
    // Declaración de Variables Globales
    String Texto;
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        Numeros_txt = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        Combo_Select = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        Texto_Combo_Txt = new javax.swing.JTextField();
        Agrega_Btn = new javax.swing.JButton();
        Combo = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ejemplos Varios");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jCheckBox1.setText("Seleccionar Opción");
        jCheckBox1.setToolTipText("Mírame estoy usando el toolTipText");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Ejemplo de uso del Check Box");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Solo puede digitar Números (Intentelo)");

        Numeros_txt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Numeros_txt.setToolTipText("Mírame estoy usando el toolTipText");
        Numeros_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Numeros_txtKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Numeros_txtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Numeros_txtKeyTyped(evt);
            }
        });

        Combo_Select.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Valor #1", "Valor #2", "Valor #3" }));
        Combo_Select.setToolTipText("Aqui tambien utilizo la propiedad: \"toolTipText\"");
        Combo_Select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo_SelectActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Seleccione una Opción:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Agregue Elementos al ComboBox:");

        Agrega_Btn.setText("Agregar>>");
        Agrega_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agrega_BtnActionPerformed(evt);
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
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Numeros_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jCheckBox1)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Combo_Select, 0, 236, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Agrega_Btn)
                        .addContainerGap(157, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Combo, javax.swing.GroupLayout.Alignment.LEADING, 0, 236, Short.MAX_VALUE)
                            .addComponent(Texto_Combo_Txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Numeros_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Combo_Select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Texto_Combo_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Agrega_Btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Ejemplos Varios V2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()){
            JOptionPane.showMessageDialog(null, "Seleccionado!!");
        }else{
          JOptionPane.showMessageDialog(null, "No Seleccionado!!");  
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    }//GEN-LAST:event_formWindowActivated

    private void Numeros_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Numeros_txtKeyPressed
    }//GEN-LAST:event_Numeros_txtKeyPressed

    private void Numeros_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Numeros_txtKeyTyped
    }//GEN-LAST:event_Numeros_txtKeyTyped

    private void Numeros_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Numeros_txtKeyReleased
        if  ((evt.getKeyCode() >= 48 && evt.getKeyCode() <= 57) || (evt.getKeyCode() == 46 || evt.getKeyCode() == 8)){ 
        }else{ 
            Texto = Numeros_txt.getText();
            Numeros_txt.setText(Texto.substring(0, (Texto.length()-1)));
        }
    }//GEN-LAST:event_Numeros_txtKeyReleased

    private void Combo_SelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo_SelectActionPerformed
            if (Combo_Select.getSelectedItem().equals("Valor #1")){
                JOptionPane.showMessageDialog(null, "Has seleccionado la primera opción");
            }
            if (Combo_Select.getSelectedItem().equals("Valor #2")){
                JOptionPane.showMessageDialog(rootPane, "Has seleccionado la segunda opción");
            }
            if (Combo_Select.getSelectedItem().equals("Valor #3")){
                JOptionPane.showMessageDialog(rootPane, "Has seleccionado la tercera opción");
            }
}//GEN-LAST:event_Combo_SelectActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jCheckBox1.setSelected(false);
    }//GEN-LAST:event_formWindowOpened

    private void Agrega_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Agrega_BtnActionPerformed
        Combo.addItem(Texto_Combo_Txt.getText());
}//GEN-LAST:event_Agrega_BtnActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agrega_Btn;
    private javax.swing.JComboBox Combo;
    private javax.swing.JComboBox Combo_Select;
    private javax.swing.JTextField Numeros_txt;
    private javax.swing.JTextField Texto_Combo_Txt;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}

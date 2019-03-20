/*************************************************************************
 * Arreglos Java - Ing. Santiago Rodrํguez P.
 * Creado: 22 de octubre de 2007, 09:41 PM
 * Actualizado: 17/09/09, 04:29 AM
 **************************************************************************/

package arreglos_java;
import java.util.Arrays; //Ojo Estas Librerํas son "nuevas"
import javax.swing.JOptionPane;
public class Principal extends javax.swing.JFrame {
    public Principal() {
        initComponents();
    }/*บบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบ
      * Declaraci๓n de Variables
      บบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบ*/
    int arreglo[] = new int[4];
    int contador = 0;
    int temporal = 0;
    
    public static int sumar(int arrelo[], int n) {
        if (n == 1) {
            return arrelo[0];
        } else {
            return arrelo[n - 1] + sumar(arrelo, n - 1);
        }
    }

     public void Inicializa_Arreglo(){
        for(int i=0; i < 10; i++){
           arreglo[i]=0;
        }
    }
      
    public void Llena_Lista(){
        for(int i=0; i < 10; i++){
           lista.add(String.valueOf(arreglo[i]));
        }
    }
    
    public void Limpiador(){
        Numero_txt.setText("");
        lista.removeAll(); //Funci๓n que limpia el ListBox
    }
    
    public void Inserta(){
         if (contador < 10){
              arreglo[contador] = Integer.valueOf(Numero_txt.getText());
             contador++;
        }else{
            contador = 0; 
            JOptionPane.showMessageDialog(null, "Has exedido el limite del arreglo\n");
        }
    }
   
    public void Ordena_Burbuja(){
        //Este For es el que llama N veces al For que ordena
        for(int pasadas=1; pasadas < arreglo.length; pasadas++){ 
            //Este For es el que ordena
           for(int i=0; i < arreglo.length - 1; i++){
               if (arreglo[i] > arreglo[i+1]){
                   temporal = arreglo[i];
                   arreglo[i] = arreglo[i+1];
                   arreglo[i+1]=temporal;
               }
            }
        }
    }//บบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบ
    
    public boolean Busqueda_Lineal(int Buscado){
       for(int i=0; i < arreglo.length - 1; i++)
           if (arreglo[i] == Buscado)
               return true;
       return false;
    }//บบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบ
    
    public boolean Busqueda_Binaria(int Buscado){
        int bajo = 0; //Contador bajo;
        int medio =0; //Contador medio
        int alto = arreglo.length - 1; //Contador alto
        while(bajo <= alto){
            medio = (bajo + alto)/2;
             if (arreglo[medio] == Buscado){
                return true;
             }else if (Buscado<arreglo[medio])
                 alto = medio -1;
             else
                 bajo = medio + 1;
        }
        return false;
    }//บบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบ
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        list1 = new java.awt.List();
        Numero_txt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Ins_Btn = new javax.swing.JButton();
        Listar_Btn = new javax.swing.JButton();
        Clear_Btn = new javax.swing.JButton();
        lista = new java.awt.List();
        Ordena_Btn = new javax.swing.JButton();
        Ordena_Btn2 = new javax.swing.JButton();
        Linear_Btn = new javax.swing.JButton();
        Binaria_Btn = new javax.swing.JButton();
        Suma_Btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Numero_txt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Numero_txt.setToolTipText("Solo puedes \ndigitar n๚meros"); // NOI18N

        jLabel1.setText("Digite un n๚mero");

        Ins_Btn.setText("Insertar");
        Ins_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ins_BtnActionPerformed(evt);
            }
        });

        Listar_Btn.setText("Listar");
        Listar_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Listar_BtnActionPerformed(evt);
            }
        });

        Clear_Btn.setText("Limpiar");
        Clear_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clear_BtnActionPerformed(evt);
            }
        });

        lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaActionPerformed(evt);
            }
        });

        Ordena_Btn.setText("Ordenar");
        Ordena_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ordena_BtnActionPerformed(evt);
            }
        });

        Ordena_Btn2.setForeground(java.awt.Color.blue);
        Ordena_Btn2.setText("Ordenar");
        Ordena_Btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ordena_Btn2ActionPerformed(evt);
            }
        });

        Linear_Btn.setText("Buscar");
        Linear_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Linear_BtnActionPerformed(evt);
            }
        });

        Binaria_Btn.setForeground(java.awt.Color.blue);
        Binaria_Btn.setText("Buscar");
        Binaria_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Binaria_BtnActionPerformed(evt);
            }
        });

        Suma_Btn.setText("Sumar");
        Suma_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Suma_BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Numero_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ins_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ordena_Btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Linear_Btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Listar_Btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ordena_Btn2, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(Clear_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(Binaria_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(Suma_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lista, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lista, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Numero_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Ins_Btn)
                            .addComponent(Suma_Btn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Linear_Btn)
                            .addComponent(Binaria_Btn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Ordena_Btn)
                            .addComponent(Ordena_Btn2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Clear_Btn)
                            .addComponent(Listar_Btn))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Ordena_Btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ordena_Btn2ActionPerformed
        Arrays.sort(arreglo); //Ordenamiento Automแtico
        Limpiador();
        Llena_Lista();
}//GEN-LAST:event_Ordena_Btn2ActionPerformed

    private void Ordena_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ordena_BtnActionPerformed
       Ordena_Burbuja();
       Limpiador();
       Llena_Lista();
}//GEN-LAST:event_Ordena_BtnActionPerformed

    private void Clear_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear_BtnActionPerformed
        Limpiador();
        Llena_Lista();
}//GEN-LAST:event_Clear_BtnActionPerformed

    private void Listar_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Listar_BtnActionPerformed
        Llena_Lista();
}//GEN-LAST:event_Listar_BtnActionPerformed

    private void Ins_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ins_BtnActionPerformed
       Inserta();
       Limpiador();
       Llena_Lista();
}//GEN-LAST:event_Ins_BtnActionPerformed

    private void Linear_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Linear_BtnActionPerformed
        int Num_Buscado = Integer.valueOf(Numero_txt.getText());
        if (Busqueda_Lineal(Num_Buscado)){
            JOptionPane.showMessageDialog(null, "El elemento buscado SI estแ en el arreglo!!");
        }else{
            JOptionPane.showMessageDialog(null, "No se encuentra el elemento buscado");
       }
    }//GEN-LAST:event_Linear_BtnActionPerformed

    private void Binaria_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Binaria_BtnActionPerformed
        int Num_Buscado = Integer.valueOf(Numero_txt.getText());
        if (Busqueda_Binaria(Num_Buscado)){
            JOptionPane.showMessageDialog(null, "El elemento buscado SI estแ en el arreglo!!");
        }else{
            JOptionPane.showMessageDialog(null, "No se encuentra el elemento buscado");
       }
}//GEN-LAST:event_Binaria_BtnActionPerformed

    private void listaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaActionPerformed

    }//GEN-LAST:event_listaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Inicializa_Arreglo();
    }//GEN-LAST:event_formWindowOpened

    private void Suma_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Suma_BtnActionPerformed
 
        JOptionPane.showMessageDialog(null, sumar(arreglo,4));
    }//GEN-LAST:event_Suma_BtnActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Binaria_Btn;
    private javax.swing.JButton Clear_Btn;
    private javax.swing.JButton Ins_Btn;
    private javax.swing.JButton Linear_Btn;
    private javax.swing.JButton Listar_Btn;
    private javax.swing.JTextField Numero_txt;
    private javax.swing.JButton Ordena_Btn;
    private javax.swing.JButton Ordena_Btn2;
    private javax.swing.JButton Suma_Btn;
    private javax.swing.JLabel jLabel1;
    private java.awt.List list1;
    private java.awt.List lista;
    // End of variables declaration//GEN-END:variables
    
}

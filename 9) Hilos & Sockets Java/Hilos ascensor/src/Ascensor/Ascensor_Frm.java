

package Ascensor;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author  German
 */
public class Ascensor_Frm extends javax.swing.JFrame {
    
 
    public Ascensor_Frm() {
        initComponents();
    }
    public void Stat(){
    if (Hide1.getValue()==50){
            try {
                Hilo.sleep(4000);
                people_pri.hide();
            } catch (InterruptedException ex) {
                Logger.getLogger(Ascensor_Frm.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    if(Hide1.getValue()==100){
            try {
                hilo = new Hilito(this);
                hilo.sleep(4000);
                hilo.start();
                baja.stop();
            } catch (InterruptedException ex) {
                Logger.getLogger(Ascensor_Frm.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}
    
    public void Stat2(){
    if (Hide1.getValue()==50){
            try {
                hilo.sleep(4000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Ascensor_Frm.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    if(Hide1.getValue()==0){
            try {
                people.setVisible(true);
                baja = new Hilo(this);
                baja.sleep(4000);
                baja.start();
                hilo.stop();
            } catch (InterruptedException ex) {
                Logger.getLogger(Ascensor_Frm.class.getName()).log(Level.SEVERE, null, ex);
            }
}
}
    public void Sube(){
    SubeBaja.setLocation(SubeBaja.getX(), SubeBaja.getY()-12);
    Hide1.setValue(Hide1.getValue()-5);    
}
    public void Baja(){
    SubeBaja.setLocation(SubeBaja.getX(), SubeBaja.getY()+12);
    people_pri.setLocation(people_pri.getX()+23,people_pri.getY());
    Hide1.setValue(Hide1.getValue()+5);
}
     Hilito hilo;
     Hilo baja;
     Hilote der;
     
      
      
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Hide2 = new javax.swing.JProgressBar();
        Hide1 = new javax.swing.JProgressBar();
        people_pri = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        people = new javax.swing.JButton();
        SubeBaja = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(300, 200, 0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Hide1.setStringPainted(true);

        SubeBaja.setBackground(new java.awt.Color(102, 255, 51));
        SubeBaja.setText("Up Down");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(Hide2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(people_pri, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                    .addComponent(people, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SubeBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(Hide1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(141, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(people)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(SubeBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addComponent(people_pri)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(272, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Hide1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Hide2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(15, 15, 15)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       baja = new Hilo(this);
        baja.start(); 
        Hide1.setVisible(false);
         Hide2.setVisible(false);
         people.setVisible(false);
    }//GEN-LAST:event_formWindowActivated
    
  
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ascensor_Frm().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Hide1;
    private javax.swing.JProgressBar Hide2;
    private javax.swing.JButton SubeBaja;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton people;
    private javax.swing.JButton people_pri;
    // End of variables declaration//GEN-END:variables
    
}

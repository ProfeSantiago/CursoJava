/************************************************
 * Utiles_Frm.java  * @author  Santiago
 * Created on 27 de febrero de 2008, 10:07 PM
 ************************************************/
public class Hilos_Frm extends javax.swing.JFrame {
    public Hilos_Frm() {
        initComponents();
    }
/************************************************
 * Declaración de Variables
 * Creamos un hilo del primer tipo
 ************************************************/
HiloThread Hilo1 = new HiloThread();
//Creamos un hilo del segundo tipo
Thread Hilo2 = new Thread(new HiloRunnable());
//************************************************
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Inicia1_Btn = new javax.swing.JButton();
        Inicia2_Btn = new javax.swing.JButton();
        Pausa1_Btn = new javax.swing.JButton();
        Pausa2_Btn = new javax.swing.JButton();
        Reanuda1_Btn = new javax.swing.JButton();
        Reanuda2_Btn = new javax.swing.JButton();
        Termina1_Btn = new javax.swing.JButton();
        Termina2_Btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Inicia1_Btn.setBackground(new java.awt.Color(153, 255, 153));
        Inicia1_Btn.setText("Iniciar Hilo1");
        Inicia1_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Inicia1_BtnActionPerformed(evt);
            }
        });

        Inicia2_Btn.setBackground(new java.awt.Color(153, 255, 153));
        Inicia2_Btn.setText("Iniciar Hilo2");
        Inicia2_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Inicia2_BtnActionPerformed(evt);
            }
        });

        Pausa1_Btn.setBackground(new java.awt.Color(255, 255, 153));
        Pausa1_Btn.setText("Pausar Hilo1");
        Pausa1_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pausa1_BtnActionPerformed(evt);
            }
        });

        Pausa2_Btn.setBackground(new java.awt.Color(255, 255, 153));
        Pausa2_Btn.setText("Pausar Hilo2");
        Pausa2_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pausa2_BtnActionPerformed(evt);
            }
        });

        Reanuda1_Btn.setBackground(new java.awt.Color(204, 204, 255));
        Reanuda1_Btn.setText("Reanudar Hilo1");
        Reanuda1_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reanuda1_BtnActionPerformed(evt);
            }
        });

        Reanuda2_Btn.setBackground(new java.awt.Color(204, 204, 255));
        Reanuda2_Btn.setText("Reanudar Hilo2");
        Reanuda2_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reanuda2_BtnActionPerformed(evt);
            }
        });

        Termina1_Btn.setBackground(new java.awt.Color(255, 153, 153));
        Termina1_Btn.setText("Terminar Hilo1");
        Termina1_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Termina1_BtnActionPerformed(evt);
            }
        });

        Termina2_Btn.setBackground(new java.awt.Color(255, 153, 153));
        Termina2_Btn.setText("Terminar Hilo2");
        Termina2_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Termina2_BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Inicia1_Btn)
                    .addComponent(Inicia2_Btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pausa1_Btn)
                    .addComponent(Pausa2_Btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Reanuda1_Btn)
                    .addComponent(Reanuda2_Btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Termina1_Btn)
                    .addComponent(Termina2_Btn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Termina1_Btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Termina2_Btn))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Reanuda1_Btn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Reanuda2_Btn))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Pausa1_Btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Pausa2_Btn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Inicia1_Btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Inicia2_Btn)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Inicia1_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Inicia1_BtnActionPerformed
        System.out.println("Iniciado el hilo #1 HiloTread");
        Hilo1.start();
    }//GEN-LAST:event_Inicia1_BtnActionPerformed

    private void Inicia2_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Inicia2_BtnActionPerformed
        System.out.println("Iniciado el hilo #2 HiloRunnable");
        Hilo2.start();
    }//GEN-LAST:event_Inicia2_BtnActionPerformed

    private void Pausa1_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pausa1_BtnActionPerformed
        System.out.println("Hilo #1 HiloTread Pausado");
        Hilo1.suspend();
}//GEN-LAST:event_Pausa1_BtnActionPerformed

    private void Pausa2_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pausa2_BtnActionPerformed
        System.out.println("Hilo #2 HiloRunnable Pausado");
        Hilo2.suspend();
}//GEN-LAST:event_Pausa2_BtnActionPerformed

    private void Reanuda1_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reanuda1_BtnActionPerformed
        System.out.println("Hilo #1 HiloTread ha reiniciado");
        Hilo1.resume();
}//GEN-LAST:event_Reanuda1_BtnActionPerformed

    private void Reanuda2_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reanuda2_BtnActionPerformed
        System.out.println("Hilo #2 HiloRunnable ha reiniciado");
        Hilo2.resume();
}//GEN-LAST:event_Reanuda2_BtnActionPerformed

    private void Termina1_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Termina1_BtnActionPerformed
        System.out.println("Hilo #1 HiloTread ha terminado");
        Hilo1.stop();
}//GEN-LAST:event_Termina1_BtnActionPerformed

    private void Termina2_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Termina2_BtnActionPerformed
        System.out.println("Hilo #2 HiloRunnable ha terminado");
        Hilo2.stop();
}//GEN-LAST:event_Termina2_BtnActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hilos_Frm().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Inicia1_Btn;
    private javax.swing.JButton Inicia2_Btn;
    private javax.swing.JButton Pausa1_Btn;
    private javax.swing.JButton Pausa2_Btn;
    private javax.swing.JButton Reanuda1_Btn;
    private javax.swing.JButton Reanuda2_Btn;
    private javax.swing.JButton Termina1_Btn;
    private javax.swing.JButton Termina2_Btn;
    // End of variables declaration//GEN-END:variables
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formsR;

import Desvanecimiento.Desvanecimiento;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author karam
 */
public class mainC extends javax.swing.JFrame {

    private int posX;
    private int posY;
    private Desvanecimiento desv;

    public mainC() {
        initComponents();
        desv = new Desvanecimiento();
        desv.Mostrar(this, 5);
        characterLimit(var_txt);
        characterLimit(rest_txt);
        jTable1.getTableHeader().setFont(new java.awt.Font("Arial Black", 0, 14));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new Color(97, 66, 159));
        jTable1.getTableHeader().setForeground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mContainer = new javax.swing.JPanel();
        gen_btn = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        exit_btn = new javax.swing.JLabel();
        rest_txt = new javax.swing.JTextField();
        js2 = new javax.swing.JSeparator();
        rest_lbl = new javax.swing.JLabel();
        var_txt = new javax.swing.JTextField();
        js1 = new javax.swing.JSeparator();
        var_lbl = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        sp_bg = new javax.swing.JLabel();
        minim_btn = new javax.swing.JLabel();
        maxim_btn = new javax.swing.JLabel();
        dragged_zone = new javax.swing.JPanel();
        title_lbl = new javax.swing.JLabel();
        menu_bg = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        resul_ta = new javax.swing.JTextArea();
        main_bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        mContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gen_btn.setBackground(new java.awt.Color(255, 255, 252));
        gen_btn.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        gen_btn.setForeground(new java.awt.Color(153, 102, 255));
        gen_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gen_btn.setText("Generar");
        gen_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gen_btn.setOpaque(true);
        gen_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gen_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gen_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gen_btnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                gen_btnMousePressed(evt);
            }
        });
        mContainer.add(gen_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 110, 120, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(176, 169, 230));
        jTable1.setShowVerticalLines(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        mContainer.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 1000, 220));

        exit_btn.setBackground(new java.awt.Color(255, 255, 255));
        exit_btn.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        exit_btn.setForeground(new java.awt.Color(153, 102, 255));
        exit_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit_btn.setText("X");
        exit_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit_btn.setOpaque(true);
        exit_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exit_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exit_btnMouseExited(evt);
            }
        });
        mContainer.add(exit_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 0, 40, 40));

        rest_txt.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        rest_txt.setForeground(new java.awt.Color(255, 255, 255));
        rest_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rest_txt.setBorder(null);
        rest_txt.setOpaque(false);
        rest_txt.setSelectedTextColor(new java.awt.Color(153, 102, 255));
        rest_txt.setSelectionColor(new java.awt.Color(255, 255, 255));
        mContainer.add(rest_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 120, 60, 30));

        js2.setOpaque(true);
        mContainer.add(js2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 150, 60, -1));

        rest_lbl.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        rest_lbl.setForeground(new java.awt.Color(255, 255, 255));
        rest_lbl.setText("Restricciones:");
        mContainer.add(rest_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, -1, -1));

        var_txt.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        var_txt.setForeground(new java.awt.Color(255, 255, 255));
        var_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        var_txt.setBorder(null);
        var_txt.setOpaque(false);
        var_txt.setSelectedTextColor(new java.awt.Color(153, 102, 255));
        var_txt.setSelectionColor(new java.awt.Color(255, 255, 255));
        mContainer.add(var_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 60, 30));

        js1.setOpaque(true);
        mContainer.add(js1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 60, -1));

        var_lbl.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        var_lbl.setForeground(new java.awt.Color(255, 255, 255));
        var_lbl.setText("Variables:");
        mContainer.add(var_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        lbl1.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        lbl1.setForeground(new java.awt.Color(255, 255, 255));
        lbl1.setText("Ingrese la cantidad de variables y restricciones.");
        mContainer.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        sp_bg.setBackground(new java.awt.Color(153, 102, 255));
        sp_bg.setOpaque(true);
        mContainer.add(sp_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 1020, 150));

        minim_btn.setBackground(new java.awt.Color(97, 66, 159));
        minim_btn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        minim_btn.setForeground(new java.awt.Color(255, 255, 255));
        minim_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minim_btn.setText("Minimizar");
        minim_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minim_btn.setOpaque(true);
        minim_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minim_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minim_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minim_btnMouseExited(evt);
            }
        });
        mContainer.add(minim_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 210, 50));

        maxim_btn.setBackground(new java.awt.Color(97, 66, 159));
        maxim_btn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        maxim_btn.setForeground(new java.awt.Color(255, 255, 255));
        maxim_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        maxim_btn.setText("Maximizar");
        maxim_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        maxim_btn.setOpaque(true);
        maxim_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maxim_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                maxim_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                maxim_btnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                maxim_btnMousePressed(evt);
            }
        });
        mContainer.add(maxim_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 181, 210, 50));

        dragged_zone.setBackground(new java.awt.Color(255, 255, 255));
        dragged_zone.setOpaque(false);
        dragged_zone.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                dragged_zoneMouseDragged(evt);
            }
        });
        dragged_zone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dragged_zoneMousePressed(evt);
            }
        });

        javax.swing.GroupLayout dragged_zoneLayout = new javax.swing.GroupLayout(dragged_zone);
        dragged_zone.setLayout(dragged_zoneLayout);
        dragged_zoneLayout.setHorizontalGroup(
            dragged_zoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1190, Short.MAX_VALUE)
        );
        dragged_zoneLayout.setVerticalGroup(
            dragged_zoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        mContainer.add(dragged_zone, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 40));

        title_lbl.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        title_lbl.setForeground(new java.awt.Color(255, 255, 255));
        title_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title_lbl.setText("SIMPLEX");
        mContainer.add(title_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 50));

        menu_bg.setBackground(new java.awt.Color(97, 66, 159));
        menu_bg.setOpaque(true);
        mContainer.add(menu_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 620));

        resul_ta.setColumns(20);
        resul_ta.setRows(5);
        jScrollPane2.setViewportView(resul_ta);

        mContainer.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 1000, 180));

        main_bg.setBackground(new java.awt.Color(250, 250, 252));
        main_bg.setOpaque(true);
        mContainer.add(main_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void gen_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gen_btnMouseEntered
        new ColorTransition(gen_btn, new Color(255, 255, 252), new Color(153, 102, 255), new Color(153, 102, 255), Color.WHITE).execute();
    }//GEN-LAST:event_gen_btnMouseEntered

    private void gen_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gen_btnMouseExited
        new ColorTransition(gen_btn, new Color(153, 102, 255), new Color(255, 255, 252), Color.WHITE, new Color(153, 102, 255)).execute();
    }//GEN-LAST:event_gen_btnMouseExited

    private void exit_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_btnMouseClicked
        desv.Cerrar(this, 5);
    }//GEN-LAST:event_exit_btnMouseClicked

    private void exit_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_btnMouseEntered
        new ColorTransition(exit_btn, Color.WHITE, new Color(153, 102, 255), new Color(153, 102, 255), Color.WHITE).execute();
    }//GEN-LAST:event_exit_btnMouseEntered

    private void exit_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_btnMouseExited
        new ColorTransition(exit_btn, new Color(153, 102, 255), Color.WHITE, Color.WHITE, new Color(153, 102, 255)).execute();
    }//GEN-LAST:event_exit_btnMouseExited

    private void minim_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minim_btnMouseClicked
        minim_btn.setFont(new java.awt.Font("Arial Black", 0, 14));
        maxim_btn.setFont(new java.awt.Font("Arial", 0, 14));
    }//GEN-LAST:event_minim_btnMouseClicked

    private void minim_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minim_btnMouseEntered
        new ColorTransition(minim_btn, new Color(97, 66, 159), new Color(124, 96, 181), Color.WHITE, Color.WHITE).execute();
    }//GEN-LAST:event_minim_btnMouseEntered

    private void minim_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minim_btnMouseExited
        new ColorTransition(minim_btn, new Color(124, 96, 181), new Color(97, 66, 159), Color.WHITE, Color.WHITE).execute();
    }//GEN-LAST:event_minim_btnMouseExited

    private void maxim_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxim_btnMouseClicked
        maxim_btn.setFont(new java.awt.Font("Arial Black", 0, 14));
        minim_btn.setFont(new java.awt.Font("Arial", 0, 14));
    }//GEN-LAST:event_maxim_btnMouseClicked

    private void maxim_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxim_btnMouseEntered
        new ColorTransition(maxim_btn, new Color(97, 66, 159), new Color(124, 96, 181), Color.WHITE, Color.WHITE).execute();
    }//GEN-LAST:event_maxim_btnMouseEntered

    private void maxim_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxim_btnMouseExited
        new ColorTransition(maxim_btn, new Color(124, 96, 181), new Color(97, 66, 159), Color.WHITE, Color.WHITE).execute();
    }//GEN-LAST:event_maxim_btnMouseExited

    private void dragged_zoneMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragged_zoneMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - posX, y - posY);
    }//GEN-LAST:event_dragged_zoneMouseDragged

    private void dragged_zoneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragged_zoneMousePressed
        posX = evt.getX();
        posY = evt.getY();
    }//GEN-LAST:event_dragged_zoneMousePressed

    private void gen_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gen_btnMouseClicked
        gen_btn.setEnabled(false);
    }//GEN-LAST:event_gen_btnMouseClicked

    private void gen_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gen_btnMousePressed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int fila = 1 + Integer.parseInt(rest_txt.getText());
        int columna = Integer.parseInt(var_txt.getText());
        int columna1 = columna;
        for (int i = 0; i < columna1; i++) {
            model.addColumn("x" + (i + 1));
        }
        columna = fila + columna;
        for (int i = columna1; i < columna; i++) {
            if (i == columna - 1) {
                model.addColumn("Res");
            } else {
                model.addColumn("s" + (i - columna1 + 1));
            }
        }
        model.setRowCount(fila);
        model.setColumnCount(columna);
        for (int j = columna1; j < columna; j++) {
            jTable1.setValueAt(0, 0, j);
        }
        int i1 = 1, j1 = columna1;
        for (int i = 1; i < fila; i++) {
            for (int j = columna1; j < columna - 1; j++) {
                if (i1 == i && j1 == j) {
                    jTable1.setValueAt(1, i, j);
                } else {
                    jTable1.setValueAt(0, i, j);
                }
            }
            i1++;
            j1++;
        }
    }//GEN-LAST:event_gen_btnMousePressed

    private void maxim_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxim_btnMousePressed
        // AQUÍ LIZ        
    }//GEN-LAST:event_maxim_btnMousePressed

    class ColorTransition {

        private static final int STEPS = 20;
        private final JLabel label;
        private final Color startBackgroundColor;
        private final Color endBackgroundColor;
        private final Color startForegroundColor;
        private final Color endForegroundColor;

        public ColorTransition(JLabel label, Color startBackgroundColor, Color endBackgroundColor, Color startForegroundColor, Color endForegroundColor) {
            this.label = label;
            this.startBackgroundColor = startBackgroundColor;
            this.endBackgroundColor = endBackgroundColor;
            this.startForegroundColor = startForegroundColor;
            this.endForegroundColor = endForegroundColor;
        }

        public void execute() {
            Timer timer = new Timer(200 / STEPS, new ActionListener() {
                private int step = 0;

                @Override
                public void actionPerformed(ActionEvent e) {
                    if (step < STEPS) {
                        float ratio = (float) step / STEPS;
                        int bgR = (int) (startBackgroundColor.getRed() + ratio * (endBackgroundColor.getRed() - startBackgroundColor.getRed()));
                        int bgG = (int) (startBackgroundColor.getGreen() + ratio * (endBackgroundColor.getGreen() - startBackgroundColor.getGreen()));
                        int bgB = (int) (startBackgroundColor.getBlue() + ratio * (endBackgroundColor.getBlue() - startBackgroundColor.getBlue()));
                        label.setBackground(new Color(bgR, bgG, bgB));

                        int fgR = (int) (startForegroundColor.getRed() + ratio * (endForegroundColor.getRed() - startForegroundColor.getRed()));
                        int fgG = (int) (startForegroundColor.getGreen() + ratio * (endForegroundColor.getGreen() - startForegroundColor.getGreen()));
                        int fgB = (int) (startForegroundColor.getBlue() + ratio * (endForegroundColor.getBlue() - startForegroundColor.getBlue()));
                        label.setForeground(new Color(fgR, fgG, fgB));

                        step++;
                    } else {
                        ((Timer) e.getSource()).stop();
                    }
                }
            });
            timer.start();
        }
    }

    private void characterLimit(JTextField a) {
        a.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
                if (a.getText().length() >= 2) {
                    e.consume();
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        });
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dragged_zone;
    private javax.swing.JLabel exit_btn;
    private javax.swing.JLabel gen_btn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JSeparator js1;
    private javax.swing.JSeparator js2;
    private javax.swing.JLabel lbl1;
    private javax.swing.JPanel mContainer;
    private javax.swing.JLabel main_bg;
    private javax.swing.JLabel maxim_btn;
    private javax.swing.JLabel menu_bg;
    private javax.swing.JLabel minim_btn;
    private javax.swing.JLabel rest_lbl;
    private javax.swing.JTextField rest_txt;
    private javax.swing.JTextArea resul_ta;
    private javax.swing.JLabel sp_bg;
    private javax.swing.JLabel title_lbl;
    private javax.swing.JLabel var_lbl;
    private javax.swing.JTextField var_txt;
    // End of variables declaration//GEN-END:variables
}

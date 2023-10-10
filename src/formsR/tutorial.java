/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formsR;

import Desvanecimiento.Desvanecimiento;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author karam
 */
public class tutorial extends javax.swing.JFrame {

    Desvanecimiento desv;
    mainC mc = new mainC();
    private static int op = 1;

    public tutorial() {
        initComponents();
        desv = new Desvanecimiento();
        desv.Abrir(this, 5);
        iDKWTD();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        left = new javax.swing.JLabel();
        right = new javax.swing.JLabel();
        exit_btn = new javax.swing.JLabel();
        txt_container = new javax.swing.JLabel();
        img_container = new javax.swing.JLabel();
        img_bg = new javax.swing.JLabel();
        main_bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        left.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        left.setForeground(new java.awt.Color(255, 255, 255));
        left.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        left.setText("<");
        left.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leftMouseClicked(evt);
            }
        });
        getContentPane().add(left, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 60, -1));

        right.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        right.setForeground(new java.awt.Color(255, 255, 255));
        right.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        right.setText(">");
        right.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rightMouseClicked(evt);
            }
        });
        getContentPane().add(right, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 160, 60, -1));

        exit_btn.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        exit_btn.setForeground(new java.awt.Color(255, 255, 255));
        exit_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit_btn.setText("X");
        exit_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit_btnMouseClicked(evt);
            }
        });
        getContentPane().add(exit_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 40, 40));

        txt_container.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_container.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txt_container, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 670, 110));

        img_container.setBackground(new java.awt.Color(255, 255, 255));
        img_container.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(img_container, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 660, 320));

        img_bg.setBackground(new java.awt.Color(153, 102, 255));
        img_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img_bg.setOpaque(true);
        getContentPane().add(img_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7, 0, 930, 360));

        main_bg.setBackground(new java.awt.Color(255, 255, 255));
        main_bg.setOpaque(true);
        getContentPane().add(main_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exit_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_btnMouseClicked
        desv.Ocultar(this, 5);
        Timer time = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isVisible()) {
                    dispose();
                    mc.setTutoEnabled(true);
                }
            }
        });
        time.setRepeats(false);
        time.start();
    }//GEN-LAST:event_exit_btnMouseClicked

    private void rightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rightMouseClicked
        switch (op) {
            case 1:
                imgYTxt("/img/2.png", "<html><center>Paso 2.<br>Se generará y mostrará la tabla con la cantidad de variables y restricciones dada.</center></html>");
                op = 2;
                break;
            case 2:
                imgYTxt("/img/3.png", "<html><center>Paso 3.<br>A continuación deberá dar doble click sobre las celdas e introducir los valores que multiplica a cada variable y el respectivo resultado.</center></html>");
                op = 3;
                break;
            case 3:
                imgYTxt("/img/4.png", "<html><center>Paso 3.<br>Antes de proceder, al introducir el último valor, presiona ENTER o haz un solo click sobre otra celda.<br>Ninguna celda debe quedar abierta para introducir un valor, se debe ver como en la imagen.</center></html>");
                op = 4;
                break;
            case 4:
                imgYTxt("/img/5.png", "<html><center>Paso 4.<br>A continuación sólo debe elegir si necesita maximizar o minimizar y presionar<br>el botón correspondiente.</center></html>");
                op = 5;
                break;
            default:
                iDKWTD();
                break;
        }
    }//GEN-LAST:event_rightMouseClicked

    private void leftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftMouseClicked
        switch (op) {
            case 1:
                imgYTxt("/img/5.png", "<html><center>Paso 4.<br>A continuación sólo debe elegir si necesita maximizar o minimizar y presionar<br>el botón correspondiente.</center></html>");
                op = 2;
                break;
            case 2:
                imgYTxt("/img/4.png", "<html><center>Paso 3.<br>Antes de proceder, al introducir el último valor, presiona ENTER o haz un solo click sobre otra celda.<br>Ninguna celda debe quedar abierta para introducir un valor, se debe ver como en la imagen.</center></html>");
                op = 3;
                break;
            case 3:
                imgYTxt("/img/3.png", "<html><center>Paso 3.<br>A continuación deberá dar doble click sobre las celdas e introducir los valores que multiplica a cada variable y el respectivo resultado.</center></html>");
                op = 4;
                break;
            case 4:
                imgYTxt("/img/2.png", "<html><center>Paso 2.<br>Se generará y mostrará la tabla con la cantidad de variables y restricciones dada.</center></html>");
                op = 5;
                break;
            default:
                iDKWTD();
                break;
        }
    }//GEN-LAST:event_leftMouseClicked

    public void iDKWTD() {
        imgYTxt("/img/1.png", "<html><center>Paso 1.<br>Ingrese la cantidad de variables y restricciones que presenta su problema.<br>Asegúrese de que los datos sean correctos y pulse el botón 'Generar'.</center></html>");
        op = 1;
    }

    private void imgYTxt(String imagePath, String labelText) {
        java.net.URL imgURL = getClass().getResource(imagePath);
        if (imgURL != null) {
            ImageIcon imageIcon = new ImageIcon(imgURL);
            Image image = imageIcon.getImage().getScaledInstance(img_container.getWidth(), img_container.getHeight(), Image.SCALE_SMOOTH);
            img_container.setIcon(new ImageIcon(image));
        }
        txt_container.setText(labelText);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tutorial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exit_btn;
    private javax.swing.JLabel img_bg;
    private javax.swing.JLabel img_container;
    private javax.swing.JLabel left;
    private javax.swing.JLabel main_bg;
    private javax.swing.JLabel right;
    private javax.swing.JLabel txt_container;
    // End of variables declaration//GEN-END:variables
}

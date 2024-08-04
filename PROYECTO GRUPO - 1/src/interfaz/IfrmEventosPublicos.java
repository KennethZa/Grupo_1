package interfaz;

import clases.EventoPublico;
import conexion_BD.EventoPublicoBD;
import java.awt.Color;
import javax.swing.JOptionPane;


public class IfrmEventosPublicos extends javax.swing.JInternalFrame {

    EventoPublicoBD evpubd = new EventoPublicoBD();

    public IfrmEventosPublicos() {
        initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultCloseOperation(HIDE_ON_CLOSE);

    }

    public void limpiarRegistro() {
        txtNombre.setText("");
        txtCedula.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
        txtDireccion.setText("");
        txtFecha.setText("");
        txtHora.setText("");
        lblBoton.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioGrupó = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblDecoracion = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblDrireccion = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        lblPaquete = new javax.swing.JLabel();
        lblTipoPago = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btn5000 = new javax.swing.JButton();
        btn10000 = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        cboxTipoEvento = new javax.swing.JComboBox<>();
        cboxPaquete = new javax.swing.JComboBox<>();
        imagenWester = new javax.swing.JLabel();
        imagenDinners = new javax.swing.JLabel();
        imagenVisa = new javax.swing.JLabel();
        imagenMaster = new javax.swing.JLabel();
        imagenPaypal = new javax.swing.JLabel();
        radioWester = new javax.swing.JRadioButton();
        radioPaypal = new javax.swing.JRadioButton();
        radioDinners = new javax.swing.JRadioButton();
        radioVisa = new javax.swing.JRadioButton();
        radioMaster = new javax.swing.JRadioButton();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblBoton = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();

        setResizable(true);
        setTitle("Eventos Publico");
        setPreferredSize(new java.awt.Dimension(883, 527));

        jPanel1.setBackground(new java.awt.Color(254, 238, 254));
        jPanel1.setName("Eventos Publicos"); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setBackground(new java.awt.Color(172, 163, 175));
        lblTitulo.setFont(new java.awt.Font("Niagara Engraved", 0, 60)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 102, 102));
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/campana.png"))); // NOI18N
        lblTitulo.setText("Evento Público ");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 350, 50));

        lblDecoracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/organizador evento.jpg"))); // NOI18N
        lblDecoracion.setText("jLabel15");
        jPanel1.add(lblDecoracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 480, 320));

        lblNombre.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        lblNombre.setText("Nombre y Apellido:");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 110, 20));

        lblCorreo.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        lblCorreo.setText("Correo electronico:");
        jPanel1.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 120, 20));

        lblDrireccion.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        lblDrireccion.setText("Direccion:");
        jPanel1.add(lblDrireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 70, 20));

        lblTipo.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        lblTipo.setText("Tipo de Evento:");
        jPanel1.add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 90, 20));

        lblFecha.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        lblFecha.setText("Fecha del Evento:");
        jPanel1.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 110, 20));

        lblHora.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        lblHora.setText("Hora del Evento:");
        jPanel1.add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 100, 20));

        lblPaquete.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        lblPaquete.setText("Paquete del Evento:");
        jPanel1.add(lblPaquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 130, 20));

        lblTipoPago.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        lblTipoPago.setText("Tipo de pago:");
        jPanel1.add(lblTipoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 80, 30));

        btnGuardar.setBackground(new java.awt.Color(255, 102, 102));
        btnGuardar.setFont(new java.awt.Font("Script MT Bold", 0, 18)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/nube.png"))); // NOI18N
        btnGuardar.setText("Registrar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 140, 30));

        btn5000.setBackground(new java.awt.Color(153, 255, 204));
        btn5000.setFont(new java.awt.Font("Lucida Fax", 0, 13)); // NOI18N
        btn5000.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/mensaje.png"))); // NOI18N
        btn5000.setText("Paquete $ 5.000");
        btn5000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5000ActionPerformed(evt);
            }
        });
        jPanel1.add(btn5000, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 400, 160, -1));

        btn10000.setBackground(new java.awt.Color(153, 255, 204));
        btn10000.setFont(new java.awt.Font("Lucida Fax", 0, 13)); // NOI18N
        btn10000.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/mensaje.png"))); // NOI18N
        btn10000.setText("Paquete $ 10.000");
        btn10000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10000ActionPerformed(evt);
            }
        });
        jPanel1.add(btn10000, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 430, -1, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 190, -1));
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 190, -1));
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 190, -1));

        txtFecha.setForeground(new java.awt.Color(204, 204, 204));
        txtFecha.setText("DD/MM/YYYY");
        txtFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtFechaMousePressed(evt);
            }
        });
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 190, -1));

        txtHora.setForeground(new java.awt.Color(204, 204, 204));
        txtHora.setText("HH:MM:SS");
        txtHora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtHoraMousePressed(evt);
            }
        });
        jPanel1.add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 190, -1));

        cboxTipoEvento.setFont(new java.awt.Font("MingLiU-ExtB", 0, 13)); // NOI18N
        cboxTipoEvento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "°°°°°°°°", "Eventos Culturales", "Eventos Religiosos", "Conciertos Musicales", "Espectáculos", "Casa Abierta " }));
        cboxTipoEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxTipoEventoActionPerformed(evt);
            }
        });
        jPanel1.add(cboxTipoEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 190, -1));

        cboxPaquete.setFont(new java.awt.Font("MingLiU-ExtB", 0, 13)); // NOI18N
        cboxPaquete.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "°°°°°°°°", "$ 5.000", "$ 10.000", " " }));
        jPanel1.add(cboxPaquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 190, -1));

        imagenWester.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/wester.png"))); // NOI18N
        jPanel1.add(imagenWester, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 50, 20));

        imagenDinners.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/dinnersClub.png"))); // NOI18N
        jPanel1.add(imagenDinners, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, -1, 30));

        imagenVisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/visa.png"))); // NOI18N
        jPanel1.add(imagenVisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, -1, 30));

        imagenMaster.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/mastercard.png"))); // NOI18N
        jPanel1.add(imagenMaster, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, -1, 30));

        imagenPaypal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/paypal.png"))); // NOI18N
        jPanel1.add(imagenPaypal, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, -1, 20));

        radioGrupó.add(radioWester);
        jPanel1.add(radioWester, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, 20));

        radioGrupó.add(radioPaypal);
        jPanel1.add(radioPaypal, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, -1, -1));

        radioGrupó.add(radioDinners);
        jPanel1.add(radioDinners, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 20, 20));

        radioGrupó.add(radioVisa);
        jPanel1.add(radioVisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, -1, -1));

        radioGrupó.add(radioMaster);
        jPanel1.add(radioMaster, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, -1, -1));

        lblTelefono.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        lblTelefono.setText("Telefono:");
        jPanel1.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 100, 20));
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 190, -1));

        lblBoton.setFont(new java.awt.Font("Ink Free", 0, 17)); // NOI18N
        jPanel1.add(lblBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 130, 40));

        lblCedula.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        lblCedula.setText("Cedula:");
        jPanel1.add(lblCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 90, 20));

        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });
        jPanel1.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 190, -1));

        btnRegresar.setBackground(new java.awt.Color(255, 153, 0));
        btnRegresar.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(123, 123, 123))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("Eventos Publico");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        IfrmRegistroPublicos e = new IfrmRegistroPublicos();

        String botones = "";
        if (radioDinners.isSelected()) {
            botones += "Dinners Club";
        }
        if (radioMaster.isSelected()) {
            botones += "Master Card";
        }
        if (radioPaypal.isSelected()) {
            botones += "PayPal";
        }
        if (radioVisa.isSelected()) {
            botones += "Visa";
        }
        if (radioWester.isSelected()) {
            botones += "Wester Union";
        }
        lblBoton.setText(botones);

        EventoPublico publi = new EventoPublico();
        publi.setNombre(txtNombre.getText());
        publi.setCedula(txtCedula.getText());
        publi.setTelefono(txtTelefono.getText());
        publi.setCorreo(txtCorreo.getText());
        publi.setDireccion(txtDireccion.getText());
        publi.setTipoEvento(cboxTipoEvento.getSelectedItem().toString());
        publi.setFechaEvento(txtFecha.getText());
        publi.setHoraEvento(txtHora.getText());
        publi.setPaquete(cboxPaquete.getSelectedItem().toString());
        publi.setTipoPago(botones);

        try {
            if (!txtNombre.getText().isEmpty()) {
                if (!txtCedula.getText().isEmpty()) {
                    if (!txtTelefono.getText().isEmpty()) {
                        if (!txtCorreo.getText().isEmpty()) {
                            if (!txtDireccion.getText().isEmpty()) {
                                if (cboxTipoEvento.getSelectedIndex() != 0) {
                                    if (!txtFecha.getText().isEmpty()) {
                                        if (!txtHora.getText().isEmpty()) {
                                            if (cboxPaquete.getSelectedIndex() != 0) {
                                                if (radioDinners.isSelected() || radioMaster.isSelected() || radioPaypal.isSelected() || radioVisa.isSelected() || radioWester.isSelected()) {
                                                    JOptionPane.showMessageDialog(this, "DATO INGRESADOS CORRECTAMENTE", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);

                                                    evpubd.InsertarEventoT(publi);
                                                    e.limpiarDatos();
                                                    e.listarTabla();
                                                    limpiarRegistro();
                                                } else {
                                                    JOptionPane.showMessageDialog(this, "Escoja la tarjeta de pago", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);

                                                }
                                            } else {
                                                JOptionPane.showMessageDialog(this, "Escoja el paquete desado", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);

                                            }
                                        } else {
                                            JOptionPane.showMessageDialog(this, "Ingrese la hora", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);

                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(this, "Ingrese la fecha", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);

                                    }
                                } else {
                                    JOptionPane.showMessageDialog(this, "Escoja el tipo de evento", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);

                                }
                            } else {
                                JOptionPane.showMessageDialog(this, "Ingrese su direccion", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);

                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "Ingrese su correo electronico", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);

                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Ingrese su numero de telefono", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);

                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Ingrese su cedula de 10 digitos", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);

                }
            } else {
                JOptionPane.showMessageDialog(this, "Ingrese su nombre y apellido", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "ERROR", "ERROR", JOptionPane.ERROR_MESSAGE);

        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btn5000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5000ActionPerformed

        JOptionPane.showMessageDialog(null, "                        °°°PAQUETE DE $ 5.000°°°\n"
                + "                  SE OFRECE:\n"
                + "-> Decoración.\n"
                + "-> Fotografia y Video profesional.\n"
                + "-> Iluminaria y musica personalizada.\n"
                + "-> 40 Arreglos florales (diferentes diseños).\n"
                + "-> 40 Mesas, 80 Sillas y 120 manteles para sillas y mesas.\n"
                + "-> Personal de limpieza.", "INFORMATION MESSAGE", 1);
    }//GEN-LAST:event_btn5000ActionPerformed

    private void btn10000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10000ActionPerformed

        JOptionPane.showMessageDialog(null, "                        °°°PAQUETE DE $ 10.000°°°\n"
                + "                  SE OFRECE:\n"
                + "-> Decoración del jardín.\n"
                + "-> Fotografia y Video profesional.\n"
                + "-> Iluminaria y musica personalizada.\n"
                + "-> 100 Personas para que ayude en el evento.\n"
                + "-> 80 Arreglos florales (diferentes diseños).\n"
                + "-> 80 Mesas, 160 Sillas y 240 manteles para sillas y mesas.\n"
                + "-> Seguridad y personal de limpieza.", "INFORMATION MESSAGE", 1);
    }//GEN-LAST:event_btn10000ActionPerformed

    private void txtFechaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFechaMousePressed
        if (txtFecha.getText().equals("DD/MM/YYYY")) {
            txtFecha.setText("");
            txtFecha.setForeground(Color.black);
        }
        if (txtHora.getText().isEmpty()) {
            txtHora.setText("HH:MM:SS");
            txtHora.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtFechaMousePressed

    private void txtHoraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHoraMousePressed
        if (txtHora.getText().equals("HH:MM:SS")) {
            txtHora.setText("");
            txtHora.setForeground(Color.black);
        }
        if (txtFecha.getText().isEmpty()) {
            txtFecha.setText("DD/MM/YYYY");
            txtFecha.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtHoraMousePressed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // cierra ventana
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        // evento para solo ingresar numeros          
        Character c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void cboxTipoEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxTipoEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxTipoEventoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn10000;
    private javax.swing.JButton btn5000;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cboxPaquete;
    private javax.swing.JComboBox<String> cboxTipoEvento;
    private javax.swing.JLabel imagenDinners;
    private javax.swing.JLabel imagenMaster;
    private javax.swing.JLabel imagenPaypal;
    private javax.swing.JLabel imagenVisa;
    private javax.swing.JLabel imagenWester;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBoton;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDecoracion;
    private javax.swing.JLabel lblDrireccion;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPaquete;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTipoPago;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton radioDinners;
    private javax.swing.ButtonGroup radioGrupó;
    private javax.swing.JRadioButton radioMaster;
    private javax.swing.JRadioButton radioPaypal;
    private javax.swing.JRadioButton radioVisa;
    private javax.swing.JRadioButton radioWester;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}

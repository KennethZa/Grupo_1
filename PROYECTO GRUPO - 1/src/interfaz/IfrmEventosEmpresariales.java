package interfaz;

import clases.EventosEmpresariales;
import conexion_BD.EventoEmpresarialBD;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author miche
 */
public class IfrmEventosEmpresariales extends javax.swing.JInternalFrame {

    EventoEmpresarialBD empresa = new EventoEmpresarialBD();
    public int buscar;

    public IfrmEventosEmpresariales() {
        initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setResizable(true);

    }

    public void limpiarRegistro() {
        txtNombre.setText("");
        txtRuc.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
        txtDirrecion.setText("");
        txtFecha.setText("");
        txtHora.setText("");
        lblBoton.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioGrupo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblDecoracion = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblTipoEvento = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        lblPaquete = new javax.swing.JLabel();
        lblTipoPago = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtDirrecion = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        cboxTipoEvento = new javax.swing.JComboBox<>();
        cboxPaquete = new javax.swing.JComboBox<>();
        lblVisa = new javax.swing.JLabel();
        lblDinners = new javax.swing.JLabel();
        lblWester = new javax.swing.JLabel();
        lblPaypal = new javax.swing.JLabel();
        lblMaster = new javax.swing.JLabel();
        radioWester = new javax.swing.JRadioButton();
        radioPaypal = new javax.swing.JRadioButton();
        radioVisa = new javax.swing.JRadioButton();
        radioDinners = new javax.swing.JRadioButton();
        radioMaster = new javax.swing.JRadioButton();
        btnGuardar = new javax.swing.JButton();
        btn5000 = new javax.swing.JButton();
        btn15000 = new javax.swing.JButton();
        btn20000 = new javax.swing.JButton();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblBoton = new javax.swing.JLabel();
        lblRuc = new javax.swing.JLabel();
        txtRuc = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setTitle("Eventos Empresariales");
        setPreferredSize(new java.awt.Dimension(860, 525));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(883, 488));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Goudy Old Style", 0, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 102, 102));
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/copa.png"))); // NOI18N
        lblTitulo.setText("Eventos Empresariales");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        lblDecoracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/empresa.jpg"))); // NOI18N
        lblDecoracion.setText("jLabel16");
        jPanel1.add(lblDecoracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 460, 260));

        lblNombre.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        lblNombre.setText("Nombre de la empresa:");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, 20));

        lblCorreo.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        lblCorreo.setText("Correo electronico:");
        jPanel1.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, 20));

        lblDireccion.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        lblDireccion.setText("Direccion:");
        jPanel1.add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, 20));

        lblTipoEvento.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        lblTipoEvento.setText("Tipo de Evento:");
        jPanel1.add(lblTipoEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 130, 20));

        lblFecha.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        lblFecha.setText("Fecha del Evento:");
        jPanel1.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 130, 20));

        lblHora.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        lblHora.setText("Hora del Evento:");
        jPanel1.add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, 20));

        lblPaquete.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        lblPaquete.setText("Paquete del Evento:");
        jPanel1.add(lblPaquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, 20));

        lblTipoPago.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        lblTipoPago.setText("Tipo del pago:");
        jPanel1.add(lblTipoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, 20));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 170, -1));
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 170, -1));
        jPanel1.add(txtDirrecion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 170, -1));

        txtFecha.setForeground(new java.awt.Color(204, 204, 204));
        txtFecha.setText("DD/MM/YYYY");
        txtFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtFechaMousePressed(evt);
            }
        });
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 170, -1));

        txtHora.setForeground(new java.awt.Color(204, 204, 204));
        txtHora.setText("HH:MM:SS");
        txtHora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtHoraMousePressed(evt);
            }
        });
        jPanel1.add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 170, -1));

        cboxTipoEvento.setFont(new java.awt.Font("MingLiU-ExtB", 0, 13)); // NOI18N
        cboxTipoEvento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "°°°°°°°°", "Conferencias", "Seminarios", "Ferias", "Convenios" }));
        jPanel1.add(cboxTipoEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 170, -1));

        cboxPaquete.setFont(new java.awt.Font("MingLiU-ExtB", 0, 13)); // NOI18N
        cboxPaquete.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "°°°°°°°°", "$ 5.000", "$ 15.000", "$ 20.000" }));
        jPanel1.add(cboxPaquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 170, -1));

        lblVisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/visa.png"))); // NOI18N
        jPanel1.add(lblVisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, -1, 40));

        lblDinners.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/dinnersClub.png"))); // NOI18N
        jPanel1.add(lblDinners, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, -1, 30));

        lblWester.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/wester.png"))); // NOI18N
        jPanel1.add(lblWester, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, 20));

        lblPaypal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/paypal.png"))); // NOI18N
        jPanel1.add(lblPaypal, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, -1, 20));

        lblMaster.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/mastercard.png"))); // NOI18N
        jPanel1.add(lblMaster, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, -1, 30));

        radioGrupo.add(radioWester);
        jPanel1.add(radioWester, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, -1, -1));

        radioGrupo.add(radioPaypal);
        jPanel1.add(radioPaypal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, -1, -1));

        radioGrupo.add(radioVisa);
        jPanel1.add(radioVisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, -1, -1));

        radioGrupo.add(radioDinners);
        jPanel1.add(radioDinners, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, -1, -1));

        radioGrupo.add(radioMaster);
        jPanel1.add(radioMaster, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(255, 255, 102));
        btnGuardar.setFont(new java.awt.Font("Juice ITC", 1, 28)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/nube.png"))); // NOI18N
        btnGuardar.setText("Registrar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 210, 50));

        btn5000.setBackground(new java.awt.Color(255, 204, 204));
        btn5000.setFont(new java.awt.Font("Goudy Old Style", 0, 15)); // NOI18N
        btn5000.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/mensaje.png"))); // NOI18N
        btn5000.setText("Paquete $ 5.000");
        btn5000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5000ActionPerformed(evt);
            }
        });
        jPanel1.add(btn5000, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 190, -1));

        btn15000.setBackground(new java.awt.Color(255, 204, 204));
        btn15000.setFont(new java.awt.Font("Goudy Old Style", 0, 15)); // NOI18N
        btn15000.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/mensaje.png"))); // NOI18N
        btn15000.setText("Paquete $ 15.000");
        btn15000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn15000ActionPerformed(evt);
            }
        });
        jPanel1.add(btn15000, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, 190, -1));

        btn20000.setBackground(new java.awt.Color(255, 204, 204));
        btn20000.setFont(new java.awt.Font("Goudy Old Style", 0, 15)); // NOI18N
        btn20000.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/mensaje.png"))); // NOI18N
        btn20000.setText("Paquete $ 20.000");
        btn20000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20000ActionPerformed(evt);
            }
        });
        jPanel1.add(btn20000, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 420, 190, -1));

        lblTelefono.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        lblTelefono.setText("Telefonno:");
        jPanel1.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 150, 20));
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 170, -1));

        lblBoton.setFont(new java.awt.Font("Ink Free", 0, 17)); // NOI18N
        jPanel1.add(lblBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 180, 40));

        lblRuc.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        lblRuc.setText("R.U.C: ");
        jPanel1.add(lblRuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 60, -1));

        txtRuc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRucKeyTyped(evt);
            }
        });
        jPanel1.add(txtRuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 170, -1));

        btnRegresar.setBackground(new java.awt.Color(255, 153, 0));
        btnRegresar.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 120, 30));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondooo.jpg"))); // NOI18N
        lblFondo.setText("jLabel10");
        lblFondo.setPreferredSize(new java.awt.Dimension(860, 479));
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 850, 550));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        IfrmRegistroEmpresiariales m = new IfrmRegistroEmpresiariales();

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

        EventosEmpresariales empr = new EventosEmpresariales();
        empr.setNombre(txtNombre.getText());
        empr.setRuc(txtRuc.getText());
        empr.setTelefono(txtTelefono.getText());
        empr.setCorreo(txtCorreo.getText());
        empr.setDireccion(txtDirrecion.getText());
        empr.setTipoEvento(cboxTipoEvento.getSelectedItem().toString());
        empr.setFechaEvento(txtFecha.getText());
        empr.setHoraEvento(txtHora.getText());
        empr.setPaquete(cboxPaquete.getSelectedItem().toString());
        empr.setTipoPago(botones);

        try {
            if (!txtNombre.getText().isEmpty()) {
                if (!txtRuc.getText().isEmpty()) {
                    if (!txtTelefono.getText().isEmpty()) {
                        if (!txtCorreo.getText().isEmpty()) {
                            if (!txtDirrecion.getText().isEmpty()) {
                                if (cboxTipoEvento.getSelectedIndex() != 0) {
                                    if (!txtFecha.getText().isEmpty()) {
                                        if (!txtHora.getText().isEmpty()) {
                                            if (cboxPaquete.getSelectedIndex() != 0) {
                                                if (radioDinners.isSelected() || radioMaster.isSelected() || radioPaypal.isSelected() || radioVisa.isSelected() || radioWester.isSelected()) {
                                                    JOptionPane.showMessageDialog(this, "DATO INGRESADOS CORRECTAMENTE", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                                                    empresa.InsertarEventoM(empr);
                                                    m.limpiarDatos();
                                                    m.listarTabla();
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
                    JOptionPane.showMessageDialog(this, "Ingrese el R.U.C de 13 digitos", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
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
                + "                  SE OFRECE PARA 70 INVITADOS:\n"
                + "-> Banquete personalizado.\n"
                + "-> Tarima para presentaciones + proyector.\n"
                + "-> 100 Copas, platos y cubiertos.\n"
                + "-> Fotografia y Video profesional.\n"
                + "-> 60 en personal de meseros y cantinero.\n"
                + "-> 40 Arreglos florales (diferentes diseños).\n"
                + "-> 40 Mesas, 80 Sillas y 120 manteles para sillas y mesas.\n"
                + "-> Iluminaria personalizada.\n"
                + "-> Personal de limpieza.", "INFORMATION MESSAGE", 1);
    }//GEN-LAST:event_btn5000ActionPerformed

    private void btn15000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn15000ActionPerformed
        JOptionPane.showMessageDialog(null, "                        °°°PAQUETE DE $ 15.000°°°\n"
                + "                  SE OFRECE PARA 200 INVITADOS:\n"
                + "-> Banquete personalizado.\n"
                + "-> Tarima para presentaciones + proyector.\n"
                + "-> 250 Copas, platos y cubiertos.\n"
                + "-> Fotografia y Video profesional.\n"
                + "-> 150 en personal de meseros y cantinero.\n"
                + "-> 120 Arreglos florales (diferentes diseños).\n"
                + "-> 120 Mesas, 240 Sillas y 360 manteles para sillas y mesas.\n"
                + "-> Iluminaria personalizada.\n"
                + "-> Personal de limpieza.", "INFORMATION MESSAGE", 1);
    }//GEN-LAST:event_btn15000ActionPerformed

    private void btn20000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20000ActionPerformed

        JOptionPane.showMessageDialog(null, "                        °°°PAQUETE DE $ 20.000°°°\n"
                + "                  SE OFRECE PARA 300 INVITADOS:\n"
                + "-> Banquete personalizado.\n"
                + "-> Tarima para presentaciones + proyector.\n"
                + "-> 350 Copas, platos y cubiertos.\n"
                + "-> Fotografia y Video profesional.\n"
                + "-> 200 en personal de meseros y cantinero.\n"
                + "-> 190 Arreglos florales (diferentes diseños).\n"
                + "-> 190 Mesas, 380 Sillas y 570 manteles para sillas y mesas.\n"
                + "-> Iluminaria personalizada.\n"
                + "-> Personal de limpieza.", "INFORMATION MESSAGE", 1);
    }//GEN-LAST:event_btn20000ActionPerformed

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

    private void txtRucKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRucKeyTyped
        // evento para solo ingresar numero
        Character c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtRucKeyTyped

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn15000;
    private javax.swing.JButton btn20000;
    private javax.swing.JButton btn5000;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cboxPaquete;
    private javax.swing.JComboBox<String> cboxTipoEvento;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBoton;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDecoracion;
    private javax.swing.JLabel lblDinners;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblMaster;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPaquete;
    private javax.swing.JLabel lblPaypal;
    private javax.swing.JLabel lblRuc;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTipoEvento;
    private javax.swing.JLabel lblTipoPago;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVisa;
    private javax.swing.JLabel lblWester;
    private javax.swing.JRadioButton radioDinners;
    private javax.swing.ButtonGroup radioGrupo;
    private javax.swing.JRadioButton radioMaster;
    private javax.swing.JRadioButton radioPaypal;
    private javax.swing.JRadioButton radioVisa;
    private javax.swing.JRadioButton radioWester;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDirrecion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRuc;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}

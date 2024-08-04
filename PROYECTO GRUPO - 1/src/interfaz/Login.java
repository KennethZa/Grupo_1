package interfaz;

import conexion_BD.LoginBD;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


/**
 *
 * 
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblClave = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuario.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        lblUsuario.setText("Usuario:");
        jPanel1.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 110, 20));

        lblClave.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        lblClave.setText("Contraseña:");
        jPanel1.add(lblClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 120, 20));

        txtpass.setText("jPasswordField1");
        txtpass.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtpassMouseClicked(evt);
            }
        });
        txtpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpassKeyPressed(evt);
            }
        });
        jPanel1.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 150, 20));

        txtUsuario.setForeground(new java.awt.Color(153, 153, 153));
        txtUsuario.setText("Ingrese su usuario");
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 150, -1));

        btnIngresar.setBackground(new java.awt.Color(255, 204, 204));
        btnIngresar.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/USUARIO.png"))); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarMouseClicked(evt);
            }
        });
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 130, 30));

        lblTitulo.setFont(new java.awt.Font("Papyrus", 1, 12)); // NOI18N
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/LOGO2.png"))); // NOI18N
        lblTitulo.setText("GRUPO_G");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 130, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 70, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/x.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 30, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondooo.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 270));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   

    private void btnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseClicked

        LoginBD login = new LoginBD();
        if (login.Login(txtUsuario.getText(), txtpass.getText()) == 1) {
            principal.setVisible(true);    
            
        }
        this.setVisible(false); 
    }//GEN-LAST:event_btnIngresarMouseClicked
  
    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
        if (txtUsuario.getText().equals("Ingrese su usuario")) {
            txtUsuario.setText("");
            txtUsuario.setForeground(Color.black);
        }
        if (txtpass.getText().isEmpty()) {
            txtpass.setText("Ingrese contraseña");
            txtpass.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtUsuarioMousePressed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            txtpass.requestFocus();
        }
    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void txtpassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassKeyPressed
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {

            if(!txtpass.getText().trim().equals("")){
                btnIngresar.requestFocus();
                btnIngresar.doClick();
            }else{
                JOptionPane.showMessageDialog(null, "Campos obligatorios");
                txtpass.requestFocus();
            }

        }
    }//GEN-LAST:event_txtpassKeyPressed

    private void txtpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpassMouseClicked
        this.txtpass.setText("");
        if (txtpass.getText().equals("Ingrese contraseña")) {
            txtpass.setText("");
            txtpass.setForeground(Color.black);
        }
        if (txtUsuario.getText().isEmpty()) {
            txtUsuario.setText("Ingrese su usuario");
            txtUsuario.setForeground(Color.gray);
        }
        
    }//GEN-LAST:event_txtpassMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                l.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblClave;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JPasswordField txtpass;
    // End of variables declaration//GEN-END:variables
public static Login l = new Login();
    public static JfrmPaginaPrincipal principal = new JfrmPaginaPrincipal();
}

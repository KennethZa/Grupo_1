package interfaz;

import static interfaz.Login.l;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JDesktopPane;

/**
 *
 * @author miche
 */
public class JfrmPaginaPrincipal extends javax.swing.JFrame {

    private JDesktopPane escritorio;

    public JfrmPaginaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        escritorio = new JDesktopPane();
        this.setContentPane(escritorio);
        escritorio.add(this.bg);
        setIconImage(getIconImge());

    }

    public Image getIconImge() {

        Image retVaule = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagen/logo_inicio.png"));

        return retVaule;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabelLetraEventos = new javax.swing.JLabel();
        jLabelLetraBds = new javax.swing.JLabel();
        jLabelImgEventos = new javax.swing.JLabel();
        bg2 = new javax.swing.JPanel();
        jLabelLogoRedes = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelLogoCarrito = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuServicios = new javax.swing.JMenu();
        jMenuRegistro = new javax.swing.JMenu();
        jMenuItemPrivado = new javax.swing.JMenuItem();
        jMenuItemCasual = new javax.swing.JMenuItem();
        jMenuItemPublicos = new javax.swing.JMenuItem();
        jMenuItemEmpresarial = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemRegistroPrivado = new javax.swing.JMenuItem();
        jMenuItemRegistroCasual = new javax.swing.JMenuItem();
        jMenuItemRegistroPublico = new javax.swing.JMenuItem();
        jMenuItemRegistroEmpresa = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GRUPO - G");
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(186, 239, 198));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Papyrus", 0, 48)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Disfruta ");
        bg.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 260, 200, 50));

        jLabel17.setFont(new java.awt.Font("Papyrus", 0, 48)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("de una ");
        bg.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 300, -1, 50));

        jLabel18.setFont(new java.awt.Font("Papyrus", 0, 48)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("gran experiencia");
        bg.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 330, -1, 50));

        jLabelLetraEventos.setBackground(new java.awt.Color(153, 204, 255));
        jLabelLetraEventos.setFont(new java.awt.Font("Harrington", 0, 70)); // NOI18N
        jLabelLetraEventos.setForeground(new java.awt.Color(127, 139, 75));
        jLabelLetraEventos.setText("Eventos Sociales ");
        bg.add(jLabelLetraEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 70));

        jLabelLetraBds.setFont(new java.awt.Font("Script MT Bold", 0, 80)); // NOI18N
        jLabelLetraBds.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLetraBds.setText("Bienvenidos ");
        bg.add(jLabelLetraBds, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 530, 400, 90));

        jLabelImgEventos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/portada.jpg"))); // NOI18N
        jLabelImgEventos.setText("jLabel3");
        bg.add(jLabelImgEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1000, 540));

        bg2.setBackground(new java.awt.Color(0, 51, 51));
        bg2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogoRedes.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        jLabelLogoRedes.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLogoRedes.setText("Contactanos");
        bg2.add(jLabelLogoRedes, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 120, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/face.png"))); // NOI18N
        bg2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 40, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/instagram.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        bg2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 30, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/youtube.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        bg2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 40, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/twt.png"))); // NOI18N
        bg2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 40, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/ws.png"))); // NOI18N
        bg2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/telegram.png"))); // NOI18N
        bg2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/numero 1.png"))); // NOI18N
        bg2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, -20, 60, 90));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/o.png"))); // NOI18N
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        bg2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 40, 50));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/p.png"))); // NOI18N
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        bg2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 40, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/u.png"))); // NOI18N
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        bg2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/r.png"))); // NOI18N
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        bg2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 40, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/g.png"))); // NOI18N
        bg2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 50, 50));

        jLabelLogoCarrito.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        jLabelLogoCarrito.setForeground(new java.awt.Color(51, 51, 51));
        jLabelLogoCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/calendario.png"))); // NOI18N
        bg2.add(jLabelLogoCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 40, 40));

        bg.add(bg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 1000, 50));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/flor.png"))); // NOI18N
        bg.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/flor.png"))); // NOI18N
        bg.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 0, 0));
        jLabel19.setText("X");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        bg.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 30, 40));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondoV.jpg"))); // NOI18N
        jLabel15.setText("jLabel15");
        bg.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 70));

        jMenuBar1.setBackground(new java.awt.Color(120, 183, 183));
        jMenuBar1.setBorder(null);

        jMenuServicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/servicios.png"))); // NOI18N
        jMenuServicios.setText("SERVICIOS");

        jMenuRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/e.png"))); // NOI18N
        jMenuRegistro.setText("Eventos");

        jMenuItemPrivado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/privados.png"))); // NOI18N
        jMenuItemPrivado.setText("Privados");
        jMenuItemPrivado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPrivadoActionPerformed(evt);
            }
        });
        jMenuRegistro.add(jMenuItemPrivado);

        jMenuItemCasual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/casual icono.jpg"))); // NOI18N
        jMenuItemCasual.setText("Casual ");
        jMenuItemCasual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCasualActionPerformed(evt);
            }
        });
        jMenuRegistro.add(jMenuItemCasual);

        jMenuItemPublicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/grupo.png"))); // NOI18N
        jMenuItemPublicos.setText("Público");
        jMenuItemPublicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPublicosActionPerformed(evt);
            }
        });
        jMenuRegistro.add(jMenuItemPublicos);

        jMenuItemEmpresarial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/re.png"))); // NOI18N
        jMenuItemEmpresarial.setText("Empresiaral");
        jMenuItemEmpresarial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEmpresarialActionPerformed(evt);
            }
        });
        jMenuRegistro.add(jMenuItemEmpresarial);

        jMenuServicios.add(jMenuRegistro);

        jMenuBar1.add(jMenuServicios);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/registro.png"))); // NOI18N
        jMenu1.setText("REGISTROS");

        jMenuItemRegistroPrivado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/hh.png"))); // NOI18N
        jMenuItemRegistroPrivado.setText("Eventos Privados");
        jMenuItemRegistroPrivado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegistroPrivadoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemRegistroPrivado);

        jMenuItemRegistroCasual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/hh.png"))); // NOI18N
        jMenuItemRegistroCasual.setText("Eventos Casual");
        jMenuItemRegistroCasual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegistroCasualActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemRegistroCasual);

        jMenuItemRegistroPublico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/hh.png"))); // NOI18N
        jMenuItemRegistroPublico.setText("Eventos Publicos");
        jMenuItemRegistroPublico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegistroPublicoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemRegistroPublico);

        jMenuItemRegistroEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/hh.png"))); // NOI18N
        jMenuItemRegistroEmpresa.setText("Eventos Empresariales");
        jMenuItemRegistroEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegistroEmpresaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemRegistroEmpresa);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 995, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemPrivadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPrivadoActionPerformed
        IfrmEventosPrivados eventosPrivados = new IfrmEventosPrivados();
        escritorio.add(eventosPrivados);
        eventosPrivados.setVisible(true);
    }//GEN-LAST:event_jMenuItemPrivadoActionPerformed

    private void jMenuItemEmpresarialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEmpresarialActionPerformed
        IfrmEventosEmpresariales eventosEmpresarial = new IfrmEventosEmpresariales();
        escritorio.add(eventosEmpresarial);
        eventosEmpresarial.setVisible(true);

    }//GEN-LAST:event_jMenuItemEmpresarialActionPerformed

private void jMenuItemPublicoActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        IfrmEventosEmpresariales eventosEmpresarial = new IfrmEventosEmpresariales();
        escritorio.add(eventosEmpresarial);
        eventosEmpresarial.setVisible(true);

    }                                           
    
    private void jMenuItemRegistroPrivadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegistroPrivadoActionPerformed
        IfrmRegistroPrivados registosPrivados = new IfrmRegistroPrivados();
        escritorio.add(registosPrivados);
        registosPrivados.setVisible(true);
    }//GEN-LAST:event_jMenuItemRegistroPrivadoActionPerformed

    private void jMenuItemRegistroEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegistroEmpresaActionPerformed
        IfrmRegistroEmpresiariales registosEmpresa = new IfrmRegistroEmpresiariales();
        escritorio.add(registosEmpresa);
        registosEmpresa.setVisible(true);
    }//GEN-LAST:event_jMenuItemRegistroEmpresaActionPerformed

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jMenuItemPublicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPublicosActionPerformed
       IfrmEventosPublicos eventosPublico = new IfrmEventosPublicos();
        escritorio.add(eventosPublico);
        eventosPublico.setVisible(true);     
    }//GEN-LAST:event_jMenuItemPublicosActionPerformed

    private void jMenuItemRegistroPublicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegistroPublicoActionPerformed
        IfrmRegistroPublicos registosPublico = new IfrmRegistroPublicos();
        escritorio.add(registosPublico);
        registosPublico.setVisible(true);
    }//GEN-LAST:event_jMenuItemRegistroPublicoActionPerformed

    private void jMenuItemCasualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCasualActionPerformed
        IfrmEventosCasuales eventosCasual = new IfrmEventosCasuales();
        escritorio.add(eventosCasual);
        eventosCasual.setVisible(true);     
    }//GEN-LAST:event_jMenuItemCasualActionPerformed

    private void jMenuItemRegistroCasualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegistroCasualActionPerformed
       IfrmRegistroCasual registosCasual = new IfrmRegistroCasual();
        escritorio.add(registosCasual);
        registosCasual.setVisible(true);
    }//GEN-LAST:event_jMenuItemRegistroCasualActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bg2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelImgEventos;
    private javax.swing.JLabel jLabelLetraBds;
    private javax.swing.JLabel jLabelLetraEventos;
    private javax.swing.JLabel jLabelLogoCarrito;
    private javax.swing.JLabel jLabelLogoRedes;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemCasual;
    private javax.swing.JMenuItem jMenuItemEmpresarial;
    private javax.swing.JMenuItem jMenuItemPrivado;
    private javax.swing.JMenuItem jMenuItemPublicos;
    private javax.swing.JMenuItem jMenuItemRegistroCasual;
    private javax.swing.JMenuItem jMenuItemRegistroEmpresa;
    private javax.swing.JMenuItem jMenuItemRegistroPrivado;
    private javax.swing.JMenuItem jMenuItemRegistroPublico;
    private javax.swing.JMenu jMenuRegistro;
    private javax.swing.JMenu jMenuServicios;
    // End of variables declaration//GEN-END:variables
}

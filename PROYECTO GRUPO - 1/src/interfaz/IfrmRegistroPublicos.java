package interfaz;

import clases.EventoPublico;
import static conexion_BD.DataBaseConnect.getConnection;
import conexion_BD.EventoPublicoBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author miche
 */
public class IfrmRegistroPublicos extends javax.swing.JInternalFrame {
    Connection cn = getConnection();
    PreparedStatement ps = null;
    Statement st = null;
    ResultSet rs = null; 

    ArrayList<EventoPublico> publi;
    EventoPublicoBD evtpub = new EventoPublicoBD();
    int contador = 0;

    public IfrmRegistroPublicos() {
        initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        limpiarDatos();
        listarTabla();

    }

    public void listarTabla() {
        publi = evtpub.ListEventoPublico(); 
        DefaultTableModel modelo = (DefaultTableModel) TblPublico.getModel();
        for (EventoPublico ep : publi) {
            modelo.addRow(new Object[]{ep.getId(),ep.getNombre(), ep.getCedula(), ep.getTelefono(), ep.getCorreo(), ep.getDireccion(), ep.getTipoEvento(), ep.getFechaEvento(), ep.getHoraEvento(), ep.getPaquete(), ep.getTipoPago()});

        }
    }

    public void limpiarDatos() {
        DefaultTableModel modelo = (DefaultTableModel) TblPublico.getModel();
        for (contador = TblPublico.getRowCount() - 1; contador >= 0; contador--) {
            modelo.removeRow(contador);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        txtBuscarNombre = new javax.swing.JTextField();
        txtBuscarTipoPago = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblPublico = new javax.swing.JTable();
        BtnActualizar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(863, 528));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Berlin Sans FB", 0, 48)); // NOI18N
        lblTitulo.setText("EVENTOS PUBLICOS");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 440, 60));

        btnEliminar.setBackground(new java.awt.Color(204, 153, 255));
        btnEliminar.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, -1, 30));

        txtBuscar.setToolTipText("");
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 160, 30));

        txtBuscarNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarNombreKeyPressed(evt);
            }
        });
        jPanel1.add(txtBuscarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 160, 30));

        txtBuscarTipoPago.setToolTipText("");
        txtBuscarTipoPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarTipoPagoKeyPressed(evt);
            }
        });
        jPanel1.add(txtBuscarTipoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 400, 160, 30));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        TblPublico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "CEDULA", "TELEFONO", "CORREO", "DIRECCION", "TIPO_EVENTO", "FECHA", "HORA", "PAQUETE", "TIPO_PAGO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TblPublico);
        if (TblPublico.getColumnModel().getColumnCount() > 0) {
            TblPublico.getColumnModel().getColumn(0).setMinWidth(0);
            TblPublico.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 820, 300));

        BtnActualizar.setBackground(new java.awt.Color(204, 153, 255));
        BtnActualizar.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        BtnActualizar.setText("Actualizar");
        BtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, 110, -1));

        btnRegresar.setBackground(new java.awt.Color(255, 153, 0));
        btnRegresar.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 110, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/lupa.png"))); // NOI18N
        jLabel2.setText(" Buscar por nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 180, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/lupa.png"))); // NOI18N
        jLabel1.setText("Buscar por cedula:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 220, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/lupa.png"))); // NOI18N
        jLabel3.setText("Buscar por Tipo de pago:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 180, 30));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondopink.jpg"))); // NOI18N
        lblFondo.setText("jLabel1");
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 490));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // Metodo para eliminar datos de la base de datos 
         DefaultTableModel modelo = (DefaultTableModel) TblPublico.getModel();
        try{
           //conexion que nos permite ingresar a la base se datos 
           Connection conect = getConnection();
           int fila = TblPublico.getSelectedRow();
           String nombre = TblPublico.getValueAt(fila, 0).toString();
           //se indica en la base de datos el metodo para eliminar datos
           ps = conect.prepareStatement("  DELETE FROM EVENTO_PUBLICO WHERE NOMBRE=?");
           ps.setString(1, nombre);
           ps.execute();
           //remueve la fila
           modelo.removeRow(fila);
           //mensaje para confirmar el proceso
           JOptionPane.showMessageDialog(this,"DATO ELIMINADO CORRECTAMENTE", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
          
        }catch(SQLException ex){
             System.out.println("ERROR AL ELIMINAR LOS DATOS : " + ex.getMessage());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // cierra ventana
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        // En el textfield de buscar hacemos el metodo para buscar cada dato ingresado en la base de datos 
        DefaultTableModel modelo = (DefaultTableModel) TblPublico.getModel();
        String[] titulos = {"NOMBRE","CEDULA","TELEFONO","CORREO","DIRECCION","TIPO_EVENTO","FECHA","HORA","PAQUETE","TIPO_PAGO"};
        String[] registros = new String[200];
        //indicamos la base de datos 
        String sql = "SELECT * FROM EVENTO_PUBLICO WHERE CEDULA LIKE '%" + txtBuscar.getText() + "%' ";
        modelo = new DefaultTableModel(null, titulos);
        //conectamos
        Connection conect = getConnection();
        try
        {
            st = (Statement) conect.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next())
            {
                registros[0] = rs.getString("NOMBRE");
                registros[1] = rs.getString("CEDULA");
                registros[2] = rs.getString("TELEFONO");
                registros[3] = rs.getString("CORREO");
                registros[4] = rs.getString("DIRECCION");
                registros[5] = rs.getString("TIPO_EVENTO");
                registros[6] = rs.getString("FECHA");
                registros[7] = rs.getString("HORA");
                registros[8] = rs.getString("PAQUETE");
                registros[9] = rs.getString("TIPO_PAGO");
                modelo.addRow(registros);
            }
            //carga en la tabla
            TblPublico.setModel(modelo);
        } catch (SQLException ex)
        {
            System.out.println("ERROR AL BUSCAR LOS DATOS : " + ex.getMessage());
        }

    }//GEN-LAST:event_txtBuscarKeyPressed

    private void txtBuscarNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarNombreKeyPressed
        DefaultTableModel modelo = (DefaultTableModel) TblPublico.getModel();
        String[] titulos = {"NOMBRE","CEDULA","TELEFONO","CORREO","DIRECCION","TIPO_EVENTO","FECHA","HORA","PAQUETE","TIPO_PAGO"};
        String[] registros = new String[200];
        //indicamos la base de datos
        String sql = "SELECT * FROM EVENTO_PUBLICO WHERE NOMBRE LIKE '%" + txtBuscarNombre.getText() + "%' ";
        modelo = new DefaultTableModel(null, titulos);
        //conectamos
        Connection conect = getConnection();
        try
        {
            st = (Statement) conect.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next())
            {
                registros[0] = rs.getString("NOMBRE");
                registros[1] = rs.getString("CEDULA");
                registros[2] = rs.getString("TELEFONO");
                registros[3] = rs.getString("CORREO");
                registros[4] = rs.getString("DIRECCION");
                registros[5] = rs.getString("TIPO_EVENTO");
                registros[6] = rs.getString("FECHA");
                registros[7] = rs.getString("HORA");
                registros[8] = rs.getString("PAQUETE");
                registros[9] = rs.getString("TIPO_PAGO");
                modelo.addRow(registros);
            }
            //carga en la tabla
            TblPublico.setModel(modelo);
        } catch (SQLException ex)
        {
            System.out.println("ERROR AL BUSCAR LOS DATOS : " + ex.getMessage());
        }
    }//GEN-LAST:event_txtBuscarNombreKeyPressed

    private void BtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarActionPerformed
        int fila = TblPublico.getSelectedRow();
        EventoPublico ep = new EventoPublico();
        ep.setId(TblPublico.getValueAt(fila, 0).toString());
        ep.setNombre(TblPublico.getValueAt(fila, 1).toString());
        ep.setCedula(TblPublico.getValueAt(fila, 2).toString());
        ep.setTelefono(TblPublico.getValueAt(fila, 3).toString());
        ep.setCorreo(TblPublico.getValueAt(fila, 4).toString());
        ep.setDireccion(TblPublico.getValueAt(fila, 5).toString());
        ep.setTipoEvento(TblPublico.getValueAt(fila, 6).toString());
        ep.setFechaEvento(TblPublico.getValueAt(fila, 7).toString());
        ep.setHoraEvento(TblPublico.getValueAt(fila, 8).toString());
        ep.setPaquete(TblPublico.getValueAt(fila, 9).toString());
        ep.setTipoPago(TblPublico.getValueAt(fila, 10).toString());
        
        evtpub.ModificarEventoT(ep);
    }//GEN-LAST:event_BtnActualizarActionPerformed

    private void txtBuscarTipoPagoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarTipoPagoKeyPressed
        DefaultTableModel modelo = (DefaultTableModel) TblPublico.getModel();
        String[] titulos = {"NOMBRE","CEDULA","TELEFONO","CORREO","DIRECCION","TIPO_EVENTO","FECHA","HORA","PAQUETE","TIPO_PAGO"};
        String[] registros = new String[200];
        //indicamos la base de datos
        String sql = "SELECT * FROM EVENTO_PUBLICO WHERE TIPO_PAGO LIKE '%" + txtBuscarTipoPago.getText() + "%' ";
        modelo = new DefaultTableModel(null, titulos);
        //conectamos
        Connection conect = getConnection();
        try
        {
            st = (Statement) conect.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next())
            {
                registros[0] = rs.getString("NOMBRE");
                registros[1] = rs.getString("CEDULA");
                registros[2] = rs.getString("TELEFONO");
                registros[3] = rs.getString("CORREO");
                registros[4] = rs.getString("DIRECCION");
                registros[5] = rs.getString("TIPO_EVENTO");
                registros[6] = rs.getString("FECHA");
                registros[7] = rs.getString("HORA");
                registros[8] = rs.getString("PAQUETE");
                registros[9] = rs.getString("TIPO_PAGO");
                modelo.addRow(registros);
            }
            //carga en la tabla
            TblPublico.setModel(modelo);
        } catch (SQLException ex)
        {
            System.out.println("ERROR AL BUSCAR LOS DATOS : " + ex.getMessage());
        }
    }//GEN-LAST:event_txtBuscarTipoPagoKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizar;
    private javax.swing.JTable TblPublico;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtBuscarNombre;
    private javax.swing.JTextField txtBuscarTipoPago;
    // End of variables declaration//GEN-END:variables
}

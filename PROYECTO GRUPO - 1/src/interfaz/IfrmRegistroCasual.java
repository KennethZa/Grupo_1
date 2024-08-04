package interfaz;

import clases.EventoCasual;
import static conexion_BD.DataBaseConnect.getConnection;
import conexion_BD.EventoCasualBD;
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
public class IfrmRegistroCasual extends javax.swing.JInternalFrame {
    Connection cn = getConnection();
    PreparedStatement ps = null;
    Statement st = null;
    ResultSet rs = null; 

    ArrayList<EventoCasual> casul;
    EventoCasualBD evcd = new EventoCasualBD();
    int contador = 0;

    public IfrmRegistroCasual() {
        initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        limpiarDatos();
        listarTabla();

    }

    public void listarTabla() {
        casul = evcd.ListEventoCasual(); 
        DefaultTableModel modelo = (DefaultTableModel) TblCasual.getModel();
        for (EventoCasual ep : casul) {
            modelo.addRow(new Object[]{ep.getId(),ep.getNombre(), ep.getCedula(), ep.getTelefono(), ep.getCorreo(), ep.getDireccion(), ep.getTipoEvento(), ep.getFechaEvento(), ep.getHoraEvento(), ep.getPaquete(), ep.getTipoPago()});

        }
    }

    public void limpiarDatos() {
        DefaultTableModel modelo = (DefaultTableModel) TblCasual.getModel();
        for (contador = TblCasual.getRowCount() - 1; contador >= 0; contador--) {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        TblCasual = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();
        BtnActualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBuscarFecha = new javax.swing.JTextField();
        txtBuscarEventos = new javax.swing.JTextField();
        lblFondo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(863, 528));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Berlin Sans FB", 0, 48)); // NOI18N
        lblTitulo.setText("EVENTOS CASUALES");
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
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 120, 30));

        txtBuscar.setToolTipText("");
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 140, 30));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        TblCasual.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TblCasual);
        if (TblCasual.getColumnModel().getColumnCount() > 0) {
            TblCasual.getColumnModel().getColumn(0).setMinWidth(0);
            TblCasual.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 820, 310));

        btnRegresar.setBackground(new java.awt.Color(255, 153, 0));
        btnRegresar.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 120, 30));

        BtnActualizar.setBackground(new java.awt.Color(204, 204, 204));
        BtnActualizar.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        BtnActualizar.setText("Actualizar");
        BtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, 120, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/lupa.png"))); // NOI18N
        jLabel1.setText("Buscar por cedula:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 160, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/lupa.png"))); // NOI18N
        jLabel2.setText(" Buscar por Fecha:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 170, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/lupa.png"))); // NOI18N
        jLabel3.setText(" Buscar por eventos:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 170, 30));

        txtBuscarFecha.setToolTipText("");
        txtBuscarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarFechaActionPerformed(evt);
            }
        });
        txtBuscarFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarFechaKeyPressed(evt);
            }
        });
        jPanel1.add(txtBuscarFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 140, 30));

        txtBuscarEventos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarEventosKeyPressed(evt);
            }
        });
        jPanel1.add(txtBuscarEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 140, 30));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondopink.jpg"))); // NOI18N
        lblFondo.setText("jLabel1");
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 490));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // Metodo para eliminar datos de la base de datos 
         DefaultTableModel modelo = (DefaultTableModel) TblCasual.getModel();
        try{
           //conexion que nos permite ingresar a la base se datos 
           Connection conect = getConnection();
           int fila = TblCasual.getSelectedRow();
           String nombre = TblCasual.getValueAt(fila, 0).toString();
           //se indica en la base de datos el metodo para eliminar datos
           ps = conect.prepareStatement("  DELETE FROM EVENTO_CASUAL WHERE NOMBRE=?");
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
        DefaultTableModel modelo = (DefaultTableModel) TblCasual.getModel();
        String[] titulos = {"NOMBRE","CEDULA","TELEFONO","CORREO","DIRECCION","TIPO_EVENTO","FECHA","HORA","PAQUETE","TIPO_PAGO"};
        String[] registros = new String[200];
        //indicamos la base de datos 
        String sql = "SELECT * FROM EVENTO_CASUAL WHERE CEDULA LIKE '%" + txtBuscar.getText() + "%' ";
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
            TblCasual.setModel(modelo);
        } catch (SQLException ex)
        {
            System.out.println("ERROR AL BUSCAR LOS DATOS : " + ex.getMessage());
        }

    }//GEN-LAST:event_txtBuscarKeyPressed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtBuscarEventosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarEventosKeyPressed
        DefaultTableModel modelo = (DefaultTableModel) TblCasual.getModel();
        String[] titulos = {"NOMBRE","CEDULA","TELEFONO","CORREO","DIRECCION","TIPO_EVENTO","FECHA","HORA","PAQUETE","TIPO_PAGO"};
        String[] registros = new String[200];
        //indicamos la base de datos 
        String sql = "SELECT * FROM EVENTO_CASUAL WHERE TIPO_EVENTO LIKE '%" + txtBuscarEventos.getText() + "%' ";
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
            TblCasual.setModel(modelo);
        } catch (SQLException ex)
        {
            System.out.println("ERROR AL BUSCAR LOS DATOS : " + ex.getMessage());
        }

    }//GEN-LAST:event_txtBuscarEventosKeyPressed

    private void BtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarActionPerformed
       int fila = TblCasual.getSelectedRow();
        EventoCasual ec = new EventoCasual();
        ec.setId(TblCasual.getValueAt(fila, 0).toString());
        ec.setNombre(TblCasual.getValueAt(fila, 1).toString());
        ec.setCedula(TblCasual.getValueAt(fila, 2).toString());
        ec.setTelefono(TblCasual.getValueAt(fila, 3).toString());
        ec.setCorreo(TblCasual.getValueAt(fila, 4).toString());
        ec.setDireccion(TblCasual.getValueAt(fila, 5).toString());
        ec.setTipoEvento(TblCasual.getValueAt(fila, 6).toString());
        ec.setFechaEvento(TblCasual.getValueAt(fila, 7).toString());
        ec.setHoraEvento(TblCasual.getValueAt(fila, 8).toString());
        ec.setPaquete(TblCasual.getValueAt(fila, 9).toString());
        ec.setTipoPago(TblCasual.getValueAt(fila, 10).toString());
        
        evcd.ModificarEventoD(ec);
    }//GEN-LAST:event_BtnActualizarActionPerformed

    private void txtBuscarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarFechaActionPerformed

    private void txtBuscarFechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarFechaKeyPressed
        DefaultTableModel modelo = (DefaultTableModel) TblCasual.getModel();
        String[] titulos = {"NOMBRE","CEDULA","TELEFONO","CORREO","DIRECCION","TIPO_EVENTO","FECHA","HORA","PAQUETE","TIPO_PAGO"};
        String[] registros = new String[200];
        //indicamos la base de datos 
        String sql = "SELECT * FROM EVENTO_CASUAL WHERE FECHA LIKE '%" + txtBuscarFecha.getText() + "%' ";
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
            TblCasual.setModel(modelo);
        } catch (SQLException ex)
        {
            System.out.println("ERROR AL BUSCAR LOS DATOS : " + ex.getMessage());
        }

    }//GEN-LAST:event_txtBuscarFechaKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizar;
    private javax.swing.JTable TblCasual;
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
    private javax.swing.JTextField txtBuscarEventos;
    private javax.swing.JTextField txtBuscarFecha;
    // End of variables declaration//GEN-END:variables
}

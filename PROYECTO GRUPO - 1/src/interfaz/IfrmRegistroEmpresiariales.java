package interfaz;

import clases.EventosEmpresariales;
import static conexion_BD.DataBaseConnect.getConnection;
import conexion_BD.EventoEmpresarialBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author miche
 */
public class IfrmRegistroEmpresiariales extends javax.swing.JInternalFrame {
    //intaciamos la conexion que nos permite conectar la base de datos
    Connection cn = getConnection();
    PreparedStatement ps = null;
    Statement st = null;
    ResultSet rs = null; 
    //lista de la clase plana
    ArrayList<EventosEmpresariales> empr;
    //instanciamos a la clase que tiene los metodos para la base de datos 
    EventoEmpresarialBD empresa = new EventoEmpresarialBD();
    int contador = 0;

    
    public IfrmRegistroEmpresiariales() {
        initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        limpiarDatos();
        listarTabla();

    }

//metodo para mostrar los datos de la base de datos y los ingresados recientemente
    public void listarTabla() {
        
        empr = empresa.ListEventoEmpresarial();
        DefaultTableModel modelo = (DefaultTableModel) tblEmpresa.getModel();
        for (EventosEmpresariales ep : empr) {
            modelo.addRow(new Object[]{ep.getId(),ep.getNombre(), ep.getRuc(), ep.getTelefono(), ep.getCorreo(), ep.getDireccion(), ep.getTipoEvento(), ep.getFechaEvento(), ep.getHoraEvento(), ep.getPaquete(), ep.getTipoPago()});

        }
    }

    public void limpiarDatos() {
        //Limpia los datos para no repetir cada vez que ingresamos nuevos datos
        DefaultTableModel modelo = (DefaultTableModel) tblEmpresa.getModel();
        for (contador = tblEmpresa.getRowCount() - 1; contador >= 0; contador--) {
            modelo.removeRow(contador);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpresa = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        txtBuscarTipoPago = new javax.swing.JTextField();
        txtBuscarDireccion = new javax.swing.JTextField();
        BtnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(863, 528));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Berlin Sans FB", 0, 48)); // NOI18N
        lblTitulo.setText("EVENTOS EMPRESARIAL");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 530, 60));

        tblEmpresa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "RUC", "TELEFONO", "CORREO", "DIRECCION", "TIPO EVENTO", "FECHA", "HORA", "PAQUETE", "TIPO PAGO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEmpresa);
        if (tblEmpresa.getColumnModel().getColumnCount() > 0) {
            tblEmpresa.getColumnModel().getColumn(0).setMinWidth(0);
            tblEmpresa.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 800, 320));

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
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 140, 30));

        txtBuscarTipoPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarTipoPagoKeyPressed(evt);
            }
        });
        jPanel1.add(txtBuscarTipoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 140, 30));

        txtBuscarDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarDireccionActionPerformed(evt);
            }
        });
        txtBuscarDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarDireccionKeyPressed(evt);
            }
        });
        jPanel1.add(txtBuscarDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 140, 30));

        BtnModificar.setBackground(new java.awt.Color(204, 153, 255));
        BtnModificar.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        BtnModificar.setText("Actualizar");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 60, 110, 30));

        btnEliminar.setBackground(new java.awt.Color(204, 153, 255));
        btnEliminar.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 120, 30));

        btnRegresar.setBackground(new java.awt.Color(255, 153, 0));
        btnRegresar.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 110, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/lupa.png"))); // NOI18N
        jLabel3.setText("Buscar por Dirección:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 160, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/lupa.png"))); // NOI18N
        jLabel2.setText(" Buscar por Tipo de pago:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 210, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/lupa.png"))); // NOI18N
        jLabel1.setText("Buscar por cedula:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 160, 30));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondoraiz.png"))); // NOI18N
        lblFondo.setText("jLabel4");
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // cierra ventana 
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        // En el textfield de buscar hacemos el metodo para buscar cada dato ingresado en la base de datos 
        
        DefaultTableModel modelo = (DefaultTableModel) tblEmpresa.getModel();
        String[] titulos = {"NOMBRE","RUC","TELEFONO","CORREO","DIRECCION","TIPO_EVENTO","FECHA","HORA","PAQUETE","TIPO_PAGO"};
        String[] registros = new String[200];
        //indicamos la base de datos 
        String sql = "SELECT * FROM EVENTO_EMPRESARIAL WHERE RUC LIKE '%" + txtBuscar.getText() + "%' ";
        modelo = new DefaultTableModel(null, titulos);
        // conectamos a la base de datos 
        Connection conect = getConnection();
        try
        {
            st = (Statement) conect.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next())
            {
                registros[0] = rs.getString("NOMBRE");
                registros[1] = rs.getString("RUC");
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
            tblEmpresa.setModel(modelo);
        } catch (SQLException ex)
        {
            System.out.println("ERROR AL BUSCAR LOS DATOS : " + ex.getMessage());
        }

    }//GEN-LAST:event_txtBuscarKeyPressed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // Metodo para eliminar datos de la base de datos 
        DefaultTableModel modelo = (DefaultTableModel) tblEmpresa.getModel();
        try{
           //conexion que nos permite ingresar a la base se datos 
           Connection conect = getConnection();
           int fila = tblEmpresa.getSelectedRow();//seleciona fila
           String nombre = tblEmpresa.getValueAt(fila, 0).toString();
           //se indica en la base de datos el metodo para eliminar datos
           ps = conect.prepareStatement("  DELETE FROM EVENTO_EMPRESARIAL WHERE NOMBRE=?");
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

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtBuscarTipoPagoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarTipoPagoKeyPressed
        DefaultTableModel modelo = (DefaultTableModel) tblEmpresa.getModel();
        String[] titulos = {"NOMBRE","RUC","TELEFONO","CORREO","DIRECCION","TIPO_EVENTO","FECHA","HORA","PAQUETE","TIPO_PAGO"};
        String[] registros = new String[200];
        //indicamos la base de datos 
        String sql = "SELECT * FROM EVENTO_EMPRESARIAL WHERE TIPO_PAGO LIKE '%" + txtBuscarTipoPago.getText() + "%' ";
        modelo = new DefaultTableModel(null, titulos);
        // conectamos a la base de datos 
        Connection conect = getConnection();
        try
        {
            st = (Statement) conect.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next())
            {
                registros[0] = rs.getString("NOMBRE");
                registros[1] = rs.getString("RUC");
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
            tblEmpresa.setModel(modelo);
        } catch (SQLException ex)
        {
            System.out.println("ERROR AL BUSCAR LOS DATOS : " + ex.getMessage());
        }
    }//GEN-LAST:event_txtBuscarTipoPagoKeyPressed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        int fila = tblEmpresa.getSelectedRow();
        EventosEmpresariales ep = new EventosEmpresariales();
        ep.setId(tblEmpresa.getValueAt(fila, 0).toString());
        ep.setNombre(tblEmpresa.getValueAt(fila, 1).toString());
        ep.setRuc(tblEmpresa.getValueAt(fila, 2).toString());
        ep.setTelefono(tblEmpresa.getValueAt(fila, 3).toString());
        ep.setCorreo(tblEmpresa.getValueAt(fila, 4).toString());
        ep.setDireccion(tblEmpresa.getValueAt(fila, 5).toString());
        ep.setTipoEvento(tblEmpresa.getValueAt(fila, 6).toString());
        ep.setFechaEvento(tblEmpresa.getValueAt(fila, 7).toString());
        ep.setHoraEvento(tblEmpresa.getValueAt(fila, 8).toString());
        ep.setPaquete(tblEmpresa.getValueAt(fila, 9).toString());
        ep.setTipoPago(tblEmpresa.getValueAt(fila, 10).toString());
        
        empresa.ModificarEventoM(ep);
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void txtBuscarDireccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarDireccionKeyPressed
        DefaultTableModel modelo = (DefaultTableModel) tblEmpresa.getModel();
        String[] titulos = {"NOMBRE","RUC","TELEFONO","CORREO","DIRECCION","TIPO_EVENTO","FECHA","HORA","PAQUETE","TIPO_PAGO"};
        String[] registros = new String[200];
        //indicamos la base de datos 
        String sql = "SELECT * FROM EVENTO_EMPRESARIAL WHERE DIRECCIONO LIKE '%" + txtBuscarDireccion.getText() + "%' ";
        modelo = new DefaultTableModel(null, titulos);
        // conectamos a la base de datos 
        Connection conect = getConnection();
        try
        {
            st = (Statement) conect.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next())
            {
                registros[0] = rs.getString("NOMBRE");
                registros[1] = rs.getString("RUC");
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
            tblEmpresa.setModel(modelo);
        } catch (SQLException ex)
        {
            System.out.println("ERROR AL BUSCAR LOS DATOS : " + ex.getMessage());
        }
    }//GEN-LAST:event_txtBuscarDireccionKeyPressed

    private void txtBuscarDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarDireccionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblEmpresa;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtBuscarDireccion;
    private javax.swing.JTextField txtBuscarTipoPago;
    // End of variables declaration//GEN-END:variables
}

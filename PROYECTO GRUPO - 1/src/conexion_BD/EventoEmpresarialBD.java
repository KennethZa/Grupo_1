package conexion_BD;

import clases.EventosEmpresariales;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author miche
 */
public class EventoEmpresarialBD {

    public ArrayList<EventosEmpresariales> ListEventoEmpresarial() {
        ArrayList<EventosEmpresariales> eventom = new ArrayList();
        try {
            //conectamos
            Connection cnx = DataBaseConnect.getConnection();
            Statement st = cnx.createStatement();
            //se indica los campos y la tabla para mostrar
            ResultSet rs = st.executeQuery("  SELECT ID, NOMBRE,RUC,TELEFONO,CORREO,DIRECCION,TIPO_EVENTO,FECHA,HORA,PAQUETE,TIPO_PAGO "
                    + "    FROM EVENTO_EMPRESARIAL ORDER BY 1  ");
            while (rs.next()) {
                EventosEmpresariales epre = new EventosEmpresariales();
                epre.setId(rs.getString("ID"));
                epre.setNombre(rs.getString("NOMBRE"));
                epre.setRuc(rs.getString("RUC"));
                epre.setTelefono(rs.getString("TELEFONO"));
                epre.setCorreo(rs.getString("CORREO"));
                epre.setDireccion(rs.getString("DIRECCION"));
                epre.setTipoEvento(rs.getString("TIPO_EVENTO"));
                epre.setFechaEvento(rs.getString("FECHA"));
                epre.setHoraEvento(rs.getString("HORA"));
                epre.setPaquete(rs.getString("PAQUETE"));
                epre.setTipoPago(rs.getString("TIPO_PAGO"));

                eventom.add(epre);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("ERROR LISTA");
        }
        return eventom;
    }

    public void InsertarEventoM(EventosEmpresariales empresa) {

        Integer id_sec= 0;
        try {
            //conectamos
            Connection cnx = DataBaseConnect.getConnection();
            //se obtiene ultimo id
            
            Statement st = cnx.createStatement();
            //se indica los campos y la tabla para mostrar
            ResultSet rs = st.executeQuery("  SELECT MAX(ID) ID from  EVENTO_EMPRESARIAL");
            
            while (rs.next()) {
                id_sec = rs.getInt("ID");
            }
            
            if(id_sec > 0){
                id_sec ++;
            }else{
                id_sec = 1;
            }
            
            //se llama la tabla con sus atributos
            PreparedStatement pst = cnx.prepareStatement("INSERT INTO EVENTO_EMPRESARIAL(ID,NOMBRE,RUC,TELEFONO,CORREO,DIRECCION,TIPO_EVENTO,FECHA,HORA,PAQUETE,TIPO_PAGO)"
                    + "     VALUES(?,?,?,?,?,?,?,?,?,?,?)");
            pst.setInt(1, id_sec);
            pst.setString(2, empresa.getNombre());
            pst.setString(3, empresa.getRuc());
            pst.setString(4, empresa.getTelefono());
            pst.setString(5, empresa.getCorreo());
            pst.setString(6, empresa.getDireccion());
            pst.setString(7, empresa.getTipoEvento());
            pst.setString(8, empresa.getFechaEvento());
            pst.setString(9, empresa.getHoraEvento());
            pst.setString(10, empresa.getPaquete());
            pst.setString(11, empresa.getTipoPago());
            pst.executeQuery();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Ingresar datos");
        }
    }
    public void ModificarEventoM(EventosEmpresariales empresa) {
        Integer exitoso=0;
        try {
            System.out.println(empresa.toString());
            //conectamos
            Connection cnx = DataBaseConnect.getConnection();           
            //se llama la tabla con sus atributos
            PreparedStatement pst = cnx.prepareStatement("UPDATE EVENTO_EMPRESARIAL SET NOMBRE = ?,RUC = ? ,TELEFONO = ? ,CORREO = ? ,DIRECCION = ?,TIPO_EVENTO = ? ,FECHA = ?,HORA = ? ,PAQUETE = ? , TIPO_PAGO = ? WHERE ID = ?");
            pst.setString(1, empresa.getNombre());
            pst.setString(2, empresa.getRuc());
            pst.setString(3, empresa.getTelefono());
            pst.setString(4, empresa.getCorreo());
            pst.setString(5, empresa.getDireccion());
            pst.setString(6, empresa.getTipoEvento());
            pst.setString(7, empresa.getFechaEvento());
            pst.setString(8, empresa.getHoraEvento());
            pst.setString(9, empresa.getPaquete());
            pst.setString(10, empresa.getTipoPago());
            pst.setString(11, empresa.getId());
            exitoso = pst.executeUpdate();
            System.out.println("Registros actualizados: " + exitoso);
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println(ex.getMessage());
            System.out.println("Error en Actualizar datos");
        }
    }
}

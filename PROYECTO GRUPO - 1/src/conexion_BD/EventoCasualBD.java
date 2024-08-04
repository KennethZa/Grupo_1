package conexion_BD;

import clases.EventoCasual;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class EventoCasualBD {
    public ArrayList<EventoCasual> ListEventoCasual(){
        ArrayList<EventoCasual> eventod = new ArrayList();
        try {
            //conectamos
            Connection cnx = DataBaseConnect.getConnection();
            Statement st = cnx.createStatement();
            //se indica los campos y la tabla para mostrar
            ResultSet rs = st.executeQuery("  SELECT ID, NOMBRE,CEDULA,TELEFONO,CORREO,DIRECCION,TIPO_EVENTO,FECHA,HORA,PAQUETE,TIPO_PAGO "
                    + "    FROM EVENTO_CASUAL ORDER BY 1  ");
            while (rs.next()) {
                EventoCasual evtcasual = new EventoCasual();
                evtcasual.setId(rs.getString("ID"));
                evtcasual.setNombre(rs.getString("NOMBRE"));
                evtcasual.setCedula(rs.getString("CEDULA"));
                evtcasual.setTelefono(rs.getString("TELEFONO"));
                evtcasual.setCorreo(rs.getString("CORREO"));
                evtcasual.setDireccion(rs.getString("DIRECCION"));
                evtcasual.setTipoEvento(rs.getString("TIPO_EVENTO"));
                evtcasual.setFechaEvento(rs.getString("FECHA"));
                evtcasual.setHoraEvento(rs.getString("HORA"));
                evtcasual.setPaquete(rs.getString("PAQUETE"));
                evtcasual.setTipoPago(rs.getString("TIPO_PAGO"));
                eventod.add(evtcasual);
            }
             } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("ERROR LISTA");
        }
        return eventod;
}
    public void InsertarEventoD(EventoCasual ec) {
            
        Integer id_sec= 0;
        try {
            //conectamos
            Connection cnx = DataBaseConnect.getConnection();
            //se obtiene ultimo id
            
            Statement st = cnx.createStatement();
            //se indica los campos y la tabla para mostrar
            ResultSet rs = st.executeQuery("  SELECT MAX(ID) ID from  EVENTO_CASUAL");
            
            while (rs.next()) {
                id_sec = rs.getInt("ID");
            }
            
            if(id_sec > 0){
                id_sec ++;
            }else{
                id_sec = 1;
            }
            
            //se llama la tabla con sus atributos
            PreparedStatement pst = cnx.prepareStatement("INSERT INTO EVENTO_CASUAL(ID, NOMBRE,CEDULA,TELEFONO,CORREO,DIRECCION,TIPO_EVENTO,FECHA,HORA,PAQUETE,TIPO_PAGO)"
                    + "     VALUES(?,?,?,?,?,?,?,?,?,?,?)");
            pst.setInt(1, id_sec);
            pst.setString(2, ec.getNombre());
            pst.setString(3, ec.getCedula());
            pst.setString(4, ec.getTelefono());
            pst.setString(5, ec.getCorreo());
            pst.setString(6, ec.getDireccion());
            pst.setString(7, ec.getTipoEvento());
            pst.setString(8, ec.getFechaEvento());
            pst.setString(9, ec.getHoraEvento());
            pst.setString(10, ec.getPaquete());
            pst.setString(11, ec.getTipoPago());
            pst.executeQuery();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Ingresar datos");
        }
    }
    public void ModificarEventoD(EventoCasual ec) {
        Integer exitoso=0;
        try {
            System.out.println(ec.toString());
            //conectamos
            Connection cnx = DataBaseConnect.getConnection();           
            //se llama la tabla con sus atributos
            PreparedStatement pst = cnx.prepareStatement("UPDATE EVENTO_CASUAL SET NOMBRE = ?,CEDULA = ? ,TELEFONO = ? ,CORREO = ? ,DIRECCION = ?,TIPO_EVENTO = ? ,FECHA = ?,HORA = ? ,PAQUETE = ? , TIPO_PAGO = ? WHERE ID = ?");
            pst.setString(1, ec.getNombre());
            pst.setString(2, ec.getCedula());
            pst.setString(3, ec.getTelefono());
            pst.setString(4, ec.getCorreo());
            pst.setString(5, ec.getDireccion());
            pst.setString(6, ec.getTipoEvento());
            pst.setString(7, ec.getFechaEvento());
            pst.setString(8, ec.getHoraEvento());
            pst.setString(9, ec.getPaquete());
            pst.setString(10, ec.getTipoPago());
            pst.setString(11, ec.getId());
            exitoso = pst.executeUpdate();
            System.out.println("Registros actualizados: " + exitoso);
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println(ex.getMessage());
            System.out.println("Error en Actualizar datos");
        }
    }
}

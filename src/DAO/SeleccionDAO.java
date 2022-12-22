/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.Continente;
import DTO.Seleccion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author kevin
 */
public class SeleccionDAO {
    
    public ArrayList<String> list = new ArrayList<>();
    
    public Integer m, m1;
    public String n, n1;

    public static void registrarS(Connection cn, DTO.Continente c, DTO.Seleccion s) throws SQLException {
        try {
            PreparedStatement consulta;
            consulta = cn.prepareStatement("Insert into seleccion(idSeleccion,nombre,idContinente,tecnico,golesFavor,golesContra,partidosGanados,partidosPerdidos,partidosJugados) Values(?,?,?,?,?,?,?,?,?)");
            consulta.setInt(1, s.getIdSeleccion());
            consulta.setString(2, s.getNombre());
            consulta.setInt(3, c.getIdcontinente());
            consulta.setString(4, s.getTecnico());
            consulta.setInt(5, s.getGolesFavor());
            consulta.setInt(6, s.getGolesContra());
            consulta.setInt(7, s.getPartGanados());
            consulta.setInt(8, s.getPartPerdidos());
            consulta.setInt(9, s.getPartjugados());
            consulta.executeUpdate();
            System.out.println("guarda");
        } catch (SQLException e) {
            System.out.println("E guardar");
            throw new SQLException(e);
        }
    }

    public static void actualizar(Connection cn, int idSeleccion, String nombre, String tecnico, int golesFavor, int golesContra, int partGanados, int partPerdidos, int partjugados) throws SQLException {
        try {
            PreparedStatement consulta;
            consulta = cn.prepareStatement("UPDATE seleccion set nombre='" + nombre + "' , tecnico='" + tecnico + "', golesFavor='" + golesFavor + "', golesContra='" + golesContra + "', partidosGanados='" + partGanados + "', partidosPerdidos='" + partPerdidos + "', partidosjugados='" + partjugados + "'  where idSeleccion='" + idSeleccion + "'");
            consulta.executeUpdate();
            System.out.println("Actualiza");
        } catch (SQLException e) {
            System.out.println("E actualizar");
            throw new SQLException(e);
        }
    }

    public static void eliminar(Connection cn, int idSeleccion) throws SQLException {
        try {
            PreparedStatement consulta;
            consulta = cn.prepareStatement("DELETE from seleccion where idSeleccion='" + idSeleccion + "'");
            consulta.executeUpdate();
            System.out.println("Elimina");
        } catch (SQLException e) {
            System.out.println("    E eliminar");
            throw new SQLException(e);
        }
    }

    public  void listarName(Connection cn, String nombre) throws SQLException {
        try {
            PreparedStatement consulta;
            consulta = cn.prepareStatement("SELECT nombre FROM seleccion");
            ResultSet rs = consulta.executeQuery();

            while (rs.next()) {
                String valor = rs.getString("nombre");
                list.add(valor);
            }
            System.out.println("    E muestra");
        } catch (SQLException e) {
            System.out.println("    E error");
            throw new SQLException(e);
        }
    }

    public void mayorGoles(Connection conexion, Seleccion d) throws SQLException {

        try {

            Statement sta = conexion.createStatement();
            String consulta = "select max(partidosGanados) as mayor,max(nombre) as nombre from seleccion";
            ResultSet rs = sta.executeQuery(consulta);

            rs.next();
            m = rs.getInt("mayor");

            n = rs.getString("nombre");

            rs.close();
            sta.close();

        } catch (SQLException ex) {

            throw new SQLException(ex);

        }

    }

    public void mayorDif(Connection conexion, Seleccion d) throws SQLException {

        try {

            Statement sta = conexion.createStatement();
            String consulta = "SELECT golesFavor - golesContra as diferencia, nombre from seleccion ORDER BY `diferencia` DESC";
            ResultSet rs = sta.executeQuery(consulta);

            rs.next();
            m1 = rs.getInt("diferencia");

            n1 = rs.getString("nombre");

            rs.close();
            sta.close();

        } catch (SQLException ex) {

            throw new SQLException(ex);

        }

    }

}

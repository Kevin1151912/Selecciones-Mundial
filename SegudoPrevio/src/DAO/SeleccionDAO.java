/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.Continente;
import DTO.Seleccion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author kevin
 */
public class SeleccionDAO {
    
    public static void registrarS(Connection cn, DTO.Continente c, DTO.Seleccion s) throws SQLException {
        try {
            PreparedStatement consulta;
            consulta = cn.prepareStatement("Insert into seleccion(idSeleccion,nombre,idContinente,tecnico,golesFavor,golesContra,partidosGanados,partidosPerdidos,partidosJugados) Values(?,?,?,?,?,?,?,?,?)");
            consulta.setInt(1, s.getIdSeleccion());
            consulta.setString(2, s.getNombre());
            consulta.setInt(3,  c.getIdcontinente());
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
    
    public static void actualizar(Connection cn,int idSeleccion, String nombre, String tecnico, int golesFavor, int golesContra, int partGanados, int partPerdidos, int partjugados) throws SQLException{
        try{
            PreparedStatement consulta;
            consulta=cn.prepareStatement("UPDATE seleccion set nombre='"+nombre+"' , tecnico='"+tecnico+"', golesFavor='"+golesFavor+"', golesContra='"+golesContra+"', partidosGanados='"+partGanados+"', partidosPerdidos='"+partPerdidos+"', partidosjugados='"+partjugados+"'  where idSeleccion='"+idSeleccion+"'");
            consulta.executeUpdate();
            System.out.println("Actualiza");
        }catch(SQLException e){
            System.out.println("E actualizar");
            throw new SQLException(e);
        }
    }
    
    public static void eliminar(Connection cn,int idSeleccion) throws SQLException{
        try{
            PreparedStatement consulta;
            consulta=cn.prepareStatement("DELETE from seleccion where idSeleccion='"+idSeleccion+"'");
            consulta.executeUpdate();
            System.out.println("Elimina");
        }catch(SQLException e){
            System.out.println("    E eliminar");
            throw new SQLException(e);
        }
    }
    
}

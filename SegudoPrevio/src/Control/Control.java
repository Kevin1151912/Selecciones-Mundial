/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;
import DAO.ContinenteDAO;
import DAO.SeleccionDAO;
import DTO.Continente;
import DTO.Seleccion;
import Servicios.Conexion;
import java.sql.Date;

/**
 *
 * @author kevin
 */
public class Control {

    private ContinenteDAO con = new ContinenteDAO();
    private SeleccionDAO sel = new SeleccionDAO();

    
    public void registrarC(Continente a) {

        try {
            //   RegistrarProducto rp = new RegistrarProducto();

            con.registrarCo(Conexion.obtener(), a);
        } catch (Exception e) {

        }

    }
    
    public void registrarS(Continente a, Seleccion s) {

        try {
            //   RegistrarProducto rp = new RegistrarProducto();

            sel.registrarS(Conexion.obtener(), a, s);
        } catch (Exception e) {

        }

    }
    
    
    public void actualizar(int idSeleccion, String nombre, String tecnico, int golesFavor, int golesContra, int partGanados, int partPerdidos, int partjugados) {
        try {
            //  RegistrarProducto rp=new RegistrarProducto();
            sel.actualizar(Conexion.obtener(), idSeleccion, nombre, tecnico, golesFavor, golesContra, partGanados, partPerdidos, partjugados);
        } catch (Exception e) {

        }
    }
    
    public void eliminar(int idSeleccion){
        try{
            sel.eliminar(Conexion.obtener(), idSeleccion);
        }catch(Exception e){
            
        }
    }

}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgModelo;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlos
 */
public class clsDAOProducto extends clsProducto {
    pkgControlador.clsConecta objConecta;

    public clsDAOProducto() {
        objConecta=new pkgControlador.clsConecta();
    }
    public boolean insertar(){
    String sql="INSERT INTO alumno(\n" +
"            idcodigo, nombre, carrera, telefono)\n" +
"    VALUES ('"+super.getCodigo()+"', '"+super.getDescripcion()+"', '"+super.getCarrera()+"', '"+super.getTelefono()+"');";
        try {
            return objConecta.insertar(sql);
        } catch (SQLException ex) {
            return true;
        }
    }
    
}

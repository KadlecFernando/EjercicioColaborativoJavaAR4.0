/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploobrador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author DANILO
 */
public class Ejemploobrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            Connection cx=DriverManager.getConnection("jdbc:mariadb://localHost:3306/obrador", "root", "");
//    consulta empleados
//            String sql="SELECT* FROM empleado";
//            PreparedStatement ps=cx.prepareStatement(sql);
//            ResultSet res=ps.executeQuery();
//            while(res.next()){
//                System.out.println("ID "+res.getInt("idEmpleado"));
//                System.out.println("DNI "+res.getInt("dni"));
//                System.out.println("Apellido "+res.getString("apellido"));
//                 System.out.println("Nombre "+res.getString("nombre"));
//                 System.out.println("Acceso "+res.getInt("acceso"));
//                 System.out.println("Estado "+res.getBoolean("estado"));
//                
//            }
// agregar empleados
//                String sql="INSERT INTO empleado (dni, apellido, nombre, acceso, estado) "
//                        + "VALUES (56987456,'Alvarez','Jose',2, true)";
//                PreparedStatement ps=cx.prepareStatement(sql);
//                ps.executeUpdate();
//                  String sql="INSERT INTO empleado (dni, apellido, nombre, acceso, estado) "
//                        + "VALUES (3564896,'Rosales','Miguel',3, true)";
//                PreparedStatement ps=cx.prepareStatement(sql);
//                ps.executeUpdate();
//  agregar herramientas
//                  String sql="INSERT INTO herramienta (nombre, descripcion, stock, estado) "
//                          + "VALUES('Pinza','Pinza de acero con mango de goma', 15, true)";
//                  PreparedStatement ps=cx.prepareStatement(sql);
//                  ps.executeUpdate();
//                    String sql="INSERT INTO herramienta (nombre, descripcion, stock, estado) "
//                          + "VALUES('Tenaza','Tenaza de acero ', 11, true)";
//                  PreparedStatement ps=cx.prepareStatement(sql);
//                  ps.executeUpdate();
//  consulta query
//                    String sql="SELECT * FROM herramienta "
//                            + "WHERE stock>10";
//                    PreparedStatement  ps=cx.prepareStatement(sql);
//                    ResultSet res=ps.executeQuery();
//                    while(res.next()){
//                        System.out.println("ID: "+res.getInt("idHerramienta"));
//                        System.out.println("Nombre: "+res.getString("nombre"));
//                        System.out.println("Descripcion: "+res.getString("descripcion"));
//                        System.out.println("Stock: "+res.getInt("stock"));
//                        System.out.println("Estado: "+res.getBoolean("estado"));
//                    
//                    }
//  dar de baja empleado
                      String sql="UPDATE empleado SET estado=false "
                              + "WHERE idEmpleado=1";
                      PreparedStatement ps=cx.prepareStatement(sql);
                      ps.executeUpdate();
            
            
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "fallo al cargar drivers"+ e.getMessage());
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error de conexion "+ex.getMessage());
        }
    }
    
}

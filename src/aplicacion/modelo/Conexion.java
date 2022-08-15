/*
Descripción: Clase para la conexión con la BD de la aplicación
Fecha: 26-junio-2021
Nombre: Rosa Angélica Rosales Camacho
 */
package aplicacion.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    public Connection abrirConexionAdmin() throws SQLException{
        Connection con;
        //Para conectarnos a nuestra base de datos
        try{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/ejemplos_poo","root", ""); // Se establece la conexión
        }catch(SQLException e){
            System.out.println("NO se pudo abrir conexión");            
            con = null;
        }            
        return con;
    }
    
    public void cerrarConexionAdmin(Connection c) throws SQLException{        
        try{
            if(!c.isClosed()){
                c.close();
            }
        }catch(SQLException e){
            System.out.println("Error al cerrar la conexión");
        }        
    }
    public Connection abrirConexionGereAdmin() throws SQLException{
        Connection con;
        //Para conectarnos a nuestra base de datos
        try{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/ejemplos_poo","root", ""); // Se establece la conexión
        }catch(SQLException e){
            System.out.println("NO se pudo abrir conexión");            
            con = null;
        }            
        return con;
    }
    public void cerrarConexionGereAdmin(Connection c) throws SQLException{        
        try{
            if(!c.isClosed()){
                c.close();
            }
        }catch(SQLException e){
            System.out.println("Error al cerrar la conexión");
        }        
    }
    public Connection abrirConexionGereTaller() throws SQLException{
        Connection con;
        //Para conectarnos a nuestra base de datos
        try{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/ejemplos_poo","root", ""); // Se establece la conexión
        }catch(SQLException e){
            System.out.println("NO se pudo abrir conexión");            
            con = null;
        }            
        return con;
    }
    public void cerrarConexionGereTaller(Connection c) throws SQLException{        
        try{
            if(!c.isClosed()){
                c.close();
            }
        }catch(SQLException e){
            System.out.println("Error al cerrar la conexión");
        }        
    }
    public Connection abrirConexionGereRecu() throws SQLException{
        Connection con;
        //Para conectarnos a nuestra base de datos
        try{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/ejemplos_poo","root", ""); // Se establece la conexión
        }catch(SQLException e){
            System.out.println("NO se pudo abrir conexión");            
            con = null;
        }            
        return con;
    }
    public void cerrarConexionGereRecu(Connection c) throws SQLException{        
        try{
            if(!c.isClosed()){
                c.close();
            }
        }catch(SQLException e){
            System.out.println("Error al cerrar la conexión");
        }        
    }
    public Connection abrirConexionVendedor() throws SQLException{
        Connection con;
        //Para conectarnos a nuestra base de datos
        try{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/ejemplos_poo","root", ""); // Se establece la conexión
        }catch(SQLException e){
            System.out.println("NO se pudo abrir conexión");            
            con = null;
        }            
        return con;
    }
    public void cerrarConexionVendedor(Connection c) throws SQLException{        
        try{
            if(!c.isClosed()){
                c.close();
            }
        }catch(SQLException e){
            System.out.println("Error al cerrar la conexión");
        }        
    }
}










//con = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto","angelica", "123456");
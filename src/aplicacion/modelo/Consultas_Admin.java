/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Steph
 */
public class Consultas_Admin {
    
    private Conexion c = new Conexion();
    PreparedStatement sent;
    
    public int AltVer(String IdVer, String NomVer, String Motor, String Trans){
        
        int res = 0;
        Connection conex = null;
        
        String cons = "call AltasVersiones(?,?,?,?);";
        
        try{
            conex = c.abrirConexionAdmin();
            sent = conex.prepareStatement(cons);
            sent.setString(1, IdVer);
            sent.setString(2, NomVer);
            sent.setString(3, Motor);
            sent.setString(4, Trans);
            
            res = sent.executeUpdate();
            c.cerrarConexionAdmin(conex);
        }catch(SQLException e){
            System.out.println(e);
        }
        return res;
    }
        public int AltCorEmp(String CorreoEmp, String IdEmp){
        
        int res = 0;
        Connection conex = null;
        
        String cons = "call AltaCorreoEmp(?,?);";
        
        try{
            conex = c.abrirConexionAdmin();
            sent = conex.prepareStatement(cons);
            sent.setString(1, CorreoEmp);
            sent.setString(2, IdEmp);
            
            res = sent.executeUpdate();
            c.cerrarConexionAdmin(conex);
        }catch(SQLException e){
            System.out.println(e);
        }
        return res;
    }
    public int AltCli(String IdCli, String CliNom, String CliApe, String CliHist, String FechaRegs, String CliSue, String rfcCli, String IdCLI){
        
        int res = 0;
        Connection conex = null;
        
        String cons = "call AltasVersiones(?,?,?,?,?,?,?,?);";
        
        try{
            conex = c.abrirConexionAdmin();
            sent = conex.prepareStatement(cons);
            sent.setString(1, IdCli);
            sent.setString(2, CliNom);
            sent.setString(3, CliApe);
            sent.setString(4, CliHist);
            sent.setString(5, FechaRegs);
            sent.setString(6, CliSue);
            sent.setString(7, rfcCli);
            sent.setString(8, IdCLI);
            
            res = sent.executeUpdate();
            c.cerrarConexionAdmin(conex);
        }catch(SQLException e){
            System.out.println(e);
        }
        return res;
    }
    public int AltCol(String IdCol, String ColNom){
        
        int res = 0;
        Connection conex = null;
        
        String cons = "call AltasColores(?,?);";
        
        try{
            conex = c.abrirConexionAdmin();
            sent = conex.prepareStatement(cons);
            sent.setString(1, IdCol);
            sent.setString(2, ColNom);
            
            res = sent.executeUpdate();
            c.cerrarConexionAdmin(conex);
        }catch(SQLException e){
            System.out.println(e);
        }
        return res;
    }
    public int AltCorCli(String Correo, String IdCli){
        
        int res = 0;
        Connection conex = null;
        
        String cons = "call AltasCorreoCli(?,?);";
        
        try{
            conex = c.abrirConexionAdmin();
            sent = conex.prepareStatement(cons);
            sent.setString(1, Correo);
            sent.setString(2, IdCli);
            
            res = sent.executeUpdate();
            c.cerrarConexionAdmin(conex);
        }catch(SQLException e){
            System.out.println(e);
        }
        return res;
    }
    public int AltCorCot(String Correo, String IdCot){
        
        int res = 0;
        Connection conex = null;
        
        String cons = "call AltasCorreoCot(?,?);";
        
        try{
            conex = c.abrirConexionAdmin();
            sent = conex.prepareStatement(cons);
            sent.setString(1, Correo);
            sent.setString(2, IdCot);
            
            res = sent.executeUpdate();
            c.cerrarConexionAdmin(conex);
        }catch(SQLException e){
            System.out.println(e);
        }
        return res;
    }
    public int AltCot(String IdCot, String FechaRegs, String IdMod, String IdEmp, String Usu){
        
        int res = 0;
        Connection conex = null;
        
        String cons = "call AltasCotizaciones(?,?,?,?,?,?,?,?);";
        
        try{
            conex = c.abrirConexionAdmin();
            sent = conex.prepareStatement(cons);
            sent.setString(1, IdCot);
            sent.setString(2, FechaRegs);
            sent.setString(3, IdMod);
            sent.setString(4, IdEmp);
            sent.setString(5, Usu);
            
            res = sent.executeUpdate();
            c.cerrarConexionAdmin(conex);
        }catch(SQLException e){
            System.out.println(e);
        }
        return res;
    }
    public int AltDep(String IdDep, String NomDep){
        
        int res = 0;
        Connection conex = null;
        
        String cons = "call AltasDeparatamentos(?,?,?,?,?,?,?,?);";
        
        try{
            conex = c.abrirConexionAdmin();
            sent = conex.prepareStatement(cons);
            sent.setString(1, IdDep);
            sent.setString(2, NomDep);
            
            res = sent.executeUpdate();
            c.cerrarConexionAdmin(conex);
        }catch(SQLException e){
            System.out.println(e);
        }
        return res;
    }
    public int AltCliDir(String IdDirCli, String NomCol, String NomCall, String NumExt, String CP){
        
        int res = 0;
        Connection conex = null;
        
        String cons = "call AltasDirCli(?,?,?,?,?,?,?,?);";
        
        try{
            conex = c.abrirConexionAdmin();
            sent = conex.prepareStatement(cons);
            sent.setString(1, IdDirCli);
            sent.setString(2, NomCol);
            sent.setString(3, NomCall);
            sent.setString(4, NumExt);
            sent.setString(5, CP);
            
            res = sent.executeUpdate();
            c.cerrarConexionAdmin(conex);
        }catch(SQLException e){
            System.out.println(e);
        }
        return res;
    }
    public int AltEmpDir(String IdEmp, String NomCol, String NomCall, String NumExt, String CP){
        
        int res = 0;
        Connection conex = null;
        
        String cons = "call AltasDirEmp(?,?,?,?,?,?,?,?);";
        
        try{
            conex = c.abrirConexionAdmin();
            sent = conex.prepareStatement(cons);
            sent.setString(1, IdEmp);
            sent.setString(2, NomCol);
            sent.setString(3, NomCall);
            sent.setString(4, NumExt);
            sent.setString(5, CP);
            
            res = sent.executeUpdate();
            c.cerrarConexionAdmin(conex);
        }catch(SQLException e){
            System.out.println(e);
        }
        return res;
    }
    public int AltEmp(String IdEmp, String EmpNom, String EmpApe, String EmpCom, String EmpNSS, String EmpUsu, String EmpContra,String IdDep, String IdDE){
        
        int res = 0;
        Connection conex = null;
        
        String cons = "call AltasEmpleados(?,?,?,?,?,?,?);";
        
        try{
            conex = c.abrirConexionAdmin();
            sent = conex.prepareStatement(cons);
            sent.setString(1, IdEmp);
            sent.setString(2, EmpNom);
            sent.setString(3, EmpApe);
            sent.setString(4, EmpCom);
            sent.setString(5, EmpNSS);
            sent.setString(5, EmpUsu);
            sent.setString(6, IdDep);
            sent.setString(7, IdDE);
            
            res = sent.executeUpdate();
            c.cerrarConexionAdmin(conex);
        }catch(SQLException e){
            System.out.println(e);
        }
        return res;
    }
    public int AltEmpVeh(String IdEmp, String VehNumSer){
        
        int res = 0;
        Connection conex = null;
        
        String cons = "call AltasEmpVeh(?,?);";
        
        try{
            conex = c.abrirConexionAdmin();
            sent = conex.prepareStatement(cons);
            sent.setString(1, IdEmp);
            sent.setString(2, VehNumSer);
            
            res = sent.executeUpdate();
            c.cerrarConexionAdmin(conex);
        }catch(SQLException e){
            System.out.println(e);
        }
        return res;
    }
    public int AltFactCli(String CodFact, String IdCli){
        
        int res = 0;
        Connection conex = null;
        
        String cons = "call AltasFactCli(?,?);";
        
        try{
            conex = c.abrirConexionAdmin();
            sent = conex.prepareStatement(cons);
            sent.setString(1, CodFact);
            sent.setString(2, IdCli);
            
            res = sent.executeUpdate();
            c.cerrarConexionAdmin(conex);
        }catch(SQLException e){
            System.out.println(e);
        }
        return res;
    }
    public int AltFac(String IdFact, String MetPago, String FechaVent, String VehNumSerie, String IdEmp){
        
        int res = 0;
        Connection conex = null;
        
        String cons = "call AltasFactura(?,?,?,?,?);";
        
        try{
            conex = c.abrirConexionAdmin();
            sent = conex.prepareStatement(cons);
            sent.setString(1, IdFact);
            sent.setString(2, MetPago);
            sent.setString(3, FechaVent);
            sent.setString(4, VehNumSerie);
            sent.setString(5, IdEmp);
            
            res = sent.executeUpdate();
            c.cerrarConexionAdmin(conex);
        }catch(SQLException e){
            System.out.println(e);
        }
        return res;
    }
    public int AltMod(String IdMod, String ModNom){
        
        int res = 0;
        Connection conex = null;
        
        String cons = "call AltasModelos(?,?);";
        
        try{
            conex = c.abrirConexionAdmin();
            sent = conex.prepareStatement(cons);
            sent.setString(1, IdMod);
            sent.setString(2, ModNom);
            
            res = sent.executeUpdate();
            c.cerrarConexionAdmin(conex);
        }catch(SQLException e){
            System.out.println(e);
        }
        return res;
    }
    public int AltTelCli(String Tel, String IdCli){
        
        int res = 0;
        Connection conex = null;
        
        String cons = "call AltasTelCli(?,?);";
        
        try{
            conex = c.abrirConexionAdmin();
            sent = conex.prepareStatement(cons);
            sent.setString(1, Tel);
            sent.setString(2, IdCli);
            
            res = sent.executeUpdate();
            c.cerrarConexionAdmin(conex);
        }catch(SQLException e){
            System.out.println(e);
        }
        return res;
    }
    public int AltTelCot(String Tele, String IdCot){
        
        int res = 0;
        Connection conex = null;
        
        String cons = "call AltasTelCot(?,?);";
        
        try{
            conex = c.abrirConexionAdmin();
            sent = conex.prepareStatement(cons);
            sent.setString(1, Tele);
            sent.setString(2, IdCot);
            
            res = sent.executeUpdate();
            c.cerrarConexionAdmin(conex);
        }catch(SQLException e){
            System.out.println(e);
        }
        return res;
    }
    public int AltTelEmp(String EmpTel, String IdEmp){
        
        int res = 0;
        Connection conex = null;
        
        String cons = "call AltasTelEmp(?,?);";
        
        try{
            conex = c.abrirConexionAdmin();
            sent = conex.prepareStatement(cons);
            sent.setString(1, EmpTel);
            sent.setString(2, IdEmp);
            
            res = sent.executeUpdate();
            c.cerrarConexionAdmin(conex);
        }catch(SQLException e){
            System.out.println(e);
        }
        return res;
    }
    public int AltVeh(String IdVeh, String VehPais, String Stock, String VehPrecio, String IdMod, String IdVers, String IdCol){
        
        int res = 0;
        Connection conex = null;
        
        String cons = "call AltasVehículos(?,?,?,?,?,?,?);";
        
        try{
            conex = c.abrirConexionAdmin();
            sent = conex.prepareStatement(cons);
            sent.setString(1, IdVeh);
            sent.setString(2, VehPais);
            sent.setString(3, Stock);
            sent.setString(4, VehPrecio);
            sent.setString(5, IdMod);
            sent.setString(6, IdVers);
            sent.setString(7, IdCol);
            
            res = sent.executeUpdate();
            c.cerrarConexionAdmin(conex);
        }catch(SQLException e){
            System.out.println(e);
        }
        return res;
    }
    public boolean ConsVer(){
        try{
            Connection con = c.abrirConexionAdmin();
            Statement s = con.createStatement();
            String cadenaSQL = "Call ConsultarVersionesVeh();";
            int registro = s.executeUpdate(cadenaSQL);
            c.cerrarConexionAdmin(con);
            return true;
        }catch(SQLException e){
            return false;
        }

    }
    public boolean ConsMod(){
        try{
            Connection con = c.abrirConexionAdmin();
            Statement s = con.createStatement();
            String cadenaSQL = "Call ConsultarModelosVeh();";
            int registro = s.executeUpdate(cadenaSQL);
            c.cerrarConexionAdmin(con);
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean ConsCli(){
        try{
            Connection con = c.abrirConexionAdmin();
            Statement s = con.createStatement();
            String cadenaSQL = "Call ConsultarClientes();";
            int registro = s.executeUpdate(cadenaSQL);
            c.cerrarConexionAdmin(con);
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean ConsCorCli(){
        try{
            Connection con = c.abrirConexionAdmin();
            Statement s = con.createStatement();
            String cadenaSQL = "Call ConsultarCorreosClientes();";
            int registro = s.executeUpdate(cadenaSQL);
            c.cerrarConexionAdmin(con);
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean ConsTelCli(){
        try{
            Connection con = c.abrirConexionAdmin();
            Statement s = con.createStatement();
            String cadenaSQL = "Call ConsultarDireccionesClientes();";
            int registro = s.executeUpdate(cadenaSQL);
            c.cerrarConexionAdmin(con);
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean ConsCol(){
        try{
            Connection con = c.abrirConexionAdmin();
            Statement s = con.createStatement();
            String cadenaSQL = "Call ConsultarColoresVeh();";
            int registro = s.executeUpdate(cadenaSQL);
            c.cerrarConexionAdmin(con);
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean ConsEmp(){
        try{
            Connection con = c.abrirConexionAdmin();
            Statement s = con.createStatement();
            String cadenaSQL = "Call ConsultarEmpleados();";
            int registro = s.executeUpdate(cadenaSQL);
            c.cerrarConexionAdmin(con);
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean ConsCorEmp(){
        try{
            Connection con = c.abrirConexionAdmin();
            Statement s = con.createStatement();
            String cadenaSQL = "Call ConsultarCorreosEmpleados();";
            int registro = s.executeUpdate(cadenaSQL);
            c.cerrarConexionAdmin(con);
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean ConsTelEmp(){
        try{
            Connection con = c.abrirConexionAdmin();
            Statement s = con.createStatement();
            String cadenaSQL = "Call ConsultarTelefonosEmpleados();";
            int registro = s.executeUpdate(cadenaSQL);
            c.cerrarConexionAdmin(con);
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean ConsDep(){
        try{
            Connection con = c.abrirConexionAdmin();
            Statement s = con.createStatement();
            String cadenaSQL = "Call ConsultarDepartamentos();";
            int registro = s.executeUpdate(cadenaSQL);
            c.cerrarConexionAdmin(con);
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean ConsDirEmp(){
        try{
            Connection con = c.abrirConexionAdmin();
            Statement s = con.createStatement();
            String cadenaSQL = "Call ConsultarDireccionesEmpleados();";
            int registro = s.executeUpdate(cadenaSQL);
            c.cerrarConexionAdmin(con);
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean ConsCoti(){
        try{
            Connection con = c.abrirConexionAdmin();
            Statement s = con.createStatement();
            String cadenaSQL = "Call ConsultarCotizaciones();";
            int registro = s.executeUpdate(cadenaSQL);
            c.cerrarConexionAdmin(con);
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean ConsCorCoti(){
        try{
            Connection con = c.abrirConexionAdmin();
            Statement s = con.createStatement();
            String cadenaSQL = "Call ConsultarCorreosCotizaciones();";
            int registro = s.executeUpdate(cadenaSQL);
            c.cerrarConexionAdmin(con);
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean ConsTelCoti(){
        try{
            Connection con = c.abrirConexionAdmin();
            Statement s = con.createStatement();
            String cadenaSQL = "Call ConsultarTelefonosCotizaciones();";
            int registro = s.executeUpdate(cadenaSQL);
            c.cerrarConexionAdmin(con);
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean ConsFact(){
        try{
            Connection con = c.abrirConexionAdmin();
            Statement s = con.createStatement();
            String cadenaSQL = "Call ConsultarFacturas();";
            int registro = s.executeUpdate(cadenaSQL);
            c.cerrarConexionAdmin(con);
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    
    public boolean EliminarCli(int IdCli){
        try{
            //Para abrir la conexión a la base de datos
            Connection con = c.abrirConexionAdmin();            
            //Para generar la consulta
            Statement s = con.createStatement();            
            //Borra en la tabla usuarios            
            int registro = s.executeUpdate("DELETE from Clientes WHERE Cli_Id = " + IdCli + ";");            
            c.cerrarConexionAdmin(con);    
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean EliminarCorreosClientes(int IdCli){
        try{
            //Para abrir la conexión a la base de datos
            Connection con = c.abrirConexionAdmin();            
            //Para generar la consulta
            Statement s = con.createStatement();            
            //Borra en la tabla usuarios            
            int registro = s.executeUpdate("DELETE from CorreosClientes WHERE CC_CliId=" + IdCli + ";");            
            c.cerrarConexionAdmin(con);    
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean EliminarTelefonosClientes(int IdCli){
        try{
            //Para abrir la conexión a la base de datos
            Connection con = c.abrirConexionAdmin();            
            //Para generar la consulta
            Statement s = con.createStatement();            
            //Borra en la tabla usuarios            
            int registro = s.executeUpdate("DELETE from TelefonosClientes WHERE TC_CliId=" + IdCli + ";");            
            c.cerrarConexionAdmin(con);    
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean EliminarDireccionesClientes(int IdDCli){
        try{
            //Para abrir la conexión a la base de datos
            Connection con = c.abrirConexionAdmin();            
            //Para generar la consulta
            Statement s = con.createStatement();            
            //Borra en la tabla usuarios            
            int registro = s.executeUpdate("DELETE from direccionesclientes WHERE DC_Id=" + IdDCli + ";");            
            c.cerrarConexionAdmin(con);    
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean EliminarVehiculos(int IdVeh){
        try{
            //Para abrir la conexión a la base de datos
            Connection con = c.abrirConexionAdmin();            
            //Para generar la consulta
            Statement s = con.createStatement();            
            //Borra en la tabla usuarios            
            int registro = s.executeUpdate("DELETE from vehiculos WHERE Veh_NumSerie=" + IdVeh + ";");            
            c.cerrarConexionAdmin(con);    
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean EliminarColores(int IdColor){
        try{
            //Para abrir la conexión a la base de datos
            Connection con = c.abrirConexionAdmin();            
            //Para generar la consulta
            Statement s = con.createStatement();            
            //Borra en la tabla usuarios            
            int registro = s.executeUpdate("DELETE from colores WHERE Color_Id=" + IdColor + ";");            
            c.cerrarConexionAdmin(con);    
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean EliminarVersiones(int IdVers){
        try{
            //Para abrir la conexión a la base de datos
            Connection con = c.abrirConexionAdmin();            
            //Para generar la consulta
            Statement s = con.createStatement();            
            //Borra en la tabla usuarios            
            int registro = s.executeUpdate("DELETE from versiones WHERE Vers_Id=" + IdVers + ";");            
            c.cerrarConexionAdmin(con);    
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean EliminarModelos(int IdMod){
        try{
            //Para abrir la conexión a la base de datos
            Connection con = c.abrirConexionAdmin();            
            //Para generar la consulta
            Statement s = con.createStatement();            
            //Borra en la tabla usuarios            
            int registro = s.executeUpdate("DELETE from modelos WHERE Mod_Id=" + IdMod + ";");            
            c.cerrarConexionAdmin(con);    
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean EliminarEmpleados(int IdEmp){
        try{
            //Para abrir la conexión a la base de datos
            Connection con = c.abrirConexionAdmin();            
            //Para generar la consulta
            Statement s = con.createStatement();            
            //Borra en la tabla usuarios            
            int registro = s.executeUpdate("DELETE from empleados WHERE Emp_Id=" + IdEmp + ";");            
            c.cerrarConexionAdmin(con);    
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean EliminarCorreosEmpleados(int IdEmp){
        try{
            //Para abrir la conexión a la base de datos
            Connection con = c.abrirConexionAdmin();            
            //Para generar la consulta
            Statement s = con.createStatement();            
            //Borra en la tabla usuarios            
            int registro = s.executeUpdate("DELETE from correosempleados WHERE CE_EmpId=" + IdEmp + ";");            
            c.cerrarConexionAdmin(con);    
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean EliminarTelefonosEmpleados(int IdEmp){
        try{
            //Para abrir la conexión a la base de datos
            Connection con = c.abrirConexionAdmin();            
            //Para generar la consulta
            Statement s = con.createStatement();            
            //Borra en la tabla usuarios            
            int registro = s.executeUpdate("DELETE from telefonosempleados WHERE TE_EmpId=" + IdEmp + ";");            
            c.cerrarConexionAdmin(con);    
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean EliminarDireccionesEmpleados(int IdEmp){
        try{
            //Para abrir la conexión a la base de datos
            Connection con = c.abrirConexionAdmin();            
            //Para generar la consulta
            Statement s = con.createStatement();            
            //Borra en la tabla usuarios            
            int registro = s.executeUpdate("DELETE from DireccionesEmpleados WHERE DE_Id=" + IdEmp + ";");            
            c.cerrarConexionAdmin(con);    
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean EliminarDepartamentos(int IdDep){
        try{
            //Para abrir la conexión a la base de datos
            Connection con = c.abrirConexionAdmin();            
            //Para generar la consulta
            Statement s = con.createStatement();            
            //Borra en la tabla usuarios            
            int registro = s.executeUpdate("DELETE from departamentos WHERE Dep_Id=" + IdDep + ";");            
            c.cerrarConexionAdmin(con);    
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean EliminarCotizaciones(int IdCot){
        try{
            //Para abrir la conexión a la base de datos
            Connection con = c.abrirConexionAdmin();            
            //Para generar la consulta
            Statement s = con.createStatement();            
            //Borra en la tabla usuarios            
            int registro = s.executeUpdate("DELETE from cotizaciones WHERE Cot_Id=" + IdCot + ";");            
            c.cerrarConexionAdmin(con);    
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean EliminarCorreosCotizaciones(int IdCot){
        try{
            //Para abrir la conexión a la base de datos
            Connection con = c.abrirConexionAdmin();            
            //Para generar la consulta
            Statement s = con.createStatement();            
            //Borra en la tabla usuarios            
            int registro = s.executeUpdate("DELETE from correoscotizaciones WHERE CCot_CotId=" + IdCot + ";");            
            c.cerrarConexionAdmin(con);    
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean EliminarTelefonosCotizaciones(int IdCot){
        try{
            //Para abrir la conexión a la base de datos
            Connection con = c.abrirConexionAdmin();            
            //Para generar la consulta
            Statement s = con.createStatement();            
            //Borra en la tabla usuarios            
            int registro = s.executeUpdate("DELETE from telefonoscotizaciones WHERE TCot_CotId=" + IdCot + ";");            
            c.cerrarConexionAdmin(con);    
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean EliminarFacturas(int IdFact){
        try{
            //Para abrir la conexión a la base de datos
            Connection con = c.abrirConexionAdmin();            
            //Para generar la consulta
            Statement s = con.createStatement();            
            //Borra en la tabla usuarios            
            int registro = s.executeUpdate("DELETE from facturas WHERE Fact_Codigo=" + IdFact + ";");            
            c.cerrarConexionAdmin(con);    
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    
    public boolean ModificarClientes(int IdCli,String NomC, String ApeC, String HCred, String FReg, String Sueldo , String RFC){
        try{
            //Para abrir una conexion a la BD
            Connection con = c.abrirConexionAdmin();            
            //Para ejecutar la consulta
            Statement s = con.createStatement();
            String cadenaSQL =  "UPDATE Clientes SET Cli_Nombre = '" + NomC + "', Cli_Apellidos= '" + ApeC 
           + "', Cli_HistorialCred='" + HCred + "', Cli_FechaRegistro='" + FReg +"', Cli_Sueldo='" + Sueldo +"', Cli_RFC='" + RFC +"' where Cli_Id = " + IdCli + ";";
            //Update en la tabla usuarios
            int registro = s.executeUpdate(cadenaSQL);
            c.cerrarConexionAdmin(con);
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean ModificarCorreosClientes(int IdCli,String Correo){
        try{
            //Para abrir una conexion a la BD
            Connection con = c.abrirConexionAdmin();            
            //Para ejecutar la consulta
            Statement s = con.createStatement();
            String cadenaSQL =  "UPDATE CorreoClientes SET CC_Correo = '" + Correo +"' where CC_CliId = " + IdCli + ";";
            //Update en la tabla usuarios
            int registro = s.executeUpdate(cadenaSQL);
            c.cerrarConexionAdmin(con);
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean ModificarTelefonosClientes(int IdCli,String Tel){
        try{
            //Para abrir una conexion a la BD
            Connection con = c.abrirConexionAdmin();            
            //Para ejecutar la consulta
            Statement s = con.createStatement();
            String cadenaSQL =  "UPDATE TelefonosClientes SET TC_NumTel = '" + Tel +"' where TC_CliId = " + IdCli + ";";
            //Update en la tabla usuarios
            int registro = s.executeUpdate(cadenaSQL);
            c.cerrarConexionAdmin(con);
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean ModificarDireccionesClientes(int IdDCli, String Col, String Calle, String Num, String CP){
        try{
            //Para abrir una conexion a la BD
            Connection con = c.abrirConexionAdmin();            
            //Para ejecutar la consulta
            Statement s = con.createStatement();
            String cadenaSQL =  "UPDATE direccionesclientes SET DC_NombreColonia= '" + Col + "' DCNombreCalle = " + Calle + "' DC_NumExt = " + Num +"' DC_CP = " + CP + "' where DC_Id = " + IdDCli + ";";
            //Update en la tabla usuarios
            int registro = s.executeUpdate(cadenaSQL);
            c.cerrarConexionAdmin(con);
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean ModificarVehiculos(int IdVeh, String Pais, String Stock, String Precio){
        try{
            //Para abrir una conexion a la BD
            Connection con = c.abrirConexionAdmin();            
            //Para ejecutar la consulta
            Statement s = con.createStatement();
            String cadenaSQL =  "UPDATE vehiculos SET Veh_PaisProcedencia= '" + Pais + "' Veh_Stock = " + Stock + "' Veh_Precio = " + Precio + "' WHERE Veh_NumSerie = " + IdVeh + ";";
            //Update en la tabla usuarios
            int registro = s.executeUpdate(cadenaSQL);
            c.cerrarConexionAdmin(con);
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean ModificarColores(int IdColor, String Color){
        try{
            //Para abrir una conexion a la BD
            Connection con = c.abrirConexionAdmin();            
            //Para ejecutar la consulta
            Statement s = con.createStatement();
            String cadenaSQL =  "UPDATE colores SET Color_Nombre= '" + Color + "'WHERE Color_Id = " + IdColor + ";";
            //Update en la tabla usuarios
            int registro = s.executeUpdate(cadenaSQL);
            c.cerrarConexionAdmin(con);
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean ModificarVersiones(int IdVers, String Vers, String Motor, String Transmision){
        try{
            //Para abrir una conexion a la BD
            Connection con = c.abrirConexionAdmin();            
            //Para ejecutar la consulta
            Statement s = con.createStatement();
            String cadenaSQL =  "UPDATE versiones SET Vers_Nombre= '"+ Vers + "'Vers_Motor= '" + Motor + "'Vers_Transmision= '" + Transmision + "'WHERE Vers_Id = " + IdVers + ";";
            //Update en la tabla usuarios
            int registro = s.executeUpdate(cadenaSQL);
            c.cerrarConexionAdmin(con);
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean ModificarModelos(int IdMod, String Modelo){
        try{
            //Para abrir una conexion a la BD
            Connection con = c.abrirConexionAdmin();            
            //Para ejecutar la consulta
            Statement s = con.createStatement();
            String cadenaSQL =  "UPDATE modelos SET Mod_Nombre= '"+ Modelo + "'WHERE Mod_Id = " + IdMod + ";";
            //Update en la tabla usuarios
            int registro = s.executeUpdate(cadenaSQL);
            c.cerrarConexionAdmin(con);
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean ModificarEmpleados(int IdEmp, String NomE, String ApeE, String Comi, String NumSS, String Usu, String Contra){
        try{
            //Para abrir una conexion a la BD
            Connection con = c.abrirConexionAdmin();            
            //Para ejecutar la consulta
            Statement s = con.createStatement();
            String cadenaSQL =  "UPDATE empleados SET Emp_Nombre= '"+ NomE + "'Emp_Apellidos = '" + ApeE +"'Emp_Comision = '" + Comi + "'Emp_NSS = '" + NumSS + "'Emp_Usuario = '" + Usu + "'Emp_Constrasena = '" + Contra + "'WHERE Emp_Id = " + IdEmp + ";";
            //Update en la tabla usuarios
            int registro = s.executeUpdate(cadenaSQL);
            c.cerrarConexionAdmin(con);
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean ModificarCorreosEmpleados(int IdEmp, String CorreoE){
        try{
            //Para abrir una conexion a la BD
            Connection con = c.abrirConexionAdmin();            
            //Para ejecutar la consulta
            Statement s = con.createStatement();
            String cadenaSQL =  "UPDATE correosempleados SET CE_Correo= '"+ CorreoE + "'WHERE CE_EmpId = " + IdEmp + ";";
            //Update en la tabla usuarios
            int registro = s.executeUpdate(cadenaSQL);
            c.cerrarConexionAdmin(con);
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean ModificarTelefonosEmpleados(int IdEmp, String TelE){
        try{
            //Para abrir una conexion a la BD
            Connection con = c.abrirConexionAdmin();            
            //Para ejecutar la consulta
            Statement s = con.createStatement();
            String cadenaSQL =  "UPDATE telefonosempleados SET TE_NumTel= '"+ TelE + "'WHERE TE_EmpId = " + IdEmp + ";";
            //Update en la tabla usuarios
            int registro = s.executeUpdate(cadenaSQL);
            c.cerrarConexionAdmin(con);
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean ModificarDireccionesEmpleados(int IdDEmp, String Colonia, String Calle, String Num, String CP){
        try{
            //Para abrir una conexion a la BD
            Connection con = c.abrirConexionAdmin();            
            //Para ejecutar la consulta
            Statement s = con.createStatement();
            String cadenaSQL =  "UPDATE DireccionesEmpleados SET DE_NombreColonia= '"+ Colonia + "DE_NombreCalle = " + Calle +"DE_NumExt = " + Num + "DE_CP = " + CP + "WHERE DE_Id = " + IdDEmp + ";";
            //Update en la tabla usuarios
            int registro = s.executeUpdate(cadenaSQL);
            c.cerrarConexionAdmin(con);
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean ModificarDepartamentos(int IdDep, String Dep){
        try{
            //Para abrir una conexion a la BD
            Connection con = c.abrirConexionAdmin();            
            //Para ejecutar la consulta
            Statement s = con.createStatement();
            String cadenaSQL =  "UPDATE departamentos SET Dep_Nombre= '"+ Dep + "WHERE Dep_Id = " + IdDep + ";";
            //Update en la tabla usuarios
            int registro = s.executeUpdate(cadenaSQL);
            c.cerrarConexionAdmin(con);
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean ModificarCotizaciones(int IdCot, String Fecha, String Nombre){
        try{
            //Para abrir una conexion a la BD
            Connection con = c.abrirConexionAdmin();            
            //Para ejecutar la consulta
            Statement s = con.createStatement();
            String cadenaSQL =  "UPDATE cotizaciones SET Cot_FechaCot= '"+ Fecha + "'Cot_NomUsuario = '" + Nombre + "'WHERE Cot_Id = " + IdCot + ";";
            //Update en la tabla usuarios
            int registro = s.executeUpdate(cadenaSQL);
            c.cerrarConexionAdmin(con);
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean ModificarCorreosCotizaciones(int IdCot, String Correo){
        try{
            //Para abrir una conexion a la BD
            Connection con = c.abrirConexionAdmin();            
            //Para ejecutar la consulta
            Statement s = con.createStatement();
            String cadenaSQL =  "UPDATE correoscotizaciones SET CCot_Correo= '"+ Correo + "'WHERE CCot_CotId = " + IdCot + ";";
            //Update en la tabla usuarios
            int registro = s.executeUpdate(cadenaSQL);
            c.cerrarConexionAdmin(con);
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean ModificarTelefonosCotizaciones(int IdCot, String Tel){
        try{
            //Para abrir una conexion a la BD
            Connection con = c.abrirConexionAdmin();            
            //Para ejecutar la consulta
            Statement s = con.createStatement();
            String cadenaSQL =  "UPDATE telefonoscotizaciones SET TCot_NumTel= '"+ Tel + "'WHERE TCot_CotId = " + IdCot + ";";
            //Update en la tabla usuarios
            int registro = s.executeUpdate(cadenaSQL);
            c.cerrarConexionAdmin(con);
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    public boolean ModificarFacturas(int IdFact, String MP, String FV){
        try{
            //Para abrir una conexion a la BD
            Connection con = c.abrirConexionAdmin();            
            //Para ejecutar la consulta
            Statement s = con.createStatement();
            String cadenaSQL =  "UPDATE facturas SET Fact_MetodoPago= '"+ MP +"'Fact_FechaVenta= '" + FV + "'WHERE TCot_CotId = " + IdFact + ";";
            //Update en la tabla usuarios
            int registro = s.executeUpdate(cadenaSQL);
            c.cerrarConexionAdmin(con);
            return true;
        }catch(SQLException e){
            return false;
        }
    }
   /* public boolean usuariosBuscar(int vrUsuId, String vrUsuNombre, String vrUsuPass){
        try{
            //Para abrir una conexion a la BD
            Connection con = c.abrirConexionAdmin();
           //Para ejecutar la consulta
            Statement s = con.createStatement();
            
            //Ejecutamos la consulta que es la llamada a un SP de MySQL y los datos los almacenamos en un ResultSet
            int registro = s.executeUpdate("SELECT UsuId as Id, UsuNombre as Nombre, UsuPass as Pass FROM usuarios WHERE UsuNombre = '" + vrUsuNombre + "' and UsuPass = '" + vrUsuPass + "';");
            
            //Guardamos los resultados en los atributos correspondientes
            this.vUsuId = rs.getInt("Id");
            this.vUsuNombre = rs.getString("Nombre");
            this.vUsuPass = rs.getString("Pass");
            
            c.cerrarConexionAdmin(con);
            return true;                       
        }
        catch(SQLException e){
            return false;
        }
   } */
}

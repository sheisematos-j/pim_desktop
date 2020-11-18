/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.data;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConexaoBanco {
    
//    public Statement stm;
//    public ResultSet rs;
//    private String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
//    private String caminho = "jdbc:sqlserver://Local_DB_Dani;1433/Blockchain";
//    private String usuario = "NEXTEL\\DSi153"; 
//    private String senha = "";
//    public Connection con;
    
    private String servidor;
    private String banco;
    private String usuário;
    private String senha;
    private Connection conexao;
    
    public ConexaoBanco()
    {
    
            this.servidor = "localhost";
            this.banco = "Blockchain";
            this.usuário = "root";
            this.senha = "root";                    
    }
    
    public boolean conectar()
    {
        try
        {
        this.conexao = DriverManager.getConnection("jdbc:mysql://"+this.servidor+"/"+this.banco, this.usuário, this.senha);
        return true;
        }
        catch(SQLException ex){
            throw new RuntimeException(ex);
        }
    }
    public Connection getConnection(){
        return conexao; 
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import classes.cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristiano
 */
public class DBConexion {
    private static String DRIVER = "com.mysql.jdbc.Driver";
    private static String USUARIO = "root";
    private static String PASSWORD= "123456";
    private static String URL = "jdbc:mysql://localhost:3306/cadastro";
    
    static {
        try{
            Class.forName(DRIVER);
            }catch (ClassNotFoundException e){
                JOptionPane.showMessageDialog(null,"Erro no Drive:"+ e);
            }
    } 
    public Connection getConnection(){
        Connection con = null;
                try {
                    con=DriverManager.getConnection(URL,USUARIO,PASSWORD);
                    JOptionPane.showMessageDialog(null,"EXITO NA CONEXAO ");
                }catch (SQLException e){
                    JOptionPane.showMessageDialog(null,"ERRO NA CONEXAO"+e);
    }
                return con;
    }    

    public int Incluir(cliente objcli) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    }
    
  
    
    
    
    
    

    

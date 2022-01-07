/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristiano
 */
public class conexao {
    
    public static void main(String[] args){
    DBConexion db = new DBConexion();
    db.getConnection();

    }}

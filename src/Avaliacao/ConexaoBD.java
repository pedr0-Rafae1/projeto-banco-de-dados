/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Avaliacao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Windows 10
 */
public class ConexaoBD {
    
    private String driver = "com.mysql.jdbc.Driver";
    private String banco = "banco";
    private String host = "localhost";
    private String str_conn = "jdbc:mysql://" + host + ":3306/" + banco;
    private String usuario = "root";
    private String senha = "";
    
    Connection con;
    PreparedStatement estado;
    
    protected void conectar(){
        
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(str_conn, usuario, senha);
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "erro ao encontrar driver");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao conectar");
        }
        
    }
    
    protected void fecharconexao(){
        try {
            con.close();
            estado.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao fechar conexao");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 
package Avaliacao;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Windows 10
 */
public class ConexaoRegistroPeso extends ConexaoBD{
    
    public void inserir(RegistroPeso p){
        String sql = "insert into registropeso values (?,?,?,?,?)";
        conectar();
        
        try {
            estado = con.prepareStatement(sql);
            estado.setInt(1, p.getId());
            estado.setString(2, p.getNome_animal());
            estado.setString(3, p.getData_pessagem());
            estado.setDouble(4, p.getPeso_anterior());
            estado.setDouble(5, p.getPeso_atual());
            
            estado.execute();
            
            JOptionPane.showMessageDialog(null, "cadastro com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao cadastrar" + ex.getMessage());
        }finally{
            fecharconexao();
        }
    }
    
    public void atualizar(RegistroPeso p){
        String sql = "update registropeso set nome_animal = ?, data_pessagem = ?, peso_anterior = ?, peso_atual = ? where id = ?";
        conectar();
        
        try {
            estado = con.prepareStatement(sql);
            estado.setInt(5, p.getId());
            estado.setString(1, p.getNome_animal());
            estado.setString(2, p.getData_pessagem());
            estado.setDouble(3, p.getPeso_anterior());
            estado.setDouble(4, p.getPeso_atual());
            
            estado.execute();
            
            JOptionPane.showMessageDialog(null, "atualizar com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao atualizar");
        }finally{
            fecharconexao();
        }
    }
    
    public void remover(RegistroPeso p){
        String sql = "delete from registropeso where id = ?";
        conectar();
        
        try {
            estado = con.prepareStatement(sql);
            estado.setInt(1, p.getId());
            
            estado.execute();
            
            JOptionPane.showMessageDialog(null, "removido com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao remover");
        }finally{
            fecharconexao();
        }
    }
}

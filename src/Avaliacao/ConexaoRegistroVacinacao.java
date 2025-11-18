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
public class ConexaoRegistroVacinacao extends ConexaoBD{
    
    public void inserir(RegistroVacinacao r){
        String sql = "insert into registrovacinacao values (?,?,?,?,?,?)";
        conectar();
        
        try {
            estado = con.prepareStatement(sql);
            estado.setInt(1, r.getId());
            estado.setString(2, r.getVacina());
            estado.setString(3, r.getData_aplicacao());
            estado.setString(4, r.getAplicador());
            estado.setString(5, r.getReacao());
            estado.setString(6, r.getMotivo());
            
            estado.execute();
            
            JOptionPane.showMessageDialog(null, "cadastro com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao cadastrar");
        }
    }
    
    public void atualizar(RegistroVacinacao r){
        String sql = "update registrovacinacao set vacina = ?, data_aplicacao = ?, aplicador = ?, reacao = ?, motivo = ? where id = ?";
        conectar();
        
        try {
            estado = con.prepareStatement(sql);
            estado.setInt(6, r.getId());
            estado.setString(1, r.getVacina());
            estado.setString(2, r.getData_aplicacao());
            estado.setString(3, r.getAplicador());
            estado.setString(4, r.getReacao());
            estado.setString(5, r.getMotivo());
            
            estado.execute();
            
            JOptionPane.showMessageDialog(null, "atualizado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao atualizar " + ex.getMessage());
        }finally{
            fecharconexao();
        }
    }
    
    public void remover(RegistroVacinacao r){
        String sql = "delete from registrovacinacao where id = ?";
        conectar();
        
        try {
            estado = con.prepareStatement(sql);
            estado.setInt(1, r.getId());
            
            estado.execute();
            
            JOptionPane.showMessageDialog(null, "removido com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao remover");
        }finally{
            fecharconexao();
        }
    }
}

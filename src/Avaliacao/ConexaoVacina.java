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
public class ConexaoVacina extends ConexaoBD{
    
    public void inserir(Vacina v){
        String sql = "insert into vacina values (?,?,?,?,?,?)";
        conectar();
        
        try {
            estado = con.prepareStatement(sql);
            estado.setInt(1,v.getId());
            estado.setString(2, v.getNome_vacina());
            estado.setString(3,v.getModelo_vacina());
            estado.setString(4, v.getDescricao());
            estado.setString(5, v.getFabricante());
            estado.setString(6, v.getData_validade());
            estado.execute();
            
            JOptionPane.showMessageDialog(null, "cadastro com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao cadastrar");
        }finally{
            
        }
    }
    
    public void atualizar(Vacina v){
        String sql = "update vacina set nome_vacina = ?, modelo_vacina = ?, descricao = ?, fabricante = ?, data_validade = ? where id = ?";
        conectar();
        
        try {
            estado = con.prepareStatement(sql);
            estado.setInt(6,v.getId());
            estado.setString(1, v.getNome_vacina());
            estado.setString(2,v.getModelo_vacina());
            estado.setString(3, v.getDescricao());
            estado.setString(4, v.getFabricante());
            estado.setString(5, v.getData_validade());
            estado.execute();
            
            JOptionPane.showMessageDialog(null, "atualizado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao atualizar");
        }finally{
            
        }
    }
    
    public void remover(Vacina v){
        String sql = "delete from vacina where id = ?";
        conectar();
        
        try {
            estado = con.prepareStatement(sql);
            estado.setInt(1,v.getId());
            
            estado.execute();
            
            JOptionPane.showMessageDialog(null, "removido com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao remover");
        }finally{
            
        }
    }
}

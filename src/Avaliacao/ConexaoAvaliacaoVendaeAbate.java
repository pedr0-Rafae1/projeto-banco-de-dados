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
public class ConexaoAvaliacaoVendaeAbate extends ConexaoBD {
    
    public void inserir(AvalicacaoVendaeAbate v){
        String sql = "insert into avaliacaovendaeabate values (?,?,?,?,?,?,?)";
        conectar();
        
        try {
            estado = con.prepareStatement(sql);
            estado.setInt(1, v.getId());
            estado.setString(2, v.getNome_animal());
            estado.setInt(3, v.getIdade());
            estado.setDouble(4, v.getPeso());
            estado.setString(5, v.getEspecie());
            estado.setString(6, v.getRaca());
            estado.setString(7, v.getFinalidade());
            
            estado.execute();
            
            JOptionPane.showMessageDialog(null, "cadastro com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao cadastrar");
        }finally{
            fecharconexao();
        }
        
    }
    
    public void atualizar(AvalicacaoVendaeAbate v){
        String sql = "update avaliacaovendaeabate set nome_animal = ?, idade = ?, peso = ?, especie = ?, raca = ?, finalidade = ? where id = ?";
        conectar();
        
        try {
            estado = con.prepareStatement(sql);
            estado.setInt(7, v.getId());
            estado.setString(1, v.getNome_animal());
            estado.setInt(2, v.getIdade());
            estado.setDouble(3, v.getPeso());
            estado.setString(4, v.getEspecie());
            estado.setString(5, v.getRaca());
            estado.setString(6, v.getFinalidade());
            
            estado.execute();
            
            JOptionPane.showMessageDialog(null, "atualizado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao atualizar");
        }finally{
            fecharconexao();
        }
        
    }
    
    public void remover(AvalicacaoVendaeAbate v){
        String sql = "delete from avaliacaovendaeabate where id = ?";
        conectar();
        
        try {
            estado = con.prepareStatement(sql);
            estado.setInt(1, v.getId());
            
            
            estado.execute();
            
            JOptionPane.showMessageDialog(null, "removido com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao remover");
        }finally{
            fecharconexao();
        }
        
    }
}

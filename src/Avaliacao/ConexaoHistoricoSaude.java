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
public class ConexaoHistoricoSaude extends ConexaoBD{
    
    public void inserir(HistoricoSaude h){
        String sql = "insert into historicosaude values (?,?,?,?,?)";
        conectar();
        
        try {
            estado = con.prepareStatement(sql);
            estado.setInt(1, h.getId());
            estado.setString(2, h.getNome_responsavel());
            estado.setString(3, h.getData_registro());
            estado.setString(4, h.getDescricao());
            estado.setString(5, h.getTratamento());
            
            estado.execute();
            
            JOptionPane.showMessageDialog(null, "cadastro com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao cadastrar");
        }finally{
            fecharconexao();
        }
    }
    
    public void atualizar(HistoricoSaude h){
        String sql = "update historicosaude set nome_responsavel = ?, data_registro = ?, descricao = ?, tratamento = ? where id = ?";
        conectar();
        
        try {
            estado = con.prepareStatement(sql);
            estado.setInt(5, h.getId());
            estado.setString(1, h.getNome_responsavel());
            estado.setString(2, h.getData_registro());
            estado.setString(3, h.getDescricao());
            estado.setString(4, h.getTratamento());
            
            estado.execute();
            
            JOptionPane.showMessageDialog(null, "atualizado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao atualizar");
        }finally{
            fecharconexao();
        }
    }
    
    public void remover(HistoricoSaude h){
        String sql = "delete from historicosaude where id = ?";
        conectar();
        
        try {
            estado = con.prepareStatement(sql);
            estado.setInt(1, h.getId());
            
            estado.execute();
            
            JOptionPane.showMessageDialog(null, "remover com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao remover");
        }finally{
            fecharconexao();
        }
    }
}

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
public class ConexaoUsuario extends ConexaoBD{
    
    public void inserir(Usuario u){
        String sql = "insert into usuario values (?,?,?,?,?,?,?,?,?)";
        conectar();
        
        try {
            estado = con.prepareStatement(sql);
            estado.setString(1, u.getCpf());
            estado.setString(2, u.getNome());
            estado.setString(3, u.getEmail());
            estado.setString(4, u.getSexo());
            estado.setString(5, u.getTel());
            estado.setString(6, u.getEstado());
            estado.setString(7, u.getMunicipio());
            estado.setString(8, u.getSenha());
            estado.setString(9, u.getTipo_usu());
            
            estado.execute();
                   
            JOptionPane.showMessageDialog(null, "cadastro com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao cadastrar " + ex.getMessage());
            ex.printStackTrace();
        }finally{
            fecharconexao();
        }   
    }
    
    public void atualizar(Usuario u){
        String sql = "update usuario set nome = ?, email = ?, sexo = ?, tel = ?, estado = ?, municipio = ?, senha = ?, tipo_usu = ? where cpf = ?";
        conectar();
        
        try {
            estado = con.prepareStatement(sql);
            estado.setString(9, u.getCpf());
            estado.setString(1, u.getNome());
            estado.setString(2, u.getEmail());
            estado.setString(3, u.getSexo());
            estado.setString(4, u.getTel());
            estado.setString(5, u.getEstado());
            estado.setString(6, u.getMunicipio());
            estado.setString(7, u.getSenha());
            estado.setString(8, u.getTipo_usu());
            
            estado.execute();
                   
            JOptionPane.showMessageDialog(null, "atualizado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao atualizar " + ex.getMessage());
        }finally{
            fecharconexao();
        }
    }
    
    public void remover(Usuario u){
        String sql = "delete from usuario where cpf = ?";
        conectar();
        
        try {
            estado = con.prepareStatement(sql);
            estado.setString(1, u.getCpf());
            
            
            estado.execute();
                   
            JOptionPane.showMessageDialog(null, "removido com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao remover");
        }finally{
            fecharconexao();
        }
    }
}

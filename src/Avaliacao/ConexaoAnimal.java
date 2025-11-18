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
public class ConexaoAnimal extends ConexaoBD{
    
    public void inserir(Animal a){
        String sql = "insert into animal values (?,?,?,?,?,?,?,?)";
        conectar();
        
        try {
            estado = con.prepareStatement(sql);
            estado.setInt(1, a.getId());
            estado.setString(2, a.getNome());
            estado.setString(3, a.getEspecie());
            estado.setString(4, a.getRaca());
            estado.setString(5, a.getData_nascimento());
            estado.setString(6, a.getSexo());
            estado.setDouble(7, a.getAltura());
            estado.setDouble(8, a.getPeso());
            
            estado.execute();
            
            JOptionPane.showMessageDialog(null, "cadastro com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao cadastrar " + ex.getMessage());
            ex.printStackTrace();
        }
    }
    
    public void atualizar(Animal a){
        String sql = "update animal set nome = ?, especie = ?, raca = ?, data_nascimento = ?, sexo = ?, altura = ?, peso = ? where id = ?";
        conectar();
        
        try {
            estado = con.prepareStatement(sql);
            estado.setInt(8, a.getId());
            estado.setString(1, a.getNome());
            estado.setString(2, a.getEspecie());
            estado.setString(3, a.getRaca());
            estado.setString(4, a.getData_nascimento());
            estado.setString(5, a.getSexo());
            estado.setDouble(6, a.getAltura());
            estado.setDouble(7, a.getPeso());
            
            estado.execute();
            
            JOptionPane.showMessageDialog(null, "atualizado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao atualizar");
        }
    }
    
    public void remover(Animal a){
        String sql = "delete from animal where id = ?";
        conectar();
        
        try {
            estado = con.prepareStatement(sql);
            estado.setInt(1, a.getId());
            
            estado.execute();
            
            JOptionPane.showMessageDialog(null, "removido com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao remover");
        }
    }
    
}

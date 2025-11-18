/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Avaliacao;

/**
 *
 * @author Windows 10
 */
public class RegistroPeso {
    
    private int id;
    private String nome_animal;
    private String data_pessagem;
    private double peso_anterior;
    private double peso_atual;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_animal() {
        return nome_animal;
    }

    public void setNome_animal(String nome_animal) {
        this.nome_animal = nome_animal;
    }

    public String getData_pessagem() {
        return data_pessagem;
    }

    public void setData_pessagem(String data_pessagem) {
        this.data_pessagem = data_pessagem;
    }

    public double getPeso_anterior() {
        return peso_anterior;
    }

    public void setPeso_anterior(double peso_anterior) {
        this.peso_anterior = peso_anterior;
    }

    public double getPeso_atual() {
        return peso_atual;
    }

    public void setPeso_atual(double peso_atual) {
        this.peso_atual = peso_atual;
    }
    
    
    
}

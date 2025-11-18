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
public class RegistroVacinacao {
    
    private int id;
    private String vacina;
    private String data_aplicacao;
    private String aplicador;
    private String reacao;
    private String motivo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVacina() {
        return vacina;
    }

    public void setVacina(String vacina) {
        this.vacina = vacina;
    }

    public String getData_aplicacao() {
        return data_aplicacao;
    }

    public void setData_aplicacao(String data_aplicacao) {
        this.data_aplicacao = data_aplicacao;
    }

    public String getAplicador() {
        return aplicador;
    }

    public void setAplicador(String aplicador) {
        this.aplicador = aplicador;
    }

    public String getReacao() {
        return reacao;
    }

    public void setReacao(String reacao) {
        this.reacao = reacao;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoyoutube;

/**
 *
 * @author user
 */
public class Gafanhoto extends Pessoa{
    private String login;
    private int tot_assistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.setTot_assistido(0);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTot_assistido() {
        return tot_assistido;
    }

    public void setTot_assistido(int tot_assistido) {
        this.tot_assistido = tot_assistido;
    }
    
    public void viuMaisUm(){
        
    }
    
    @Override
    protected void ganharExp() {
        this.setExperiencia(this.getExperiencia() + 1);
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "\nlogin=" + login + ", tot_assistido=" + tot_assistido + '}';
    }
    
    
    
}

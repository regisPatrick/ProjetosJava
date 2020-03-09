/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reinoanimalpolimorfismo;

/**
 *
 * @author user
 */
public class Peixe extends Animal{
    private String cor_escama;

    public String getCor_escama() {
        return cor_escama;
    }

    public void setCor_escama(String cor_escama) {
        this.cor_escama = cor_escama;
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substância");
    }

    @Override
    public void emitiirSom() {
        System.out.println("Peixe não faz som");
    }
    
    public void soltarBolha(){
        System.out.println("Soltou uma bolha");
    }
    
}

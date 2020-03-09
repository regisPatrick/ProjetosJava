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
public class Reptil extends Animal{
    private String cor_escama;

    public String getCor_escama() {
        return cor_escama;
    }

    public void setCor_escama(String cor_escama) {
        this.cor_escama = cor_escama;
    }

    @Override
    public void locomover() {
        System.out.println("Rastejanto");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais");
    }

    @Override
    public void emitiirSom() {
        System.out.println("Som de Reptil");
    }
    
    
}

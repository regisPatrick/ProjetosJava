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
public class Ave extends Animal{
    private String cor_pena;

    public String getCor_pena() {
        return cor_pena;
    }

    public void setCor_pena(String cor_pena) {
        this.cor_pena = cor_pena;
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitiirSom() {
        System.out.println("Som de ave");
    }

    public void fazerNinho(){
        System.out.println("Construiu um ninho");
    }
        
}

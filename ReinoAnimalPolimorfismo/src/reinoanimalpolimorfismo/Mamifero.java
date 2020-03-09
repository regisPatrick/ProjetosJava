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
public class Mamifero extends Animal{
    private String cor_pelo;

    public String getCor_pelo() {
        return cor_pelo;
    }

    public void setCor_pelo(String cor_pelo) {
        this.cor_pelo = cor_pelo;
    }

    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitiirSom() {
        System.out.println("Som de mamífero");
    }
    
    
}

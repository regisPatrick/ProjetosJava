/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caespolimorfismodesobrecarga;

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
    public void emitirSom() {
        System.out.println("Som de Mamífero");
    }
        
}

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
public class ReinoAnimalPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara e = new Arara();
        
        m.setPeso(35.3f);
        m.setCor_pelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitiirSom();
        
        a.locomover();
        
        p.locomover();
        
        r.locomover();
        
        c.locomover();
        c.emitiirSom();
        
        t.locomover();
        
        k.locomover();
        k.emitiirSom();
    }
    
}

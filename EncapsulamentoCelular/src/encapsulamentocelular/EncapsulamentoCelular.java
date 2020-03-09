/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamentocelular;

/**
 *
 * @author user
 */
public class EncapsulamentoCelular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Celular c = new Celular(988880099, "Demerval");
        c.ligarCelular();
        c.telefonar();
        c.desligarTelenonema();
        c.desligarCelular();
        c.statusCelular();
    }
    
}

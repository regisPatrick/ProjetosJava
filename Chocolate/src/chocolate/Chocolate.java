/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chocolate;

/**
 *
 * @author user
 */
public class Chocolate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PoteDeChocolate pc = new PoteDeChocolate();
        pc.tamanho = 20;
        pc.cheio = false;
        pc.tampado = true;
        pc.formato = "redondo";
        pc.destampado();
        pc.encherPote();
        pc.comerChocolate();
        pc.status();
    }
    
}

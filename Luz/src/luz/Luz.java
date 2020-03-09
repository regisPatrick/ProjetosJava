/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luz;

/**
 *
 * @author user
 */
public class Luz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Luminaria l = new Luminaria();
        l.tipo_lampada = "led";
        l.claridade = 25.5f;
        l.ligada = false;
        l.cor_lampada = "azul";
        l.qtde_lampada = 8;
        
        l.ligar();
        l.informaQuantidadeDeLampadas(6);
        l.status();
        
        Luminaria lu = new Luminaria();
        lu.tipo_lampada = "halógena";
        lu.qtde_lampada = 8;
        lu.ligada = true;
        lu.desligar();
        lu.informaQuantidadeDeLampadas(8);
        lu.status();
    }
    
}

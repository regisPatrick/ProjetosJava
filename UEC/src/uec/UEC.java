/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uec;

/**
 *
 * @author user
 */
public class UEC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Lutador prettyboy = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        Lutador putscript = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        Lutador snapshadow = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        Lutador deadcode = new Lutador("Deadcode", "Australia", 28, 1.93f, 81.6f, 13, 0, 2);
        Lutador ufocobol = new Lutador("Ufocobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        Lutador nerdaard = new Lutador("Nerdaard", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
        */
        //prettyboy.situacao();
        //putscript.situacao();
        //snapshadow.situacao();
        //deadcode.situacao();
        //ufocobol.situacao();
        //nerdaard.situacao();
        
        
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        l[3] = new Lutador("Deadcode", "Australia", 28, 1.93f, 81.6f, 13, 0, 2);
        l[4] = new Lutador("Ufocobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        l[5] = new Lutador("Nerdaard", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
        
        
        /*prettyboy.apresentar();
        prettyboy.status();
        prettyboy.ganharLuta();
        prettyboy.perderLuta();
        prettyboy.empatarLuta();
        prettyboy.apresentar();
        prettyboy.status();
        
        
        l[0].apresentar();
        l[0].status();
        l[0].ganharLuta();
        l[0].perderLuta();
        l[0].empatarLuta();
        l[0].apresentar();
        l[3].status();
        
        l[4].apresentar();
        */
        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[4], l[5]);
        UEC01.lutar();
        l[4].status();
        l[5].status();
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testevar;

/**
 *
 * @author user
 */
public class TesteVar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char c = 'c';
        int i = 10;
        double d = 10;
        long l = 1;
        String s = "Hello";
        
        // ERRO c = c + i;
        // Correto s += i;
        // Erro i += s;
        // Erro c += s;
        // Correto i += l;
    }
    
}

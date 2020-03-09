/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leituralivros;

/**
 *
 * @author user
 */
public class LeituraLivros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p[] = new Pessoa[3];
        p[0] = new Pessoa("Regis", 33, "M");
        p[1] = new Pessoa("Pedez", 21, "M");
        p[2] = new Pessoa("Margarete", 40, "F");
        
        Livro l[] = new Livro[2];
        l[0] = new Livro(22, 220, "A metamorfose", "Franz Kafka", p[1]);
        l[1] = new Livro(78, 500, "A revolução dos bichos", "George Orwell", p[1]);
        
        l[0].detalhes();
        l[0].abrir();
        l[0].folhear();
        p[1].fazerAniver();
        l[0].avancarPag();
        l[0].avancarPag();
        l[0].voltarPag();
        l[0].folhear();
        l[0].detalhes();
        l[0].fechar();
        l[0].detalhes();
    }
    
}

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
public class Luminaria {
    String tipo_lampada;
    float claridade;
    boolean ligada;
    String cor_lampada;
    int qtde_lampada;
    
    void ligar(){
        this.ligada = true;
    }
    
    void desligar(){
        this.ligada = false;
    }
    
    void informaQuantidadeDeLampadas(int n){
        if(n != this.qtde_lampada){
            System.out.println("A quantidade de lampadas desta "
                    + "luminaria é: " + this.qtde_lampada + ", não pode"
                            + " ser " + n);
        }else{
            System.out.println(n + " é a quantidade de lampadas desta luminaria");
        }
    }
    
    void status(){
        System.out.println("O tipo da lampada é: " + this.tipo_lampada);
        System.out.println("A claridade da lampada está em: " + this.claridade + "%");
        System.out.println("A lampada está ligadda: " + this.ligada);
        System.out.println("A cor da lampada é: " + this.cor_lampada);
        System.out.println("A quantidade de lampadas desta luminaria é: " + this.qtde_lampada);
    }
}

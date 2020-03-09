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
public class PoteDeChocolate {
    
    int tamanho;
    boolean cheio;
    String formato;
    boolean tampado;
    
    void tampar(){
        this.tampado = true;
    }
    
    void destampado(){
        this.tampado = false;
    }
    
    void encherPote(){
        this.cheio = true;
    }
    
    void esvaziarPote(){
        this.cheio = false;
    }
    
    void comerChocolate(){
        if((this.tampado == false) && (this.cheio == true)){
            System.out.println("Comer chocolate!!!");
        }else{
            System.out.println("Acabou o chocolate!!!");
        }
    }
    
    void status(){
        System.out.println("O tamanho do pote é: " + this.tamanho + "cm");
        System.out.println("O pote está cheio: " + this.cheio);
        System.out.println("O formato do pote é: " + this.formato);
        System.out.println("O pote está tampado: " + this.tampado);
    }
    
}

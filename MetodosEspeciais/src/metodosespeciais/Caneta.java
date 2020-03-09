/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosespeciais;

/**
 *
 * @author user
 */
public class Caneta {
    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    
    
    public Caneta(String m, String c, float p){ //Este é o metodo construtor
        this.setModelo(m);
        this.setCor(c);
        this.setPonta(p);
        this.tampar();
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public void setCor(String c){
        this.cor = c;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta(float p){
        this.ponta = p;
    }
    
    public boolean getTampada(){
        return this.tampada;
    }
    
    public void setTampada(boolean t){
        this.tampada = t;
    }
    
    public void tampar(){
        this.setTampada(true);
    }
    
    public void destampar(){
        this.setTampada(false);
    }
    
    public void status(){
        System.out.println("Sobre a caneta: ");
        System.out.println("O modelo da caneta é: " + this.getModelo());
        System.out.println("A ponta da caneta é: " + this.getPonta());
        System.out.println("A cor da caneta é: " + this.getCor());
        System.out.println("Tampada: " + this.getTampada());
    }
    
}

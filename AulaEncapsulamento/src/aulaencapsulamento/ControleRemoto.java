/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaencapsulamento;

/**
 *
 * @author user
 */
public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
    }  

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if(this.getLigado()){
        System.out.println("--------------Menu------------");
        System.out.println("Está ligado: " + this.getLigado());
        System.out.println("Está tocando: " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        for(int i = 0; i <= this.getVolume(); i += 10){
            System.out.print("|");
        }
        System.out.println("");
        }else{
            System.out.println("O menu nao pode ser exibido");
        }
    }

    @Override
    public void fecharMenu() {
        if(this.getLigado()){
        System.out.println("Fechando Menu...");
        }else{
            System.out.println("O menu não pode ser desligado");
        }
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() + 5);
        }else{
            System.out.println("Impossivel aumentar o volume");
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() - 5);
        }else{
            System.out.println("Impossivel diminuir o volume");
        }
    }

    @Override
    public void ligarMudo() {
        if((this.getLigado()) && (this.getVolume() > 0)){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if((this.getLigado()) && (this.getVolume() == 0)){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if((this.getLigado()) && !(this.getTocando())){
            this.setTocando(true);
        }else{
            System.out.println("Não consegui reproduzir");
        }
    }

    @Override
    public void pause() {
        if((this.getLigado()) && (this.getTocando())){
            this.setTocando(false);
        }else{
            System.out.println("Não consegui pausar");
        }
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uec;

import java.util.Random;

/**
 *
 * @author user
 */
public class Luta implements InterfaceLuta{
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    
    @Override
    public void marcarLuta(Lutador l1, Lutador l2) {
        if((l1.getCategoria().equals(l2.getCategoria())) && l1 != l2){
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        }else{
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }

    @Override
    public void lutar() {
        if(this.getAprovada()){
            System.out.println("=========Desafiado==========");
            this.getDesafiado().apresentar();
            System.out.println("========Desafiante==========");
            this.getDesafiante().apresentar();
            
            Random aleatorio = new Random();
            int vencedor =  aleatorio.nextInt(3);

            System.out.println("==========Resultado da luta==============");
            switch(vencedor){
                case 0: 
                    System.out.println("Empatou!!!");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                    break;
                case 1:
                    System.out.println("O vencedor da luta foi: " + this.getDesafiado().getNome());
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                    break;
                case 2:
                    System.out.println("O vencedor da luta foi: " + this.getDesafiante().getNome());
                    this.getDesafiado().perderLuta();
                    this.getDesafiante().ganharLuta();
                    break;
            }
            System.out.println("==========================================");
        }else{
                    System.out.println("Luta não pode acontecer!!!");
        }
    }
    
    
}

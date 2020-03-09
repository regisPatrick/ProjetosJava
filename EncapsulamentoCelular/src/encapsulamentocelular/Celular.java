/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamentocelular;

/**
 *
 * @author user
 */
public class Celular implements ControladorCelular{
    private int numero;
    private String nome;
    private boolean ocupado;
    private boolean ligado;

    public Celular(int numero, String nome) {
        this.setNumero(numero);
        this.setNome(nome);
        this.setOcupado(false);
        this.setLigado(false);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean getOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    @Override
    public void ligarCelular() {
        this.setLigado(true);
    }

    @Override
    public void desligarCelular() {
        this.setLigado(false);
    }

    @Override
    public void telefonar() {
        this.setOcupado(true);
        System.out.println("O telefone está ocupado");
    }

    @Override
    public void desligarTelenonema() {
        this.setOcupado(false);
        System.out.println("O telefone está disponivel para uso");
    }

    @Override
    public void statusCelular() {
        System.out.println("=========STATUS=========");
        System.out.println("O Celular está ligado: " + this.getLigado());
        System.out.println("O celular está em uso: " + this.getOcupado());
        System.out.println("O número do celular é: " + this.getNumero());
        System.out.println("O nome do dono(a) do celular é: " + this.getNome());
        System.out.println("========================");
    }
     
}

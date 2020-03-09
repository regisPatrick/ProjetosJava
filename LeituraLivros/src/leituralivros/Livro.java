/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leituralivros;

import java.util.Random;

/**
 *
 * @author user
 */
public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int tot_paginas;
    private int pag_atual;
    private boolean aberto;
    private Pessoa l;

    public Livro(int pa, int tp, String tit, String aut, Pessoa p) {
        this.setAberto(false);
        this.setPag_atual(pa);
        this.setTot_paginas(tp);
        this.setTitulo(tit);
        this.setAutor(aut);
        this.setL(p);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTot_paginas() {
        return tot_paginas;
    }

    public void setTot_paginas(int tot_paginas) {
        this.tot_paginas = tot_paginas;
    }

    public int getPag_atual() {
        return pag_atual;
    }

    public void setPag_atual(int pag_atual) {
        this.pag_atual = pag_atual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getL() {
        return l;
    }

    public void setL(Pessoa l) {
        this.l = l;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
        System.out.println("O livro está aberto");
    }

    @Override
    public void fechar() {
        this.setAberto(false);
        System.out.println("O livro está fechado");
    }

    @Override
    public void folhear() {
        
        if(this.getAberto()){
        
        Random folheando = new Random();
        int totp = folheando.nextInt(this.getTot_paginas());
        
        System.out.println("A página deste livro que eu folheei e caiu nela foi a: " + totp);
        }else{
            System.out.println("O livro precisa ser aberto para ser folheado");
        }
    }

    @Override
    public void avancarPag() {
        if(this.getAberto()){
        this.setPag_atual(this.getPag_atual() + 1);
            System.out.println("Página foi avançada");
        }else{
            System.out.println("O livro precisa estar aberto para avançar a página");
        }
    }

    @Override
    public void voltarPag() {
        if(this.getAberto()){
        this.setPag_atual(this.getPag_atual() - 1);
            System.out.println("Página foi voltada");
        }else{
            System.out.println("O livro precisa estar aberto para volta a pagina");
        }
    }
    
    public void detalhes(){
        System.out.println("-------------Detalhes do Livro---------------");
        System.out.println("O nome do livro é: " + this.getTitulo());
        System.out.println("O nome do autor é: " + this.getAutor());
        System.out.println("O total de páginas é: " + this.getTot_paginas());
        System.out.println("A pagina atual é: " + this.getPag_atual());
        System.out.println("O livro está aberto: " + this.getAberto());
        System.out.println("O leitor do livro é: " + this.getL().getNome());
        System.out.println("A idade do leitor é: " + this.getL().getIdade());
        System.out.println("O sexo do leitor é: " + this.getL().getSexo());
        System.out.println("---------------------------------------------");
    }
    
}

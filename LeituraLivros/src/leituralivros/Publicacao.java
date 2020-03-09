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
public interface Publicacao {
    public abstract void abrir();
    public abstract void fechar();
    public abstract void folhear();
    public abstract void avancarPag();
    public abstract void voltarPag();
}

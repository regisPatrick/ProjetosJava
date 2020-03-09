/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uec;

/**
 *
 * @author user
 */
public interface ILutador {
    public abstract void apresentar();
    public abstract void status();
    public abstract void ganharLuta();
    public abstract void perderLuta();
    public abstract void empatarLuta();
}

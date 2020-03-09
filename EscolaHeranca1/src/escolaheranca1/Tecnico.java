/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escolaheranca1;

/**
 *
 * @author user
 */
public final class Tecnico extends Aluno{
    private int registro_profissional = 3333;

    public int getRegistro_profissional() {
        return registro_profissional;
    }

    public void setRegistro_profissional(int registro_profissional) {
        this.registro_profissional = registro_profissional;
    }
    
    public void praticar(){
        System.out.println("Praticando...");
    }
    
}

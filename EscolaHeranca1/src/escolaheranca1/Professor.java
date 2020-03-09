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
public class Professor extends Pessoa{
    private String especialidade;
    private float salario = 500f;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public void receberAumento(){
        this.setSalario(this.getSalario() + 200f);
        System.out.println("O sálario novo será: " + this.getSalario());
    }
    
}

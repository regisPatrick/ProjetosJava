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
public final class Bolsista extends Aluno {
    private float bolsa;

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
        
    
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de: " + this.getNome());
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " é bolsista, pagamento facilitado!!!");
    }

    @Override
    public String toString() {
        return "Bolsista{" + "bolsa=" + bolsa + "nome=" + this.getNome() + ", idade=" + this.getIdade() + ", sexo=" + this.getSexo() + '}';
    }
    
    
    
}

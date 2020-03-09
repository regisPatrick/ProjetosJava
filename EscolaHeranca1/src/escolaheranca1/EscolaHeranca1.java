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
public class EscolaHeranca1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
        System.out.println(b1.toString());
        
        Professor p1 = new Professor();
        p1.setNome("Eustaqueo");
        System.out.println("O salário atual é: " + p1.getSalario());
        p1.receberAumento();
        System.out.println(p1.toString());
        
        Tecnico t1 = new Tecnico();
        System.out.println("O registro profissional é: " + t1.getRegistro_profissional());
        t1.praticar();
    }
    
}

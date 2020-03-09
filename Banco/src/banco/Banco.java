/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author user
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaBanco jubileu = new ContaBanco();
        jubileu.setNum_conta(01);
        jubileu.setDono("Jubileu");
        jubileu.abrirConta("cp");
        jubileu.depositarDinheiro(300f);
        jubileu.situacaoConta();
        
        ContaBanco creuza = new ContaBanco();
        creuza.setNum_conta(02);
        creuza.setDono("Creuza");
        creuza.abrirConta("cc");
        creuza.depositarDinheiro(500f);
        creuza.sacarDinheiro(100f);
        creuza.mensalidade();
        creuza.situacaoConta();
    }
    
}

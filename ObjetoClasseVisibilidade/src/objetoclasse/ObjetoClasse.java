/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetoclasse;

/**
 *
 * @author user
 */
public class ObjetoClasse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta();
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f; Esse atributo nao pode ser manipulado pois é private
        c1.carga = 80;
        //c1.tampada = true;
        c1.destampar();
        c1.status();
        c1.rabiscar();
    }
    
}

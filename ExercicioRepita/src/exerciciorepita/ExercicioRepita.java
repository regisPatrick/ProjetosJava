/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JOptionPane.showMessageDialog(null, "Olá, mundo!", "Boas Vindas", JOptionPane.WARNING_MESSAGE);
        //int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número: "));
        //JOptionPane.showMessageDialog(null, "O número que você digitou é: " + num);
        int n;//número entrada
        int soma_total = 0;//soma para calcular a media
        int media;//calcula a media
        int cc = 0;//Variavel para mostrar total de valores
        int cp = 0;//contador par
        int ci = 0;//contador impar
        int ccem = 0;//contador para numeros acima de cem
        do{ 
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um valor: <br><em>(0 interrompe)</em></html>"));
        if (n == 0){
                break;
        }
        cc ++;
        soma_total += n;
            if (n % 2 == 0){
                cp++;
            }else{
                ci++;
            }
            if (n > 100){ 
                ccem++;
            }
        }while (n != 0);
        media = soma_total / cc;
        JOptionPane.showMessageDialog(null, "<html>Resultado Final: <hr><br>" + 
                                            "<html>Total de Valores: " + cc +
                                            "<br><html>Total de Pares: " + cp +
                                            "<br><html>Total de Impares: " + ci +
                                            "<br><html>Acima de cem: " + ccem +
                                            "<br><html>Média dos Valores: " + media + "</html>", 
                                            "Resultado Final",
                                            JOptionPane.INFORMATION_MESSAGE);
        }
       
    
}

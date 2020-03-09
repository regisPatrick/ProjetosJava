/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor01;

import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    /*    int n[] = {3, 2, 8, 7, 5, 4};
        
        //System.out.println("O total de casas de N é: " + n.length);
        
        for(int c = 0; c <= n.length-1; c++){
            System.out.println("Na posição " + c + " temos o valor " + n[c]);
        }
        
        Calendar cal = Calendar.getInstance();
        int ano  = cal.get(Calendar.YEAR);*/
        
        int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ano: ", "Informe o ano", JOptionPane.INFORMATION_MESSAGE));
    
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai","Jun", 
                        "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int dia[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        boolean bissexto = false;
        
        
        for (int cc = 0; cc < mes.length; cc++){
            if(ano % 400 == 0){
                bissexto = true;
                dia[1] = 29;
            } else if ((ano % 4 == 0) && (ano % 100 != 0)){
                bissexto = true;
                dia[1] = 29;
            }else{
                bissexto = false;
            }
            
            System.out.println("O mês de " + mes[cc] + " tem " +
                                dia[cc] + " dias!!!");
        }
            if(bissexto == true){
                System.out.println("O ano de " + ano + " é bissexto!!!");  
            }else{
                System.out.println("O ano de " + ano + " não é bissexto!!!");
            }
    }
    
}

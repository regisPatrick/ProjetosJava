/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horaidiomaresolucaodatela;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author user
 */
public class HoraIdiomaResolucaoDaTela {
    public static void main(String[] args) {
        Date data = new Date();
        System.out.println("A data do sistema é: ");
        System.out.println(data.toString());
        
        Locale idioma = Locale.getDefault();
        System.out.println("O idioma do sistema é: ");
        System.out.println(idioma.getLanguage());
        System.out.println(idioma.getCountry());
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension resolucao = tk.getScreenSize();
        System.out.println("A resolução da tela é: ");
        System.out.println("Altura (Height):" +resolucao.getHeight());
        System.out.println("Largura (Width):" +resolucao.getWidth());
    }
}

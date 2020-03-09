/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idiomadosistema;

import java.util.Locale;


/**
 *
 * @author user
 */
public class IdiomaDoSistema {
    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();
        System.out.println("O idioma do sistema é:");
        System.out.println(idioma.getDisplayLanguage());
        System.out.println(idioma.getLanguage());
    }
}

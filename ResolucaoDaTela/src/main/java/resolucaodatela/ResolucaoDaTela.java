/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucaodatela;

import java.awt.*;

/**
 *
 * @author user
 */
public class ResolucaoDaTela {
    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension resolucao = tk.getScreenSize();
        System.out.println("A resolução da tela é:");
        System.out.println("Altura (Height):" +resolucao.getHeight());
        System.out.println("Largura (width):" +resolucao.getWidth());
    }
}

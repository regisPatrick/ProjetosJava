/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellojavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author user
 */
public class HelloWorldController implements Initializable {

    @FXML
    private Label lblMensagem;
    private Button btnClick;
    
    @FXML
    
    private void clicouBotao(ActionEvent event){
        lblMensagem.setText("Ola Mundo FX!!!!!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}


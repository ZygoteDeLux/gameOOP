/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LemGame;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
//import javafx.scene.layout.AnchorPane;
//import javafx.scene.input.MouseEvent;

/**
 *
 * @author mehgn
 */
public class FXMLDocumentController implements Initializable {
    
    private Button pickupButton;
    @FXML
    private Button talkButton;
    @FXML
    private Button pickUp;
    @FXML
    private TextField print;
    
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    private void pickUp(ActionEvent event/*, Player player*/) {
//        player.pickUp();
        print.setText("What do you want to pick up");
//        this.pickupButton.setOnAction( e -> player.pickUp());
    }

    private void talk(ActionEvent event /*, Game game*/ ) {
//        game.talk();
//        this.talkButton.setOnAction( e -> game.talk());
    }
}
    
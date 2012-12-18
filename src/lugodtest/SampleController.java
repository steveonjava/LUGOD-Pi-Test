/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lugodtest;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author sjc
 */
public class SampleController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private TextField input;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText(input.getText());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}

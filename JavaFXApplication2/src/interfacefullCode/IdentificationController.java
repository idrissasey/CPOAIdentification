/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacefullCode;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import interfacefullCode.ContexteIdentification;

/**
 *
 * @author Idrissa SI
 */
public class IdentificationController implements Initializable {
    
    private TextField login ;
    private TextField password ;
   interfaceIdentification ui;
    
       
   ContexteIdentification contexte;
    
   public void setUI(interfaceIdentification ui){
      
       login = ui.login;
       password=ui.password;
 this.ui= ui;
     ui.setController(this);
       
   
   }
   
   
    
     void handleButtonAction(ActionEvent event) {
        //System.out.println("You clicked me!");
       // label.setText("Hello World!");
    }
    
   
    public void processOk(ActionEvent event) {
        System.out.println("login : "+ contexte.getLoginUtilisateurCo() + " est le mdp est " + contexte.getPasswordnUtilisateurCoProperty().getValue());
    }
    

    public  void processCancel(ActionEvent event) {
       login.textProperty().set("");
       password.textProperty().set("");
    }
    
    public void setContexte(ContexteIdentification context){
        
        this.contexte = context;
        context.getLoginUtilisateurCoProperty().bind(login.textProperty());
        context.getPasswordnUtilisateurCoProperty().bind(password.textProperty());
                }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

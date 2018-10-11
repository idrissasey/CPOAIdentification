/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacefulljavafx;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;


/**
 *
 * @author Idrissa SI
 */
public class FXMLIdentificationController implements Initializable {
    
    @FXML
    private TextField login ;
    @FXML
    private TextField pwd ;
    
       
   ContexteIdentification contexte;
    @FXML
    private ProgressBar progress;
    @FXML
    private Label commentaire;
    @FXML
    private BorderPane border;
    
    
    private void handleButtonAction(ActionEvent event) {
        //System.out.println("You clicked me!");
       // label.setText("Hello World!");
    }
    
        @FXML
    private void processOk(ActionEvent event) {
        System.out.println("login : "+ contexte.getLoginUtilisateurCo() + " est le mdp est " + contexte.getPasswordnUtilisateurCoProperty().getValue());
    }
    
        @FXML
    private void processCancel(ActionEvent event) {
       login.textProperty().set("");
       pwd.textProperty().set("");
    }
    
    public void setContexte(ContexteIdentification context){
        
        this.contexte = context;
        context.getLoginUtilisateurCoProperty().bind(login.textProperty());
        context.getPasswordnUtilisateurCoProperty().bind(pwd.textProperty());
    }
    
    public boolean isDigic(String c){
        Pattern p = Pattern.compile("-?\\d+");
        Matcher m = p.matcher(c);
        if (m.find()) {
             System.out.println(m.group());
        }
        return m.find();
        
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        
        progress.setProgress(pwd.getText().length()/8.0f);
        
        Image image = new Image(getClass().getResourceAsStream("attachment_70105628.jpg"));
        commentaire.setGraphic(new ImageView(image));
    
        
        pwd.textProperty().addListener(new ChangeListener<String> () {
         @Override
        public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue){
//            progress.setProgress(newValue.length()/8.0f);
StringBuilder comment = new StringBuilder("Attetion");
            if(!newValue.matches(".*\\d+.*")){
                comment.append(" doit contenir un chiffre");
            }
            if(!newValue.matches("[a-aZ-Z0-9]+")){
                comment.append(" doit contenir un alphanum");
            }
            


            commentaire.setText(comment.toString());
          //  
        }
        });
        progress.progressProperty().bind(pwd.textProperty().length().divide(8.0f));
        
    }
}

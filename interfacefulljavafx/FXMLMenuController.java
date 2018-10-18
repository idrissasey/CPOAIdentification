/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacefulljavafx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Idrissa SI
 */
public class FXMLMenuController implements Initializable {
    
    ContexteMenu contexte;
    @FXML
    private MenuItem profilMenu;
    @FXML
    private MenuItem avatarMenu;
    @FXML
    private MenuItem quitterMenu;
    @FXML
    private Menu Menu;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void setContexte(ContexteMenu context){
        
        this.contexte = context;
       // contexte.getPersonne().getDetailsCoProperty().bind(details.textProperty());

    }

    @FXML
    private void afficherProfil(ActionEvent event) {
        Alert message = new Alert(Alert.AlertType.INFORMATION);
        message.setTitle("Vos identifiants");
        message.setContentText("Nom : " + this.contexte.getPersonne().getNomVal() + " Login : " + this.contexte.getPersonne().getLogin() + " Adresse : "   + this.contexte.getPersonne().getAdresse1Val());
        message.show();

    }

    @FXML
    private void afficherAvatar(ActionEvent event) throws IOException {
        
            Personne p = this.contexte.getPersonne();           
            Stage stageAvatar = new Stage();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("pageAccueil.fxml"));
            Parent root = loader.load();
            PageAccueilController controleur =  loader.getController();
            //création d'un nouveau contexte 
            ContexteMenu contexteP = new ContexteMenu(p);
            controleur.setContexte(contexteP);
            Scene scene = new Scene(root);

            stageAvatar.setScene(scene);
            stageAvatar.show();
    }

    @FXML
    private void quitter(ActionEvent event) {
        System.exit(0);
    }
        
        
}

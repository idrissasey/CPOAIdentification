/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacefullCode;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


/**
 *
 * @author Idrissa SI
 */
public class JavApplication extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        /*FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("FXMLIdentification.fxml"));
        Parent root = loader.load();
        */
        
        BorderPane interfac = (BorderPane) new interfaceIdentification();
        IdentificationController controleur = new IdentificationController();
      
       ContexteIdentification contexte = new ContexteIdentification(new Personnes());
       controleur.setUI((interfaceIdentification)interfac);
       controleur.setContexte(contexte);
        
        Scene scene = new Scene(interfac);
       stage.setScene(scene);
       scene.getStylesheets().add(IdentificationController.class.getResource("style.css").toExternalForm());
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

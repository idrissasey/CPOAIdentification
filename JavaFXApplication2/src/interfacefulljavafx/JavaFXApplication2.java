/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacefulljavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import interfacefulljavafx.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Idrissa SI
 */
public class JavaFXApplication2 extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("FXMLIdentification2.fxml"));
        Parent root = loader.load();
        FXMLIdentificationController controleur =  loader.getController();
        ContexteIdentification contexte = new ContexteIdentification(new Personnes());
        controleur.setContexte(contexte);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       launch(args);
    }
    
}

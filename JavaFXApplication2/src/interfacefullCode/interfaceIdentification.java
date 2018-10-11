/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacefullCode;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;


/**
 *
 * @author Idrissa SI
 */
public class interfaceIdentification extends BorderPane{
    
    Label titre;
     TextField login;
     PasswordField password;
  IdentificationController controleur;
    
    public interfaceIdentification (){
        titre = new Label("Identification");
        titre.setId("titre");
        this.setTop(titre);// met en haut
        this.setAlignment(titre, Pos.CENTER);
        
        GridPane centerPane = new GridPane();
        Label label1 = new Label("Login");
        
        label1.setPrefWidth(100);
        centerPane.add(label1,0,0);
        Label label2 = new Label("Password");
        label2.setPrefWidth(100);
        centerPane.add(label2,0,1);
        
        
        password = new PasswordField();
        login = new TextField();
        centerPane.add(login, 1, 0);
        centerPane.add(password, 1, 1);
        this.setCenter(centerPane);
        this.setAlignment(centerPane, Pos.CENTER);
        
        FlowPane bottomPane = new FlowPane();
        bottomPane.setHgap(10);
        
       
        Button okButton = new Button("Ok");
        okButton.setDefaultButton(true);
      okButton.setOnAction(e -> {controleur.processOk(e);});
        Button cancelButton = new Button("Cancel");
        cancelButton.setDefaultButton(true);
      cancelButton.setOnAction(e -> {controleur.processCancel(e);});
        
        bottomPane.getChildren().addAll(okButton,cancelButton);
        bottomPane.setAlignment(Pos.CENTER);
        this.setBottom(bottomPane);
    
        this.setPrefSize(437, 187);
        this.setPadding(new Insets(10,0,10,0));
       
    }
    
    public void setController(IdentificationController controleur){
        this.controleur = controleur;
    }
}

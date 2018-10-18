/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacefulljavafx;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

/**
 * FXML Controller class
 *
 * @author Idrissa SI
 */
public class PageAccueilController implements Initializable {
    
    ContexteMenu contexte;
    @FXML
    private Label label_Name;
    @FXML
    private Label labelLongueurCheveux;
    @FXML
    private Label labelTypeBouche;
    @FXML
    private Label labelDetailPersonnage;
    @FXML
    private ComboBox<?> comboTypeBouche;
    @FXML
    private TextArea details;
    @FXML
    private RadioButton radioLong;
    @FXML
    private RadioButton radioCourt;
    @FXML
    private RadioButton radioMoyen;
    @FXML
    private GridPane avatar;
    @FXML
    private Canvas canvas;
    @FXML
    private Button effacer;

    @FXML
    private void effacerCanvas(ActionEvent event) {
        GraphicsContext gt = canvas.getGraphicsContext2D();
        gt.clearRect(0, 0, 300, 200);
    }

    @FXML
    private void dessinerTete(ActionEvent event) {
        GraphicsContext gt = canvas.getGraphicsContext2D();
               this.drawHead(gt);
        this.drawEyes(gt);
        this.drawEyes2(gt);
        this.drawNose(gt);
    }
    
   
    
    private enum typeBouche{
        ROND, CARRE, RECTANGLE, OVALE
    }
    
    
      private void drawShapes(GraphicsContext gc) {
        gc.setFill(Color.GREEN);
        gc.setStroke(Color.BLUE);
        gc.setLineWidth(5);
        gc.strokeLine(40, 10, 10, 40);
        gc.fillOval(10, 60, 30, 30);
        gc.strokeOval(60, 60, 30, 30);
        gc.fillRoundRect(110, 60, 30, 30, 10, 10);
        gc.strokeRoundRect(160, 60, 30, 30, 10, 10);
        gc.fillArc(10, 110, 30, 30, 45, 240, ArcType.OPEN);
        gc.fillArc(60, 110, 30, 30, 45, 240, ArcType.CHORD);
        gc.fillArc(110, 110, 30, 30, 45, 240, ArcType.ROUND);
        gc.strokeArc(10, 160, 30, 30, 45, 240, ArcType.OPEN);
        gc.strokeArc(60, 160, 30, 30, 45, 240, ArcType.CHORD);
        gc.strokeArc(110, 160, 30, 30, 45, 240, ArcType.ROUND);
        gc.fillPolygon(new double[]{10, 40, 10, 40},
                       new double[]{210, 210, 240, 240}, 4);
        gc.strokePolygon(new double[]{60, 90, 60, 90},
                         new double[]{210, 210, 240, 240}, 4);
        gc.strokePolyline(new double[]{110, 140, 110, 140},
                          new double[]{210, 210, 240, 240}, 4);
    }
    private void drawHead(GraphicsContext gc) {
       
        gc.setStroke(Color.BLUE);
   
      //  gc.strokeLine(40, 10, 10, 40);
      // gc.fillOval(10, 60, 30, 30);
        gc.strokeOval(5, 5, 160, 160);
     
    }
    
        private void drawEyes(GraphicsContext gc) {
       
        gc.setStroke(Color.BLUE);
   
      //  gc.strokeLine(40, 10, 10, 40);
      // gc.fillOval(10, 60, 30, 30);
        gc.strokeOval(50, 30, 10, 10);
     
    }
        
                private void drawEyes2(GraphicsContext gc) {
       
        gc.setStroke(Color.BLUE);
   
      //  gc.strokeLine(40, 10, 10, 40);
      // gc.fillOval(10, 60, 30, 30);
        gc.strokeOval(110, 30, 10, 10);
     
    }
        
      private void drawShapesRond(GraphicsContext gc) {
       
        gc.setStroke(Color.BLUE);
   
      //  gc.strokeLine(40, 10, 10, 40);
      // gc.fillOval(10, 60, 30, 30);
        gc.strokeOval(70, 105, 20, 20);
     
    }
      
            private void drawShapesOvale(GraphicsContext gc) {
       
        gc.setStroke(Color.BLUE);
   
      //  gc.strokeLine(40, 10, 10, 40);
      // gc.fillOval(10, 60, 30, 30);
              gc.fillArc(70, 105, 30, 30, 45, 240, ArcType.OPEN);

     
    }


    private void drawShapesRectangle(GraphicsContext gc) {
       
        gc.setStroke(Color.BLUE);
   
      //  gc.strokeLine(40, 10, 10, 40);
      // gc.fillOval(10, 60, 30, 30);
        gc.strokeRoundRect(70, 105, 20, 20, 10 ,10);
     
    }
      
    private void drawShapesCarre(GraphicsContext gc) {
       
        gc.setStroke(Color.BLUE);
   
      //  gc.strokeLine(40, 10, 10, 40);
      // gc.fillOval(10, 60, 30, 30);
         gc.strokeRoundRect(70, 105, 20, 20, 0 ,0);
     
    }
      
      
              
      private void drawNose(GraphicsContext gc) {
       
          gc.setLineWidth(5);
        gc.setStroke(Color.BLUE);
       gc.strokeLine(80, 80, 80, 80);
    
      // gc.fillOval(10, 60, 30, 30);
       
     
    }
      
      
     private void drawHairLong( GraphicsContext gc) {
       
          gc.setLineWidth(5);
        gc.setStroke(Color.BLUE);
     //  gc.strokeLine(4, 4, 40, 20);
          gc.fillArc(10, 0, 150, 50, 25, 195, ArcType.OPEN);
    
      // gc.fillOval(10, 60, 30, 30);
       
     
    }
     
    private void drawHairCourt ( GraphicsContext gc) {
       
          gc.setLineWidth(5);
        gc.setStroke(Color.BLUE);
          gc.fillArc(10, 0, 150, 50, 25, 100, ArcType.OPEN);
       
    
      // gc.fillOval(10, 60, 30, 30);
       
     
    }
          
    private void drawHairMoyen( GraphicsContext gc) {
       
          gc.setLineWidth(5);
        gc.setStroke(Color.BLUE);
       gc.fillArc(10, 0, 150, 50, 25, 150, ArcType.OPEN);
    
      // gc.fillOval(10, 60, 30, 30);
       
     
    }
               
               
      
      
    
    
    
      

    @FXML
    private void dessinerBouche(ActionEvent event) {
         System.out.println("votre bouche est  " + comboTypeBouche.getValue());
          GraphicsContext gt = canvas.getGraphicsContext2D();
          switch (comboTypeBouche.getValue().toString()) {
           
              case "OVALE": 
                  
         
                  drawShapesOvale(gt);
                  drawHairLong(gt);
                     break;
              case "RECTANGLE":                   

         
                  drawShapesRectangle(gt);
                     break;
                     
              case "ROND": 
                    drawShapesRond(gt);
                     break;
                     
                     
             case "CARRE":  drawShapesCarre(gt);
                     break;
                     
                     
     
          }
                
    }

    @FXML
    private void dessinerChevLong(ActionEvent event) {
        this.radioCourt.setSelected(false);
        this.radioMoyen.setSelected(false);
        GraphicsContext gt = canvas.getGraphicsContext2D();
        this.drawHairLong(gt);
    }

    @FXML
    private void dessinerChevCourt(ActionEvent event) {
        this.radioLong.setSelected(false);
        this.radioMoyen.setSelected(false);
        GraphicsContext gt = canvas.getGraphicsContext2D();
        this.drawHairCourt(gt);
    }

    @FXML
    private void dessinerChevMoyen(ActionEvent event) {
        this.radioCourt.setSelected(false);
        this.radioLong.setSelected(false);
        System.out.println("cheveux moyen");
        GraphicsContext gt = canvas.getGraphicsContext2D();
        this.drawHairMoyen(gt);
    }



    private static ObservableList comboItem ;  
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        List<String> comboBouche = new ArrayList<>();
        GraphicsContext gt = canvas.getGraphicsContext2D();
        this.drawHead(gt);
        this.drawEyes(gt);
        this.drawEyes2(gt);
        this.drawNose(gt);
        //souviens toi de cette ligne
        //label_Name.setText( this.contexte.getPersonne().getNomVal());
        
        
        comboBouche.add(typeBouche.CARRE.toString());
        comboBouche.add(typeBouche.OVALE.toString());
        comboBouche.add(typeBouche.RECTANGLE.toString());
        comboBouche.add(typeBouche.ROND.toString());
        
        comboItem = FXCollections.observableList(comboBouche);
        this.comboTypeBouche.getItems().clear();
        this.comboTypeBouche.setItems(comboItem);
        
        // TODO
    }
     
    
    public void setContexte(ContexteMenu context){
        
        this.contexte = context;
        
        System.out.println(contexte.getPersonne().getNom());
        contexte.getPersonne().getDetailsCoProperty().bindBidirectional(details.textProperty());
        contexte.getPersonne().getFormeBoucheCoProperty().bindBidirectional(comboTypeBouche.promptTextProperty());
       contexte.getPersonne().getLongueurChevCoProperty().bindBidirectional(this.radioCourt.textProperty());
       contexte.getPersonne().getLongueurChevCoProperty().bindBidirectional(this.radioLong.textProperty());
       contexte.getPersonne().getLongueurChevCoProperty().bindBidirectional(this.radioMoyen.textProperty());
       label_Name.textProperty().bind(contexte.getPersonne().getNom());
       this.radioMoyen.textProperty().bind(contexte.getPersonne().getLongueurChevCoProperty());
       this.radioCourt.textProperty().bind(contexte.getPersonne().getLongueurChevCoProperty());
       this.radioCourt.textProperty().bind(contexte.getPersonne().getLongueurChevCoProperty());
       //this.comboTypeBouche.bind();
    }
    

    
    
}

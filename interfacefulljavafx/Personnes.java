package interfacefulljavafx;

import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Idrissa SI
 */
public class Personnes {
    private final ObservableList<Personne> liste;
    
    public Personnes( ObservableList<Personne> list){
        this.liste = FXCollections.observableArrayList(list);
    }
    public Personnes(){
        this.liste = FXCollections.observableArrayList();
        this.liste.add(new Personne("idrissa", "seyd" , "idrissa seyd","chemin seminaire","","","055055"));
        
        
    }
    public ObservableList<Personne> getListe(){
        return liste;
   }
    
   public Personne identification(String login,String password){
       for(Personne p : liste)
           if(p.checkPassword(login, password)) return p; 
       return null;
   }
   
    
    
}

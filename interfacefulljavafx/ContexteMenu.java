/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacefulljavafx;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleStringProperty;
/**
 *
 * @author Idrissa SI
 * Modele de données
 */
public class ContexteMenu {
    
    private Personne personne;

    
    
    /**
     * @return the longinUtilisateurCo
     */
    public ContexteMenu(Personne pers){
        this.personne = pers;
    
    }
    
    public Personne getPersonne(){
        return personne;
    }
    
    

    
    /*
    public Personne identification(){
        return personnes.identification(loginUtilisateurCo.getValue(), passwordnUtilisateurCo.getValue());
    }
*/
    
}

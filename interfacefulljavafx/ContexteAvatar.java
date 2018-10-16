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
public class ContexteAvatar {
    
    private Personne personne;
    private StringProperty longeurChev;
    private StringProperty formeBouche;
    private StringProperty details;
    
    
    /**
     * @return the longinUtilisateurCo
     */
    public ContexteAvatar(Personne pers){
        this.personne = pers;
        this.longeurChev = new SimpleStringProperty();
        this.formeBouche = new SimpleStringProperty();
        this.details = new SimpleStringProperty();
    
    }
    
    public Personne getPersonne(){
        return personne;
    }
    
    
    /**
     * @return the longinUtilisateurCo
     */
    public StringProperty getLongueurChevCoProperty() {
        return longeurChev;
    }
    
        /**
     * @return the longinUtilisateurCo
     */
    public String getLongueurChevCo() {
        return longeurChev.getValue();
    }

    /**
     * @return the passwordnUtilisateurCo
     */
    public StringProperty getFormeBoucheCoProperty() {
        return formeBouche;
    }
    
        /**
     * @return the passwordnUtilisateurCo
     */
    public StringProperty getDetailsCoProperty() {
        return details;
    }
    
    /*
    public Personne identification(){
        return personnes.identification(loginUtilisateurCo.getValue(), passwordnUtilisateurCo.getValue());
    }
*/
    
}

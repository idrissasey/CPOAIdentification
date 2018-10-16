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
public class ContexteIdentification {
    
    private Personnes personnes;
    private StringProperty loginUtilisateurCo;
    private StringProperty passwordnUtilisateurCo;
    
    
    /**
     * @return the longinUtilisateurCo
     */
    public ContexteIdentification(Personnes pers){
        this.personnes = pers;
        this.loginUtilisateurCo = new SimpleStringProperty();
        this.passwordnUtilisateurCo = new SimpleStringProperty();
    
    }
    
    public Personnes getPersonnes(){
        return personnes;
    }
    
    
    /**
     * @return the longinUtilisateurCo
     */
    public StringProperty getLoginUtilisateurCoProperty() {
        return loginUtilisateurCo;
    }
    
        /**
     * @return the longinUtilisateurCo
     */
    public String getLoginUtilisateurCo() {
        return loginUtilisateurCo.getValue();
    }

    /**
     * @return the passwordnUtilisateurCo
     */
    public StringProperty getPasswordnUtilisateurCoProperty() {
        return passwordnUtilisateurCo;
    }
    
        /**
     * @return the passwordnUtilisateurCo
     */
    public String getPasswordnUtilisateurCo() {
        return passwordnUtilisateurCo.get();
    }
    
    public Personne identification(){
        return personnes.identification(loginUtilisateurCo.getValue(), passwordnUtilisateurCo.getValue());
    }
    
}

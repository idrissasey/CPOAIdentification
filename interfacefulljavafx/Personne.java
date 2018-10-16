/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacefulljavafx;

import java.time.LocalDate;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Idrissa SI
 */

public class Personne {
    
    private StringProperty login = new SimpleStringProperty();
    private StringProperty password = new SimpleStringProperty();
    private StringProperty nom = new SimpleStringProperty();
    private StringProperty adresse1 = new SimpleStringProperty();
    private StringProperty adresse2 = new SimpleStringProperty();
    private StringProperty villeCP = new SimpleStringProperty();
    private StringProperty tel1 = new SimpleStringProperty();
    private StringProperty tel2 = new SimpleStringProperty();
    private  final ObjectProperty<LocalDate> derniereConnexion = new SimpleObjectProperty<>();
    
    
    
    public Personne(String log, String pwd,String nom, String adr1, String adr2, String tel1, String tel2){
        this.login.set(log);
        this.password.set(pwd);
        this.nom.set(nom);
        this.adresse1.set(adr1);
        this.adresse2.set(adr2);
        this.tel1.set(pwd);
        this.tel2.set(pwd);
        
    }
    
    public boolean checkPassword(String login, String password){
        return login.equals(this.login.getValue()) && password.equals(this.password.getValue());
    }
    
    public LocalDate getDerniereConnexion(){
        return derniereConnexion.get();
    }
    
        public ObjectProperty getDerniereConnexionProperty(){
        return derniereConnexion;
    }
    
    public void setDerniereConnexion(LocalDate dc){
        derniereConnexion.set(dc);
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login.get();
    }
    
        /**
     * @return the login property
     */
    public StringProperty getLoginProperty() {
        return login;
    }
    
        /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login.set(login);
    }

    /**
     * @param login the login to set
     */
    public void setLoginProperty(StringProperty login) {
        this.login = login;
    }

    /**
     * @return the password
     */
    public StringProperty getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(StringProperty password) {
        this.password = password;
    }

    /**
     * @return the nom
     */
    public StringProperty getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(StringProperty nom) {
        this.nom = nom;
    }

    /**
     * @return the adresse1
     */
    public StringProperty getAdresse1() {
        return adresse1;
    }

    /**
     * @param adresse1 the adresse1 to set
     */
    public void setAdresse1(StringProperty adresse1) {
        this.adresse1 = adresse1;
    }

    /**
     * @return the adresse2
     */
    public StringProperty getAdresse2() {
        return adresse2;
    }

    /**
     * @param adresse2 the adresse2 to set
     */
    public void setAdresse2(StringProperty adresse2) {
        this.adresse2 = adresse2;
    }

    /**
     * @return the villeCP
     */
    public StringProperty getVilleCP() {
        return villeCP;
    }

    /**
     * @param villeCP the villeCP to set
     */
    public void setVilleCP(StringProperty villeCP) {
        this.villeCP = villeCP;
    }

    /**
     * @return the tel1
     */
    public StringProperty getTel1() {
        return tel1;
    }

    /**
     * @param tel1 the tel1 to set
     */
    public void setTel1(StringProperty tel1) {
        this.tel1 = tel1;
    }

    /**
     * @return the tel2
     */
    public StringProperty getTel2() {
        return tel2;
    }

    /**
     * @param tel2 the tel2 to set
     */
    public void setTel2(StringProperty tel2) {
        this.tel2 = tel2;
    }
    
}

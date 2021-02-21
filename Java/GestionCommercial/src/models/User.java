/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Mansour Djamil
 */
public class User extends Personne {
    private String login;
    private String pwd;

    public User() {
        super();
        profil="User";
        
    }

    public User(String login, String pwd, String nom, String prenom, String profil) {
        super(nom, prenom, profil);
        this.profil="User";
        this.login = login;
        this.pwd = pwd;
    }

    public User(String login, String pwd, int id, String nom, String prenom, String profil) {
        super(id, nom, prenom, profil);
        this.login = login;
        this.pwd = pwd;
        this.profil="User";
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return super.toString()+login+pwd; //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
    
    
    
}

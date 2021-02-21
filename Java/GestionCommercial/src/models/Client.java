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
public class Client extends Personne {
    private String tel;
    private String adresse;

    public Client() {
        super();
        profil="Client";
    }

    public Client(String tel, String adresse, String nom, String prenom, String profil) {
        super(nom, prenom, profil);
        this.tel = tel;
        this.adresse = adresse;
        this.profil="Client";
    }

    public Client(String tel, String adresse, int id, String nom, String prenom, String profil) {
        super(id, nom, prenom, profil);
        this.tel = tel;
        this.adresse = adresse;
        this.profil="Client";
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return super.toString()+tel +adresse; //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
    
    
    
    
    
    
}

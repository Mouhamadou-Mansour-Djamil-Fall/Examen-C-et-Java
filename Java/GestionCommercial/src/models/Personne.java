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
public abstract class  Personne {
    protected int id;
    protected String nom;
    protected String prenom;
    protected String profil;
    

    public Personne() {
    }

    public Personne(String nom, String prenom, String profil) {
        this.nom = nom;
        this.prenom = prenom;
        this.profil = profil;
    }

    public Personne(int id, String nom, String prenom, String profil) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.profil = profil;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getProfil() {
        return profil;
    }

    public void setProfil(String profil) {
        this.profil = profil;
    }

    @Override
    public String toString() {
        return "Personne{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", profil=" + profil + '}';
    }

    

   
    
    
    
}

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
public class Article {
    private int id;
    private String reference;
    private String libelle;
    private int qte;
    private int prix;
    private Categorie ct;

    public Article() {
    }

    public Article(String reference, String libelle, int qte, int prix) {
        this.reference = reference;
        this.libelle = libelle;
        this.qte = qte;
        this.prix = prix;
    }

    public Article(int id, String reference, String libelle, int qte, int prix) {
        this.id = id;
        this.reference = reference;
        this.libelle = libelle;
        this.qte = qte;
        this.prix = prix;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public Categorie getCt() {
        return ct;
    }

    public void setCt(Categorie ct) {
        this.ct = ct;
    }

    @Override
    public String toString() {
        return "Article{" + "id=" + id + ", reference=" + reference + ", libelle=" + libelle + ", qte=" + qte + ", prix=" + prix + '}';
    }

   
    
    
}

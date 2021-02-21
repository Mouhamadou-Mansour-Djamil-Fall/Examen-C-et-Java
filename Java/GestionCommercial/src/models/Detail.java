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
public class Detail {
    private int qteCommande;
    // Relation
    private Commande com;
    private Article art;
    

    public Detail() {
    }

    public Detail(int qteCommande) {
        this.qteCommande = qteCommande;
    }

    public int getQteCommande() {
        return qteCommande;
    }

    public void setQteCommande(int qteCommande) {
        this.qteCommande = qteCommande;
    }

    @Override
    public String toString() {
        return "Detail{" + "qteCommande=" + qteCommande + '}';
    }

    public Commande getCom() {
        return com;
    }

    public void setCom(Commande com) {
        this.com = com;
    }

    public Article getArt() {
        return art;
    }

    public void setArt(Article art) {
        this.art = art;
    }
    
    
}

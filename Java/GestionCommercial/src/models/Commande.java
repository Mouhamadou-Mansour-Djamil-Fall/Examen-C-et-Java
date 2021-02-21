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
public class Commande {
    private int id;
    private String date;
    private String numero;
    private int total;

    public Commande() {
    }

    public Commande(String date, String numero, int total) {
        this.date = date;
        this.numero = numero;
        this.total = total;
    }

    public Commande(int id, String date, String numero, int total) {
        this.id = id;
        this.date = date;
        this.numero = numero;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Commande{" + "id=" + id + ", date=" + date + ", numero=" + numero + ", total=" + total + '}';
    }

    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import dao.DaoArticle;
import dao.DaoCategorie;
import dao.DaoCommande;
import dao.DaoDetail;
import dao.DaoPersonne;
import java.util.List;
import models.Article;
import models.Categorie;
import models.Personne;

/**
 *
 * @author Mansour Djamil
 */
public class Service {
    private DaoCategorie daoCategorie;
    private DaoPersonne daoPersonne;
    private DaoDetail daoDetail;
    private DaoArticle daoArticle;
    private DaoCommande daoCommande;
    
   
    
    public Service(){
        daoCategorie=new DaoCategorie();
        daoPersonne=new DaoPersonne();
        daoDetail=new DaoDetail();
        daoArticle=new DaoArticle();
        daoCommande=new DaoCommande();
        
        
        
        
    }
   
     public boolean creerCategorie(Categorie categorie){
            int nbreLigne= daoCategorie.insert(categorie);
        return nbreLigne != 0;
        }
     
      public List<Categorie> ListerCategorie(){
       return daoCategorie.findAll();
    }
      
      public List<Article> listerArticle(Article article){
        return daoArticle.findByArticle();
    }
    
      public boolean creerArticle(Article article){
        return daoArticle.insert(article)!=0;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Article;

/**
 *
 * @author Mansour Djamil
 */
public class DaoArticle implements IDao<Article>{
     private final String SQL_SELECT_ARTICLE="select * from article ";  //categorie_id=?
     private final String SQL_INSERT="INSERT INTO `article` (`reference`, `libelle`, `qte`, `prix`) VALUES (?,?,?,?)";
     
     public List<Article>findByArticle(Article article){
        List<Article>lArticles=new ArrayList<>();
        return lArticles;
     }
     
     @Override
     public int insert (Article article) {
         int nbreLigne=0;
         Connection con=null;
         try {
            Class.forName("com.mysql.jdbc.Driver");
            
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_commercial", "root", "");
            PreparedStatement ps=con.prepareStatement(SQL_INSERT);
            ps.setString(1,article.getReference());
            ps.setString(2, article.getLibelle());
            ps.setInt(3, article.getQte());
            ps.setInt(4, article.getPrix());
            
            nbreLigne=ps.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
         System.out.println("Erreur de Chargement du driver");
        } catch (SQLException ex) {
             System.out.println("Erreur d'ouverture de la base de données");
         }
         
         return nbreLigne;
         
     }
     
     public List<Article> findByArticle (){
        List<Article>lArticle=new ArrayList<>();
        Connection con=null;
         try {
             Class.forName("com.mysql.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_commercial", "root", "");
             PreparedStatement ps=con.prepareStatement(SQL_SELECT_ARTICLE);
             ResultSet rs=ps.executeQuery();
             while(rs.next()){
                 Article article=new Article();
                 article.setId(rs.getInt("id"));
                 article.setReference(rs.getString("reference"));
                 article.setLibelle(rs.getString("libelle"));
                 article.setQte(rs.getInt("qte"));
                 article.setPrix(rs.getInt("prix"));
                 lArticle.add(article);
             }
         } catch (ClassNotFoundException ex) {
            System.out.println("Erreur de Chargement du driver"); 
         } catch (SQLException ex) {
             System.out.println("Erreur d'ouverture de la base de données");
         }
        
        return lArticle;
    }
    
}

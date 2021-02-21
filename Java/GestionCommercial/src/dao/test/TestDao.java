/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.test;

import dao.DaoArticle;
import models.Article;

/**
 *
 * @author Mansour Djamil
 */
public class TestDao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DaoArticle daoArticle=new DaoArticle(); 
        //Article article=new Article("a232", "Sel",14,100);
        daoArticle.findByArticle().forEach((article)->{
            System.out.println(article);
        });
    }
    
}

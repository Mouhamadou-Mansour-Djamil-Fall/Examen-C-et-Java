/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import models.Categorie;

/**
 *
 * @author Mansour Djamil
 */
public class DaoCategorie implements IDao<Categorie>{
    private final String SQL_INSERT="INSERT INTO `categorie` (`libelle`) VALUES (?)";
    private final String SQL_SELECT_ALL="select * from categorie";
    
    @Override
    public int insert(Categorie categorie){
        int nbreLigne=0;
    return nbreLigne;
    }
    
    public List<Categorie> findAll (){
        List<Categorie>lCategorie=new ArrayList<>();
        
        return lCategorie;
    }
    
}

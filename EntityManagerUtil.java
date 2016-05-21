/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author  Mateus Moreira
 */
public class EntityManagerUtil {
     static EntityManagerFactory emf = null;
    
      public static EntityManager getEntityManager(){
          if(emf == null){
              try{
                  emf = Persistence.createEntityManagerFactory(" PU ");
              }catch(Exception e){
                  
              }
          }
          return emf.createEntityManager();
      }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.metzger.treilli;

import java.util.List;

/**
 *
 * @author lilou
 */
public class Treillis {
    List noeuds ;
    List barres ; 
    
    public Treillis (List noeuds, List barres) {
        this.noeuds = noeuds ;
        this.barres = barres ; 
    }
    
    public List getNoeuds () {
        return this.noeuds ; 
    }
    
    public List getBarres () {
        return this.barres ; 
    }
    
    public void setNoeuds (){
        this.noeuds = noeuds  ;
    }
    
    public void setBarres (){
        this.barres = barres  ;
    }
  
    @Override
    public String toString(){
        return "Treilli : [ Barres " + this.barres + " Noeuds "  + this.noeuds + " ]" ; 
    }
    
    public static int maxIdNoeud(Treillis T) {
      return 0 ;
      //to do 
    }
    
    public static int maxIdBarre(Treillis T) {
      return 0 ;
       //to do 
    }
    
    public static void ajouteNoeud (Noeud n) {
        //to do 
    }
    
    public static void ajouteBarre (Barre b){
        //to do 
    }
    
}

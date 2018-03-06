/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvctest;

import java.util.Arrays;
import java.lang.String;
import java.util.ArrayList;

/**
 *
 * @author alexandre
 */
public class Noeud {
    private final Object contenu;
    private final ArrayList<Noeud> fils;
    private String newLine;

    public Noeud(Object cont) {
        newLine = System.getProperty("line.separator");
        this.contenu = cont;
        this.fils = new ArrayList<Noeud>();
    }
    
    public void addNode(Noeud neuneu){
        this.fils.add(neuneu);
    }
    
    public boolean isFeuille(){
        return this.fils.isEmpty();        
    }

    public Object getContenu() {
        return contenu;
    }

    public ArrayList<Noeud> getFils() {
        return fils;
    }
    
    public Noeud getEnfantNum (int i) {
        return fils.get(i);
    }
    
    public int getNbfils(){
        return fils.size();
    }
    
    public int numeroEnfant (Noeud enfant){
        return fils.indexOf(enfant);
    }
    
    @Override
    public String toString (){
        return contenu.toString();
    }
    
    public String sousArbre (){
        String toReturn = new String();
        if (isFeuille()){
            toReturn+= contenu.toString()+", ";
        }
        else{
            toReturn += contenu.toString() + newLine;
            for (Noeud fifi : fils){
                toReturn+=fifi.sousArbre() + " | ";
            }
        }
        return toReturn;
    }
}

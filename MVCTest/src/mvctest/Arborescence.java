/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvctest;

import java.util.logging.Logger;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author alexandre
 */
public class Arborescence implements TreeModel {
    private final Noeud racine;

    public Arborescence(Noeud racine) {
        this.racine = racine;
    }
    
    @Override
    public Object getRoot(){
        return racine;
    }
    
    @Override
    public Object getChild (Object parent, int i){
        if (parent != null && parent instanceof Noeud){
            return ((Noeud)parent).getEnfantNum(i);
        }
        else{
            return null;
        }
    }
    
    @Override
    public int getChildCount (Object parent){
        if (parent != null && parent instanceof Noeud){
            return ((Noeud)parent).getNbfils();
        }
        else{
            return 0;
        }
    }
    
    @Override
    public boolean isLeaf (Object node){
        return getChildCount(node)==0;
    }
    
    @Override
    public void valueForPathChanged(TreePath path, Object newValue) {
        // pas implementé
    }
    
    @Override
    public int getIndexOfChild(Object parent, Object child) {
        if(parent != null && parent instanceof Noeud && child instanceof Noeud) {
            return ((Noeud)parent).numeroEnfant((Noeud)child);
        } else return -1;
    }
    
    @Override
    public void addTreeModelListener(TreeModelListener l) {
        // pas implémenté
    }
 
    @Override
    public void removeTreeModelListener(TreeModelListener l) {
        // pas implémenté
    }
}


    
    
    


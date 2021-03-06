/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvctest;

import java.awt.BorderLayout;
 
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeModel;


public class MVCTest {

    public static void main(String[] args) {
        
        
        
        // creation de l'arbre, uniquement à l'aide de la classe Noeud
        
        Classe class1=new Classe("CP", "Jean Louis" ,15);
        Classe class2=new Classe("MS", "Pierre Yves",20);
        
        Eleve eleve1=new Eleve("/image/bidon", "Delap", "Lou", "male", "22");
        Eleve eleve2=new Eleve("/image/bidon", "Mar", "Nath", "male", "20");
        Eleve eleve3=new Eleve("/image/bidon", "Jean", "Paul", "male", "22");
        Eleve eleve4=new Eleve("/image/bidon", "Poppo", "Robinot", "femelle", "21");
        Eleve eleve5=new Eleve("/image/bidon", "Ade", "Rich", "femelle", "21");
        Eleve eleve6=new Eleve("/image/bidon", "Guigui", "Dubuibui", "male alpha", "28");
        
        //Creation arbre
        final Noeud arbre = new Noeud("Ecole");
        Noeud classTemp = new Noeud(class1);
        classTemp.addNode(new Noeud(eleve1));
        classTemp.addNode(new Noeud(eleve4));
        classTemp.addNode(new Noeud(eleve6));
        arbre.addNode(classTemp);
        classTemp= new Noeud(class2);
        classTemp.addNode(new Noeud(eleve5));
        classTemp.addNode(new Noeud(eleve3));
        classTemp.addNode(new Noeud(eleve2));
        arbre.addNode(classTemp);
        
        // affichage
        System.out.println(arbre.sousArbre());
        
        Vue vue = new Vue(arbre);

    }
}

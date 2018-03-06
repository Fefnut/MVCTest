/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvctest;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author Nathan
 */
public class PanelFormEl extends JPanel{
    private JPanel formulaireContent;
    private JTextField fnom,fprenom,fsexe,fage;
    private JButton save;
    private Eleve e;
    
    public PanelFormEl(){
        e = new Eleve("/resources", "Paul", "Axelle", "Fille", 19);
        
        JLabel lnom=new JLabel("Nom");
        JLabel lprenom=new JLabel("Prénom");
        JLabel lsexe=new JLabel("Sexe");
        JLabel lage=new JLabel("Age");
        
        formulaireContent=new JPanel();
        formulaireContent.setLayout(new GridLayout(5,2));
        
        fnom = new JTextField(e.getNom());
        fprenom = new JTextField(e.getPrenom());
        fsexe = new JTextField(e.getSexe());
        fage = new JTextField(Integer.toString(e.getAge()));
        fnom.setPreferredSize(new Dimension(150,20));
        fprenom.setPreferredSize(new Dimension(150,20));

        formulaireContent.add(lnom);
        formulaireContent.add(fnom);
        formulaireContent.add(lprenom);
        formulaireContent.add(fprenom);
        formulaireContent.add(lsexe);
        formulaireContent.add(fsexe);
        formulaireContent.add(lage);
        formulaireContent.add(fage);
        //this.setContentPane(formulaireContent);
        
        save=new JButton("Save changes");
        
        //formulaire=new JPanel();
        this.setLayout(new BorderLayout());
        this.add(formulaireContent,BorderLayout.CENTER);
        this.add(save,BorderLayout.SOUTH);
    }
}

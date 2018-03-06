/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvctest;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Nathan
 */
public class Vue extends JFrame {
    private Tableau modele = new Tableau();
    private JTable tableau;
    private JPanel formulaireContent,formulaire;
    private JTextField fnom,fprenom,fsexe,fage;
    private JButton save;
    private Eleve e;
 
    public Vue() {
        super();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tableau = new JTable(modele);
        this.getContentPane().add(new JScrollPane(tableau), BorderLayout.CENTER);
        /*
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
        this.setContentPane(formulaireContent);
        
        save=new JButton("Save changes");
        
        formulaire=new JPanel();
        formulaire.setLayout(new BorderLayout());
        formulaire.add(formulaireContent,BorderLayout.CENTER);
        formulaire.add(save,BorderLayout.SOUTH);
*/
        this.pack();
        this.setVisible(true);
    }
    
}
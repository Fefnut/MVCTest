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
    private JPanel /*formulaireContent,*/formulaire, rightArea;
    //private JTextField fnom,fprenom,fsexe,fage;
    //private JButton save;
    //private Eleve e;
 
    public Vue() {
        super();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        
        tableau = new JTable(modele);
        formulaire =new PanelFormEl();
        
        rightArea=new JPanel();
        rightArea.setLayout(new BorderLayout());
        
        //this.getContentPane().add(new JScrollPane(tableau), BorderLayout.CENTER);
        rightArea.add(tableau,BorderLayout.SOUTH);
        rightArea.add(formulaire,BorderLayout.CENTER);
        this.setContentPane(rightArea);
        
        this.pack();
        this.setVisible(true);
    }
    
}
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
public class PanelFormCl extends JPanel{
    private JPanel formulaireContent;
    private JTextField fniveau,fprof,fnbEl;
    private JButton save;
    private Classe c;
    
    public PanelFormCl(){
        c = new Classe("CM1","M. Girard",163);
        
        JLabel lniveau=new JLabel("Nom");
        JLabel lprof=new JLabel("Prénom");
        JLabel lnbEl=new JLabel("Nombre d'élèves");
        
        formulaireContent=new JPanel();
        formulaireContent.setLayout(new GridLayout(3,2));
        
        fniveau = new JTextField(c.getNiveau());
        fprof = new JTextField(c.getProfResp());
        fnbEl = new JTextField(c.getNbEleves());
        fniveau.setPreferredSize(new Dimension(150,20));

        formulaireContent.add(lniveau);
        formulaireContent.add(fniveau);
        formulaireContent.add(lprof);
        formulaireContent.add(fprof);
        formulaireContent.add(lnbEl);
        
        save=new JButton("Save changes");
        this.setLayout(new BorderLayout());
        this.add(formulaireContent,BorderLayout.CENTER);
        this.add(save,BorderLayout.SOUTH);
    }
}

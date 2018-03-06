/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvctest;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Nathan
 */
public class Vue extends JFrame {
    private Tableau modele = new Tableau();
    private JTable tableau;
 
    public Vue() {
        super();
        tableau = new JTable(modele);
        getContentPane().add(new JScrollPane(tableau), BorderLayout.CENTER);
        pack();
        setVisible(true);
        
    }
    
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvctest;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

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
    private Eleve e;
 
    public Vue() {
        super();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        
        //e=new Eleve("/res","PAUL","Axelle","Fille","19");
        
        rightArea=new JPanel();
        rightArea.setLayout(new BorderLayout());
        
        tableau = new JTable(modele);
        //////////////////////////////////////////////////////////////////////
        tableau.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
        public void valueChanged(ListSelectionEvent event) {
            // do some actions here, for example
            // print first column value from selected row
            int x = tableau.getSelectedRow();
            //if (x != -1){ 
               System.out.println("Coucou");
               e=new Eleve("/res","PAUL","Axelle","Fille","19");
               e.setIcone(tableau.getModel().getValueAt(x,0).toString()); 
               e.setNom(tableau.getModel().getValueAt(x,1).toString()); 
               e.setPrenom(tableau.getModel().getValueAt(x,2).toString()); 
               e.setSexe(tableau.getModel().getValueAt(x,3).toString()); 
               e.setAge(tableau.getModel().getValueAt(x,4).toString());
               formulaire =new PanelFormEl(e);
               setVisible(false);
               pack();
               setVisible(true);
               //remove(formulaire);
               //remove(rightArea);
               //rightArea=new JPanel();
               //rightArea.setLayout(new BorderLayout());
               //formulaire=new PanelFormEl(e);
               //formulaire.revalidate();
               //rightArea.add(tableau,BorderLayout.SOUTH);
               //rightArea.add(formulaire,BorderLayout.CENTER);
               //this.setContentPane(rightArea);
            //}
        }
        });
        ////////////////////////////////////////////////////////////////////////
        
        //this.getContentPane().add(new JScrollPane(tableau), BorderLayout.CENTER);
        rightArea.add(tableau,BorderLayout.SOUTH);
        rightArea.add(formulaire,BorderLayout.CENTER);
        this.setContentPane(rightArea);
        
        this.pack();
        this.setVisible(true);
    }
    
    
}
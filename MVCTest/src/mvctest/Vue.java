/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvctest;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreeModel;
import javax.swing.JTree;

/**
 *
 * @author Nathan
 */
public class Vue extends JFrame {
    private Tableau modele = new Tableau();
    private JTable tableau;
    private JPanel /*formulaireContent,*/formulaire, rightArea;
    private final TreeModel model;
    //private JTextField fnom,fprenom,fsexe,fage;
    //private JButton save;
    //private Eleve e;
 
    public Vue (Noeud racine) {
        super();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        
                // création de l'adaptateur, pour avoir un TreeModel sur l'arbre
        model = new Arborescence(racine);
        tableau = new JTable(modele);
        formulaire =new PanelFormEl();
         
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // création et affichage de la fenetre avec un JTree affichant les
                // données de 'arbre'
                // NB : le JTree fait simplement référence au modèle
                JTree treetree = new JTree(model);
                Vue.this.add(new JScrollPane(treetree), BorderLayout.WEST);
                treetree.addTreeSelectionListener(new TreeSelectionListener() {
                    @Override
                    public void valueChanged(TreeSelectionEvent e) {
                             Noeud node = (Noeud)treetree.getLastSelectedPathComponent();

        if (node.getContenu() == "Ecole"){
            System.out.println("Racine");
        }else if (node.isFeuille()){
            System.out.println("Feuille");
        }else{
            Vue.this.setVisible(false);
            System.out.println("Noeud");
            modele.showClass(node);
            tableau.setModel(modele);
            Vue.this.pack();            
            Vue.this.setVisible(true);
        }
    }
});
            }
        });
                

        
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
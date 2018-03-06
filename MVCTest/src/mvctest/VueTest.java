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
public class VueTest extends JPanel {
    private Test modele = new Test();
    private JTable tableau;
 
    public VueTest() {
        super();
        tableau = new JTable(modele);
    }
}
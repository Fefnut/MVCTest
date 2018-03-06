/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvctest;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Nathan
 */
public class Tableau extends AbstractTableModel {
    private List<Eleve> eleves = new ArrayList<Eleve>();
 
    private final String[] entetes = {"Icone", "Nom", "Prenom", "Sexe", "Age"};
 
    public Tableau() {
        super();
    }
 
    public int getRowCount() {
        return eleves.size();
    }
 
    public int getColumnCount() {
        return entetes.length;
    }
 
    public String getColumnName(int columnIndex) {
        return entetes[columnIndex];
    }
 
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return eleves.get(rowIndex).getIcone();
            case 1:
                return eleves.get(rowIndex).getNom();
            case 2:
                return eleves.get(rowIndex).getPrenom();
            case 3:
                return eleves.get(rowIndex).getSexe();
            case 4:
                return eleves.get(rowIndex).getAge();
            default:
                return null; //Ne devrait jamais arriver
        }
    }
 
    public void addEleve(Eleve ami) {
        eleves.add(ami);
 
        fireTableRowsInserted(eleves.size() -1, eleves.size() -1);
    }
 
    public void removeEleve(int rowIndex) {
        eleves.remove(rowIndex);
 
        fireTableRowsDeleted(rowIndex, rowIndex);
    }
    
    public void showClass (Noeud laClasse){
        int nbEleve = laClasse.getNbfils();
        Eleve eleveTemp;
        ArrayList<Eleve> tempList = new ArrayList<Eleve>();
        for (int i=0; i<nbEleve; i++){
            eleveTemp = (Eleve)laClasse.getEnfantNum(i).getContenu();
            System.out.println(eleveTemp);
            tempList.add(eleveTemp);
        }
        eleves=tempList;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvctest;

/**
 *
 * @author Nathan
 */
public class Classe {
    
    private String niveau, profResp;
    private int nbEleves;

    public Classe(String niveau, String profResp, int nbEleves) {
        this.niveau = niveau;
        this.profResp = profResp;
        this.nbEleves=nbEleves;
    }

    public int getNbEleves() {
        return nbEleves;
    }

    public void setNbEleves(int nbEleves) {
        this.nbEleves = nbEleves;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public String getProfResp() {
        return profResp;
    }

    public void setProfResp(String profResp) {
        this.profResp = profResp;
    }
    
    @Override
    public String toString(){
        return niveau;
    }
    
}

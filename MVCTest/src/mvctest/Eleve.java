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
public class Eleve {
    private String icone,nom,prenom;
    private boolean isfille;
    private int age;

    public Eleve(String icone, String nom, String prenom, boolean isfille, int age) {
        this.icone = icone;
        this.nom = nom;
        this.prenom = prenom;
        this.isfille = isfille;
        this.age = age;
    }

    public String getIcone() {
        return icone;
    }

    public void setIcone(String icone) {
        this.icone = icone;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public boolean isIsfille() {
        return isfille;
    }

    public void setIsfille(boolean isfille) {
        this.isfille = isfille;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString (){
        return "Eleve : " + nom + " " + prenom;
    }
    
    
}

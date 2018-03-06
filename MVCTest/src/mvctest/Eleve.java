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
    private String icone,nom,prenom,sexe;
    private int age;

    public Eleve(String icone, String nom, String prenom, String sexe, int age) {
        this.icone = icone;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
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

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.evidencepojisteni;

import java.util.ArrayList;

public class Databaze {
    
    private ArrayList<Pojistenec> pojistenci;
    
     public Databaze(){
        pojistenci = new ArrayList<>();
    }
    
    public void pridejPojistence(String jmeno, String prijmeni, int vek, int telefonniCislo){
        Pojistenec pojistenec = new Pojistenec(jmeno, prijmeni, vek, telefonniCislo);
        pojistenci.add(pojistenec);   
    }
    
    public ArrayList<Pojistenec> getPojistenci() {
        return pojistenci;
    }
    
    public Pojistenec vyhledejPojistence(String jmeno, String prijmeni){
        Pojistenec nalezenyPojistenec = new Pojistenec();
        for (Pojistenec pojistenec : pojistenci) {
            if(pojistenec.getJmeno().equals(jmeno) && pojistenec.getPrijmeni().equals(prijmeni)) {
                nalezenyPojistenec = pojistenec;
            }
        }
        return nalezenyPojistenec;
    }    
}

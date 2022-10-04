
//autor: Zdeněk Lenk
package cz.itnetwork.evidencepojisteni;

public class Pojistenec {
    private String jmeno;
    private String prijmeni;
    private int vek;
    private int telefonniCislo;

    public Pojistenec(){
        
    }
    
    public Pojistenec(String jmeno, String prijmeni, int vek, int telefonniCislo) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefonniCislo = telefonniCislo;
    }
    
    public String getJmeno() {
        return jmeno;
    }
    
    public String getPrijmeni() {
        return prijmeni;
    }
    
    @Override
    public String toString(){
        
        return String.format("\n Jméno: %s \n Příjmení: %s \n Věk: %s \n Telefonní číslo: %s\n", jmeno, prijmeni, vek, telefonniCislo);
    }
}

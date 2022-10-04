/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//autor: Zdeněk Lenk
package cz.itnetwork.evidencepojisteni;


import java.util.ArrayList;
import java.util.Scanner;

public class Evidence {
    
    private Databaze databaze;
    Scanner sc = new Scanner(System.in, "Windows-1250");
    
    
    public Evidence(){
        databaze = new Databaze();
    }
    
  
    public void pridejPojisteneho(){
        
        System.out.println("Zadejte jméno pojištěného: ");
        String jmeno = sc.nextLine();
        System.out.println("Zadejte příjmení: ");
        String prijmeni = sc.nextLine();
        System.out.println("Zadejte věk: ");
        int vek = Integer.parseInt(sc.nextLine());
        System.out.println("Zadej telefonní číslo: ");
        int telefonniCislo = Integer.parseInt (sc.nextLine());
        databaze.pridejPojistence(jmeno, prijmeni, vek, telefonniCislo);
        System.out.println();
        System.out.println("Pojištěnec byl přidán");
        System.out.println();
    }
    
    public void vypisPojistenych(){
        
        ArrayList<Pojistenec> seznamPojistenych = new ArrayList<>();
        seznamPojistenych = databaze.getPojistenci();
        System.out.println("Seznam všech pojištěných klientů: ");
        System.out.println();
        for (int i = 0; i < seznamPojistenych.size(); i++) {
            System.out.print(String.format("Pojištěnec %s", i + 1));
            System.out.println(seznamPojistenych.get(i));
        }
    
    }
    
    public void vyhledejPojisteneho() {
        System.out.println("Zadejte jméno: ");
        String jmeno = sc.nextLine();
        System.out.println("Zadejte příjmení: ");
        String prijmeni = sc.nextLine();
        Pojistenec nalezenyPojistenec = databaze.vyhledejPojistence(jmeno, prijmeni);
        System.out.println("Nalezený pojištěnec:");
        System.out.println(nalezenyPojistenec);
    }           
}

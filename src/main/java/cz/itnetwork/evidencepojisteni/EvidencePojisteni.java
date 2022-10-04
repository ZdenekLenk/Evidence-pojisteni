/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
//autor: Zdeněk Lenk 
package cz.itnetwork.evidencepojisteni;

import java.util.Scanner;

public class EvidencePojisteni {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in, "Windows-1250");
    Evidence evidence = new Evidence();
    
    String volba = "";
    while (!volba.equals("4")) {
        System.out.println("-------------------------");
        System.out.println("Evidence pojištěných");
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Vyberte si akci:");
        System.out.println("1 - Přidat nového pojištěného");
        System.out.println("2 - Vypsat všechny pojištěné");
        System.out.println("3 - Vyhledat pojištěného");
        System.out.println("4 - Konec");
        volba = sc.nextLine();
        System.out.println();
    
        switch (volba) {
            case "1":
                evidence.pridejPojisteneho();
                break;
            case "2":
                evidence.vypisPojistenych();
                break;
            case "3":
                evidence.vyhledejPojisteneho();
                break;
            case "4":
                System.out.println("Děkujeme, nashledanou...");
                break;
            default:
                System.out.println("Neplatná volba.Pro vykonání příkazu zvolte 1 - 4.");
                break;
        }
    }
    }
}

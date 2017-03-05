/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eksamensøving;

/**
 *
 * @author Stian
 */
import java.util.Scanner;
public class Eksamensøving {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Kunderegister kunde = new Kunderegister();
        for (int k = 0; k<20; k++){
        
        Scanner in = new Scanner (System.in);
        System.out.println("Hva vil du gjøre?");
        System.out.println("1. Legge til bruker?");
        System.out.println("2. Vise personliste?");
        System.out.println("3. Skrive ut eldste?");
        System.out.println("4. Fjerne bruker?");
        int valg = in.nextInt();
        
        if (valg == 1){
           kunde.leggTilBruker(); 
        }
        else if (valg == 2){
            kunde.visPersonListe();
        }
        else if (valg == 3){
            kunde.skrivUtEldste();
        }
        else if (valg == 4) {
            kunde.fjernBruker();
        }
        else {
            System.out.println("Ugyldig valg"); break;
        }
        }
        
    }
    
    
}

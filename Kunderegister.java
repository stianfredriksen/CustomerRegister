
package eksamensøving;

import java.util.Scanner;

/**
 *
 * @author Stian
 */
public class Kunderegister {
    
    private Scanner input;
    private Person[] brukere;
    int antallkunder = 0;
    
    public Kunderegister(){
        input = new Scanner(System.in);
        brukere = new Person[3];
        
    }
    public void leggTilBruker(){
        if (antallkunder == 3){
            System.out.println("Systemet er fullt!");
        }
        else{           
            System.out.println("Navn: ");
            String navn = input.next();
            System.out.println("Person nr: ");
            int personNummer = input.nextInt();
            System.out.println("Alder: ");
            int alder = input.nextInt();
            Person person = new Person(navn, personNummer, alder);
            brukere[antallkunder] = person;
            antallkunder += 1;
        }
    }
    
    public void fjernBruker(){
        System.out.println("**************");
        System.out.println("*Fjern bruker*");
        System.out.println("**************");
        System.out.println("Personnummer: ");
        int fjernes = input.nextInt();
        for (int i = 0; i < antallkunder; i++){
            int temp = brukere[i].getPersonNummer();
            if (temp == fjernes){
                brukere[antallkunder] = brukere[i];
                brukere[i] = brukere[i+1];
                brukere[i+1] = brukere[antallkunder];            
            }
            
           // else
             //   System.out.println("Finner ingen ved dette person nummeret.");
                            
            }
        for (int i = 0; i <antallkunder; i++) {            
            int temp = brukere[i].getPersonNummer();
            if (temp == fjernes){
                System.out.println("Person nr: " + fjernes + " er fjernet ifra registeret.");
                antallkunder--;
            }
        } 
    }

    
        
     
        
    

    
    
    public void visPersonListe(){
        System.out.println("Personnummer  Navn,   Alder");
        for (int i = 0; i < antallkunder; i++){
            System.out.println(brukere[i] + "\n");
        }
    }
    
    public void skrivUtEldste(){
        
    }
}

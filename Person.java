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
public class Person {
    
    private String navn;
    private int personNummer;
    private int alder;
    
    public Person(String navn, int personNummer, int alder){
        this.navn = navn;
        this.personNummer = personNummer;
        this.alder = alder;
    }

    @Override
    public String toString() {
        return "" + personNummer + ", " + navn + ", " + alder;
    }
    
    public int getPersonNummer(){
        return personNummer;
    }
    
}

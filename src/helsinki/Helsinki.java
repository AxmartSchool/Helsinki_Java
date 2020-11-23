/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helsinki;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Axmart
 */
public class Helsinki {

    /**
     * @param args the command line arguments
     */
    
    static ArrayList<Helyezes> helyezesek;
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        helyezesek = Helyezes.Beolvasas();
        
        pontszerzoHelyekSzama();
        ermekSzama();
        olimpiaiPontokSzama();
        
    }

    private static void pontszerzoHelyekSzama() {
        
        System.out.println("3. Feladat: ");
        System.out.println("Pontszerzo helyezesek szama: "+ helyezesek.size());
        
        
        
    }

    private static void ermekSzama() {
       
        int arany = 0;
        int ezust = 0;
        int bronz = 0;
        
        for(Helyezes h : helyezesek){
            
            switch(h.getElertHelyezes()){
                case 1:
                    arany++;
                    break;
               case 2:
                    ezust++;
                    break;
               case 3:
                    bronz++;
                    break;
            }

        }
        
        System.out.println("4. Feladat:");
        System.out.println("Arany: "+ arany);
        System.out.println("Ezust: "+ ezust);
        System.out.println("Bronz: "+ bronz);
        System.out.println("Osszesen: : "+ (bronz+ezust+arany));
    
        
        
        
    }

    private static void olimpiaiPontokSzama() {
        
        int osszeg = 0;
        
        for(Helyezes h : helyezesek){
        
            osszeg += 7 - h.getElertHelyezes();
            if (h.getElertHelyezes() == 1) {
                osszeg ++;
            }
        
        
        
        }
        
        System.out.println("5. Feladat:");
        System.out.println("Olimpiai pontok szama : "+ osszeg);
        
        
        
    }
    
}

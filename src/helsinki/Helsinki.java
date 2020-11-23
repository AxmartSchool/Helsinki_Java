/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helsinki;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import javafx.util.Pair;

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
        legsikeresebbSportag();
        Helyezes.Kiiras(helyesAllomany());
        legtobbSportolo();
        
        
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

    private static void legsikeresebbSportag() {
        
        System.out.println("6. Feladat:");
        
        Pair<String,Integer> legsikeresebbSportag = new Pair<>(null,0);
        
        HashMap<String,Integer> sportagak = new HashMap<>();
        for(Helyezes h : helyezesek){
            
            if (sportagak.containsKey(h.getSportagNeve())) {
             
                 sportagak.put(h.getSportagNeve(), sportagak.get(h.getSportagNeve())+1);
                 
            }else{
                sportagak.put(h.getSportagNeve(),1);
            }
            
            
        }
        
        for (String sportag : sportagak.keySet()){
            
            if (sportagak.get(sportag) > legsikeresebbSportag.getValue()) {
               
                legsikeresebbSportag = new Pair<>(sportag,sportagak.get(sportag));
                
            }
            
            
        }
        
        System.out.println(legsikeresebbSportag.getKey() +" sportagban szereztek tobb ermet");
        
        
        
    }

    private static String[] helyesAllomany() {
           
        String[] output = new String[helyezesek.size()];
        int osszeg;
        String sportag = null;
        
        
        for (int i = 0; i < helyezesek.size(); i++) {
            
             osszeg = 0;
            osszeg += 7 - helyezesek.get(i).getElertHelyezes();
            if (helyezesek.get(i).getElertHelyezes() == 1) {
                osszeg ++;
            }
            
            
            if (helyezesek.get(i).getSportagNeve().equals("kajakkenu")) {
                sportag = "kajak-kenu";
            }else{
                sportag = helyezesek.get(i).getSportagNeve();
            }
            
            
            output[i]= helyezesek.get(i).getElertHelyezes()+" "+helyezesek.get(i).getSportolokSzama()+" "+osszeg+" "+ sportag+" "+ helyezesek.get(i).getVersenyszamNeve();
            
        }
             
        
        return output;
    }

    private static void legtobbSportolo() {
        
        Helyezes legtobbSportolo = new Helyezes(0,0,null,null);
        
        for(Helyezes h : helyezesek){
            
            if (h.getSportolokSzama()>legtobbSportolo.getSportolokSzama()) {
                legtobbSportolo = h;
            }
            
            
        }
        
        System.out.println("8. Feladat:");
        System.out.println("Sportag: "+ legtobbSportolo.getSportagNeve());
        System.out.println("Versenyszam: "+ legtobbSportolo.getVersenyszamNeve() );
        System.out.println("Sportolok szama: "+ legtobbSportolo.getSportolokSzama());
    }
    
}

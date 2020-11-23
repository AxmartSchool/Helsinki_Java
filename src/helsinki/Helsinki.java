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
        
    }

    private static void pontszerzoHelyekSzama() {
        
        System.out.println("A pontszerzo helyezesek szama: "+  helyezesek.size()); 
        
    }
    
}

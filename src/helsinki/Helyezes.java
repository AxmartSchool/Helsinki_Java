/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helsinki;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Axmart
 */
public class Helyezes {
    
    private int elertHelyezes; 
    private int sportolokSzama;
    private String sportagNeve;
    private String versenyszamNeve;

    public int getElertHelyezes() {
        return elertHelyezes;
    }

    public int getSportolokSzama() {
        return sportolokSzama;
    }

    public String getSportagNeve() {
        return sportagNeve;
    }

    public String getVersenyszamNeve() {
        return versenyszamNeve;
    }

    public Helyezes(int elertHelyezes, int sportolokSzama, String sportagNeve, String versenyszamNeve) {
        this.elertHelyezes = elertHelyezes;
        this.sportolokSzama = sportolokSzama;
        this.sportagNeve = sportagNeve;
        this.versenyszamNeve = versenyszamNeve;
    }
    
    
    
    
    
    
    public static ArrayList<Helyezes> Beolvasas() throws IOException{
        
        ArrayList<Helyezes> outputList = new ArrayList<Helyezes>();
        
         System.setProperty("file.encoding", "UTF8");
        BufferedReader fileReader = new BufferedReader(new FileReader("helsinki.txt"));
        
        String sor;
        
        String[] tempTomb;
        
        while((sor =fileReader.readLine())!= null){
            
            tempTomb = sor.split(" ");
            outputList.add(new Helyezes(Integer.parseInt(tempTomb[0]),Integer.parseInt(tempTomb[1]), tempTomb[2], tempTomb[3]));
            
        }
        
        fileReader.close();
        
        return outputList;
        
        
        
    }
    
    
    
}

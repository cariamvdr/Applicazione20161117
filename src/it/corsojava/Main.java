package it.corsojava;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        LogFile.getInstance().info("Ciaone");
        
        LogFile.getInstance().info("Ciaone tua sorella");
        
        try{
            ClasseSbagliata cs = new ClasseSbagliata();
            cs.sbaglia();
        } catch(ExceptionCorso ex){
            LogFile.getInstance().error(ex.getMessage());
        } finally {
            LogFile.getInstance().info("Questo è finally");
        }
        
        List<Double> oggetti = new ArrayList<Double> ();
        oggetti.add(new Double(2.5));
        oggetti.add(new Double(5.0));
        oggetti.add(new ClasseSbagliata());
        
        Double somma = 0d;
        for (int i = 0; i<oggetti.size(); i++){
            if (oggetti.get(i)) instanceof Double){
            somma+= /*(Double)*/oggetti.get(i);
            }            
        }
        
        LogFile.getInstance().info("Somma: "+somma);
        
    }
    
}

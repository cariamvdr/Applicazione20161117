package it.corsojava;

import model.Rubrica;
import model.Contatto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        /*LogFile.getInstance().info("Ciaone");
        
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
        //oggetti.add(new ClasseSbagliata());
        
        Double somma = 0d;
        for (int i = 0; i<oggetti.size(); i++){
            if (oggetti.get(i)  instanceof Double){
            somma+= *//*(Double)*//*oggetti.get(i);
            }            
        }
        
        LogFile.getInstance().info("Somma: "+somma);
        
        Map<String, String> rubricaSemplice = new TreeMap<>();
               
        //rubricaSemplice.put("Aldo"      ,   "345 3322111");
        rubricaSemplice.put("Giovanni"  ,   "350 3454887");
        rubricaSemplice.put("Giacomo"   ,   "323 3334441");
        rubricaSemplice.put("Aldo"      ,   "345 3322111");
        rubricaSemplice.put("Giovanni"   ,   "355 9835666");
        
        System.out.println("\n\nQuesta è rubricaSemplice\n");
        for(String k: rubricaSemplice.keySet()){
            String v = rubricaSemplice.get(k);
            LogFile.getInstance().info(String.format("%s: %s", k , v));
        }

        
        //----------------------------------------------------------------------
        Map<String, String> rubricaSemplice2 = new HashMap<>();
               
        //rubricaSemplice.put("Aldo"      ,   "345 3322111");
        rubricaSemplice2.put("Giovanni"  ,   "350 3454887");
        rubricaSemplice2.put("Giacomo"   ,   "323 3334441");
        rubricaSemplice2.put("Aldo"      ,   "345 3322111");
        rubricaSemplice2.put("Giovanni"   ,   "355 9835666");
        
        System.out.println("\n\nQuesta è rubricaSemplice2\n");
        for(String k: rubricaSemplice2.keySet()){
            String v = rubricaSemplice2.get(k);
            LogFile.getInstance().info(String.format("%s: %s", k , v));
        }
        
        //----------------------------------------------------------------------
        Map<String, String> rubricaSemplice3 = new LinkedHashMap<>();
               
        //rubricaSemplice.put("Aldo"      ,   "345 3322111");
        rubricaSemplice3.put("Giovanni"  ,   "350 3454887");
        rubricaSemplice3.put("Giacomo"   ,   "323 3334441");
        rubricaSemplice3.put("Aldo"      ,   "345 3322111");
        rubricaSemplice3.put("Giovanni"   ,   "355 9835666");
        
        System.out.println("\n\nQuesta è rubricaSemplice3\n");
        for(String k: rubricaSemplice3.keySet()){
            String v = rubricaSemplice3.get(k);
            LogFile.getInstance().info(String.format("%s: %s", k , v));
        }*/
        Contatto aldo = new Contatto (0,"Cataldo","Baglio","345 3322111");
        Contatto giovanni = new Contatto (1,"Giovanni","Storti","350 3454887");
        Contatto giacomo = new Contatto (2,"Giacomo","Poretti","323 3334441");
        
        Rubrica rubrica = new Rubrica();
        rubrica.addContatto(aldo);
        rubrica.addContatto(giovanni);
        rubrica.addContatto(giacomo);
        
        String stringa="";
        for(Contatto i: rubrica.getContatti()){
           stringa+="\n\nid: "+String.valueOf(i.getId());             
           stringa+="\nnome: "+i.getNome();             
           stringa+="\ncognome: "+i.getCognome();             
           stringa+="\ntelefono: "+i.getTelefono();             
        }
        
        stringa+="\n\n\n\n";
        for(Contatto i: rubrica.getContatti()){
           stringa+=i.toString()+"\n";
        }
        
        LogFile.getInstance().info(stringa);
        
        List<Contatto> list = rubrica.getContatti();
        Map<String, Contatto> mappaRicerca = new HashMap<>();
        list = rubrica.getContatti();
        for (int i = 0; i< list.size(); i++){
            String nome = list.get(i).getNome();
            mappaRicerca.put(nome, list.get(i));
            LogFile.getInstance().info("\n\n"+nome+",\n"+list.get(i));
        }
        
        for (Contatto c : rubrica.getContatti()){
            rubrica.getMappaRicerca().put(c.getNome(), c);
        }
    }
    
}

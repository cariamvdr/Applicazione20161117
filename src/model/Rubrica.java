
package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Rubrica {
    private List<Contatto> contatti = new ArrayList();
    private Map<String, Contatto> mappaRicerca = new HashMap<>(); 
        public Rubrica (){}
        
            public void addContatto(Contatto contatto){
                getContatti().add(contatto);
            }

            /**
             * @return the contatti
             */
            public List<Contatto> getContatti() {
                return contatti;
            }

            /**
             * @param contatti the contatti to set
             */
            public void setContatti(List<Contatto> contatti) {
                this.contatti = contatti;
            }

            /**
             * @return the mappaRicerca
             */
            public Map<String, Contatto> getMappaRicerca() {
                return mappaRicerca;
            }

            /**
             * @param mappaRicerca the mappaRicerca to set
             */
            public void setMappaRicerca(Map<String, Contatto> mappaRicerca) {
                this.mappaRicerca = mappaRicerca;
            }
        
            
}

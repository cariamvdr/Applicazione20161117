
package model;

import java.util.ArrayList;
import java.util.List;

public class Rubrica {
    private List<Contatto> contatti = new ArrayList();
        
        public Rubrica (){}
        
            public void addContatto(Contatto contatto){
                contatti.add(contatto);
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
        
}

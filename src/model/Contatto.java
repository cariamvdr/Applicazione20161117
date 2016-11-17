
package model;

public class Contatto {
    private long id=0;
    private String nome="";
    private String cognome="";
    private String telefono="";

        public Contatto (){}
        
        public Contatto (long id, String nome, String cognome, String telefono){
            this.setNome(nome);
            this.setCognome(cognome);
            this.setTelefono(telefono);
            this.setId(id);
        }
        
        @Override
        public String toString(){
            return String.format("id: %d, nome: %s, cognome: %s, telefono: %s", id, nome, cognome, telefono);
        }
        
            public String getNome(){
                return this.nome;
            }
            public void setNome(String nome){
                this.nome=nome;
            }

            public String getCognome(){
                return this.cognome;
            }
            public void setCognome(String cognome){
                this.cognome=cognome;
            }

            public String getTelefono(){
                return this.telefono;
            }
            public void setTelefono(String telefono){
                this.telefono=telefono;
            }

            public long getId(){
                return this.id;
            }

            public void setId(long id) {
                this.id = id;
            }
}

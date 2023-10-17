/*
  1. Representar un concurso de baile. El concurso tiene a lo sumo N parejas. Cada pareja
tiene 2 participantes y un estilo de baile. De los participantes se tiene dni, nombre,
edad.
a) Genere las clases necesarias. Provea constructores para iniciar: el concurso para
un máximo de N parejas (inicialmente sin parejas cargadas); las parejas y los
participantes a partir de toda su información.
 b) Implemente métodos en las clases adecuadas para permitir:
 b1) Agregar una pareja al concurso. Asuma que hay lugar.
 b2) Obtener la diferencia de edad de la pareja.
 b3) Obtener la pareja con más diferencia de edad del concurso.
2. Realice un programa que instancie un concurso, cargue 2 parejas y a partir del
concurso muestre: los nombres de los participantes de la pareja con más diferencia de
edad.
 */
package parciales.concurso;

/**
 *
 */
public class Concurso {
    private int n;
    private Pareja []vector;
    private int dml;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public Concurso(int n) {
        this.n = n;
        
        vector = new Pareja[n];
    }
    public void agregarPareja(Pareja pareja){
        vector[dml] = pareja;
        dml++;
    }
    public int diferenciaEdad(int i){
        int aux;
        aux = vector[i].getConcursante1().getEdad() - vector[i].getConcursante2().getEdad();
        if (aux < 0){
           aux = aux * (-1);
        }
            return aux;
        
       
    }
    public String maximaDifEdad(){
        int maximo = 0; int aux=0;
        for (int i = 0; i < getN(); i++) {
            if(maximo < diferenciaEdad(i)){
                maximo = diferenciaEdad(i);
                
                aux =i;
            }
            
        }
        return "ganadores: "+ vector[aux].getConcursante1() +" y "+vector[aux].getConcursante2();
    }
    @Override
    public String toString(){
        String aux="";
        for (int i = 0; i < n; i++) {
           aux= aux+ vector[i].toString()+"\n";
            
        }
        return aux;
    }
}

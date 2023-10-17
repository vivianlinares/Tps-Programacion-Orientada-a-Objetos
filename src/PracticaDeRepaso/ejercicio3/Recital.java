/*
 De todo recital se conoce el nombre de la banda y la lista de temas que tocarán durante
el recital.
 */
package PracticaDeRepaso.ejercicio3;

/**
 *
 */
public abstract class Recital {
    private String banda;
    private String []lista;
    private int dml = 0;
    private int dmf;
    
    /*Implemente los constructores. El constructor de recitales recibe el nombre de la banda
y la cantidad de temas que tendrá el recital.*/
    public Recital(String banda, int dmf){
        this.banda = banda;
        this.dmf = dmf;
        this.lista = new String[this.dmf];
    }

    public int getDmf() {
        return dmf;
    }

    public void setDmf(int dmf) {
        this.dmf = dmf;
    }
    
    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }
    /*i. Cualquier recital debe saber responder a los mensajes:
 agregarTema que recibe el nombre de un tema y lo agrega a la lista de temas.
 actuar que imprime (por consola) para cada tema la leyenda “y ahora
tocaremos…” seguido por el nombre del tema.*/
    public void actuar(){
        for (int i = 0; i < this.dmf; i++) {
            System.out.println("y ahora tocaremos "+lista[i]);
            
        }
    }
    public void agregarTema(String tema){
        lista[dml] = tema;
        dml++;
    }
    /*iv. Todo recital debe saber responder al mensaje calcularCosto teniendo en cuenta lo
siguiente. Si es un evento ocasional devuelve 0 si es a beneficio, 50000 si es un show de TV
y 150000 si es privado. Las giras deben devolver 30000 por cada fecha de la misma.*/
 public abstract double calcularCosto();
}

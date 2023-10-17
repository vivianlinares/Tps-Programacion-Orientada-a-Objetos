/*
Una gira es un recital que además tiene un nombre y las “fechas” donde se repetirá la
actuación. De cada “fecha” se conoce la ciudad y el día. Además la gira guarda el
número de la fecha en la que se tocará próximamente (actual).
 */
package PracticaDeRepaso.ejercicio3;

/**
 *
 */
public class Gira extends Recital {
    private String nombre;
    private Fecha []fechas;
    private int dmfFecha;
    private int dml;
    /*El constructor de giras
además recibe el nombre de la gira y la cantidad de fechas que tendrá.*/
    public Gira(String banda, int dmf, String nom, int dmfFecha){
        super(banda, dmf);
        this.dmfFecha = dmfFecha;
        this.nombre = nom;
        this.fechas = new Fecha[dmfFecha];
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*ii. La gira debe saber responder a los mensajes:
 agregarFecha que recibe una “fecha” y la agrega adecuadamente.
 La gira debe responder al mensaje actuar de manera distinta. Imprime la leyenda
“Buenas noches …” seguido del nombre de la ciudad de la fecha “actual”. Luego
debe imprimir el listado de temas como lo hace cualquier recital. Además debe
establecer la siguiente fecha de la gira como la nueva “actual”.*/
    public void agregarFecha(Fecha fecha){
        fechas[dml] = fecha;
        dml++;
    }
    @Override
    public void actuar(){
        System.out.println("buenas noches");
        super.actuar();
    }
    /*iv. Todo recital debe saber responder al mensaje calcularCosto, Las giras deben devolver 30000 por cada fecha de la misma.*/
    @Override
    public double calcularCosto(){
        return 30000* dmfFecha;
    }
}

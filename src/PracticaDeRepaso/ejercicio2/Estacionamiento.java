/*
 n estacionamiento conoce su
nombre, dirección, hora de apertura, hora de cierre, y almacena para cada número de piso
(1..N) y número de plaza (1..M), el auto que ocupa dicho lugar.
 */
package PracticaDeRepaso.ejercicio2;

/**
 *
 * @author cosito
 */
public class Estacionamiento {
    private String nombre;
    private String direccion;
    private String horaCierre;
    private String horaApe;
    private int piso;
    private int plaza;
    private Auto [][]autos;
/*- Un constructor debe recibir nombre y dirección, e iniciar el estacionamiento
con hora de apertura “8:00”, hora de cierre “21:00”, y para 5 pisos y 10 plazas
por piso. El estacionamiento inicialmente no tiene autos.*/
    public Estacionamiento(String non, String dire){
        this.nombre = non;
        this.direccion = dire;
        this.piso = 5;
        this.plaza = 10;
        this.horaApe =  "8:00";
        this.horaCierre ="21:00";
        Auto auto;
        this.autos = new Auto[piso][plaza];
        for (int i = 0; i < piso; i++) {
            for (int j = 0; j < plaza; j++) {
       
                autos[i][j] = null; 
            }
            
        }
    }
    /*- Otro constructor debe recibir nombre, dirección, hora de apertura, hora de
cierre, el número de pisos (N) y el número de plazas por piso (M) e iniciar el
estacionamiento con los datos recibidos y sin autos.*/
    public Estacionamiento(String non, String dire, String ape, String cierre, int piso, int plaza){
        this.nombre = non;
        this.direccion = dire;
        this.piso = piso;
        this.plaza = plaza;
        this.horaApe =  ape;
        this.horaCierre = cierre;
       
        this.autos = new Auto[piso][plaza];
        for (int i = 0; i < piso; i++) {
            for (int j = 0; j < plaza; j++) {
                
                autos[i][j] = null; 
            }
            
        }
    }
    /*c) Implemente métodos para:
- Dado un auto A, un número de piso X y un número de plaza Y, registrar al auto
en el estacionamiento en el lugar X,Y. Suponga que X, Y son válidos (es decir,
están en rango 1..N y 1..M respectivamente) y que el lugar está desocupado.
*/
    public void registrarAuto(int piso, int plaza, Auto auto){
        this.autos[piso][plaza] = auto;
    }
    /*- Obtener un String con la representación del estacionamiento. Ejemplo: “Piso 1
Plaza 1: libre Piso 1 Plaza 2: representación del auto …
 Piso 2 Plaza 1: libre … etc”*/
    @Override
    public String toString(){
        String aux=" ";
        for (int i = 0; i < getPiso(); i++) {
            for (int j = 0; j < getPlaza(); j++) {
                if (autos[i][j] == null){
                aux = aux+"piso "+i+" plaza "+j+ ": libre"+"\n";
                        }
                else{
                    aux=aux+"piso "+i+" plaza "+j+ autos[i][j].toString()+"\n";
                }
            }
        }
        return aux;
    }
    /*- Dado un número de plaza Y, obtener la cantidad de autos ubicados en dicha
plaza (teniendo en cuenta todos los pisos).*/
    public int cantidadautos(int plaza){
        int aux=0;
        for (int i = 0; i < getPiso(); i++) {
           if( autos[i][plaza] != null){
               aux++;
           }  
               
        }
        return aux;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(String horaCierre) {
        this.horaCierre = horaCierre;
    }

    public String getHoraApe() {
        return horaApe;
    }

    public void setHoraApe(String horaApe) {
        this.horaApe = horaApe;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public int getPlaza() {
        return plaza;
    }

    public void setPlaza(int plaza) {
        this.plaza = plaza;
    }
     /*- Dada una patente, obtener un String que contenga el número de piso y plaza
donde está dicho auto en el estacionamiento. En caso de no encontrarse,
retornar el mensaje “Auto Inexistente”.*/
    public String buscarPatente(String patente){
        String es=" Auto Inexistente";
        for (int i = 0; i < getPiso(); i++) {
            for (int j = 0; j < getPlaza(); j++) {
              if  (autos[i][j] !=null){
                  if(autos[i][j].patente.equals(patente)==true){
                      es = "piso: "+i+"plaza: "+j;
                  }
              }
            }    
        }
        return es;
    }
    
}

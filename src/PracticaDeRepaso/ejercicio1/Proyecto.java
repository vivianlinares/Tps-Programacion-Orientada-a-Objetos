/*
Un proyecto
tiene: nombre, código, nombre completo del director y los investigadores que participan
en el proyecto (50 como máximo). 
 */
package PracticaDeRepaso.ejercicio1;

import PracticaDeRepaso.ejercicio1.Investigador;

/**
 *
 * 
 */
public class Proyecto {
    private String director;
    private String nombre;
    private int codigo;
    private Investigador []investigadores;
    private int dml = 0;
    
    /*a. Un proyecto sólo debería poder construirse con el nombre, código, nombre del
director.*/
    public Proyecto(String nombre, int codigo, String director){
        this.codigo = codigo;
        this.director = director;
        this.nombre = nombre;
        this.investigadores = new Investigador[50];
    }
    /*a. void agregarInvestigador(Investigador unInvestigador);
// agregar un investigador al proyecto.*/
     public void agregarInvestigador(Investigador unInvestigador){
         investigadores[dml] = unInvestigador;
         dml++;
     }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    /*c. double dineroTotalOtorgado();
//devolver el monto total otorgado en subsidios del proyecto (tener en cuenta
todos los subsidios otorgados de todos los investigadores)*/
     public double dineroTotalOtorgado(){
         double aux=0;
         for (int i = 0; i < this.dml; i++) {
            aux = investigadores[i].montoInvestigacion();
         }
         return aux;
     }
/*e. String toString();
// devolver un string con: nombre del proyecto, código, nombre del director, el
total de dinero otorgado del proyecto y la siguiente información de cada
investigador: nombre, categoría, especialidad, y el total de dinero de sus
subsidios otorgados.*/
    @Override
     public String toString(){
         String aux = "\n ";
         for (int i = 0; i < dml; i++) {
             aux =aux + investigadores[i].toString();
         }
         return "proyector: "+ getNombre() +"codigo: "+ getCodigo()+" director: "+getDirector()+"total: "+dineroTotalOtorgado()+"\n"+aux;
     }
}

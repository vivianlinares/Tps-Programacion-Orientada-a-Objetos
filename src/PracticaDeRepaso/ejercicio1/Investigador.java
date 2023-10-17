/*
De cada investigador se tiene: nombre completo,
categoría (1 a 5) y especialidad. Además, cualquier investigador puede pedir hasta un
máximo de 5 subsidios. 
 */
package PracticaDeRepaso.ejercicio1;

/**
 *
 *
 */
public class Investigador {
    private String nombre;
    private int categoria;
    private String especialidad;
    private Subsidio []subsidios;
    private int dml = 0;
    
    /*b. Un investigador sólo debería poder construirse con nombre, categoría y
especialidad.*/
    public Investigador(String nombre, int categoria, String especialidad){
        this.categoria = categoria;
        this.especialidad = especialidad;
        this.nombre = nombre;
        this.subsidios = new Subsidio[5];
    }
    /*b. void agregarSubsidio(Subsidio unSubsidio);
// agregar un subsidio al investigador.*/
    public void agregarSubsidio(Subsidio unSubsidio){
        subsidios[dml] = unSubsidio;
        dml++;
    }
         /*/*d. void otorgarTodos(String nombre_completo);
//otorgar todos los subsidios no-otorgados del investigador llamado
nombre_completo*/
    public void otorgarTodos(String nombre_completo){
        if(getNombre().equals(nombre_completo)==true){
            for (int i = 0; i < dml; i++) {
                subsidios[i].setOtorgado(true);
                
            }
        }
        
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    /*
//devolver el monto total otorgado en subsidios del proyecto (tener en cuenta
todos los subsidios otorgados de todos los investigadores)*/
    public double montoInvestigacion(){
        double aux=0;
        for (int i = 0; i < dml; i++) {
           if(subsidios[i].isOtorgado() == true){
               aux = aux+subsidios[i].getMonto();
           }   
        }
        return aux;
    }
    /*investigador: nombre, categoría, especialidad, y el total de dinero de sus
subsidios otorgados.*/
    @Override
    public String toString(){
        String aux = " ";
        aux = "nombre: "+getNombre() + " categoria: "+getCategoria()+" total: "+montoInvestigacion()+ "\n";
        return aux;
    }
    public String esverdad(){
        
        return "es? "+subsidios[1].isOtorgado();
    }
}

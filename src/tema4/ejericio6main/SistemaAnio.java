/*
e) Devolver un String con el nombre de la estación, su latitud y longitud, y los promedios
mensuales o anuales según corresponda:
- La versión del sistema que reporta por años deberá calcular el promedio para
cada año (el promedio del año X se calcula con los datos mensuales de ese año).
Ej: “La Plata (34,921 S - 57,955 O):
- Año 2020: 23,8 ºC;
- Año 2021: 26,1 ºC;
- Año 2022: 25,3 ºC. ”
 */
package tema4.ejericio6main;

/**
 *
 */
public class SistemaAnio extends Sistema {
    
    public SistemaAnio(Estacion estacion, int anioA, int anioB){
        super(anioB, anioA,estacion);
    }
    
    @Override
    public double calcularPromedio(int i){
        double aux=0;
            for (int j = 0; j < 12; j++) {
                aux = aux + obtenerTemperatura(j,i); 
           
            }
           System.out.println("suma de temperaturas es: "+aux);
        return aux;
    }
    @Override
    public String toString(){
        String aux =" La Plata (34,921 S - 57,955 O): \n";
        for (int i = 0; i < getAnioN(); i++) {
            aux = aux + " Año "+ (i+getAnioA()+ ": "+calcularPromedio(i)+" Cº; \n");   
        }
       return aux;
        
        
    }
}

/*
 (ii) Implemente los constructores necesarios para iniciar: los clientes a partir de nombre,
DNI, edad; el hotel para N habitaciones, cada una desocupada y con costo aleatorio e/
2000 y 8000.
 */
package tema3;

public class Hotel {
    public int dmf;
    int dml =0;
    private habitacion[] habitaciones;
    
    public Hotel(int dmf){
        this.dmf = dmf;
        this.habitaciones= new habitacion[dmf]; 
        for (int i = 0; i < dmf; i++) {
            habitacion habi = new habitacion();
            habitaciones[i] = habi;
          
        }
    }
    
     /*- Ingresar un cliente C en la habitación número X. Asuma que X es válido (es decir, está
en el rango 1..N) y que la habitación está libre.*/
    
    public void agregarHabitacion(habitacion habitacion, int numero){
            this.habitaciones[numero] = habitacion;
    }
    /*Aumentar el precio de todas las habitaciones en un monto recibido.*/
    public void aumentarprecio(double monto){
        for (int i = 0; i <dmf; i++) {
            double aumento = habitaciones[i].getCosto() + monto;
            habitaciones[i].setCosto(aumento);            
        }
    }
    /*Obtener la representación String del hotel, siguiendo el formato:
{Habitación 1: costo, libre u ocupada, información del cliente si está ocupada}
…*/
    @Override
    public String toString(){
        String aux = " "; 
        for (int i = 0; i < dmf; i++) {
            if ( habitaciones[i].getOcupado() == true){
            aux =" {habitacion "+i+" costo: "+habitaciones[i].getCosto()+" ocupada "+ habitaciones[i].getPersona().toString()+"}\n" + aux;
            }
            else{
                aux ="{habitacion "+i+" costo: "+habitaciones[i].getCosto()+" desocupada }\n"+ aux;
            }
                
        }
        return aux;
    }
}

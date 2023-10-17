/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parciales.estacionamiento;
import PaqueteLectura.Lector;
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estacionamiento e = new Estacionamiento("calle falsa",12.2,2,3);
        Vehiculo v;int sector,lugar,hora; String modelo, marca;
        for (int i = 0; i < 3; i++) {
            System.out.println("cant de horas: ");
            hora=Lector.leerInt();
            System.out.println("modelo");modelo=Lector.leerString();
            System.out.println("marca");marca=Lector.leerString();
            
            v = new Vehiculo("as123",marca,modelo,hora);
            System.out.println("sector: ");
            sector = Lector.leerInt();
            System.out.println("lugar: ");
            lugar= Lector.leerInt();
            e.registrarVehiculo(sector, lugar, v);
        }
        System.out.println(e.toString());
        
        System.out.println("sector mas recaudado: "+e.sectorMasRecaudado());
        System.out.println(e.liberarLugares("modelo2000", 0));
        System.out.println(e.toString());
    }
    
}

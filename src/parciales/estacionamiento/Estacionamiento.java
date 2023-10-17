/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parciales.estacionamiento;

public class Estacionamiento {
    private String direccion;
    private double costohora;
    private Vehiculo [][]tabla;
    private int sector;
    private int lugar;
    public Estacionamiento(String direccion, double costohora, int sec, int lug) {
        this.direccion = direccion;
        this.costohora = costohora;
        this.sector = sec;
        this.lugar= lug;
        tabla = new Vehiculo[this.sector][this.lugar];
    }

    public int getSector() {
        return sector;
    }

    public void setSector(int sector) {
        this.sector = sector;
    }

    public int getLugar() {
        return lugar;
    }
    
    public void setLugar(int lugar) {
        this.lugar = lugar;
    }
    
    public void registrarVehiculo(int sec, int lug, Vehiculo v){
        tabla[sec][lug]= v;
    }
    public int sectorMasRecaudado(){
        double suma,max =0; int sectormax=-1;
        for (int i = 0; i < getSector(); i++) {
            suma = 0;
            for (int j = 0; j < getLugar(); j++) {
                if(tabla[i][j] !=null){
                   suma =(double) suma + (getCostohora()*tabla[i][j].getCanthoras());
   
                }
            }
            if(suma > max){
                max = suma;
                sectormax = i;
            }
        }
        return sectormax;
    }

    public double getCostohora() {
        return costohora;
    }

    public void setCostohora(double costohora) {
        this.costohora = costohora;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String liberarLugares(String marca, int sec){
        String aux = "";
        for (int i = 0; i < getLugar() ; i++) {
            if(tabla[sec][i]!= null){
            if ((tabla[sec][i].getMarca().equals(marca))==true){
                aux = aux + tabla[sec][i].toString();
                tabla[sec][i] = null;
            }}
        }
        return aux;
    }
    @Override
    public String toString(){
        String aux="";
        for (int i = 0; i <getSector(); i++) {
            aux = aux +" sector: "+i+"\n";
            for (int j = 0; j < getLugar(); j++) {
                if(tabla[i][j] !=null){
                aux= aux +tabla[i][j].toString();
                }
            }
        }
        return " Estacionamiento: "+getDireccion()+" costo por hora: "+getCostohora()+"\n"+aux;
    }
}

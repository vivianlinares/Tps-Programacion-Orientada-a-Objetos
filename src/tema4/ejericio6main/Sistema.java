/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.ejericio6main;

/**
 *
 * @author cosito
 */
public abstract class Sistema {
    private double [][]tabla;
    private int anioN;
    private int anioA;
    private Estacion estacion;

    public Estacion getEstacion() {
        return estacion;
    }

    public void setEstacion(Estacion estacion) {
        this.estacion = estacion;
    }
    
    public Sistema(int N, int A,Estacion estacion){
        this.estacion = estacion;
	tabla= new double[N][12];
	anioA = A;
	anioN = N;
        for (int i = 0; i < anioN; i++) {
            for (int j = 0; j < 12; j++) {
                tabla[i][j] = 1000;  
            }
        }
    }
    public abstract double calcularPromedio(int i);
    public int getAnioN() {
        return anioN;
    }

    public void setAnioN(int anioN) {
        this.anioN = anioN;
    }

    public int getAnioA() {
        return anioA;
    }

    public void setAnioA(int anioA) {
        this.anioA = anioA;
    }
    
    /* Registrar la temperatura de un mes y año recibidos por parámetro. Nota: El mes
está en rango 1..12 y el año está en rango A..A+N-1.*/
    
public void registro( int mes,int anio,double temperatura){
//Se envia anio 2010 y mes de 1 a 12
    tabla[anio][mes] = temperatura;
        System.out.println("guardado, temperatura: "+temperatura+"en el mes: "+mes+" año: "+anio);
}
    /*c) Obtener la temperatura de un mes y año recibidos por parámetro. Nota: El mes está
en rango 1..12 y el año está en rango A..A+N-1. En caso de no haberse registrado
temperatura para ese mes/año se retorna el valor muy alto. */
public double obtenerTemperatura( int mes,int anio){
        double aux = tabla[anio][mes];
        
        return aux;
}
/*d) Devolver un String que concatena el mes y año en que se registró la mayor
temperatura. Nota: Suponga que ya están registradas las temperaturas de todos
los meses y años*/
    
    public String temperaturaMax(){
     double max = 0, mesmax =0, aniomax =0; 
        for (int i = 0; i < getAnioN(); i++) {
            for (int j = 0; j < 12; j++) {
                if (max < tabla[i][j]){
                    max = tabla[i][j];
                    mesmax = j; aniomax =i;
                }
            }
            
        }
        return "anio: "+ aniomax + " mes: "+mesmax+ "temperatura max: "+max;
}
}

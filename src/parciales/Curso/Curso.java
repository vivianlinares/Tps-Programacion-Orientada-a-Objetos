/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parciales.Curso;

/**
 *
 * @author cosito
 */
public abstract class Curso {
    private int anio;
    private int N;
    private Alumno vector[];
    private int dml=0;

    public abstract boolean puederendir(Alumno alumno);
    public Curso(int N,int anio) {
        this.anio = anio;
        this.N = N;
        vector = new Alumno[N];
    }
    public boolean agregarAlumno(Alumno alumno){
        boolean aux;
        vector[dml] = alumno;
        if (vector[dml] != null){
           aux = true;
        }else{
            aux = false;
        }
        dml++;
        return aux;
    }
    public void incrementarAsistencia(int dni){
        for (int i = 0; i < this.dml; i++) {
            if (dni == vector[i].getDni()){
                vector[i].setAsistencia(vector[i].getAsistencia()+1);
            }
        }
    }
    public void incrementarAutoevaluacion(int dni){
        for (int i = 0; i < this.dml; i++) {
            if (dni == vector[i].getDni()){
                vector[i].setCantApro(vector[i].getCantApro()+1);
            }
            
        }
    }
    public int cantidadDeAlumnosQuePueden(){
        int aux=0;
        for (int i = 0; i < dml; i++) {
            if(puederendir(vector[i]) == true){
                aux = aux+1;
            }
        }
        return aux;
    }
    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getN() {
        return N;
    }

    public void setN(int N) {
        this.N = N;
    }

    @Override
    public String toString() {
        String aux=" ";
        for (int i = 0; i < dml; i++) {
           aux= aux + "dni"+vector[i].getDni()+" asistencia: "+ vector[i].getAsistencia();
            
        }
        return aux;
    }
    
}

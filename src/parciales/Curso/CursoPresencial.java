/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parciales.Curso;
import PaqueteLectura.GeneradorAleatorio;
public class CursoPresencial extends Curso{
    private int cantAulas;
    public CursoPresencial(int N, int anio){
        super(N,anio);
        GeneradorAleatorio.iniciar();
        this.cantAulas = GeneradorAleatorio.generarInt(3);
    }
    @Override
    public boolean puederendir(Alumno alumno){
        if (3 <= alumno.getAsistencia()){
            return true;
        }else
        {
            return false;
        }
    }
    
}

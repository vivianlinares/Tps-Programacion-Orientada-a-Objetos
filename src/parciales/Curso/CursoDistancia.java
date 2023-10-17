
package parciales.Curso;

import PaqueteLectura.GeneradorAleatorio;

public class CursoDistancia extends Curso{
    private String link;
    public CursoDistancia(int N, int anio){
        super(N,anio);
        GeneradorAleatorio.iniciar();
        this.link = GeneradorAleatorio.generarString(10);
    }
    @Override
    public boolean puederendir(Alumno alumno){
        if ((3 <= alumno.getCantApro())&&(1 <= alumno.getAsistencia())){
            return true;
        }else
        {
            return false;
        }
    }
}

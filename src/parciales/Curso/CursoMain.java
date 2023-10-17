/*
21:10
 */
package parciales.Curso;
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
public class CursoMain {

    public static void main(String[] args) {
        Curso cursoPresencial;
        cursoPresencial = new CursoPresencial(3, 2023);
        Alumno alum; int dni;
        for (int i = 0; i < 3; i++) {
           GeneradorAleatorio.iniciar();
           dni = Lector.leerInt();
           alum = new Alumno(dni,GeneradorAleatorio.generarString(3));
            System.out.println(cursoPresencial.agregarAlumno(alum));
            System.out.println("dni para aumentar asistencia");
            dni = Lector.leerInt();
            
            cursoPresencial.incrementarAsistencia(dni);
            System.out.println("dni para aumentar autoeva apro");
            dni = Lector.leerInt();
            
            cursoPresencial.incrementarAutoevaluacion(dni);
        }
        System.out.println("cant alu para rendir: "+ cursoPresencial.cantidadDeAlumnosQuePueden());
        System.out.println(cursoPresencial.toString());
    }
    
}

package solutions;

import java.io.BufferedReader;
import java.io.PrintStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class Exercise10 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {
        /*
            En un Centro de Estudios Técnico Superior se lleva a cabo una prueba para los estudiantes de primer ingreso. El Centro tiene una política de proveer hasta un máximo de 10 puntos extras en la prueba a los buenos estudiantes que ingresan al Centro.
            Para optar a esos beneficios el estudiante debe de tener más de 90 en Matemáticas y en Física. 
            
            Los puntos extras que puede obtener dependen de una clasificación.
                Su clasificación será A si posee como promedio de todos los cursos más de 90.
                Su clasificación será B si posee como promedio de todos los cursos entre 88 y 90
                Su clasificación será C si posee como promedio de todos los cursos entre 85 y 87
                Su clasificación será D si posee como promedio de todos los cursos menos de 85
                Si la clasificación es A obtiene 10 puntos extra.
                Si la clasificación es B obtiene 7 puntos extra.
                Si la clasificación es C obtiene 4 puntos extra.
                Si la clasificación es D obtiene 0 puntos extra.
            
            Se deberá leer el nombre del estudiante, las notas de los cursos de Matemáticas, Física, Sociales, Ciencias y Español. El algoritmo deberá imprimir si el estudiante puede optar por los puntos extras o no; en caso de que pueda optar, cuál es la cantidad de puntos obtenidos.
        */

        //Definición de Variables
        int cantidadPuntosExtra = 0;
        char clasificacion = ' ';
        double promedio;

        //Entradas
        out.printf("¿Cúal es el nombre del estudiante: ? ");
        String nombre = in.readLine();
        out.printf("¿Cúal fue la nota en Matemáticas? ");
        double notaMate = Double.parseDouble(in.readLine());
        out.printf("¿Cúal fue la nota en Física? ");
        double notaFisica = Double.parseDouble(in.readLine());
        out.printf("¿Cúal fue la nota en Sociales? ");
        double notaSociales = Double.parseDouble(in.readLine());
        out.printf("¿Cúal fue la nota en Ciencias? ");
        double notaCiencias = Double.parseDouble(in.readLine());
        out.printf("¿Cúal fue la nota en Español? ");
        double notaEspanol = Double.parseDouble(in.readLine());

        if (notaMate > 90 && notaFisica > 90) {
            promedio = (notaMate + notaFisica + notaSociales + notaCiencias + notaEspanol) / 5;

            if (promedio > 90) {
                clasificacion = 'A';
                cantidadPuntosExtra = 10;
            } else if (promedio >= 88 && promedio <= 90) {
                clasificacion = 'B';
                cantidadPuntosExtra = 7; 
            } else if (promedio >= 85 && promedio <= 87) {
                clasificacion = 'C';
                cantidadPuntosExtra = 4;  
            } else {
                clasificacion = 'D';
                cantidadPuntosExtra = 0; 
            }
            out.println("El promedio de " + nombre + " fue de " + promedio);
            out.println("Por lo cual obtuvo " + cantidadPuntosExtra + " puntos extra, por su clasificación " + clasificacion + ".");

        }else {
            out.println("El estudiante " + nombre + " no puede optar por los puntos extras, ya que debe tener una nota mayor a 90 en Física y Matemáticas.");
        }
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class promedioGrupo {

  //programa que calcula el promedio de un grupo
  //* rl tamaño fr rl grupom es N*/
  /*
   * las calificaciones se leen y se almacenan en un arrglo de tamaño N
   */
  public static void main(String[] args) throws IOException {
    int N; // tamaño del areglo
    BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    String entrada;
    double[] calificaciones;
    double suma = 0; // para sumar calificaciones
    double promedio;

    System.out.println("programa calcula el promedio de un grupo");
    System.out.println("escribe tamaño del grupo");
    entrada = bufer.readLine();
    N = Integer.parseInt(entrada);

    /*
     * construimos el arreglo de calificacion
     */
    calificaciones = new double[N];
    // leer las calificaciones de cada alumno
    for (int i = 0; i < calificaciones.length; i++) {
      System.out.println("escriba la calificacion del alumno" + (i + 1) + ":");
      entrada = bufer.readLine();
      calificaciones[1] = Double.parseDouble(entrada);
      suma += calificaciones[1];
    }
    promedio = suma / N;
    System.out.println("las calificaciones del grupo son: ");
    for (int i = 0; i < calificaciones.length; i++) {
      System.out.println(calificaciones[i]);
    }
    System.out.println("el promedio del grupo es: " + promedio);
  }
}

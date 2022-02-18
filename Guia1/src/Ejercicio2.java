import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner reader = new Scanner(System.in);
		    int notamayor, notamenor, j;
		    double nota;
		    notamayor = 0;
		    notamenor = 0;
		    for (j = 1; j <= 10; j++) {
		      System.out.print("Ingrese la nota del alumno:");
		      nota = reader.nextDouble();
		      if (nota >= 7) {
		        notamayor = notamayor + 1;
		      } else {
		        notamenor = notamenor + 1;
		      }
		    }
		    System.out.println("La cantidad de alumnos con notas mayores a '7' son :" + notamayor);
		    System.out.println("La cantidad de alumnos con notas menores a '7' son :" + notamenor);
	}

}

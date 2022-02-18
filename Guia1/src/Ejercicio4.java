import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int puntosIng,i,primero=0,segundo=0,tercero=0,cuarto=0;
		float coordenadax,coordenaday;
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Cuántos puntos en el plano desea ingresar? ");
		puntosIng = teclado.nextInt();
		for (i=1; i <= puntosIng; i++) {
		System.out.println("Ingrese la coordenada x" +i + " :");
		coordenadax = teclado.nextFloat();
		System.out.println("Ingrese la coordenada y" +i + " :");
		coordenaday = teclado.nextFloat();
		if(coordenadax>0 && coordenaday>0){
		primero++;
		}else if(coordenadax<0 && coordenaday>0){
		segundo++;
		}else if(coordenadax<0 && coordenaday<0){
		tercero++;
		}else if(coordenadax>0 && coordenaday<0){
		cuarto++;
		}
		}
		System.out.println("El número de puntos ingresados en el primer cuadrante es : " +primero);
		System.out.println("El número de puntos ingresados en el segundo cuadrante es : " +segundo);
		System.out.println("El número de puntos ingresados en el tercer cuadrante es : " +tercero);
		System.out.println("El número de puntos ingresados en el cuarto cuadrante es : " +cuarto);
		}
	}



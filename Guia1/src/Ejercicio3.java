import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner reader = new Scanner(System.in);
		 int n,x,valor,pares,impares;
	        x=1;
	        pares=0;
	        impares=0;
	        System.out.print("Cuantos números desaeas ingresar:");
	        n=reader.nextInt();
	        while (x<=n) {
	            System.out.print("Ingrese el valor:");
	            valor=reader.nextInt();
	            if (valor%2==0) {
	                pares=pares + 1;
	            } else {
	                impares=impares + 1;
	            }
	            x=x + 1;
	        }
	        System.out.print("Cantidad de pares:");
	        System.out.println(pares);
	        System.out.print("Cantidad de impares:");
	        System.out.print(impares);
	}

}

import java.util.Scanner;
public class ejercicio1 {

	public static void main(String[] args) {
		 Scanner reader = new Scanner(System.in);
		 int numero1,numero2;

		 System.out.println("Introduce un n�mero");
		 numero1 = reader.nextInt();
		 		
		 System.out.println("Introduce el n�mero por el cual quieres saber si es divisible");
		 numero2 = reader.nextInt();
		 if (numero1%numero2 == 0){
		     System.out.println(numero1 + " es divisible por " + numero2);
		     }
		 else{
			 System.out.println(numero1 + " NO es divisible por " + numero2);
		 }
		
	}

}

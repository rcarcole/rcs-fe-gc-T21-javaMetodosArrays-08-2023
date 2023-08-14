package Ex3;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Introduce un número para verificar si es primo: ");
	        int numero = sc.nextInt();

	        if (esPrimo(numero)) {
	            System.out.println("El número " + numero + " es primo.");
	        } else {
	            System.out.println("El número " + numero + " no es primo.");
	        }
	        sc.close();
	    }

	    public static boolean esPrimo(int numero) {
	        if (numero <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(numero); i++) {
	            if (numero % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	}
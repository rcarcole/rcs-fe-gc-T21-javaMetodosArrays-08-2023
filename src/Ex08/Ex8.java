package Ex8;

import java.util.Scanner;

public class Ex8 {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[] numeros = new int[10];

	        rellenarValores(numeros, sc);
	        mostrarValores(numeros);

	        sc.close();
	    }

	    public static void rellenarValores(int[] numeros, Scanner scanner) {
	        System.out.println("Introduce 10 números enteros:");
	        for (int i = 0; i < numeros.length; i++) {
	            System.out.print("Número en la posición " + i + ": ");
	            numeros[i] = scanner.nextInt();
	        }
	    }

	    public static void mostrarValores(int[] numeros) {
	        System.out.println("Índice y valor del array:");
	        for (int i = 0; i < numeros.length; i++) {
	            System.out.println("Índice: " + i + " - Valor: " + numeros[i]);
	        }
	    }
	}
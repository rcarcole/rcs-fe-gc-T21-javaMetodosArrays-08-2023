package Ex6;

import java.util.Scanner;

public class Ex6 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduce un número entero positivo: ");
            numero = sc.nextInt();
            if (numero < 0) {
                System.out.println("Por favor, introduce un número positivo.");
            }
        } while (numero < 0);

        int cifras = contarCifras(numero);
        System.out.println("El número " + numero + " tiene " + cifras + " cifras.");
        sc.close();
    }

    public static int contarCifras(int numero) {
        int conteo = 0;
        do {
            numero = numero / 10;
            conteo++;
        } while (numero > 0);
        return conteo;
    }
}

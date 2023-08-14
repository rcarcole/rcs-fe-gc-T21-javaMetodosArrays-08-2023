package Ex12;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el tamaño del array: ");
        int tamano = sc.nextInt();

        int[] array = new int[tamano];

        // Array con números aleatorios entre 1 y 300
        for (int i = 0; i < tamano; i++) {
            array[i] = (int) (Math.random() * 300) + 1;
        }

        // Pedir dígito
        int digito;
        do {
            System.out.print("Introduce el dígito final (entre 0 y 9): ");
            digito = sc.nextInt();
        } while (digito < 0 || digito > 9);

        // Nuevo array para guardar los números que terminan en el dígito pedido
        int[] numerosAcabadosEnDigito = new int[tamano];
        int contador = 0;

        System.out.println("Números en el array que terminan en " + digito + ":");
        for (int numero : array) {
            if (numero % 10 == digito) {
                System.out.println(numero);
                numerosAcabadosEnDigito[contador++] = numero;
            }
        }
        sc.close();
    }
}
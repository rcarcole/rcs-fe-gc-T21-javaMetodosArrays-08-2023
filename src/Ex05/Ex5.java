package Ex5;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número en base decimal para convertirlo a binario: ");
        int numero = sc.nextInt();

        String binario = convertirABinario(numero);
        System.out.println("El número " + numero + " en binario es " + binario + ".");

        sc.close();
    }

    public static String convertirABinario(int numero) {
        StringBuilder binario = new StringBuilder();
        do {
            int resto = numero % 2;
            binario.insert(0, resto);
            numero = numero / 2;
        } while (numero > 0);
        return binario.toString();
    }
}
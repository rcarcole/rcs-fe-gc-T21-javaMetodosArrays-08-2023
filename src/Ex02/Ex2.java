package Ex2;

import java.util.Scanner;

public class Ex2 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos números aleatorios quieres generar? ");
        int cantidad = sc.nextInt();

        System.out.print("Introduce el límite inferior: ");
        int min = sc.nextInt();

        System.out.print("Introduce el límite superior: ");
        int max = sc.nextInt();

        System.out.println("Los números aleatorios generados son:");
        for (int i = 0; i < cantidad; i++) {
            int numeroAleatorio = generarNumeroAleatorio(min, max);
            System.out.println(numeroAleatorio);
        }
        sc.close();
    }

    public static int generarNumeroAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
package Ex10;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el tamaño del array: ");
        int tamano = sc.nextInt();

        System.out.print("Introduce el valor mínimo del rango: ");
        int min = sc.nextInt();

        System.out.print("Introduce el valor máximo del rango: ");
        int max = sc.nextInt();

        int[] numerosPrimos = rellenarConPrimos(tamano, min, max);
        mostrarArray(numerosPrimos);
        
        sc.close();
    }

    public static int[] rellenarConPrimos(int tamano, int min, int max) {
        int[] array = new int[tamano];
        for (int i = 0; i < tamano; i++) {
            int numero;
            do {
                numero = (int) (Math.random() * (max - min + 1)) + min;
            } while (!esPrimo(numero));
            array[i] = numero;
        }
        return array;
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    public static void mostrarArray(int[] array) {
        int mayor = array[0];
        System.out.println("Números primos en el array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posición " + i + ": " + array[i]);
            if (array[i] > mayor) {
                mayor = array[i];
            }
        }
        System.out.println("El número primo más grande en el array es: " + mayor);
    }
}
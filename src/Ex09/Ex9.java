package Ex9;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el tamaño del array: ");
        int tamano = sc.nextInt();

        int[] numeros = new int[tamano];

        rellenarArray(numeros, 0, 9);
        mostrarArray(numeros);

        sc.close();
    }

    public static void rellenarArray(int[] array, int min, int max) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (max - min + 1)) + min;
        }
    }

    public static void mostrarArray(int[] array) {
        int suma = 0;
        System.out.println("Contenido del array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posición " + i + ": " + array[i]);
            suma += array[i];
        }
        System.out.println("Suma de todos los valores: " + suma);
    }
}
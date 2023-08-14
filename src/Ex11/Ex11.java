package Ex11;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce la dimensión de los arrays: ");
        int dimension = sc.nextInt();

        int[] array1 = new int[dimension];
        int[] array2 = array1;

        // array1 con numeros aleatorios
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 10);
        }

        // array2 con valores aleatorios
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 10);
        }

        // Nuevo array
        int[] arrayResultado = multiplicarArrays(array1, array2);

        System.out.println("Contenido de array1:");
        mostrarArray(array1);

        System.out.println("Contenido de array2:");
        mostrarArray(array2);

        System.out.println("Contenido del array resultado de la multiplicación:");
        mostrarArray(arrayResultado);
        
        sc.close();
    }

    public static int[] multiplicarArrays(int[] array1, int[] array2) {
        int[] resultado = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            resultado[i] = array1[i] * array2[i];
        }
        return resultado;
    }

    public static void mostrarArray(int[] array) {
        for (int valor : array) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}
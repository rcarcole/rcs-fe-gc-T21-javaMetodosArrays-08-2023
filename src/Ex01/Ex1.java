package Ex1;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Selecciona la figura a calcular:");
        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triángulo");
        int seleccion = sc.nextInt();

        switch (seleccion) {
            case 1:
                System.out.print("Introduce el radio del círculo: ");
                double radio = sc.nextDouble();
                System.out.println("El área del círculo es: " + areaCirculo(radio));
                break;
            case 2:
                System.out.print("Introduce el lado del cuadrado: ");
                double lado = sc.nextDouble();
                System.out.println("El área del cuadrado es: " + areaCuadrado(lado));
                break;
            case 3:
                System.out.print("Introduce la base del triángulo: ");
                double base = sc.nextDouble();
                System.out.print("Introduce la altura del triángulo: ");
                double altura = sc.nextDouble();
                System.out.println("El área del triángulo es: " + areaTriangulo(base, altura));
                break;
            default:
                System.out.println("Selección no válida.");
                break;
        }
        sc.close();
    }

    public static double areaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public static double areaCuadrado(double lado) {
        return lado * lado;
    }

    public static double areaTriangulo(double base, double altura) {
        return 0.5 * base * altura;
    }
}

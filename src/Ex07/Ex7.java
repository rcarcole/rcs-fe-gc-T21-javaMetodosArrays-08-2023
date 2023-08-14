package Ex7;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la cantidad en euros que quieres convertir: ");
        double euros = sc.nextDouble();

        System.out.println("Elige la moneda a la que quieres convertir (dolares, yenes, libras): ");
        String moneda = sc.next().toLowerCase();

        convertirMoneda(euros, moneda);
        sc.close();
    }

    public static void convertirMoneda(double euros, String moneda) {
        double conversion;
        switch (moneda) {
            case "dolares":
                conversion = euros * 1.28611;
                System.out.println(euros + " euros son " + conversion + " dólares.");
                break;
            case "yenes":
                conversion = euros * 129.852;
                System.out.println(euros + " euros son " + conversion + " yenes.");
                break;
            case "libras":
                conversion = euros * 0.86;
                System.out.println(euros + " euros son " + conversion + " libras.");
                break;
            default:
                System.out.println("Moneda no reconocida.");
                break;
        }
    }
}
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la base imponible (precio del artículo sin IVA): ");
        double baseImponible = sc.nextDouble();
        System.out.printf("Base imponible %8.2f\n", baseImponible);
        System.out.printf("IVA %8.2f\n", (baseImponible * 0.21));
        System.out.printf("-----------------------\n");
        System.out.printf("Total %8.2f\n", (baseImponible * 1.21));
        }
}

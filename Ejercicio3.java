import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la cantidad de pesetas que quiere convertir: ");
        int pesetas = sc.nextInt();
        double euros = pesetas / 166.386;
        System.out.printf("%d pesetas son %.2f euros.", pesetas, euros);
        }
}

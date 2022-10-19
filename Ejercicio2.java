import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cantidad de euros que quieres convertir: ");
        double euros = sc.nextDouble();
        int pesetas = (int) (euros * 166.386);
        System.out.print(euros + " euros son " + pesetas + " pesetas.");
        }
}

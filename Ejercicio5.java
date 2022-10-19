import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Área de un rectángulo");
        System.out.print("Introduzca la longitud de la base (cm): ");
        double base = sc.nextDouble();
        System.out.print("Introduzca la altura (cm): ");
        double altura = sc.nextDouble();
        System.out.println("El área del rectángulo es " + (base * altura) + " cm2");
        }
}

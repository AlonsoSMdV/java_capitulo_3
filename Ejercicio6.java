import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Área de un triángulo");
    System.out.print("Introduzca la longitud de la base (cm): ");
    double base = sc.nextDouble();
    System.out.print("Inroduzca la altura (cm): ");
    double altura = sc.nextDouble();
    System.out.println("El área del triángulo es " + (base * altura)/2 + " cm2");
    }
}

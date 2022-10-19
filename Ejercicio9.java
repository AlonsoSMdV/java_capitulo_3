import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.141592654;
        System.out.println("Volumen de un cono");
        System.out.print("Introduzca la altura en cm: ");
        double h = sc.nextDouble();
        System.out.print("Introduzca el radio en cm: ");
        double r = sc.nextDouble();
        double v = (1.0/3.0) * PI * r * r * h;
        System.out.println("El volumen del cono es de " + v + " cm3");
        }
}

import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el número de Kb: ");
        double kb = sc.nextDouble();
        System.out.println(kb + "Kb son " + (kb / 1024) + "Mb.");
        }
}

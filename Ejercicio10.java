import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el número de Mb: ");
        double mb = sc.nextDouble();
        System.out.println(mb + "Mb son " + (mb * 1024) + "Kb.");
        }
}

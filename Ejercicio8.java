import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el número de horas trabajadas durante la semana: ");
        int horasTrabajadas = sc.nextInt();
        System.out.println("Su salario semanal es de " + (horasTrabajadas * 12) + " euros.");
        }
}

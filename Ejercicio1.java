import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1;
        int num2;
        String linea;

        System.out.print("Introduzca el primer dígito: ");
        linea = System.console().readLine();
        num1 = Integer.parseInt(linea);


        System.out.print("Introduzca el segundo dígito: ");
        linea = System.console().readLine();
        num2 = Integer.parseInt(linea);

        System.out.print(num1+"*"+num2+"="+(num1 * num2));
    }
    }
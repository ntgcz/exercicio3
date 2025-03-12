import java.util.Scanner;

public class teste2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero, dobro;

        System.out.println(" Digite um número");
        numero = entrada.nextDouble();

        dobro = numero * 2;

        System.out.println("Você digitou " + numero);

        System.out.println("O dobro é " + dobro);

        entrada.close();
    }
}

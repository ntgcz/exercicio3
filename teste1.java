
import java.util.Scanner;

public class teste1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double notaUm;
        double notaDois;

        System.out.println(" Digite sua nota");
        notaUm = entrada.nextDouble();

        System.out.println(" Digite sua segunda nota");
        notaDois = entrada.nextDouble();

        double media = ((notaUm + notaDois) / 2);
        System.out.println("A média do aluno é " + media);

        // se a media >= 7 escrever reprovado
        /*if(media >= 7){
         System.out.println("APROVADO");
         else {
            System.out.println("REPROVADO");}
        }*/
        boolean aprovado = (media >= 7);
        if (aprovado == true) {
            System.out.println("APROVADO");}

 // else é caso contrario de if, sem if sem else. 2 caminhos

        else {
            if (media >= 5) {
                System.out.println("EXAME"); } 

                else { System.out.println("REPROVADO"); }
        }

        entrada.close();
    }
}

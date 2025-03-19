public class AppPessoa {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        

       p1.idade = 12;
       p2.idade = 19;

        p1.nome = "Nat e";
        p2.nome = "Gomes e";

        p1.apresentar();
        p1.possoDirigir();
        p2.apresentar(); 
        System.out.println(" Olá! sou = " + p1.nome + " tenho " + p1.idade);
        System.out.println("---------");

        System.out.println(" Olá! sou = " + p2.nome + " tenho " + p2.idade);
        System.out.println("---------");

    }
}

public class Pessoa {
// primeira coisa é colocar as características q pertecem a esse objeto = atributo
String nome;
int idade;
// ações = método  

void apresentar() {
    System.out.println("OI");
    System.out.println("Eu sou " + nome);
}
void possoDirigir(){
    if (idade >= 18) {
        System.out.println("Posso dirigir");
    }
    else {
        System.out.println("Não posso dirigir");
    }
    System.out.println("--------");
}
}
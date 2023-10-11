import java.util.ArrayList;
import java.util.Scanner;


// 2 - Números primos -- Criar uma função em sua linguagem preferida. A função deve receber um numero N > 1 (validar o input),
// e retornar todos os números primos até o numero N. EX. p(2) = [2]; p(3) = [2, 3]; p(10) = [2, 3, 5, 7];
public class numerosPrimos {
    // Arrays que vão ser utilizados, um pra gerar a lista com os numeros até o número que o utilizador pediu e a outra que depois seré utilizada para guarda os números primos da primeira lista
    static ArrayList <Integer> listaNumeros = new ArrayList<>();
    static ArrayList <Integer> listaNumerosPrimos = new ArrayList<>();
    public static void main(String[] args) throws Exception {

    //leitor para ler o input
    Scanner leitor = new Scanner(System.in);

    // validação do número introduzido pelo utilizador, criando uma variavel que guarda o número aonde vai até número escolhido pelo utilizador
    int numero = -1;
    do {
        System.out.println("Digite um número limite para dar a sequência dos números primos até ele: ");
        numero = leitor.nextInt();
    } while (numero<=1);

    //gerar a lista com todos os números
    for (int i = 2; i < numero + 1; i++) {
        listaNumeros.add(i-2, i);
    }

    //chamando o método que irá verificar quais são primos dentro da lista listaNumeros
    isPrimo();

    //irá imprimir a resposta e os números primos para o utilizador
    System.out.println("Os números primos da sequência até o número escolhido pelo utilizador : " + listaNumerosPrimos);

    }
    // verificando se os números são primos
    public static void isPrimo() {
        for (int i = 0; i < listaNumeros.size(); i++) {
            int numeroDaLista = listaNumeros.get(i);
            if (numeroDaLista==2) {
                listaNumerosPrimos.add(numeroDaLista);
            }else if (numeroDaLista==3) {
                listaNumerosPrimos.add(numeroDaLista);
            } else if (numeroDaLista%2!=0 & numeroDaLista%3!=0){
                listaNumerosPrimos.add(numeroDaLista);
            }
        }
    }
}

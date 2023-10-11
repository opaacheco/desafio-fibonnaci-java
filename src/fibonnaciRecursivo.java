import java.util.ArrayList;
import java.util.Scanner;

// --- Criar uma função recursiva que resolva fibonacci

public class fibonnaciRecursivo {
    public static void main(String[] args) throws Exception {

    //leitor de entrada de dados
    Scanner leitor = new Scanner(System.in);


    // validação do número introduzido pelo utilizador
    int posicao = -1;
    do {
        System.out.println("Digite um posição entre 0 e 18, para buscar o seu correspondente na ordem Fibonnaci: ");
        posicao = leitor.nextInt();
    } while (posicao < 0 || posicao >18);

    //
    System.out.println("O correspondente a posição : " + posicao + " é : " + fibRecursiva(posicao));

    }
    //método recursivo para buscar o número da posição desejada
    public static int fibRecursiva(int numero) {
        if (numero == 0) {
            return 0;
        } else if (numero == 1) {
            return 1;
        } else {
            return fibRecursiva(numero-1) + fibRecursiva(numero-2);
        }
    }
}

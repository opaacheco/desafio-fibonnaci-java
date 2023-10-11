import java.util.ArrayList;
import java.util.Scanner;

// --- Criar uma função linear que resolva fibonacci

public class fibonnaciLinear {
    public static void main(String[] args) throws Exception {

    //leitor de entrada de dados
    Scanner leitor = new Scanner(System.in);

    // validação do número introduzido pelo utilizador
    int posicao = -1;
    do {
        System.out.println("Digite um index entre 0 e 18, para buscar o seu correspondente na ordem Fibonnaci: ");
        posicao = leitor.nextInt();
    } while (posicao < 0 || posicao >18);

    //imprimindo o número na posição da ordem fibonnaci desejada 
    System.out.println("O númedo correspondente da posição " + posicao + " desejada : " + fibLinear(posicao));

    }
    //método linear para retorna o número na ordem fibonnaci
    public static int fibLinear(int numero) {
        if (numero == 0) {
            return 0;
        } else if (numero == 1) {
            return 1;
        } else {
            int a = 0;
            int b = 1;
            for (int i = 2; i < numero+1; i++) {
                int aux = a;
                a=b;
                b=aux+b;
            }
            return b;
        }
    }
}


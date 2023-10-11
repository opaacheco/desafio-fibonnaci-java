import java.util.ArrayList;
import java.util.Scanner;


//  -- Criar uma função em sua linguagem preferida. A função deve receber um numero N >= 0 (deve validar o input para a função),
// e retornar o valor correspondente desse número na sequencia fibonnaci. EX. fib(0) =0; fib(1) = 1; fib(2) = 1; fib(3) = 2; fib(5) = 5; fib(6) = 8.

public class fibonnaci {
    static ArrayList<Integer> fibonnaci = new ArrayList<>();
    public static void main(String[] args) throws Exception {

        Scanner leitor = new Scanner(System.in);

        //gerar um fibonacci limitado para o código
        fibonnaci.add(0, 0);
        fibonnaci.add(1, 1);
        int aux = 2;
        do{
            fibonnaci.add(aux, fibonnaci.get(fibonnaci.size()-2) + fibonnaci.get(fibonnaci.size()-1)); 
            aux++;
        }while(fibonnaci.size() < 18);

        // validação da entrada de dados
        int indexDesejado = -1;
        do {
            System.out.println("Digite um index entre 0 e 18, para buscar o seu correspondente na ordem Fibonnaci: ");
            indexDesejado = leitor.nextInt();
        } while (indexDesejado < 0 || indexDesejado >18);

        int correspondente = retornarCorrespondente(indexDesejado);

        System.out.println("o valor correspondente ao index " + indexDesejado + " tem seu correspondente : " + correspondente);
        
    }
    public static int retornarCorrespondente(int numero) {
        if (numero == 0) {
            return 0;
        } else if (numero == 1) {
            return 1;
        } else {
          return fibonnaci.get(numero);
        }
    }
}

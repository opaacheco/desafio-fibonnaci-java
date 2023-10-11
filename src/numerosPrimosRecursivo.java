import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// --- Criar uma função recursiva que resolva p

public class numerosPrimosRecursivo {
    // Arrays que vão ser utilizados, um pra gerar a lista com os numeros até o número que o utilizador pediu e a outra que depois seré utilizada para guarda os números primos da primeira lista
    static List<Integer> listaNumeros = new ArrayList<>();
    static List<Integer> listaPrimos = new ArrayList<>();
    public static void main(String[] args) {

        //leitor para ler o input
        Scanner leitor = new Scanner(System.in);

        // Validação do número introduzido pelo utilizador.
        int n = 1;
        do{
            System.out.println("Digite um número limite para listar os números primos até ele: ");
            n = leitor.nextInt();
        }while (n < 2);

        //chama o método que ir adicionar os número na lista e em seguida verificar se é primo
        isPrimo(n);

        // Imprimindo os números primos
        System.out.println("Esta é a lista somente com números primos: " + listaPrimos);
    }
    //método para verificar e adicionar numeros na lista dos primos
    public static void isPrimo(int numero) {
        if (numero >= 2) {
            listaNumeros.add(numero);
            isPrimo(numero - 1);
        }else{
            for (int i = 0; i < listaNumeros.size(); i++) {
                int numeroDaLista = listaNumeros.get(i);
                if (numeroDaLista==2) {
                    listaPrimos.add(numeroDaLista);
                }else if (numeroDaLista==3) {
                    listaPrimos.add(numeroDaLista);
                } else if (numeroDaLista%2!=0 & numeroDaLista%3!=0){
                    listaPrimos.add(numeroDaLista);
                }
            }

        }
    }
}

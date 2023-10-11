import java.util.ArrayList;
import java.util.Scanner;

// --- Criar uma função linear que resolva p

public class numerosPrimosLinear {
    //lista que guarda todos os números primos
    static ArrayList<Integer> listaPrimos = new ArrayList<>();
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Validação do número introduzido pelo utilizador.
        int n = 1;
        do{
            System.out.println("Digite um número limite para listar os números primos até ele: ");
            n = leitor.nextInt();
        }while (n < 2);

        //chama o método que vai encontrar os números primos
        isPrimo(n);

        // Imprimindo os números primos
        System.out.println("Esta é a lista somente com números primos: " + listaPrimos);
    }
    //verifica quais são números primos
    public static void isPrimo(int numero) {
        for (int i = 2; i <= numero; i++) {
            if (i==2) {
                listaPrimos.add(i);
            }else if (i==3) {
                listaPrimos.add(i);
            } else if (i%2!=0 & i%3!=0){
                listaPrimos.add(i);
            }
        }
    }
}

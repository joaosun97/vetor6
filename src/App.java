import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = {8, 2, 5, 4, 6, 7, 3, 1, 10, 24};
        System.out.println("Vetor original:");
        imprimirVetor(vetor);

        System.out.println("Digite o número que deseja retirar:");
        int remover = scanner.nextInt();

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == remover) {
                vetor[i] = -1; 
                System.out.println("Número encontrado e removido.");
                System.out.println("Vetor após remoção:");
                imprimirVetor(vetor);
                scanner.close();
                return; 
            }
        }

        System.out.println("Número não encontrado no vetor.");
        scanner.close();
    }

    public static void imprimirVetor(int[] vetor) {
        for (int numero : vetor) {
            if (numero != -1) { 
                System.out.print(numero + " ");
            }
        }
        System.out.println();
    }
}
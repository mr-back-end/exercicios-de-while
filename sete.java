import java.util.Scanner;

public class sete {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lado;

        do {
            System.out.print("Digite o tamanho do lado do quadrado (entre 1 e 20): ");
            lado = scanner.nextInt();

            if (lado < 1 || lado > 20) {
                System.out.println("O tamanho do lado deve estar entre 1 e 20.");
            }
        } while (lado < 1 || lado > 20);

        imprimirQuadrado(lado);

        scanner.close();
    }

    public static void imprimirQuadrado(int lado) {
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

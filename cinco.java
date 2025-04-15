import java.util.Scanner;

public class cinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int contador = 0;
        int maior = Integer.MIN_VALUE;

        while (contador < 10) {
            System.out.print("Digite o número " + (contador + 1) + ": ");
            int numero = scanner.nextInt();
            contador++;

            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("O maior número digitado é: " + maior);
        
        scanner.close();
    }
}
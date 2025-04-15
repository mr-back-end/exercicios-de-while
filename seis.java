import java.util.Scanner;

public class seis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int contador = 0;
        int maior1 = Integer.MIN_VALUE;
        int maior2 = Integer.MIN_VALUE;

        while (contador < 10) {
            System.out.print("Digite o número " + (contador + 1) + ": ");
            int numero = scanner.nextInt();
            contador++;

            if (numero > maior1) {
                maior2 = maior1;
                maior1 = numero;
            } else if (numero > maior2) {
                maior2 = numero;
            }
        }

        System.out.println("Os dois maiores números digitados são: " + maior1 + " e " + maior2);
        
        scanner.close();
    }
}

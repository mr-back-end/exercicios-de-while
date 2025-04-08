import java.util.Scanner;

public class quatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantos alunos tem na sala? ");
        int numeroAlunos = scanner.nextInt();
        
        int contador = 0;
        while (contador < numeroAlunos) {
            System.out.print("Digite a nota do aluno " + (contador + 1) + ": ");
            double nota = scanner.nextDouble();
            System.out.println("Nota do aluno " + (contador + 1) + ": " + nota);
            contador++;
        }
        
        scanner.close();
    }
}
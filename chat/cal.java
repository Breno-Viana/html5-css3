import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero1, numero2, resultado;
        char operacao;

        System.out.println("Digite o primeiro número:");
        numero1 = scanner.nextDouble();

        System.out.println("Digite a operação (+, -, *, /):");
        operacao = scanner.next().charAt(0);

        System.out.println("Digite o segundo número:");
        numero2 = scanner.nextDouble();

        switch (operacao) {
            case '+':
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Não é possível dividir por zero.");
                }
                break;
            default:
                System.out.println("Operação inválida.");
        }

        scanner.close();
    }
}

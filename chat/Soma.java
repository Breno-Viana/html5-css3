public class Soma {

    // Função para somar dois números inteiros e retornar o resultado
    public int somar(int a, int b) {
        int resultado = a + b;
        return resultado;
    }

    // Método main para testar a função
    public static void main(String[] args) {
        Soma calculadora = new Soma();  // Criando uma instância da classe Soma

        // Chamando a função somar e armazenando o resultado
        int numero1 = 10;
        int numero2 = 5;
        int resultado = calculadora.somar(numero1, numero2);

        // Exibindo o resultado
        System.out.println("A soma de " + numero1 + " e " + numero2 + " é: " + resultado);
    }
}

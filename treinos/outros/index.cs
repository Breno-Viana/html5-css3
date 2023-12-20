using System;

class Calculadora
{
    static void Main()
    {
        while (true)
        {
            Console.WriteLine("Calculadora Simples");
            Console.WriteLine("1. Adição");
            Console.WriteLine("2. Subtração");
            Console.WriteLine("3. Multiplicação");
            Console.WriteLine("4. Divisão");
            Console.WriteLine("5. Sair");

            Console.Write("Escolha a operação (1-5): ");
            int escolha = int.Parse(Console.ReadLine());

            if (escolha == 5)
            {
                Console.WriteLine("Saindo da calculadora. Até logo!");
                break;
            }

            Console.Write("Digite o primeiro número: ");
            double numero1 = double.Parse(Console.ReadLine());

            Console.Write("Digite o segundo número: ");
            double numero2 = double.Parse(Console.ReadLine());

            double resultado = 0;

            switch (escolha)
            {
                case 1:
                    resultado = numero1 + numero2;
                    break;
                case 2:
                    resultado = numero1 - numero2;
                    break;
                case 3:
                    resultado = numero1 * numero2;
                    break;
                case 4:
                    if (numero2 != 0)
                    {
                        resultado = numero1 / numero2;
                    }
                    else
                    {
                        Console.WriteLine("Erro: Divisão por zero.");
                        continue; // Reinicia o loop para permitir uma nova escolha
                    }
                    break;
                default:
                    Console.WriteLine("Escolha inválida. Tente novamente.");
                    continue; // Reinicia o loop para permitir uma nova escolha
            }

            Console.WriteLine($"Resultado: {resultado}");
        }
    }
}

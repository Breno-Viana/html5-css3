// Definindo a classe Carro
public class l {
  // Propriedades do carro
  String marca;
  String modelo;
  String cor;

  // Método construtor para inicializar o objeto
  public Carro(String marca, String modelo, String cor) {
      this.marca = marca;
      this.modelo = modelo;
      this.cor = cor;
  }

  // Método para exibir informações do carro
  public void exibirInformacoes() {
      System.out.println("Marca: " + marca);
      System.out.println("Modelo: " + modelo);
      System.out.println("Cor: " + cor);
  }

  // Outros métodos do carro
  public void acelerar() {
      System.out.println("Carro acelerando...");
  }

  public void frear() {
      System.out.println("Carro freando...");
  }
}

// Criando um objeto da classe Carro
public class Main {
  public static void main(String[] args) {
      // Criando um objeto Carro chamado meuCarro
      Carro meuCarro = new Carro("Honda", "Civic", "Preto");

      // Chamando métodos do objeto
      meuCarro.exibirInformacoes();
      meuCarro.acelerar();
      meuCarro.frear();
  }
}

import random

def escolher_palavra():
    palavras = ["python", "programacao", "jogo", "computador", "divertido", "desafio"]
    return random.choice(palavras)

def jogar_forca(palavra):
    palavra_secreta = list(palavra)
    palavra_descoberta = ["_"] * len(palavra)
    tentativas = 6
    letras_erradas = []

    while tentativas > 0:
        print("Palavra: " + " ".join(palavra_descoberta))
        print("Tentativas restantes: {}".format(tentativas))
        print("Letras erradas: {}".format(", ".join(letras_erradas)))

        palpite = input("Digite uma letra: ").lower()

        if palpite in palavra_secreta:
            print("Boa! A letra está na palavra.")
            for i in range(len(palavra_secreta)):
                if palavra_secreta[i] == palpite:
                    palavra_descoberta[i] = palpite
        else:
            print("Ops! A letra não está na palavra.")
            letras_erradas.append(palpite)
            tentativas -= 1

        if "_" not in palavra_descoberta:
            print("Parabéns! Você descobriu a palavra: {}".format(palavra))
            break

    if tentativas == 0:
        print("Você perdeu! A palavra era: {}".format(palavra))

if __name__ == "__main__":
    print("Bem-vindo ao Jogo da Forca!")
    palavra_aleatoria = escolher_palavra()
    jogar_forca(palavra_aleatoria)

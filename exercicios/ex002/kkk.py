# Função para verificar se um número é primo
def eh_primo(numero):
    if numero <= 1:
        return False
    if numero <= 3:
        return True
    if numero % 2 == 0 or numero % 3 == 0:
        return False
    i = 5
    while i * i <= numero:
        if numero % i == 0 or numero % (i + 2) == 0:
            return False
        i += 6
    return True

# Solicita ao usuário o limite inferior e superior do intervalo
limite_inferior = int(input("Digite o limite inferior: "))
limite_superior = int(input("Digite o limite superior: "))

# Encontra e exibe os números primos dentro do intervalo
print(f"Números primos no intervalo de {limite_inferior} a {limite_superior}:")
for numero in range(limite_inferior, limite_superior + 1):
    if eh_primo(numero):
        print(numero)

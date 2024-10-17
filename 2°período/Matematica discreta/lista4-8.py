import random

def sorteia(num):
    for _ in range(6):
        num.append(random.randint(1, 100))


def somaPar(num):
    soma = 0
    pares_somados = []
    for n in num:
        if n % 2 == 0:
            soma += n
            pares_somados.append(n)

    print(f"Pares somados: {pares_somados}")
    print(f"Soma dos pares: {soma}")



num = []
sorteia(num)
print(f"Números sorteados: {num}")
somaPar(num)
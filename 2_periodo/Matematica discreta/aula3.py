import time

def calcFatorial(n):
    fatorial = 1
    for i in range(1, n + 1):
        fatorial *= i
    return fatorial

def fatorialRecursivo(n):
    if n == 1:
        return 1
    else:
        return n * fatorialRecursivo(n-1)

calcFatorial(20)
fatorialRecursivo(20)


def somatorioImpares(n):
    soma = 0
    for i in range(n+1):
        soma += 2*i+1
    return soma


def somatorioImparesRecursivo(n):
    if n == 0:
        return 1
    else:
        return 2 * n + 1 + somatorioImparesRecursivo(n - 1) 
    
print(somatorioImpares(3))
print(somatorioImparesRecursivo(3))

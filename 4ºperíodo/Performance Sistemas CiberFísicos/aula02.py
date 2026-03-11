decimal = int(input("Digite um número decimal: \n"))

resultado_binario = []
resultado_octal = []
resultado_hexa = []

def decimal_binario(decimal):
    while decimal > 0:
        resultado_binario.append(str(decimal % 2))
        decimal = decimal // 2


def decimal_octal(decimal):
    while decimal > 0:
        resultado_octal.append(str(decimal % 8))
        decimal = decimal // 8

print(f"Resultado binário: {decimal_binario(decimal)} \n")
print(f"Resultado octal: {decimal_octal(decimal)} \n")


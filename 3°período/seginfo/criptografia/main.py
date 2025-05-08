alfabeto = [chr(i) for i in range(97, 123)]  # Lista com as letras do alfabeto (a-z)


def cifrar(texto, x):
    textoCifrado = []
    for i in texto:
        if i in alfabeto:
            indice = alfabeto.index(i)
            novo_indice = (indice + x) % len(alfabeto)
            textoCifrado.append(alfabeto[novo_indice])
        else:
            textoCifrado.append(i)
    return ''.join(textoCifrado)

def descifrar(texto, x):
    textoDescifrado = []
    for i in texto:
        if i in alfabeto:
            indice = alfabeto.index(i)
            novo_indice = (indice - x) % len(alfabeto)
            textoDescifrado.append(alfabeto[novo_indice])
        else:
            textoDescifrado.append(i)  
    return ''.join(textoDescifrado)
        

while True:
    texto = input("Digite o texto que quer cifrar: ").lower()
    numero = int(input("Digite o número: "))

    textoCifrado = cifrar(texto, numero)

    print(f"Texto encriptado: {textoCifrado}")

    textoDecifrado = descifrar(textoCifrado,numero)
    print(f"Texto desencriptado {textoDecifrado}")


                     

                     
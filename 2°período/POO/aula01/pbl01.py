import random

def createListRandomNumbers(lenghtList):
    listRandomNumbers = []
    for i in range(lenghtList):
        listRandomNumbers.append(random.randint(0, 100))
    return listRandomNumbers

def oddOrEvenAndMultipleof3(list):
    for i in range(len(list)):
        if list[i] % 3 == 0:
                if list[i] % 2 == 0:
                    print(f"{list[i]} - Múltiplo de 3 e Par")
                else:
                    print(f"{list[i]} - Múltiplo de 3 e Ímpar")
                continue
        elif list[i] % 2 == 0:
            print(f"{list[i]} - Par")
        else:
            print(f"{list[i]} - Ímpar")   

leghtList = int(input("Digite o tamanho da lista: "))
oddOrEvenAndMultipleof3(createListRandomNumbers(leghtList))
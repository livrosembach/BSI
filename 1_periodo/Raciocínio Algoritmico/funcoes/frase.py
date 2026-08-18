
def conta_palavras():
    frase = input("Digite uma frase: \n").split(" ")
    return len(frase)
   
def conta():
    frase = input("Digite uma frase: \n")
    espacos = 1
    for char in frase:
        if char == " ":
            espacos +=1
    return espacos

print(conta_palavras())
print(conta())    
    


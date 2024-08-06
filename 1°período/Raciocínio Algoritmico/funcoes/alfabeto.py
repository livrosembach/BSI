
alfabeto = ["a","b","c","d","e","f","g","h","i","j","k",
            "l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"]
cripto_alfabeto =["d","e","f","g","h","i","j","k",
            "l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","a","b","c"]

frase = input("digite uma palavra: \n")

for letra in frase:
    if letra in alfabeto:
        index_letra = alfabeto.index(letra)
        print(cripto_alfabeto[index_letra])
    
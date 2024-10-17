def consoante(letra):
    return letra.lower() in 'bcdfghjklmnpqrstvwxyz'


caracteres = []
consoantes = []


for i in range(6):
    caractere = input(f"Digite o caractere {i+1}: ")
    caracteres.append(caractere)
    

    if consoante(caractere):
        consoantes.append(caractere)


print(f"Consoantes lidas ({len(consoantes)}):")
for i, consoante in enumerate(consoantes):
    print(f"{i+1} -> {consoante}")
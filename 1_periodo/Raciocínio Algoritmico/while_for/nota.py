nota = float(input("Digite a nota do aluno - "))

while nota < 0 or nota > 10:
    print("Nota invalida")
    nota = float(input("Digite a nota do aluno - "))
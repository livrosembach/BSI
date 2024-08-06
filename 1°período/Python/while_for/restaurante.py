cont = int(input("Quantos pratos você quer inserir : "))
peso_total = 0
maior_800 = 0

for _ in range (cont) :
    peso = float(input("Qual o peso do prato : "))
    peso_total += peso
    if peso >= 800 :
        maior_800 += 1

média = peso_total / cont
print("A média dos pesos é : ", média)
print("A quantidade de prato acima de 800 é : ", maior_800)
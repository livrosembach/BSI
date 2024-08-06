altura = int(input("Qual a altura? "))
raio = int(input("Qual o raio? "))
area = (2*3.14 * raio * raio) + (2*3.14 * raio * altura)
litro = area/3
lata = litro/5
custo = lata * 50
print("Será necessário ", lata, "latas e o custo será ", custo )
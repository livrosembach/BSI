A = []

for i in range(5):
    num = int(input(f"Digite o número {i+1}: "))
    A.append(num)

soma_quadrados = sum([x**2 for x in A])

print(f"A soma dos quadrados dos elementos do vetor é: {soma_quadrados}")



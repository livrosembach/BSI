medias = []

for aluno in range(6):
    print(f"\nAluno {aluno + 1}:")
    notas = []
    for nota in range(4):
        nota_atual = float(input(f"Digite a nota {nota + 1}: "))
        notas.append(nota_atual)
    
    media = sum(notas) / 4
    medias.append(media)

alunos_com_media_acima_7 = sum(1 for media in medias if media >= 7.0)

print(f"\nNúmero de alunos com média maior ou igual a 7.0: {alunos_com_media_acima_7}")

capacidade_caminhao_caixas = 50 ##caixas
capacidade_caixa = 20 ##livros
peso_livro = 0.100
capacidade_caminhao_livros = capacidade_caminhao_caixas * capacidade_caixa
peso_caminhao = capacidade_caminhao_livros * peso_livro
print("Podem ser transportados ", capacidade_caminhao_livros , "livros")
print("O peso do caminhão na sua capacidade total é ", peso_caminhao,"Kg")

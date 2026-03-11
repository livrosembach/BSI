//
//  Main.swift
//  Guia_1
//
//  Created by Livia Rosembach Oliveira on 11/03/26.
//

var livros: [Livro] = []

func Main() {
    
    while true {
        print("""
        
        ===== Sistema de Biblioteca =====
        1 - Adicionar livro
        2 - Listar livros
        3 - Alterar disponibilidade
        4 - Sair
        
        Escolha uma opção:
        """)
        
        guard let opcao = readLine() else { continue }
        
        switch opcao {
            
        case "1":
            print("Título:")
            let titulo = readLine() ?? ""
            
            print("Autor:")
            let autor = readLine() ?? ""
            
            print("Ano de publicação:")
            let ano = Int(readLine() ?? "") ?? 0
            
            adicionarLivros(
                titulo: titulo,
                autor: autor,
                anoPublicacao: ano,
                disponibilidade: true
            )
            
            print("Livro adicionado com sucesso!")
            
            
        case "2":
            listarLivros()
            
            
        case "3":
            print("Digite o título do livro:")
            let titulo = readLine() ?? ""
            
            alterarDisponibilidade(livro: titulo)
            
            
        case "4":
            print("Saindo do sistema...")
            return
            
            
        default:
            print("Opção inválida!")
        }
    }
}

func alterarDisponibilidade(livro: String) {
    if let index = livros.firstIndex(where: { $0.titulo == livro }) {
        livros[index].disponibilidade.toggle()
        
        switch livros[index].disponibilidade{
        case true:
            print("O livro \(livros[index].titulo) está disponível novamente!")
        case false:
            print("O livro \(livros[index].titulo) foi emprestado")
        }
        
    } else {
        print("Esse livro não existe")
    }
}

func adicionarLivros(titulo: String, autor: String, anoPublicacao: Int, disponibilidade: Bool) {
    livros.append(Livro(titulo: titulo, autor: autor, anoPublicacao: anoPublicacao, disponibilidade: disponibilidade))
}

func listarLivros() {
    print("Lista de Livros:")
    for livro in livros {
        print("Título: \(livro.titulo)")
        print("Autor: \(livro.autor)")
        print("Ano de Publicação: \(livro.anoPublicacao)")
        print("Disponibilidade: \(livro.disponibilidade)")
        print("---------------------")
    }
}

contador = ''
lista_pokemons = []
pokemon = ''

while contador != "exit" :
    num = int(input("1 - Inserir Pokemon \n2- Sair "))
    if num == 1 :
        pokemon = input("Digite o nome do pokemon \n")
        lista_pokemons.append(pokemon)
    elif num == 2 :
        contador = "exit"
    else :
        print("Digite 1 ou 2")

for pokemon in list :
    print(pokemon)
    


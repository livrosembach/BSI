def ataque(dano, vida_pokemon): 
    return vida_pokemon - dano

def cura(pocao_cura, vida_pokemon) :
    return vida_pokemon + pocao_cura

pokemon1 = {"nome":"Pikachu", "vida": 100 ,"ataque" : 20 ,"pocao_cura" : 10}
pokemon2 = {"nome" : "Charmander", "vida" : 100 , "ataque" : 15 , "pocao_cura" : 15}

print("Bem-vindo ao jogo \n Pokemon 1:")
for item in pokemon1.items():
    print(item)
print("Pokemon 2 :")
for item in pokemon2.items() :
    print(item)

while True:
    vez = 1
    if vez == 1 and pokemon1["vida"] != 0 and pokemon2["vida"] != 0  :
        controle = int(input("Vez do Pokemon 1 \n O que você deseja fazer? \n 1- Atacar \n 2- Curar \n"))
        if controle == 1 :
            pokemon2["vida"] = ataque(pokemon1["ataque"], pokemon2["vida"])
            print("Vida Restante do Pokemon 2 : ", pokemon2["vida"])
            if pokemon2["vida"] == 0:
                print("Pokemon 1 venceu!!")
                break
            vez = 2
        elif controle == 2 :
            pokemon1["vida"] = cura(pokemon1["pocao_cura"], pokemon1["vida"])
            print("Vida Restante do Pokemon 1 : ", pokemon1["vida"])
            vez = 2
        else:
               print("Invalido, por favor escreva 1 ou 2")
            
    if vez == 2 :
        controle = int(input("Vez do Pokemon 2 \n O que você deseja fazer? \n 1- Atacar \n 2- Curar \n"))
        if controle == 1 :
            pokemon1["vida"] = ataque(pokemon2["ataque"], pokemon1["vida"])
            print("Vida Restante do Pokemon 1 : ", pokemon1["vida"])
            if pokemon1["vida"] == 0:
                print("Pokemon 2 venceu!!")
                break
        elif controle == 2 :
            pokemon2["vida"] = cura(pokemon2["pocao_cura"], pokemon2["vida"])
            print("Vida Restante do Pokemon 2 : ", pokemon2["vida"])
        vez = 1


            

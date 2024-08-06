def ataque(dano, vida_pokemon): 
    return vida_pokemon - dano

def cura(pocao_cura, vida_pokemon) :
    return vida_pokemon + pocao_cura

vida1 = 100
vida2 = 100
dano = 20
pocao_cura = 10

while True:
    vez = 1
    if vida1 != 0 and vida2 != 0:
        while vez == 1:
            controle = int(input("1 ou 2 \n"))
            if controle == 1:
                vida2 = ataque(dano, vida2)
                print(vida2)
            elif controle == 2 :
                vida1 = cura(pocao_cura, vida1)
                print(vida1)
            vez = 2
        while vez == 1:
            controle = int(input("1 ou 2 \n"))
            if controle == 1:
                vida1 = ataque(dano, vida1)
                print(vida1)
            elif controle == 2 :
                vida2 = cura(pocao_cura, vida2)
                print(vida2)
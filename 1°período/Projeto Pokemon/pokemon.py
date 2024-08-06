import random

ataques = {
    "bite": {
        "nome": "bite",
        "dano": 500,
        "tipo": "eletrico",
        "chance_de_acerto": 0.99,
        "velocidade_de_ataque": 5.73
    },
    "choquei": {
        "nome": "choquei",
        "dano": 500,
        "tipo": "eletrico",
        "chance_de_acerto": 0.99,
        "velocidade_de_ataque": 5.73
    }
}

# Todos pokemons 
pokemons = {
    "peppa pig": {
        "hp_pokemon": 1000,
        "tipo_pokemon": ["grama"],
        "nivel_pokemon": 1,
        "ataques_pokemon": [ataques["bite"]],
    },
    "charmander": {
        "hp_pokemon": 1200,
        "tipo_pokemon": ["fogo"],
        "nivel_pokemon": 5,
        "ataques_pokemon": [ataques["choquei"]],
    },
    "squirtle": {
        "hp_pokemon": 800,
        "tipo_pokemon": ["água"],
        "nivel_pokemon": 3,
        "ataques_pokemon": [ataques["bite"]],
    },
    "bulbasaur": {
        "hp_pokemon": 900,
        "tipo_pokemon": ["grama", "veneno"],
        "nivel_pokemon": 4,
        "ataques_pokemon": [ataques["choquei"]],
    },
    "pikachu": {
        "hp_pokemon": 1100,
        "tipo_pokemon": ["elétrico"],
        "nivel_pokemon": 7,
        "ataques_pokemon": [ataques["bite"]],
    },
    "jigglypuff": {
        "hp_pokemon": 1500,
        "tipo_pokemon": ["normal", "fada"],
        "nivel_pokemon": 9,
        "ataques_pokemon": [ataques["choquei"]],
    }
}

party_jogador = []
pokemon_ativo = pokemons["peppa pig"]
print(party_jogador)

def escolher_pokemon_rival():
  poke_ativ_rival = random.choice(list(pokemons.items()))
  print(poke_ativ_rival)

def escolher_pokemon():
    for i in range(len(pokemons)) :
        print(f"{i+1} - {list(pokemons.keys())[i]}")
    escolha = int(input("Digite sua escolha\n"))
    pokemon_escolhido = list(pokemons)[escolha - 1]
    print(pokemon_escolhido)
    pokemon_ativo = pokemons[pokemon_escolhido]

def fugir() :
   fugir = random.randint(1,100)
   return fugir <= 35
    
def atacar(pokemon_ativo) :
   for i,ataque in enumerate(pokemon_ativo["ataques_pokemon"][i]["nome"]) :
    print(f"{i+1}-{ataque['nome']}")
   

while True :
   
   while True :
      acao_atual = input("1 - Atacar \n 2 - Trocar Pokemon \n 3 - Bag \n 4 - Fugir")
      match acao_atual :
        case "1": 
            atacar(pokemon_ativo)
        case "2": 
            escolher_pokemon()
        case "3": 
            print("bag")
        case "4": 
            if fugir():
               print("Você conseguiu fugir")
               break
            print("Você não conseguiu fugir")
        case _ : 
            print("Opção Inválida")

    

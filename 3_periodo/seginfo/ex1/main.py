import json
import os

# Carregar dados do JSON (usuários ou bloqueados)
def load_arquive(arquive):
    if os.path.exists(arquive):
        with open(arquive, "r") as arquive:
            return json.load(arquive)
    return {}

# Salvar dados em arquive JSON
def save_arquive(arquive, dados):
    with open(arquive, "w") as arquive:
        json.dump(dados, arquive, indent=4)

# Autenticação com bloqueio
def autenticar():
    usuarios = load_arquive("usuarios.json")
    bloqueados = load_arquive("bloqueados.json")

    login = input("Digite seu login: ")

    # Verifica se o usuário está bloqueado
    if login in bloqueados and bloqueados[login]["tentativas"] >= 5:
        print("Usuário bloqueado. Acesso negado.")
        return

    senha = input("Digite sua senha: ")

    if login in usuarios and senha == usuarios[login]:
        print(f"Seja bem-vindo, {login}!")
        # Zera tentativas após login bem-sucedido
        if login in bloqueados:
            del bloqueados[login]
        save_arquive("bloqueados.json", bloqueados)
    else:
        print("Login ou senha incorreto. Tente novamente mais tarde.")
        # Incrementa tentativas
        if login not in bloqueados:
            bloqueados[login] = {"tentativas": 1}
        else:
            bloqueados[login]["tentativas"] += 1

        if bloqueados[login]["tentativas"] >= 5:
            print("Usuário bloqueado após 5 tentativas.")

        save_arquive("bloqueados.json", bloqueados)

# Executa o programa
while True:
    autenticar()

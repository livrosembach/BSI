# Acessar: https://bit.ly/44kzlpn

import json
import pprint

# Carrega base de autorização
with open('aula_projeto_seginfo.json', "r") as arquivo:
    base = json.load(arquivo)

# Vou mudar o nome do usuário que está armazenado em base
base[0]['permissoes'][0]['escrita'] = True
base[0]['permissoes'][0]['execucao'] = False

# Salvar base atualizada 
with open('aula_projeto_seginfo.json', 'w') as arquivo:
    json.dump(base, arquivo, ensure_ascii=False)

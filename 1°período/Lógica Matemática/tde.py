from tabulate import tabulate

tabela_vdd = {'p':['v','v','f','f'], 'q' : ['v', 'f', 'v', 'f'],
              '~p' : ['f', 'f', 'v', 'v'], '~q' : ['f' , 'v', 'f', 'v'],
              'p -> q' : ['v','f','v','v'], 'p ^ q': ['v', 'f', 'f', 'f'],
              'p v q' : ['v', 'v', 'v', 'f'], 'p <-> q' : ['v', 'f','f','v']}


proposicao = input("Insira uma proposição válida: \n")
lista_proposicao = proposicao.split()
tabela_vdd_prop = []

if lista_proposicao[1] == 'v':
    tabela_vdd_prop = [tabela_vdd['p'], tabela_vdd['q'], tabela_vdd['p v q']]
    
elif lista_proposicao[1] == '^':
    tabela_vdd_prop = [tabela_vdd['p'], tabela_vdd['q'], tabela_vdd['p ^ q']]
    
elif lista_proposicao[1] == '<->':
    tabela_vdd_prop = [tabela_vdd['p'], tabela_vdd['q'], tabela_vdd['p <-> q']]
    
elif lista_proposicao[1] == '->':
    tabela_vdd_prop = [tabela_vdd['p'], tabela_vdd['q'], tabela_vdd['p -> q']]
    
else :
    print("Proposição Inválida")


tabela_vdd_prop = list(map(list, zip(*tabela_vdd_prop)))


print(tabulate(tabela_vdd_prop, headers=['p', 'q', proposicao]))


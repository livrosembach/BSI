hora_entrada = int(input("Qual a hora de entrada?"))
minuto_entrada = int(input("Qual o minuto de entrada?"))
hora_saida = int(input("Qual a hora de saída?"))
minuto_saida = int(input("Qual o minuto de saída)"))

hora_passada_entrada = hora_entrada *60 + minuto_entrada
hora_passada_saida = hora_saida *60 + minuto_saida
diferenca = hora_passada_saida - hora_passada_entrada 
print("Minutos transcorridos: ", diferenca)

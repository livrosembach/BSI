ingressos = float(input("Quantos ingressos vai querer?"))
valor_ingresso = 20
desconto = float(input("Qual a sua porcentagem de desconto?"))
estacionamento = float(input("Qual o valor do estacionamento?"))

preco_pagar = valor_ingresso * ingressos
preco_pagar = (preco_pagar - (desconto / 100)* preco_pagar) - estacionamento
print("O preço a pagar é R$" , preco_pagar)
##declarar qual o valor dos comprimentos do possivel triangulo
valor1 = float(input("Valor 1 : "))
valor2 = float(input("Valor 2 : "))
valor3 = float(input("Valor 3 : "))

##descobrir se é um triangulo
if (valor1 + valor2) > valor3 and (valor1 + valor3) > valor2 and (valor2 + valor3) > valor1 :
    ##descobrir que tipo de triangulo é
    if valor1 != valor2 and valor2 != valor3 and valor1 != valor3 :
        print("É um triangulo Escaleno")
    elif valor1 == valor2 == valor3 :
        print("É um triangulo Equilátero")
    else :
        print("É um triangulo Isóceles")
else :
    print("Não é um triangulo")



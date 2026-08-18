
num = int(input("Digite o número que deseja ver se existe na sequência de fibonacci \n"))

numF1 = 0
numF2 = 1
numF3 = numF1 + numF2
numeroAchado = False


while True :
    numF3 = numF1 + numF2
    numF1 = numF2
    numF2 = numF3
    if num == numF3:
         numeroAchado = True
         break
    if num < numF3:
         break


if(numeroAchado):
     print("Esse número está na sequência de Fibonacci")
else:
     print("Esse número não está na sequência de Fibonacci")

    



credits = 0
start_hour = 0
start_minute= 0
end_hour = 0
end_minute = 0
time_hour = 0
time_minute = 0

def recharge_credits(num):
    if num.isdigit() and num > 0:
        credits += num
    else :
        print("Digite um valor válido")

def time():
    if end_hour > start_hour:
        time_hour = end_hour - start_hour
    elif end_hour < start_hour:
        time_hour = 24 - start_hour + end_hour


while True :
    login = "admin"
    password = "1234"
    login_ = input("Digite seu Login: ")
    password_ = input("Digite sua senha: ")
    if login_ == login and password_ == password:
        while True:
            options = input("1 - Alugar a Bike \n 2 - Devolver a Bike \n 3 - Consultar créditos \n 4 - Comprar créditos")
            if options == 1 :
                ##digitar o horario, verificar se tem créditos, 


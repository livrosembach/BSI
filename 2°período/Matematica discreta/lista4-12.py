running = -1
votes = []

while running != 0:
    user_input = int(input("Digite um valor de 0 a 6 \n"))
    if user_input == 0:
        running = 0
    elif user_input < 0 or user_input > 6:
        print("O valor deve ser de 0 a 6")
    else:
        match user_input:
            case 1:
                votes.append("Python")
            case 2:
                votes.append("C++")
            case 3:
                votes.append("Java")
            case 4:
                votes.append("Rust")
            case 5:
                votes.append("C#")
            case 6:
                votes.append("Outro")

print("Linguagem | Votos | Percentual")
for language in set(votes):
    count = votes.count(language)
    percentage = (count / len(votes)) * 100
    print(f"{language} | {count} | {percentage:.2f}%")
print(f"Total |{len(votes)}|")
peso_boxeador = float(input("Qual seu peso? "))

if peso_boxeador < 50 :
    print("Pertence a categoria: Palha")
elif peso_boxeador >= 50 and peso_boxeador < 60 :
    print("Pertence a categoria: Pluma")
elif peso_boxeador >= 60 and peso_boxeador < 76:
    print("Pertence a categoria: Leve")
elif peso_boxeador >= 76 and peso_boxeador < 88:
    print("Pertence a categoria: Pesado")
elif peso_boxeador >= 88 :
    print("Pertence a categoria: Super Pesado")

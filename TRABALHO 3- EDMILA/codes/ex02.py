def calcular_media():
    try:
        nota1 = float(input("Digite a primeira nota: "))
        nota2 = float(input("Digite a segunda nota: "))
        nota3 = float(input("Digite a terceira nota: "))
    except ValueError:
        print("Entrada inválida. Preencha as notas com números")
        return
    
    media = (nota1 + nota2 + nota3) /3

    print(f'A média das notas é: {media:.2f}')

calcular_media()

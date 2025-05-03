def calcular_imc():
    try:
        peso = float(input("Digite o seu peso em quilogramas: "))
        altura = float(input("Digite a sua altura em metros: "))
    except ValueError:
        print("Entrada inválida. Por favor preencha com seu peso e altura em números.")
        return
    
    if altura <= 0:
        print("Altura inválida. A altura deve ser maior do que zero.")

    imc = peso / (altura **2)

    print(f"\nSeu IMC é: {imc:.2f}")

    if imc < 18.5:
     print("Condição: Abaixo do peso")
    elif 18.6 <= imc <= 24.9:
     print("Condição: Peso ideal (parabéns)")
    elif 25.0 <= imc <= 29.9:
     print("Condição: Levemente acima do peso")
    elif 30.0 <= imc <= 34.9:
     print("Condição: Obesidade grau I")
    elif 35.0 <= imc <= 39.9:
     print("Condição: Obesidade grau II (severa)")
    else:
     print("Condição: Obesidade grau III (mórbida)")

calcular_imc()
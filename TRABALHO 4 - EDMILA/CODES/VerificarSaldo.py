def verificar_saldo():
    numero_conta = input("Digite o número da conta do cliente: ")
    saldo = float(input("Digite o saldo da conta: "))
    debito = float(input("Digite o valor do débito: "))
    credito = float(input("Digite o valor do crédito: "))

    saldo_atual = saldo - debito + credito

    print(f"\nNúmero da Conta: {numero_conta}")
    print(f"Saldo Atual: R$ {saldo_atual:.2f}")

    if saldo_atual >= 0:
        print("Saldo Positivo")
    else:
        print("Saldo Negativo")


verificar_saldo()
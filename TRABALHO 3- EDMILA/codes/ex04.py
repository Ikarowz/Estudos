def calcular_valor_final():
    try:
        valor_produto = float(input("Digite o valor do produto: R$ "))
    except ValueError:
        print("Entrada inválida. Por favor, digite um valor númerico para o produto.")
        return

    print("\nSelecione a forma de pagamento:")
    print("1 - A Vista em Dinheiro ou Pix (15% De desconto)")
    print("2 - A Vista no Cartão de crédito (10% De desconto)")
    print("3 - Parcelado no cartão em duas vezes (preço normal)")
    print("4 - Parcelado no cartão em três vezes ou mais (preço normal + 10% De juros)")
    
    try:
        codigo_pagamento = int(input("Digite o código da forma de pagamento desejada: "))
    except ValueError:
        print("Entrada inválida. Por favor, digite um número para o código de pagamento.")
        return
    
    if codigo_pagamento == 1:
        valor_final = valor_produto * (1 - 0.15)
        print(f"Valor final com 15% De desconto: R$ {valor_final:.2f}")
    elif codigo_pagamento == 2:
        valor_final = valor_produto * (1 - 0.10)  # 10% de desconto
        print(f"Valor final com 10% de desconto: R$ {valor_final:.2f}")
    elif codigo_pagamento == 3:
        valor_final = valor_produto
        print(f"Valor final parcelado em 2 vezes (sem juros): R$ {valor_final:.2f}")
    elif codigo_pagamento == 4:
        valor_final = valor_produto * (1 + 0.10)  # 10% de juros
        print(f"Valor final parcelado em 3 vezes ou mais (com 10% de juros): R$ {valor_final:.2f}")
    else:
        print("Código de pagamento inválido.")
    
calcular_valor_final()
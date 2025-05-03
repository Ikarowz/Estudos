def verificar_aprovacao():
    nome_aluno = input("Digite o nome do aluno: ")
    try:
        nota1 = float(input("Digite a primeira nota: "))
        nota2 = float(input("Digite a segunda nota: "))
        nota3 = float(input("Digite a terceira nota: "))
        nota4 = float(input("Digite a quarta nota: "))
    except ValueError:
        print("Entrada inválida. Preencha as notas com números")
        return
    
    media = (nota1 + nota2 + nota3 + nota4) /4

    print(f"\nNome do aluno: {nome_aluno}")
    print(f"Média final: {media:.2f}")

    if media >= 7:
        print("Situação: APROVADO")
    else:
        print("Situação: REPROVADO")

verificar_aprovacao()
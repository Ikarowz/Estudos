def verificar_acesso():
    codigo_correto = 1234
    senha_correta = 9999

    codigo_usuario = int(input("Digite o código de usuário: "))

    if codigo_usuario != codigo_correto:
        print("Usuário inválido!")
    else:
        senha_usuario = int(input("Digite a senha: "))
        if senha_usuario != senha_correta:
            print("Senha incorreta!")
        else:
            print("Acesso permitido")


verificar_acesso()
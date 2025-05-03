def calcular_salario():
    horas_trabalhadas = float(input("Digite o número de horas trabalhadas no mês: "))
    salario_por_hora = float(input("Digite o salário por hora: "))

    horas_semanais = 40
    semanas_no_mes = 4
    horas_mensais = horas_semanais * semanas_no_mes

    if horas_trabalhadas > horas_mensais:
        horas_extras = horas_trabalhadas - horas_mensais
        valor_hora_extra = salario_por_hora * 1.5
        salario_total = (horas_mensais * salario_por_hora) + (horas_extras * valor_hora_extra)
    else:
        salario_total = horas_trabalhadas * salario_por_hora

    print(f"\nSalário Total: R$ {salario_total:.2f}")


calcular_salario()
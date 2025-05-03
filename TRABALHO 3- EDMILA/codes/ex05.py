def calcular_salario_liquido_professor():
  try:
    valor_hora_aula = float(input("Digite o valor da hora aula: R$ "))
    numero_aulas_mes = int(input("Digite o número de aulas lecionadas no mês: "))
    percentual_desconto_inss = float(input("Digite o percentual de desconto do INSS (ex: 0.11 para 11%): "))
  except ValueError:
    print("Entrada inválida. Por favor, digite valores numéricos.")
    return

  salario_bruto = valor_hora_aula * numero_aulas_mes

  valor_desconto_inss = salario_bruto * percentual_desconto_inss

  salario_liquido = salario_bruto - valor_desconto_inss

  print("\n--- Cálculo do Salário Líquido ---")
  print(f"Valor da hora aula: R$ {valor_hora_aula:.2f}")
  print(f"Número de aulas lecionadas no mês: {numero_aulas_mes}")
  print(f"Percentual de desconto do INSS: {percentual_desconto_inss * 100:.2f}%")
  print(f"Salário bruto: R$ {salario_bruto:.2f}")
  print(f"Valor do desconto do INSS: R$ {valor_desconto_inss:.2f}")
  print(f"Salário líquido final: R$ {salario_liquido:.2f}")

calcular_salario_liquido_professor()
import javax.swing.JOptionPane;

public class CalcularSalarioLiquido {

    public static void main(String[] args) {
        try {
            String valorHoraAulaStr = JOptionPane.showInputDialog("Digite o valor da hora aula: R$");
            double valorHoraAula = Double.parseDouble(valorHoraAulaStr);

            String numeroAulasMesStr = JOptionPane.showInputDialog("Digite o número de aulas lecionadas no mês:");
            int numeroAulasMes = Integer.parseInt(numeroAulasMesStr);

            String percentualDescontoInssStr = JOptionPane.showInputDialog("Digite o percentual de desconto do INSS (ex: 0.11 para 11%):");
            double percentualDescontoInss = Double.parseDouble(percentualDescontoInssStr);

            double salarioBruto = valorHoraAula * numeroAulasMes;

            double valorDescontoInss = salarioBruto * percentualDescontoInss;

            double salarioLiquido = salarioBruto - valorDescontoInss;

            String resultado = "--- Cálculo do Salário Líquido ---\n";
            resultado += String.format("Valor da hora aula: R$ %.2f\n", valorHoraAula);
            resultado += String.format("Número de aulas lecionadas no mês: %d\n", numeroAulasMes);
            resultado += String.format("Percentual de desconto do INSS: %.2f%%\n", percentualDescontoInss * 100);
            resultado += String.format("Salário bruto: R$ %.2f\n", salarioBruto);
            resultado += String.format("Valor do desconto do INSS: R$ %.2f\n", valorDescontoInss);
            resultado += String.format("Salário líquido final: R$ %.2f", salarioLiquido);

            JOptionPane.showMessageDialog(null, resultado, "Salário Líquido", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, digite valores numéricos.", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Operação cancelada.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }
}
import javax.swing.JOptionPane;

public class CalcularValorFinal {

    public static void main(String[] args) {
        try {
            String valorProdutoStr = JOptionPane.showInputDialog("Digite o valor do produto: R$");
            double valorProduto = Double.parseDouble(valorProdutoStr);

            String[] opcoes = {"À Vista em Dinheiro ou Pix (15% de desconto)",
                               "À Vista no cartão de crédito (10% de desconto)",
                               "Parcelado no cartão em duas vezes (preço normal)",
                               "Parcelado no cartão em três vezes ou mais (preço normal + 10% de juros)"};

            int escolha = JOptionPane.showOptionDialog(null,
                    "Selecione a forma de pagamento:",
                    "Forma de Pagamento",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]);

            double valorFinal = 0;

            switch (escolha) {
                case 0:
                    valorFinal = valorProduto * (1 - 0.15);
                    JOptionPane.showMessageDialog(null, String.format("Valor final com 15%% de desconto: R$ %.2f", valorFinal), "Valor Final", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 1: // À Vista no cartão de crédito
                    valorFinal = valorProduto * (1 - 0.10);
                    JOptionPane.showMessageDialog(null, String.format("Valor final com 10%% de desconto: R$ %.2f", valorFinal), "Valor Final", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2: // Parcelado no cartão em duas vezes
                    valorFinal = valorProduto;
                    JOptionPane.showMessageDialog(null, String.format("Valor final parcelado em 2 vezes (sem juros): R$ %.2f", valorFinal), "Valor Final", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3: // Parcelado no cartão em três vezes ou mais
                    valorFinal = valorProduto * (1 + 0.10);
                    JOptionPane.showMessageDialog(null, String.format("Valor final parcelado em 3 vezes ou mais (com 10%% de juros): R$ %.2f", valorFinal), "Valor Final", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case JOptionPane.CLOSED_OPTION:
                    JOptionPane.showMessageDialog(null, "Operação cancelada.", "Aviso", JOptionPane.WARNING_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção de pagamento inválida.", "Erro", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, digite um valor numérico para o produto.", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Operação cancelada.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }
}
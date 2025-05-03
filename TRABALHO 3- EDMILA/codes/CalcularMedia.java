import javax.swing.JOptionPane;

public class CalcularMedia {

    public static void main(String[] args) {
        try {
            String nota1Str = JOptionPane.showInputDialog("Digite a primeira nota:");
            double nota1 = Double.parseDouble(nota1Str);

            String nota2Str = JOptionPane.showInputDialog("Digite a segunda nota:");
            double nota2 = Double.parseDouble(nota2Str);

            String nota3Str = JOptionPane.showInputDialog("Digite a terceira nota:");
            double nota3 = Double.parseDouble(nota3Str);

            double media = (nota1 + nota2 + nota3) / 3;

            JOptionPane.showMessageDialog(null, String.format("A média das notas é: %.2f", media), "Média", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Preencha as notas com números.", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Operação cancelada.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }
}
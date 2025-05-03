import javax.swing.JOptionPane;

public class VerificarAprovacao {

    public static void main(String[] args) {
        String nomeAluno = JOptionPane.showInputDialog("Digite o nome do aluno:");

        try {
            String nota1Str = JOptionPane.showInputDialog("Digite a primeira nota:");
            double nota1 = Double.parseDouble(nota1Str);

            String nota2Str = JOptionPane.showInputDialog("Digite a segunda nota:");
            double nota2 = Double.parseDouble(nota2Str);

            String nota3Str = JOptionPane.showInputDialog("Digite a terceira nota:");
            double nota3 = Double.parseDouble(nota3Str);

            String nota4Str = JOptionPane.showInputDialog("Digite a quarta nota:");
            double nota4 = Double.parseDouble(nota4Str);

            double media = (nota1 + nota2 + nota3 + nota4) / 4;

            String resultado = String.format("Nome do aluno: %s\nMédia final: %.2f\n", nomeAluno, media);

            if (media >= 7) {
                resultado += "Situação: APROVADO";
            } else {
                resultado += "Situação: REPROVADO";
            }

            JOptionPane.showMessageDialog(null, resultado, "Resultado da Avaliação", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, digite números para as notas.", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Operação cancelada.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }
}
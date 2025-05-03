import javax.swing.JOptionPane;

public class CalcularIMC {

    public static void main(String[] args) {
        try {
            String pesoStr = JOptionPane.showInputDialog("Digite o seu peso em quilogramas (kg):");
            double peso = Double.parseDouble(pesoStr);

            String alturaStr = JOptionPane.showInputDialog("Digite a sua altura em metros (m):");
            double altura = Double.parseDouble(alturaStr);

            if (altura <= 0) {
                JOptionPane.showMessageDialog(null, "Altura inválida. A altura deve ser maior que zero.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            double imc = peso / (altura * altura);

            String resultado = String.format("Seu IMC é: %.2f\n", imc);

            if (imc < 18.5) {
                resultado += "Condição: Abaixo do peso";
            } else if (imc >= 18.6 && imc <= 24.9) {
                resultado += "Condição: Peso ideal (parabéns)";
            } else if (imc >= 25.0 && imc <= 29.9) {
                resultado += "Condição: Levemente acima do peso";
            } else if (imc >= 30.0 && imc <= 34.9) {
                resultado += "Condição: Obesidade grau I";
            } else if (imc >= 35.0 && imc <= 39.9) {
                resultado += "Condição: Obesidade grau II (severa)";
            } else {
                resultado += "Condição: Obesidade grau III (mórbida)";
            }

            JOptionPane.showMessageDialog(null, resultado, "Resultado do IMC", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, digite números para peso e altura.", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Operação cancelada.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }
}
import javax.swing.*;

public class Pessoa {
    private int idade;

    public Pessoa(int idade) {
        this.idade = idade;
    }

    public void classificarIdade() {
        if (idade < 12) {
            JOptionPane.showMessageDialog(null, "Criança");
        } else if (idade < 18) {
            JOptionPane.showMessageDialog(null, "Adolescente");
        } else if (idade < 60) {
            JOptionPane.showMessageDialog(null, "Adulto");
        } else {
            JOptionPane.showMessageDialog(null, "Idoso");
        }
    }
}
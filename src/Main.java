import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String idadeStr = JOptionPane.showInputDialog("Digite a idade:");
        int idade = Integer.parseInt(idadeStr);
        Pessoa p = new Pessoa(idade);
        p.classificarIdade();
    }
}
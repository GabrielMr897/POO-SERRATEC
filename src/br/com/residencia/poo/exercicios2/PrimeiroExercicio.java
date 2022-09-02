package br.com.residencia.poo.exercicios2;
import javax.swing.JOptionPane;
public class PrimeiroExercicio {
  public static void main(String[] args) {
    String nome;
    String sobrenome;

    // It's asking the user to input a name.
    nome = JOptionPane.showInputDialog("Qual seu nome?");
    // It's asking the user to input a last name.
    sobrenome = JOptionPane.showInputDialog("Qual seu sobrenome?");

    // It's showing a message dialog with the name and last name of the user.
    JOptionPane.showMessageDialog(null, "Olá, " + nome + " " + sobrenome + ", seja bem vindo ao universo da programação");
    

  }
}

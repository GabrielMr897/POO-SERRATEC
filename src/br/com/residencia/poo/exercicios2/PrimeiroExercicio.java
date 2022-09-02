package br.com.residencia.poo.exercicios2;
import javax.swing.JOptionPane;
public class PrimeiroExercicio {
  public static void main(String[] args) {
    String nome;
    String sobrenome;

    nome = JOptionPane.showInputDialog("Qual seu nome?");
    sobrenome = JOptionPane.showInputDialog("Qual seu sobrenome?");

    JOptionPane.showMessageDialog(null, "Olá, " + nome + " " + sobrenome + ", seja bem vindo ao universo da programação");
    

  }
}

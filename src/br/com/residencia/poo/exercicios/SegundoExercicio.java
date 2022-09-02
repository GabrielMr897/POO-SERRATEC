package br.com.residencia.poo.exercicios;
import java.util.Scanner;
public class SegundoExercicio {
  public static void main(String[] args) {
   try (Scanner ler = new Scanner (System.in)) {
    String nome;

     // It's asking for the user to input a name and then it's saving it in the variable `nome`.
     System.out.printf("Digite seu nome: ");
     nome = ler.nextLine();
     System.out.printf("Olá " + nome);
  }
  }
}

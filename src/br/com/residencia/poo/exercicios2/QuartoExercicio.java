package br.com.residencia.poo.exercicios2;
import java.util.Scanner;
public class QuartoExercicio {
  public static void main(String[] args) {
    double C, F;
    Scanner ler = new Scanner(System.in);

    // Asking the user to input a temperature in Celsius.
    System.out.println("Digite uma temperatura em Celsius");
    C = ler.nextDouble();

   // It's converting the temperature from Celsius to Fahrenheit.
    F = C * 1.8 + 32;

    // It's printing the temperature in Fahrenheit.
    System.out.println("A temperatura em Fahrenheit é: " + F + "F");

    ler.close();
  }
}

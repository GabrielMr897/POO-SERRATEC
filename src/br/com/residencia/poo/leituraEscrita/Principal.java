package br.com.residencia.poo.leituraEscrita;

import java.io.IOException;

public class Principal {
  public static void main(String[] args) {
    try {
      LeituraEscrita.leitor("EntradaDados");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
}

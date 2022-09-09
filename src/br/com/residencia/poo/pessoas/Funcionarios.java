package br.com.residencia.poo.pessoas;

public class Funcionarios {
  private int cpf;
  private String nome;
  private Double salario; 


  
  public int getCpf() {
    return cpf;
  }



  public void setCpf(int cpf) {
    this.cpf = cpf;
  }
 


  public String getNome() {
    return nome;
  }



  public void setNome(String nome) {
    this.nome = nome;
  }



  public Double getSalario() {
    return salario;
  }



  public void setSalario(Double salario) {
    this.salario = salario;
  }



  public Double bonificacao() {
    return getSalario() * 0.5;
  }


}

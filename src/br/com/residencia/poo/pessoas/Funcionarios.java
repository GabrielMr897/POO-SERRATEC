package br.com.residencia.poo.pessoas;

public class Funcionarios {
  protected int cpf;
  protected String nome;
  protected Double salario; 


  
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



  public Double getBonificacao() {
    return this.salario * 0.15;
  }


}

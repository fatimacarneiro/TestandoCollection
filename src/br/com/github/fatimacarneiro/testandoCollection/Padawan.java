package br.com.github.fatimacarneiro.testandoCollection;

public class Padawan {
   private String nome;
   private String cargo;
   private int nivel;
   private int idade;

   public Padawan(String nome, String cargo, int nivel, int idade){
       this.nome = nome;
       this.cargo = cargo;
       this.nivel = nivel;
       this.idade = idade;
    }

    @Override
    public String toString() {
        return "O nome do Padawan é: " + nome + ", sua idade é " + idade + ", seu cargo é " + cargo + " " + nivel;
    }



}

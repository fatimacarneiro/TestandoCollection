package br.com.github.fatimacarneiro.testandoCollection;

import java.util.Comparator;
import java.util.Date;

public class Padawan implements Comparator {
   private String nome;
   private String cargo;
   private int nivel;
   private int idade;
   private Date dataAdmissao;

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

    public String getNome() {
        return nome;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

    public int getIdade() {
        return idade;
    }
}

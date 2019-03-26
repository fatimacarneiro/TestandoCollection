package br.com.github.fatimacarneiro.testandoCollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetXLinkedHashSet {

    public static void main(String [] args) {
        Padawan padawan1 = new Padawan("Camila", "Aprendiz", 3, 26);
        Padawan padawan2 = new Padawan("Fatima", "Aprendiz", 3,23);
        Padawan padawan3 = new Padawan("José", "Aprendiz", 3,20);
        Padawan padawan4 = new Padawan("Wesley", "Aprendiz", 3,20);
        Padawan padawanTeste = new Padawan("Teste", "testando", 0,1);


        Set<Padawan> padawanHashSet = new HashSet<>();
        padawanHashSet.add(padawan1);
        padawanHashSet.add(padawan2);
        padawanHashSet.add(padawan3);
        padawanHashSet.add(padawan4);
        padawanHashSet.add(padawanTeste);

        System.out.println(padawanHashSet);


        Set<Padawan> padawanLinkedHashSet = new LinkedHashSet<>();
        padawanLinkedHashSet.add(padawan1);
        padawanLinkedHashSet.add(padawan2);
        padawanLinkedHashSet.add(padawan3);
        padawanLinkedHashSet.add(padawan4);
        padawanLinkedHashSet.add(padawanTeste);

        System.out.println(padawanLinkedHashSet);
    }
}

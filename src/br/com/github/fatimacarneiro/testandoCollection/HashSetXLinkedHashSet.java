package br.com.github.fatimacarneiro.testandoCollection;

import com.sun.codemodel.internal.JForEach;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

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

        padawanHashSet.forEach(new Consumer<Padawan>() {
            @Override
            public void accept(Padawan padawan) {
                System.out.println(padawan);
            }
        });

        System.out.println("\n" + "\n");


        Set<Padawan> padawanLinkedHashSet = new LinkedHashSet<>();
        padawanLinkedHashSet.add(padawan1);
        padawanLinkedHashSet.add(padawan2);
        padawanLinkedHashSet.add(padawan3);
        padawanLinkedHashSet.add(padawan4);
        padawanLinkedHashSet.add(padawanTeste);

        padawanLinkedHashSet.forEach(padawan -> System.out.println(padawan));
        System.out.println("\n" + "\n");

        padawanHashSet.stream().filter(padawan -> padawan.getIdade() >= 23).forEach(System.out::println);


    }
}

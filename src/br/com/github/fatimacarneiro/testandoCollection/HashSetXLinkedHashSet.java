package br.com.github.fatimacarneiro.testandoCollection;

import java.util.*;
import java.util.function.Consumer;

public class HashSetXLinkedHashSet {

    public static void main(String [] args) {

        Padawan padawan1 = new Padawan("Camila", "Aprendiz", 3, 26);
        Padawan padawan2 = new Padawan("Fatima", "Aprendiz", 3,23);
        Padawan padawan3 = new Padawan("José", "Aprendiz", 3,20);
        Padawan padawan4 = new Padawan("Wesley", "Aprendiz", 3,20);


        Set<Padawan> padawanHashSet = new HashSet<>();
        padawanHashSet.add(padawan1);
        padawanHashSet.add(padawan2);
        padawanHashSet.add(padawan3);
        padawanHashSet.add(padawan4);

        System.out.println("HashSet:");
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

        System.out.println("Imprimindo linkedHashSet com lambda:");
        padawanLinkedHashSet.forEach(padawan -> System.out.println(padawan));
        System.out.println("\n" + "\n");

        System.out.println("Imprimindo o HashSet com stream com filter:");
        padawanHashSet.stream().filter(padawan -> padawan.getIdade() >= 23).forEach(System.out::println);


    }
}

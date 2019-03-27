package br.com.github.fatimacarneiro.testandoCollection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class AplicacaoMap {
    public static void main(String[] args) {
        Map<Integer, String> padawanMap = new HashMap<>();

        padawanMap.put(1,"Camila");
        padawanMap.put(2,"Fatima");
        padawanMap.put(3,"José");
        padawanMap.put(4,"Wesley");


        System.out.println(padawanMap);
        System.out.println("\n");

        padawanMap.put(1, "teste");
        System.out.println(padawanMap);

        padawanMap.put(5, "Teste2");
        padawanMap.put(6, "Luke");
        padawanMap.put(7, "Leia");
        padawanMap.put(8, "Chewbacca");
        padawanMap.put(9, "Yoda");
        System.out.println(padawanMap);
        System.out.println("\n");


        //_________________________________________________________________

        System.out.println("Começa o LinkedHashMap");
        Map<Integer, String> padawanLinkedHashMap = new LinkedHashMap<>();
        padawanLinkedHashMap.put(1, "Luke");
        padawanLinkedHashMap.put(2, "Leia");
        padawanLinkedHashMap.put(3, "Chewbacca");
        padawanLinkedHashMap.put(4, "Yoda");

        System.out.println("\n");

        System.out.println(padawanLinkedHashMap);
        System.out.println("\n");

        padawanLinkedHashMap.put(1, "teste");
        System.out.println(padawanLinkedHashMap);

        padawanLinkedHashMap.put(5, "Teste2");
        padawanLinkedHashMap.put(6,"Camila");
        padawanLinkedHashMap.put(7,"Fatima");
        padawanLinkedHashMap.put(8,"José");
        padawanLinkedHashMap.put(9,"Wesley");
        System.out.println(padawanLinkedHashMap);
        System.out.println("\n");

        //_________________________________________________________________
        System.out.println("Começa o TreeMap");
        Map<Integer, Padawan> padawanTreeMap = new TreeMap<>();
        padawanTreeMap.put(1, new Padawan("Camila", "Aprendiz", 3, 26));
        padawanTreeMap.put(2, new Padawan("Fatima", "Aprendiz", 3, 23));
        padawanTreeMap.put(3, new Padawan("José", "Aprendiz", 3, 20));
        padawanTreeMap.put(4, new Padawan("Wesley", "Aprendiz", 3, 20));
        padawanTreeMap.put(5, new Padawan("teste", "teste", 0, 0));

        System.out.println("\n");

        padawanTreeMap.forEach((numero, padawan) -> System.out.println(padawan));

        System.out.println("\n");

        padawanTreeMap.put(5, new Padawan("Outro teste", "testador", 1, 1));
        padawanTreeMap.forEach((numero, padawan) -> System.out.println(padawan));








    }}

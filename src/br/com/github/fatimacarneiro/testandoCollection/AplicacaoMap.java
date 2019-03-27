package br.com.github.fatimacarneiro.testandoCollection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class AplicacaoMap {
    public static void main(String[] args) {
        Map<Integer, String> padawanMap = new HashMap<>();

        padawanMap.put(1,"Camila");
        padawanMap.put(3,"Fatima");
        padawanMap.put(2,"José");
        padawanMap.put(4,"Wesley");
        padawanMap.put(7, "Leia");
        padawanMap.put(9, "Yoda");
        padawanMap.put(6, "Luke");
        padawanMap.put(8, "Chewbacca");
        padawanMap.put(5, "Cestaro");


        System.out.println(padawanMap);
        System.out.println("\n");


        padawanMap.put(1, "Substituindo valor");


        System.out.println(padawanMap);
        System.out.println("\n");


       //_________________________________________________________________

        System.out.println("Começa o LinkedHashMap");
        Map<Integer, String> padawanLinkedHashMap = new LinkedHashMap<>();

        padawanLinkedHashMap.put(1,"Camila");
        padawanLinkedHashMap.put(3,"Fatima");
        padawanLinkedHashMap.put(2,"José");
        padawanLinkedHashMap.put(4,"Wesley");
        padawanLinkedHashMap.put(7, "Leia");
        padawanLinkedHashMap.put(9, "Yoda");
        padawanLinkedHashMap.put(6, "Luke");
        padawanLinkedHashMap.put(8, "Chewbacca");
        padawanLinkedHashMap.put(5, "Cestaro");


        System.out.println(padawanLinkedHashMap);
        System.out.println("\n");


        padawanLinkedHashMap.put(1, "Substituindo valor");


        System.out.println(padawanLinkedHashMap);
        System.out.println("\n");

       //_________________________________________________________________
        System.out.println("Começa o TreeMap");
        Map<Integer, String> padawanTreeMap = new TreeMap<>();

        padawanTreeMap.put(1,"Camila");
        padawanTreeMap.put(3,"Fatima");
        padawanTreeMap.put(2,"José");
        padawanTreeMap.put(4,"Wesley");
        padawanTreeMap.put(7, "Leia");
        padawanTreeMap.put(9, "Yoda");
        padawanTreeMap.put(6, "Luke");
        padawanTreeMap.put(8, "Chewbacca");
        padawanTreeMap.put(5, "Cestaro");


        System.out.println(padawanTreeMap);
        System.out.println("\n");


        padawanTreeMap.put(1, "Substituindo valor");


        System.out.println(padawanTreeMap);
        System.out.println("\n");

//        padawanTreeMap.put(1, new Padawan("Camila", "Aprendiz", 3, 26));
//        padawanTreeMap.put(2, new Padawan("Fatima", "Aprendiz", 3, 23));
//        padawanTreeMap.put(3, new Padawan("José", "Aprendiz", 3, 20));
//        padawanTreeMap.put(4, new Padawan("Wesley", "Aprendiz", 3, 20));
//        padawanTreeMap.put(5, new Padawan("teste", "teste", 0, 0));
//
//        System.out.println("\n");
//
//        padawanTreeMap.forEach((numero, padawan) -> System.out.println(padawan));
//
//        System.out.println("\n");
//
//        padawanTreeMap.put(5, new Padawan("Outro teste", "testador", 1, 1));
//        padawanTreeMap.forEach((numero, padawan) -> System.out.println(padawan));








    }}

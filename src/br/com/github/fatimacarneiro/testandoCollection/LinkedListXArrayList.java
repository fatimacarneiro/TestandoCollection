package br.com.github.fatimacarneiro.testandoCollection;

import java.util.*;

public class LinkedListXArrayList {

    public static void main(String[] args) {

        List<Padawan> padawanArrayList = new ArrayList<>();
        List<Padawan> padawanLinkedList = new LinkedList<>();

      //  ___________________________

        long tempoAntesLinked = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            Padawan padawan = new Padawan("Pizinho " + i, "aprendizes", 1,2);
            padawanLinkedList.add(padawan);
        }

        long tempoDepoisLinked = System.currentTimeMillis();


        long tempoAntesArray = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            Padawan padawan = new Padawan("Cestarinhos " + i, "aprendizes", 1,2);
            padawanArrayList.add(padawan);
        }

        long tempoDepoisArray = System.currentTimeMillis();

        System.out.println("Tempo inserção LinkedList: ");
        System.out.println(tempoDepoisLinked - tempoAntesLinked);
        System.out.println("Tempo inserção ArrayList: ");
        System.out.println(tempoDepoisArray - tempoAntesArray);

        // -------------------------------------------------------------

        //REMOVER

        long tempoAntesRemocaoArray = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            padawanArrayList.remove(0);
        }

        long tempoDepoisRemocaoArray = System.currentTimeMillis();

        //_______________________

        long tempoAntesRemocaoLinked = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            padawanLinkedList.remove(0);
        }

        long tempoDepoisRemocaoLinked = System.currentTimeMillis();


        System.out.println("Tempo remoção ArrayList: ");
        System.out.println(tempoDepoisRemocaoArray - tempoAntesRemocaoArray);
        System.out.println("Tempo remoção LinkedList: ");
        System.out.println(tempoDepoisRemocaoLinked - tempoAntesRemocaoLinked);



    }
}
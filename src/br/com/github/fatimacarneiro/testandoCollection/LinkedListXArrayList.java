package br.com.github.fatimacarneiro.testandoCollection;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class LinkedListXArrayList {

    public static void main(String[] args) {

        List<Padawan> padawanLinkedList = new LinkedList<>();
        List<Padawan> padawanArrayList = new ArrayList<>();

        //inserção

        long resultadoAdicaoLinkedList = calculaTempoInsencao(padawanLinkedList);
        long resultadoAdicaoArrayList = calculaTempoInsencao(padawanArrayList);

        System.out.println("Tempo inserção LinkedList: " + resultadoAdicaoLinkedList);
        System.out.println("Tempo inserção ArrayList: " + resultadoAdicaoArrayList);

        //remoção
        long resultadoRemocaoArrayList = calculaTempoRemocao(padawanArrayList);
        long resultadoRemocaoLinkedList = calculaTempoRemocao(padawanLinkedList);

        System.out.println("Tempo remoção LinkedList: " + resultadoRemocaoLinkedList);
        System.out.println("Tempo remoção ArrayList: " + resultadoRemocaoArrayList);

        //exibir listas
        //long resultadoExibicaoArray = calculaTempoExibir(padawanArrayList);
        //long resultadoExibicaoLinked = calculaTempoExibir(padawanLinkedList);




//        padawanArrayList.sort(Comparator.comparing(padawan -> padawan.getNome()));
//
//        padawanArrayList.forEach(System.out::println);
//
//        padawanLinkedList.forEach(padawan -> {
//            System.out.println(padawan);
//        });


    }

    public static long calculaTempoInsencao(List<Padawan> listaPadawan){
        long tempoAntes = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            Padawan padawan = new Padawan("Pizinho " + i, "aprendizes", 1,2);
            listaPadawan.add(padawan);
        }

        long tempoDepois = System.currentTimeMillis();

        return tempoDepois- tempoAntes;
    }

    public static long calculaTempoRemocao(List<Padawan> listaPadawan){
        long tempoAntes = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            listaPadawan.remove(0);
        }

        long tempoDepois = System.currentTimeMillis();

        return tempoDepois- tempoAntes;
    }

    /*public static long calculaTempoExibicao(List<Padawan> listaPadawan){
        long tempoAntes = System.currentTimeMillis();

        listaPadawan.forEach(padawan -> {
            System.out.println(padawan);
        });

        long tempoDepois = System.currentTimeMillis();

        return tempoDepois- tempoAntes;
    }
    */

}
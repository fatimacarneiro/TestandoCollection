package br.com.github.fatimacarneiro.testandoCollection;

import java.util.ArrayList;

import java.util.List;
import java.util.Vector;

public class VectorXArrayList {

    public static void main(String[] args) {

        List<Padawan> padawanArrayList = new ArrayList<>();
        List<Padawan> padawanVector = new Vector<>();

        //inserção

        long resultadoAdicaoVector = calculaTempoInsencao(padawanVector);
        long resultadoAdicaoArrayList = calculaTempoInsencao(padawanArrayList);

        System.out.println("Tempo inserção Vector: " + resultadoAdicaoVector);
        System.out.println("Tempo inserção ArrayList: " + resultadoAdicaoArrayList);


    }

    public static long calculaTempoInsencao(List<Padawan> listaPadawan){
        long tempoAntes = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            Padawan padawan = new Padawan("Pizinho " + i, "aprendizes", 1,2);
            listaPadawan.add(padawan);
        }

        long tempoDepois = System.currentTimeMillis();

        return tempoDepois- tempoAntes;
    }

}

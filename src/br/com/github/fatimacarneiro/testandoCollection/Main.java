package br.com.github.fatimacarneiro.testandoCollection;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        Padawan padawan1 = new Padawan("Camila", "Aprendiz", 3, 26);
        System.out.println(padawan1);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        LocalDateTime agora = LocalDateTime.now();

        DateTimeFormatter formatadorDateTime = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate agoraDateTime = LocalDate.now();

        System.out.println(agora.format(formatador));
        System.out.println(agoraDateTime.format(formatadorDateTime));

    }

}
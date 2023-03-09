package org.lessons.java;

import java.util.Random;

public class Snack2 {
    public static void main(String[] args) {
        // CONSEGNA:
        /*
         * Generatore di “nomi cognomi” casuali:
         * il Grande Gatsby ha una lista di nomi e una lista di cognomi,
         * e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.
         * */

        //creo la lista di nomi e quella dei cognomi

        String[] names = {"Ciro", "Simona", "Mario", "Paolo", "Sara"};
        String[] surnames = {"Di Salvo", "Ricci", "Esposito", "Rossi", "Conte"};

        //stampo la lista mixata di nomi e cognomi
        for (int i = 0; i < 5; i++) {
            Random random = new Random();
            int randomName = random.nextInt(names.length);
            int randomSurname = random.nextInt(surnames.length);
            System.out.println(names[randomName] + " " + surnames[randomSurname]);
        }

    }
}

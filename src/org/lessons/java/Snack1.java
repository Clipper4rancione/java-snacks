package org.lessons.java;

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
// CONSEGNA:
/*
 * Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.
 *
 * */
    // INPUT
        //chiedo all'utente di inserire un numero
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci il tuo numero: ");
        int userInput = Integer.parseInt(scan.nextLine());

    // OUTPUT
        // verifico se il numero è pari o dispari
        // creo una condizione per stampare il numero se è pari e passare al prossimo se è dispari
        if (userInput % 2 == 0){
            System.out.println("Il numero che hai inserito è Pari");
        } else {
            System.out.println("Passaggio al numero successivo...");
            System.out.println(userInput + 1);
        }
        }



    }


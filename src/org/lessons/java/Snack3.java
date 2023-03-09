package org.lessons.java;

public class Snack3 {
    public static void main(String[] args) {
        // CONSEGNA:
        /*
         * Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari
         *
         * */

        //Definisco l'array di interi
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i);
            if (i % 3 == 0 ){
                sum += i;
            }
        }
        System.out.println("La somma dei numeri dispari è di: " + sum);
    }
}

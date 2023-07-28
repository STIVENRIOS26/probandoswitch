package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        double temperaturaAmbiente;
        System.out.println("¿Cúal es la temperatura ambiente?");
        temperaturaAmbiente=keyboard.nextDouble();

        if(temperaturaAmbiente == 20.0){
            temperaturaAmbiente = 25.0;
        }else if(temperaturaAmbiente == 30.0){
            temperaturaAmbiente = 20.0;
        } else if(temperaturaAmbiente == 40) {
            temperaturaAmbiente = 20.0;
        }else{
            System.out.println("Señor usuario ingrese la temperatura que desea: ");
            temperaturaAmbiente = keyboard.nextDouble();
        }
        System.out.println("Apreciado usuario su temperatura cambio a "+temperaturaAmbiente);
    }
}
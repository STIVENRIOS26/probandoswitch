package org.example.ejemplo2;

import java.util.Scanner;

public class Ejemplo3 {
    public static void main(String[] args) {

        Scanner keyboard=new Scanner(System.in);

        System.out.println("Digita la temperatura actual: ");
        Double temperaturaAmbiente= keyboard.nextDouble();
        String temperaturaComoTexto=temperaturaAmbiente.toString();
        //Double temperaturaDos=Double.parseDouble(temperaturaComoTexto);

        switch (temperaturaComoTexto){

            case "20.0":
                temperaturaAmbiente=25.0;
                break;
            case "30.0":
                temperaturaAmbiente=20.0;
                break;
            case "40.0":
                temperaturaAmbiente=20.0;
                System.out.println("Te estás muriendo");
                break;
            default:
                System.out.println("¿Que temperatura deseas?");
                temperaturaAmbiente=keyboard.nextDouble();
        }
        //si se quiere conservar el decimal se hace parseo




    }
}

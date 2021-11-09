package com.sofka.proyect;

import java.util.Scanner;

public class process {

    String nombre, celular;
    int edad;

    public process(){
    }

    public void leerDatos (){
        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese el nombre: ");
        nombre = in.nextLine();
        System.out.println("Ingrese su numero de celular: ");
        celular = in.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = in.nextInt();
    }

    public void mostrarDatos(){
        System.out.println("Bienvenido señor "+ nombre +", es un placer para nosotros contar con una persona de "+ edad + " años."
                            +"\nProximamente nos comunicaremos con usted al celular "+ celular +"."+
                            "\nFeliz día.");
    }
}

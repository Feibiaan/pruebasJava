package com.pruebas;

public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Fabian";

        String detalle = curso + " con el alumno " + profesor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;

        System.out.println(detalle + " " + (numeroA + numeroB));
    }
}

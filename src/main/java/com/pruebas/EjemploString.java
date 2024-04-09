package com.pruebas;

public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String cruso2 = new String("Programación Java");

        boolean esIgual = curso == cruso2;
        System.out.println("curso == curso2 = " + esIgual);

        esIgual = curso.equals(cruso2);
        System.out.println("curso.equals(cruso2) = " + esIgual);

        String curso3 = "Programación Java";
        esIgual = curso == curso3;
        System.out.println("curso == curso3 = " + esIgual);
    }
}

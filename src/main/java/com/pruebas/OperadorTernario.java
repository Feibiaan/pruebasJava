package com.pruebas;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        String estado = "";
        Double promedio = 0.0;

        Double matematicas = 0.0;
        Double ciencias = 0.0;
        Double historia = 0.0;

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese la nota de matemáticas entre 2.0 - 7.0");
        matematicas = s.nextDouble();

        System.out.println("Ingrese la nota de ciencias entre 2.0 - 7.0");
        ciencias = s.nextDouble();

        System.out.println("Ingrese la nota de historia entre 2.0 - 7.0");
        historia = s.nextDouble();

        promedio = (matematicas + ciencias + historia) / 3;

        estado = promedio >= 5.49 ? "Aprobado" : "Suspenso";
        System.out.println("estado = " + estado);
        System.out.println("promedio = " + promedio);

    }
}

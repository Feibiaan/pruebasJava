package com.pruebas;

public class ArgumentosLineaComandoCalculadora {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Por favor ingresar una operación (suma, resta, multi o div) y dos números!");
            System.exit(-1);
        }
        String operacion = args[0];
        int a = 0;
        int b = 0;
        double resultado = 0.00;
        try {
            a = Integer.parseInt(args[1]);
            b = Integer.parseInt(args[2]);
            resultado = 0.00;
        } catch (NumberFormatException e) {
            System.err.println("Cuidado a y b deben ser enteros");
            System.exit(-1);
        }
        switch (operacion) {
            case "suma":
                resultado = a + b;
                break;
            case "resta":
                resultado = a - b;
                break;
            case "multi":
                resultado = a * b;
                break;
            case "div":
                if(b == 0) {
                    System.exit(-1);
                    System.out.println("No se puede dividir por cero!");
                }
                resultado = (double)a/b;
                break;
            default:
                resultado = a + b;
        }

        System.out.println("Resultado de la operación '" + operacion + "' es: " + resultado);
    }
}

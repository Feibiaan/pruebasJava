package com.pruebas;

public class EjemploStringMetodos {
    public static void main(String[] args) {
        
        String nombre = "Fabian";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Fabian\") = " + nombre.equals("Fabian"));
        System.out.println("nombre.equals(\"fabian\") = " + nombre.equals("fabian"));
        System.out.println("nombre.equalsIgnoreCase(\"fabian\") = " + nombre.equalsIgnoreCase("fabian"));
        System.out.println("nombre.compareTo(\"Fabian\") = " + nombre.compareTo("Fabian"));
        
    }
}

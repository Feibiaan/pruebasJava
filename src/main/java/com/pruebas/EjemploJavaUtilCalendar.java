package com.pruebas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();

//        calendario.set(2024,3,9);
        calendario.set(Calendar.YEAR, 2024);
        calendario.set(Calendar.MONTH, 3);
        calendario.set(Calendar.DAY_OF_MONTH, 9);

//        calendario.set(Calendar.HOUR_OF_DAY, 16);
        calendario.set(Calendar.HOUR, 4);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.MINUTE, 25);
        calendario.set(Calendar.SECOND, 26);
        calendario.set(Calendar.MILLISECOND, 122);

        Date fecha = calendario.getTime();
        System.out.println("fecha sin formato = " + fecha);

//        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS a"); //formato 24h
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS a"); //formato 12h
        String fechaConFormato = formato.format(fecha);
        System.out.println("fechaConFormato = " + fechaConFormato);

//        System.out.println(calendario.YEAR);

    }
}

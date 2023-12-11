package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {
    public static void main(String[] args) {
        Telefono tel1 = new Telefono("claro", "099434534", 1);
            Telefono tel2 = new Telefono("MOVI", "05454534", 2);
            Telefono tel3 = new Telefono("movi", "099445343", 3);
             Telefono tel4 = new Telefono("movi", "099445343", 3);

             AdminTelefono adminTelefono = new AdminTelefono();

        // Invocar a contarClaro
        int cantidadClaro = adminTelefono.contarClaro(tel1, tel2, tel3, tel4);

        // Imprimir el resultado de contarClaro
        System.out.println("Cantidad de teléfonos con operadora 'claro': " + cantidadClaro);
    }

    }


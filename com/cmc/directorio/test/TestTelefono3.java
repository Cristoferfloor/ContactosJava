package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3{

    public static void main(String[] args) {
        
   
            Telefono tel1 = new Telefono("claro", "099434534", 1);
            Telefono tel2 = new Telefono("MOVI", "05454534", 2);
            Telefono tel3 = new Telefono("movi", "099445343", 3);

            AdminTelefono adminTelefono = new AdminTelefono();

            int cantidadMovi = adminTelefono.contarMovi(tel1, tel2, tel3);

            System.out.println("Cantidad de teléfonos con operadora 'movi': " + cantidadMovi);
    
        }
    
}

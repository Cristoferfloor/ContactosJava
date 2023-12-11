package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono2 {
    
    public static void main(String[] args) {
       
        AdminTelefono at = new AdminTelefono();
        Telefono telf = new Telefono("claro","0995884254",10);

        
        System.out.println("Información del Teléfono:");
        System.out.println("Operadora: " + telf.getOperadora());
        System.out.println("Número: " + telf.getNumero());
        System.out.println("Código: " + telf.getCodigo());
        System.out.println("Tiene WhatsApp: " + telf.isTieneWhatsapp());

        at.activarMensajeria(telf);

        System.out.println("\nInformación del Teléfono después de activar la mensajería:");
        System.out.println("Operadora: " + telf.getOperadora());
        System.out.println("Número: " + telf.getNumero());
        System.out.println("Código: " +telf.getCodigo());
        System.out.println("Tiene WhatsApp: " + telf.isTieneWhatsapp());
    }

    
}

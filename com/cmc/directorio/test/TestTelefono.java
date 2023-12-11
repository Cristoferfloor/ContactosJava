package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;

public class TestTelefono {

    public static void main(String[] args) {
        

        Telefono telf = new Telefono("claro","0995884254",10);



        // Imprimir en consola la información de este teléfono
        System.out.println("Información del Teléfono:");
        System.out.println("Operadora: " + telf.getOperadora());
        System.out.println("Número: " + telf.getNumero());
        System.out.println("Código: " + telf.getCodigo());
        System.out.println("Tiene WhatsApp: " + telf.isTieneWhatsapp());
    }
    
}

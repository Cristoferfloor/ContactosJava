package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContacto;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto2 {
    public static void main(String[] args) {
        
        Telefono telef = new Telefono("movi", "123456789",1);

        
        Contacto c = new Contacto("John", "Doe", true, telef, 75.5);

       
        System.out.println("Información del Contacto:");
        System.out.println("Nombre: " + c.getNombre());
        System.out.println("Apellido: " + c.getApellido());
        System.out.println("Activo: " + c.isActivo());
        System.out.println("Operadora: " + c.getTelefono().getOperadora());
        System.out.println("Número de Teléfono: " + c.getTelefono().getNumero());
        System.out.println("Peso: " + c.getPeso());

        
        AdminContacto adminContactos = new AdminContacto();

      
        Contacto otroContacto = new Contacto("Jane", "Smith", true, new Telefono( "claro", "987654321",1), 85.0);
        Contacto masPesado = adminContactos.buscarMasPesado(c, otroContacto);
        System.out.println("\nInformación del Contacto más pesado:");
        System.out.println("Nombre: " + masPesado.getNombre());
        System.out.println("Apellido: " + masPesado.getApellido());
        System.out.println("Activo: " + masPesado.isActivo());
        System.out.println("Operadora: " + masPesado.getTelefono().getOperadora());
        System.out.println("Número de Teléfono: " + masPesado.getTelefono().getNumero());
        System.out.println("Peso: " + masPesado.getPeso());

       
        boolean mismaOperadora = adminContactos.compararOperadoras(c, otroContacto);
        System.out.println("\n¿Ambos contactos tienen la misma operadora? " + mismaOperadora);
    }
}

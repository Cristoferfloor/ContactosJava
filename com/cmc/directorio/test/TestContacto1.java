package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContacto;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {
    
    public static void main(String[] args) {
         Telefono telef = new Telefono( "movi", "123456789",2);

        
        Contacto c = new Contacto("John", "Doe", telef, 75.5);

        
        System.out.println("Información del Contacto:");
        System.out.println("Nombre: " + c.getNombre());
        System.out.println("Apellido: " + c.getApellido());
        System.out.println("Activo: " + c.isActivo());
        System.out.println("Operadora: " + c.getTelefono().getOperadora());
        System.out.println("Número de Teléfono: " + c.getTelefono().getNumero());
        System.out.println("Peso: " + c.getPeso());

       
        Contacto contacto1 = new Contacto("Alice", "Smith", telef, 65.2);
        Contacto contacto2 = new Contacto("Bob", "Johnson", new Telefono( "claro", "987654321",5), 80.3);

        
        AdminContacto adminContactos = new AdminContacto();
        Contacto contactoMasPesado = adminContactos.buscarMasPesado(contacto1, contacto2);
        System.out.println("\nContacto con mayor peso:");
        System.out.println("Nombre: " + contactoMasPesado.getNombre());
        System.out.println("Apellido: " + contactoMasPesado.getApellido());
        System.out.println("Peso: " + contactoMasPesado.getPeso());

        
        boolean mismasOperadoras = adminContactos.compararOperadoras(contacto1, contacto2);
        System.out.println("\n¿Ambos contactos tienen la misma operadora?: " + mismasOperadoras);
    }
}

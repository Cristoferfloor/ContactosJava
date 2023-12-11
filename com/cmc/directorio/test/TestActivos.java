package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContacto;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

    public static void main(String[] args) {
        
        Telefono telefonoSinWhatsApp = new Telefono("movi", "123456789",3);
        Contacto contactoSinWhatsApp = new Contacto("Alice", "Johnson", false, telefonoSinWhatsApp, 60.0);

        // Imprimir los datos para verificar que el valor de tieneWhatsapp es false
        System.out.println("Información del Contacto sin WhatsApp antes de activar:");
        System.out.println("Nombre: " + contactoSinWhatsApp.getNombre());
        System.out.println("Apellido: " + contactoSinWhatsApp.getApellido());
        System.out.println("Activo: " + contactoSinWhatsApp.isActivo());
        System.out.println("Operadora: " + contactoSinWhatsApp.getTelefono().getOperadora());
        System.out.println("Número de Teléfono: " + contactoSinWhatsApp.getTelefono().getNumero());
        System.out.println("Peso: " + contactoSinWhatsApp.getPeso());

        // Crear una instancia de AdminContactos
        AdminContacto adminContactos = new AdminContacto();

        // Invocar el método activarUsuario y pasarle el contacto creado
        adminContactos.activarUsuario(contactoSinWhatsApp);

        // Imprimir los datos y verificar que el comportamiento sea el adecuado
        System.out.println("\nInformación del Contacto después de activar (si tiene WhatsApp):");
        System.out.println("Nombre: " + contactoSinWhatsApp.getNombre());
        System.out.println("Apellido: " + contactoSinWhatsApp.getApellido());
        System.out.println("Activo: " + contactoSinWhatsApp.isActivo());
        System.out.println("Operadora: " + contactoSinWhatsApp.getTelefono().getOperadora());
        System.out.println("Número de Teléfono: " + contactoSinWhatsApp.getTelefono().getNumero());
        System.out.println("Peso: " + contactoSinWhatsApp.getPeso());
    }
    
}

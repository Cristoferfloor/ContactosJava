package com.cmc.directorio.entidades;

public class AdminContacto {
    

    public Contacto buscarMasPesado(Contacto contacto1, Contacto contacto2) {
        return (contacto1.getPeso() > contacto2.getPeso()) ? contacto1 : contacto2;
    }

   
    public boolean compararOperadoras(Contacto contacto1, Contacto contacto2) {
        return contacto1.getTelefono().getOperadora().equalsIgnoreCase(contacto2.getTelefono().getOperadora());
    }

   
    public void activarUsuario(Contacto contacto) {
        if (contacto.getTelefono().isTieneWhatsapp()) {
            contacto.setActivo(true);
        }
    }
}

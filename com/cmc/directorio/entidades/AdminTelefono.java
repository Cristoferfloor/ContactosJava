package com.cmc.directorio.entidades;

public class AdminTelefono {


    public void activarMensajeria(Telefono telefono){

        if (telefono.getOperadora().equalsIgnoreCase("claro")) {

            telefono.setTieneWhatsapp(true);
            System.out.println("Mensajeria activada en el telefono con operadora claro ");

            
        }else{
            System.out.println("No se puede activar la mensajeria en un telefono con operaodra diferente a claro");


        }
    }


    public int contarMovi(Telefono tel1, Telefono tel2, Telefono tel3) {
        int contadorMovi = 0;

        if (tel1.getOperadora().equalsIgnoreCase("movi")) {
            contadorMovi++;
        }

        if (tel2.getOperadora().equalsIgnoreCase("movi")) {
            contadorMovi++;
        }

        if (tel3.getOperadora().equalsIgnoreCase("movi")) {
            contadorMovi++;
        }

        return contadorMovi;
    }

    public int contarClaro(Telefono tel1, Telefono tel2, Telefono tel3, Telefono tel4) {
        int contadorClaro = 0;

        if (tel1.getOperadora().equalsIgnoreCase("claro")) {
            contadorClaro++;
        }

        if (tel2.getOperadora().equalsIgnoreCase("claro")) {
            contadorClaro++;
        }

        if (tel3.getOperadora().equalsIgnoreCase("claro")) {
            contadorClaro++;
        }

        if (tel4.getOperadora().equalsIgnoreCase("claro")) {
            contadorClaro++;
        }

        return contadorClaro;
    }

    
    

}

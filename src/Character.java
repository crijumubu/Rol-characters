public abstract class Character{
    
    private String nombre, imagen;
    private int altura, peso, inteligencia, habilidades; // cm / kg / 0-201 (iq) / n-habilidades

    public String ClasificacionAltura(){
        if (altura >= 180){
            return "Gigante";
        }
        else if(altura >= 160){
            return "Promedio";
        }
        else{
            return "Enano";
        }
    }

    public String ClasificacionPeso(){
        if (peso > 100){
            return "Grasudo";
        }
        else if(peso > 60){
            return "Promedio";
        }
        else{
            return "Desnutrido";
        }
    }

    public String ClasificacionInteligencia(){
        if (inteligencia > 115){
            return "Sabio";
        }
        else if(altura > 85){
            return "Promedio";
        }
        else{
            return "Bruto";
        }
    }

    public String DescripcionGeneral(){
        return "Nombre: " + nombre + "\nImagen: " + imagen + "\nAltura: " + altura + "\nPeso: " + peso + "\nInteligencia: " + inteligencia + "\nHabilidades: " + habilidades;
    }
}

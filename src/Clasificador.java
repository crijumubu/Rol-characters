public class Clasificador {
    
    private static String toReturn;

    public static String ClasificacionAltura(String nombre, int altura){
        toReturn = nombre;
        if (altura >= 180){
            toReturn += " gigante";
        }
        else if(altura >= 160){
            toReturn += " prominente";
        }
        else{
            toReturn += " enano";
        }
        return toReturn;
    }

    public static String ClasificacionPeso(String nombre, int peso){
        toReturn = nombre;
        if (peso > 100){
            toReturn += " grasudo";
        }
        else if(peso > 60){
            toReturn += " delgado";
        }
        else{
            toReturn += " desnutrido";
        }
        return toReturn;
    }

    public static String ClasificacionInteligencia(String nombre, int inteligencia){
        toReturn = nombre;
        if (inteligencia > 115){
            toReturn += " sabio";
        }
        else if(inteligencia > 85){
            toReturn += " listo";
        }
        else{
            toReturn += " bruto";
        }
        return toReturn;
    }
}

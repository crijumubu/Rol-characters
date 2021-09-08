import java.util.ArrayList;
import java.util.Scanner;

public class App {

    static String nombre, imagen, apodo, archiEnemigo, tipoEspada, malformacion;
    static int altura, peso, inteligencia, habilidades, opcion;
    static Scanner input = new Scanner (System.in);
    public static void main(String[] args) throws Exception {

        ArrayList<Character> personajes = new ArrayList<Character>();
        boolean continuar = true;
        String opciones = "1. Crear un personaje de tipo Heroe\n2. Crear Crear un personaje de tipo Villano\n3. Crear un personaje de tipo Principe\n4. Crear un personaje de tipo Monstruo\n5. Ver inventario de personajes\n6. Salir";
        
        System.out.println("¡Bienvenido a rol characters! ");
        System.out.println("A continuación, te presentaremos nuestras opciones: ");
        System.out.println(opciones);

        while (continuar){

            System.out.println("Ingresa tu opción a continuación: ");
            Scanner input = new Scanner (System.in);
            opcion = input.nextInt();

            switch (opcion){
                case 1:
                    inputsGenerales();
                    System.out.println("Ingresa el apodo: ");
                    apodo = input.nextLine();
                    personajes.add(new Heroe(nombre, imagen, apodo, altura, peso, inteligencia, habilidades));
                    System.out.println("¡Tu personaje se ha creado exitosamente!");
                    break;
                case 2:
                    inputsGenerales();
                    System.out.println("Ingresa el nombre del archiEnemigo: ");
                    archiEnemigo = input.nextLine();
                    personajes.add(new Villano(nombre, imagen, archiEnemigo, altura, peso, inteligencia, habilidades));
                    System.out.println("¡Tu personaje se ha creado exitosamente!");
                    break;
                case 3:
                    inputsGenerales();
                    System.out.println("Ingresa el tipo de espada (material): ");
                    tipoEspada = input.nextLine();
                    personajes.add(new Principe(nombre, imagen, tipoEspada, altura, peso, inteligencia, habilidades));
                    System.out.println("¡Tu personaje se ha creado exitosamente!");
                    break;
                case 4:
                    inputsGenerales();
                    System.out.println("Ingresa el tipo de malformación: ");
                    malformacion = input.nextLine();
                    personajes.add(new Monstruo(nombre, imagen, malformacion, altura, peso, inteligencia, habilidades));
                    System.out.println("¡Tu personaje se ha creado exitosamente!");
                    break;
                case 5:
                    System.out.println("Este es tu inventario de personajes:");
                    for (int i=0; i<personajes.size(); i++){
                        System.out.println(i + ')');
                        personajes.get(i).DescripcionGeneral();
                        System.out.println("\n");
                    }
                    break;
                case 6:
                    continuar = false;
                    break;
                default:
                    System.out.println(opciones);
                    break;
            }
        }
    }

    public static void inputsGenerales(){
        System.out.println("Ingresa el nombre: ");
        nombre = input.nextLine();
        System.out.println("Ingresa la imagen (texto): ");
        imagen = input.nextLine();
        System.out.println("Ingresa la altura (cm): ");
        altura = input.nextInt();
        System.out.println("Ingresa el peso (kg): ");
        peso = input.nextInt();
        System.out.println("Ingresa el coeficiente de inteligencia (0-201):  " );
        inteligencia = input.nextInt();
        System.out.println("Ingresa la cantidad de habilidades: ");
        habilidades = input.nextInt();
    }
}

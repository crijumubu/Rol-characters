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
        
        System.out.println("¡Bienvenido a rol characters!\n");
        System.out.println("A continuación, te presentaremos nuestras opciones: ");
        System.out.println(opciones);

        while (continuar){

            System.out.print("\nIngresa tu opción a continuación: ");
            opcion = input.nextInt();
            input.nextLine();

            switch (opcion){
                case 1:
                    inputsGenerales();
                    System.out.print("\nIngresa el apodo: ");                  
                    apodo = input.nextLine();
                    personajes.add(new Heroe(nombre, imagen, apodo, altura, peso, inteligencia, habilidades));
                    System.out.println("\n¡Tu personaje se ha creado exitosamente!");
                    break;
                case 2:
                    inputsGenerales();
                    System.out.print("\nIngresa el nombre del archiEnemigo: ");
                    archiEnemigo = input.nextLine();
                    personajes.add(new Villano(nombre, imagen, archiEnemigo, altura, peso, inteligencia, habilidades));
                    System.out.println("\n¡Tu personaje se ha creado exitosamente!");
                    break;
                case 3:
                    inputsGenerales();
                    System.out.print("\nIngresa el tipo de espada (material): ");
                    tipoEspada = input.nextLine();
                    personajes.add(new Principe(nombre, imagen, tipoEspada, altura, peso, inteligencia, habilidades));
                    System.out.println("\n¡Tu personaje se ha creado exitosamente!");
                    break;
                case 4:
                    inputsGenerales();
                    System.out.print("\nIngresa el tipo de malformación: ");
                    malformacion = input.nextLine();
                    personajes.add(new Monstruo(nombre, imagen, malformacion, altura, peso, inteligencia, habilidades));
                    System.out.println("\n¡Tu personaje se ha creado exitosamente!");
                    break;
                case 5:
                    System.out.println("\nEste es tu inventario de personajes:\n");
                    for (int i=0; i<personajes.size(); i++){
                        System.out.println(i + "). " + "Nombre: "+ personajes.get(i).Getnombre() + ", tipo: " + personajes.get(i).GetTipo());
                    }
                    System.out.print("\nIngresa el indice del personaje que deseas seleccionar: ");
                    int i = input.nextInt();
                    input.nextLine();

                    try{
                        personajes.get(i).DescripcionGeneral();
                        System.out.println("\nHaz seleccionado al personaje con índice " + i + ": ");
                    }
                    catch(Exception e){
                        System.out.println("\n¡No hemos podido acceder al personaje que seleccionaste, seguramente aún no haz creado el personaje al cual deseas revisar!");                        
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
        System.out.print("\nIngresa el nombre: ");
        nombre = input.nextLine();
        System.out.print("\nIngresa la imagen (texto): ");
        imagen = input.nextLine();
        System.out.print("\nIngresa la altura (cm): ");
        altura = input.nextInt();
        System.out.print("\nIngresa el peso (kg): ");
        peso = input.nextInt();
        System.out.print("\nIngresa el coeficiente de inteligencia (0-201):  " );
        inteligencia = input.nextInt();
        System.out.print("\nIngresa la cantidad de habilidades: ");
        habilidades = input.nextInt();
        input.nextLine();
    }
}

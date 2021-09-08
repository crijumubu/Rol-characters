public class Heroe implements Character{

    private String nombre, imagen, apodo;
    private int altura, peso, inteligencia, habilidades, daño = 100; // cm / kg / 0-201 (iq) / n-habilidades

    public Heroe(String nombre, String imagen, String apodo ,int altura, int peso, int inteligencia, int habilidades){
        this.nombre = nombre;
        this.imagen = imagen;
        this.apodo = apodo;
        this.altura = altura;
        this.peso = peso;
        this.inteligencia = inteligencia;
        this.habilidades = habilidades;
    }

    @Override
    public String ClasificacionAltura() {
        return Clasificador.ClasificacionAltura(nombre, altura);
    }

    @Override
    public String ClasificacionPeso() {
        return Clasificador.ClasificacionPeso(nombre, peso);
    }

    @Override
    public String ClasificacionInteligencia() {
        return Clasificador.ClasificacionInteligencia(nombre, inteligencia);
    }

    @Override
    public void DescripcionGeneral() {
        System.out.println("Información general:");
        System.out.println("    " + "Nombre: " + nombre + ", Imagen: " + imagen + ", Apodo: " + apodo + ", Altura: " + altura + ", Peso: " + peso + ", Inteligencia: " + inteligencia + ", Habilidades: " + habilidades + ", Daño por habilidad: " + daño);
        System.out.println("    " + "Clasificación por altura: " + ClasificacionAltura());
        System.out.println("    " + "Clasificación por peso: " + ClasificacionPeso());
        System.out.println("    " + "Clasificación por inteligencia: " + ClasificacionInteligencia());
    }

}

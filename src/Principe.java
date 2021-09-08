public class Principe implements Character {

    private String nombre, imagen, tipoEspada, tipo = "Principe";
    private int altura, peso, inteligencia, habilidades, daño = 50; // cm / kg / 0-201 (iq) / n-habilidades

    public Principe(String nombre, String imagen, String tipoEspada ,int altura, int peso, int inteligencia, int habilidades){
        this.nombre = nombre;
        this.imagen = imagen;
        this.tipoEspada = tipoEspada;
        this.altura = altura;
        this.peso = peso;
        this.inteligencia = inteligencia;
        this.habilidades = habilidades;
    }

    public String Getnombre(){
        return nombre;
    }

    public String GetTipo(){
        return tipo;
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
        System.out.println("    " + "Nombre: " + nombre + ", Imagen: " + imagen + ", Tipo de espada: " + tipoEspada + ", Altura: " + altura + ", Peso: " + peso + ", Inteligencia: " + inteligencia + ", Habilidades: " + habilidades + ", Daño por habilidad: " + daño);
        System.out.println("    " + "Clasificación por altura: " + ClasificacionAltura());
        System.out.println("    " + "Clasificación por peso: " + ClasificacionPeso());
        System.out.println("    " + "Clasificación por inteligencia: " + ClasificacionInteligencia());
    }

}

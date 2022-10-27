
public class Perro extends Animal {
    /* la palabra reservada extends es para heredar */
    private int peso;

    public Perro(String nombre, String raza, String tipo_alimento, int edad, int peso) {
        /*
         * para poder obetener los atributios heredados debemos hacer uso de la palabra
         * reservada super
         */
        super(nombre, raza, tipo_alimento, edad);
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    // set
    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void mostrarPerro() {
        System.out.println("El nombre del perro es: " + getNombre() + "\n" + "Su raza es:" + getRaza() + "\n"
                + "Se alimenta de: " + getTipo_alimento() + "\n" + "Su edad es: " + getEdad() + " anos" + "\n" + "Pesa: "
                + peso + " kilos" + "\n");
    }

}

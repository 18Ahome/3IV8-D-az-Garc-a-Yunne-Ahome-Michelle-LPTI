public class Huron extends Animal {
    /* la palabra reservada extends es para heredar */
    private int peso;

    public Huron(String nombre, String raza, String tipo_alimento, int edad,int peso) {
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
    public void setPeso(int  peso) {
        this.peso = peso;
    }

    public void mostrarHuron() {
        System.out.println("El nombre del Huron es: " + getNombre() + "\n" + "Su raza es:" + getRaza() + "\n"
                + "Se alimenta de: " + getTipo_alimento() + "\n" + "Su edad es: " + getEdad() + "años" + "\n" + " Pesa: "
                + peso + "kilos" + "\n");
    }

}

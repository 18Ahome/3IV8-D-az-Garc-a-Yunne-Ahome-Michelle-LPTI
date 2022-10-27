public class Conejo extends Animal {
    /* la palabra reservada extends es para heredar */
    private int medida ;

    public Conejo(String nombre, String raza, String tipo_alimento, int edad, int medida) {
        /*
         * para poder obetener los atributios heredados debemos hacer uso de la palabra
         * reservada super
         */
        super(nombre, raza, tipo_alimento, edad);
        this.medida = medida;
    }

    public int getMedida() {
        return medida;
    }

    // set
    public void setMedida(int medida) {
        this.medida = medida;
    }

    public void mostrarConejo() {
        System.out.println("El nombre del Conejo es: " + getNombre() + "\n" + "Su raza es:" + getRaza() + "\n"
                + "Se alimenta de: " + getTipo_alimento() + "\n" + "Su edad es: " + getEdad() +"años" + "\n" + " Mide: "
                + medida + "cm" + "\n");
    }

}

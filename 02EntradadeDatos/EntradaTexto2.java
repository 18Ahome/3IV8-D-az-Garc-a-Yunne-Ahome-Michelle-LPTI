//esto es un comentario
/**
 * Todo programa en java debe tener el nombre de la clase tal cual como el
 * archivo
 */

class Entradadetexto {
    // los limites de la clase

    // toda clase debe de tener un metodo principal

    /**
     * Vamo a realizar un programa mediante el cual podemos introducir texto a
     * nuestra conveniencia
     */

    // tipo de dato

    // el ; es el fin de linea

    // metodo principal

    public static void main(String[] args) {
        String nombre;
        int edad;
        // instancia
        System.out.println("Por favor introduce tu nombre asi bien kawaii: ");

        // vamos a obtener el nombre del usuario

        nombre = System.console().readLine();

        System.out.println("Por favor introduce tu edad asi bien kawaii: ");

        edad = Integer.parseInt(System.console().readLine());

        System.out.println("Hola " + nombre + " bienvenido a tu programita, tienes " + edad + " primaveras");
    }
}
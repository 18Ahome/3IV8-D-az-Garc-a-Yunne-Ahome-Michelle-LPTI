import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        // mascotas
        /*Gato cat = new Gato("Michit", "de calle", "atun", 1, 7);
        Perro dog = new Perro("Pulgas", "de calle", "croquetas", 1, "guau");
        cat.mostrarGato();
        dog.mostrarPerro();*/
        String nom, raza, alim;
        int edad, dt;
        Scanner tec = new Scanner (System.in);
        int ele = 0;
        //int j=1;

        do{
        System.out.println("Bienvenido, este programa esta hecho por Diaz Garcia Yunne Ahome Michelle");
        System.out.println("Seleccione un numero");
        System.out.println("1.- Perro");
        System.out.println("2.- Gato");
        System.out.println("3.- Conejo");
        System.out.println("4.- Hamster");
        System.out.println("5.- Huron");
        System.out.println("6.- Salir");
        ele = tec.nextInt();

        switch(ele){
            case 1:
            Scanner tec1 = new Scanner (System.in);
                System.out.println("Ingrese el nombre del perro");
                nom = tec1.nextLine();
                System.out.println("Ingrese la raza del perro");
                raza = tec1.nextLine();
                System.out.println("Ingrese el tipo de alimento del perro");
                alim = tec1.nextLine();
                System.out.println("Ingrese la edad del perro");
                edad = tec1.nextInt();
                System.out.println("Ingrese el peso del perro");
                dt = tec1.nextInt();

                Perro dog = new Perro( nom, raza, alim, edad, dt );
                dog.mostrarPerro();

                break;
            case 2:
            Scanner tec2 = new Scanner (System.in);
                System.out.println("Ingrese el nombre del gato");
                nom = tec2.nextLine();
                System.out.println("Ingrese la raza del gato");
                raza = tec2.nextLine();
                System.out.println("Ingrese el tipo de alimento del gato");
                alim = tec2.nextLine();
                System.out.println("Ingrese la edad del gato");
                edad = tec2.nextInt();
                System.out.println("Ingrese el numero de vidas del gato");
                dt = tec2.nextInt();

                Gato cat = new Gato (nom, raza, alim, edad, dt);
                cat.mostrarGato();
                
                break;
            case 3:
            Scanner tec4 = new Scanner (System.in);
                System.out.println("Ingrese el nombre del conejo");
                nom = tec4.nextLine();
                System.out.println("Ingrese la raza del conejo");
                raza = tec4.nextLine();
                System.out.println("Ingrese el tipo de alimento del conejo");
                alim = tec4.nextLine();
                System.out.println("Ingrese la edad del conejo");
                edad = tec4.nextInt();
                System.out.println("Ingrese la medida del conejo");
                dt = tec4.nextInt();

                Conejo rabbit = new Conejo(nom, raza, alim, edad, dt);
                rabbit.mostrarConejo();

                break;
            case 4:
            Scanner tec5 = new Scanner (System.in);
                System.out.println("Ingrese el nombre del Hamster");
                nom = tec5.nextLine();
                System.out.println("Ingrese la raza del Hamster");
                raza = tec5.nextLine();
                System.out.println("Ingrese el tipo de alimento del Hamster");
                alim = tec5.nextLine();
                System.out.println("Ingrese la edad del Hamster");
                edad = tec5.nextInt();
                System.out.println("Ingrese la medida del Hamster");
                dt = tec5.nextInt();

                Hamster ham = new Hamster(nom, raza, alim, edad, dt);
                ham.mostrarHamster();

                break;
            case 5:
            Scanner tec6 = new Scanner (System.in);
                System.out.println("Ingrese el nombre del Huron");
                nom = tec6.nextLine();
                System.out.println("Ingrese la raza del Huron");
                raza = tec6.nextLine();
                System.out.println("Ingrese el tipo de alimento del Huron");
                alim = tec6.nextLine();
                System.out.println("Ingrese la edad del Huron");
                edad = tec6.nextInt();
                System.out.println("Ingrese el peso del Huron");
                dt = tec6.nextInt();

                Huron hur = new Huron(nom, raza, alim, edad, dt);
                hur.mostrarHuron();

                break;
            case 6:
                 System.exit(0);
                break;
            default:
                System.out.println("Lo siento no hay otra opcion, elija una de las anteriores mostradas");
                break;

        }

    }while(ele != 6);











    }

}

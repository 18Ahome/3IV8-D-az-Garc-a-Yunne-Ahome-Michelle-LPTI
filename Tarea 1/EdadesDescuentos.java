import java.util.Scanner;

class EdadesDescuentos {
public static void main (String[] args){

    Scanner scanner;
    scanner = new Scanner(System.in);
    double preciofinal = 0;

System.out.println("Creado por Diaz Garcia Yunne Ahome Michelle 3IV8");
    System.out.println ("Introduzca su edad: ");
    int edad = scanner.nextInt();

    System.out.println ("Introduzca el monto de su abono: ");
    double abono = scanner.nextDouble();

    if (edad >= 65) {
        preciofinal = (abono * 0.40) + abono;
        System.out.println("Su abono total con el aumento es de: " + preciofinal  + " pesos");
    }
    else if(edad <21){
        System.out.println ("¿Sus padres son socios?");
        Scanner scanner2;
        scanner2 = new Scanner(System.in);
        String socios;
        socios = scanner2.nextLine();

switch (socios){

case "Si":
preciofinal = (abono * 0.45 ) + abono;
System.out.println("Su abono total con el aumento es de: " + preciofinal + " pesos");
break;

case "No":
preciofinal = (abono * 0.25) + abono;
System.out.println("Su abono total con el aumento es de: " + preciofinal + " pesos");
break;

default :
System.out.println("Error, vuelva a intentarlo");
break;
             
}

    }
else if(edad >= 21 && edad <65){
System.out.println("No hay ningún aumento disponible, su abono total es de: " + abono + " pesos");
}  

    }
} 
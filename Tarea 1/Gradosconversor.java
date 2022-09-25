import java.util.Scanner;

class Gradosconversor {
public static void main(String[] args){

Scanner scanner;
scanner = new Scanner(System.in);
double fa = 0;
double ke = 0;
double ce = 0;
double ra = 0;
char conversion;

System.out.println("Creado por Diaz Garcia Yunne Ahome Michelle  3IV8");
System.out.println("Introduzca la cantidad de grados Fahrenheit:");
fa = scanner.nextDouble();
System.out.println("Elegir un numero del 1 al 3:");
System.out.println("1.- Grados Fahrenheit a Kelvine");
System.out.println("2.- Grados Fahrenheit a Celsius");
System.out.println("3.- Grados Fahrenheit a Rankine");
Scanner scanner2;
scanner2 = new Scanner(System.in);
conversion = scanner2.next().charAt(0);

switch(conversion){
case '1':
       ke = (fa - 32) * 0.5555 + 273.15 ;
   System.out.println("Los grados en Kelvin son: " + ke + "°");
break;

case '2':
ce = (fa -32) * 0.5555 ;
System.out.println("Los grados en Celsius son: " + ce + "°");
break;

case '3':
ra = fa + 459.67;
System.out.println("Los grados en Rankine son: " + ra + "°");
break;
   }
 }
}  
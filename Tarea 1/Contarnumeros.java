import java.util.Scanner;

class Contarnumeros {
  public static void main(String [] args){
    
    Scanner lector = new Scanner(System.in);
    
    int n, numero_natural, ps=0, ng=0, nulo=0;
    
    System.out.println("Creado por Diaz Garcia Yunne Ahome Michelle 3IV8");
    System.out.println("Introduzca la cantidad de datos que desea analizar:"); 
    n = lector.nextInt();

        if (n > 0){
          
          for (int i=1; i<=n;i++){
            System.out.println("Ingrese un numero: ");
            numero_natural = lector.nextInt();

            if(numero_natural>0){
              ps++; 
            } else if (numero_natural < 0){
              ng++;
            } else{
              nulo++;
            }
          }

          System.out.println("La cantidad de numeros positivos es: " + ps);
          System.out.println("La cantidad de numeros negativos es: " + ng);
          System.out.println("La cantidad de ceros es: " + nulo);
            
        } else {
          System.out.println("El numero ingresado no es correcto. Intentelo nuevamente");
        }
             
  }
}
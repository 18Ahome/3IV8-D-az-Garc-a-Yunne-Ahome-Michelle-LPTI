Algoritmo compararnumeros
	Escribir "Ejemplo para comparar si un nuemro es mayor a 10"
	num1<-10
	num2<- 0
	Escribir "Ingresa un numero:"
	Leer num1
	Escribir "Ingresa otro numero:"
	Leer num2
	
	Si num1 == num2 Entonces
		Escribir "Los dos numeros son iguales"
	SiNo
		Si num1 es mayor que num2 Entonces
			Escribir "El primero es mayor y es de" , num1
		SiNo
			Escribir "El segundo es mayor y es de" , num2
		Fin Si
	Fin Si
	
FinAlgoritmo

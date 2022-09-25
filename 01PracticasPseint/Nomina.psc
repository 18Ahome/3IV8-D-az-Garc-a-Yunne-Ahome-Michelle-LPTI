//Subproceso
Funcion Salario <- Calcularsalario (h, d, salario)
	Salario<-h*d*salario
	
Fin Funcion

Funcion Salariohextras <- Calcularsalariohextras ( salario )
	salario<-h*d
Fin funcion

Algoritmo Nomina
	Repetir
			Escribir "Desarrolla un algoritmo que calcule la nomina de un trabjador"
			h<-0
			d<-0
			salario<-0
			hextras<-0
			sabado<-0
			domingo<-0
		
			Escribir "Ingrese el numero de horas"
			Leer h
			Escribir "Ingrese el numero de días trabajados"
			Leer d
			Escribir "Ingrese el salario por hora"
			Leer salario
			Escribir "Ingrese el numero de horas extras"
			Leer hextras
			Escribir "Ingrese el numero de horas extras que trabajo el dia Sabado"
			Leer sabado
			Escribir "Ingrese el numero de horas extras que trabajo el dia Domingo"
			Leer domingo
		
			Si d <= 15 y h <= 23 Entonces
				Escribir "El salario  comun que recibirá a la quincena sera: " , Calcularsalario(h, d, salario)
			SiNo
				Escribir "El salario se reincia cada quince días, espera a la segunda quincena"
			Fin si
		
			Si hextras > 0 Entonces
				salextra<-0
				salextra= Calcularsalario (h, d, salario) + (hextras*2)
				Escribir "El salario total con las horas extras que recibirá en la quincena sera: " , salextra
			SiNo 
				Escribir "Su salario es de: ", Calcularsalario(h, d, salario)
				Escribir "No recibirá pago de las horas extra"
			Fin si	
		
			Si horassabado > 0 y horasextras==0 Entonces
				salextrasab<-0
				salextrasab= Calcularsalario(h, d, salario) + (sabado*2)
				Escribir "El salario total con las horas extras del dia sabado que recibirá en la quincena sera: " , salextrasab
			SiNo
				
				Si horassabado > 0 y horasextras > 0 Entonces
					salextrasab<-0
					salextrasab= Calcularsalario(h, d, salario ) + (sabado*2) + (hextras*2) 
					Escribir "El salario total con las horas extras del dia sabado y las horas extras que recibirá en la quincena sera: ",salextrasab
				Fin si
			Si sabado ==0 y hextras > 0 Entonces
				salextrasab<-0
				salextrasab = Calcularsalario(h , d , salario ) + (hextras*2) 
				Escribir "El salario total sin las horas extras del dia sabado y las horas extras que recibirá en la quincena sera: " ,salarioextrasab
			Fin Si
			Si hsextras ==0 y sabado ==0 Entonces
				Escribir "Su salario es de: ", Calcularsalario(h, d, salario)
				Escribir "No recibirá pago por las horas extras del dia sabado"
			FinSi
			Fin si
		
			Si horasdomingo > 0 Entonces
				salextradom<-0
				salextradom= Calcularsalario(h, d, salario)+ (domingo*3)
				Escribir "El salario total con las horas extras del dia domningo que recibirá en la quincena sera: " , salextradom
			SiNo
				Escribir "Su salario es de: " , Calcularsalario(h, d, salario)
				Escribir "No recibirá un pago extra por las horas del dia Domingo"
			Fin Si
		Escribir "Para finalizar escriba f"
		Leer t
	Hasta que t=F o t=f
FinAlgoritmo

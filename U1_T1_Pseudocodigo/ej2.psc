Algoritmo EJERCICIO_2
	
	n1 es entero
	digito es entero
	resto es entero
	
	Escribir "Ingrese un numero"
	Leer n1

	resto<-0
	Mientras n1>0 Hacer
		digito<-n1 MOD 10
		n1<- n1-digito
		n1<- n1/10
		resto<- resto*10+digito
	FinMientras
	
	Escribir "El numero invertido es " resto
	
FinAlgoritmo

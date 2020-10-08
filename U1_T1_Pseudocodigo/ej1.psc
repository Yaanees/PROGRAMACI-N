Algoritmo EJERCICIO1
	
	unidad es entero
	i es entero
	
	Escribir "Introduzca el numero de unidades"
	Leer unidad
	
	Si unidad<=100 Entonces
		Escribir "El precio total sera de: " unidad*5.23 " euros"
	SiNo
		Si unidad>100 Y unidad<=1000 Entonces
			i<-unidad-100
			Escribir "El precio en total es " (i*4.16)+(100*5.23) " euros"
		SiNo
			Escribir "El precio en total es " (((i*4.16)+(100*5.23))/2) " euros"
		Fin Si
	Fin Si
	
	
FinAlgoritmo

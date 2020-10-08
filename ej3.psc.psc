Algoritmo EJERCICIO_3
	
	tam,fila es Entero
	
	Repetir 
		Escribir "Introduce el tamaño. Mayor o igual que 5 e impar"
		Leer tam
	Hasta Que tam>=5 Y tam MOD 2=1
	
	Para fila<-1 Hasta tam Hacer
		SI (fila=1) O fila=tam O (fila=trunc(tam/2)+1)  ENTONCES 
			Escribir "MMMMMM"
		SINO 
			Escribir "M    M"
		FinSi	
	FinPara
	
FinAlgoritmo

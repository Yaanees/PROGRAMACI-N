import java.util.Scanner;

public class ej3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numero1,numero2,numero3,loteria,i,cont;

        System.out.println("Introduzca su primer numero favorito");
        numero1=sc.nextInt();

        System.out.println("Introduzca su segundo numero favorito");
        numero2=sc.nextInt();

        System.out.println("Introduzca su tercer numero favorito");
        numero3=sc.nextInt();

        System.out.println("Introduzca el numero de loteria");
        loteria=sc.nextInt();

        cont=0;

        for (i=1; i<6; i++) {
            if (loteria % 10 == numero1) {
                cont = cont + 1;
                numero1=numero2;

            }
            if (loteria % 10 == numero2) {
                cont = cont + 1;
                numero2=numero3;
            }
            if (loteria % 10 == numero3) {
                cont = cont + 1;

            }
            loteria = loteria / 10;
        }

        if (cont>=3) {
            System.out.println("Su numero tiene suerte");
        }
        else {
            System.out.println("Su numero no tiene suerte");
        }
    }

}


import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora,minuto,segundo,aumento,trunc,diferencia,diferencia2,i;

        System.out.println("Introduzca la hora");
        hora = sc.nextInt();

        System.out.println("Introduzca los minutos");
        minuto = sc.nextInt();

        System.out.println("Introduzca los segundos");
        segundo = sc.nextInt();

        System.out.println("¿Cuantos segundos desea aumentar?");
        aumento = sc.nextInt();

        trunc = (int) Math.floor((aumento + segundo) / 60);

        for (i = 1; i < aumento+1; i++) {
            segundo = segundo + 1;
            if (segundo == 60) {
                segundo = 0;
                minuto = minuto + 1;

            }
            if (minuto == 60) {
                hora = hora + 1;
                minuto = 0;

            }
            if (hora == 24) {
                hora = 00;
            }
            System.out.println(hora + ":" + minuto + ":" + segundo);
        }
    }
}

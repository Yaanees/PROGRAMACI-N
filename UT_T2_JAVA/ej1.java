import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altu;
        System.out.println("Introduzca la altura del calcetin");
        altu= sc.nextInt();

        for (int i = 0; i < altu-2; i++) {
            System.out.println("***  ***");
        }
        for (int j= 0; j<2; j++) {
            System.out.println("****** ******");
        }
    }
}


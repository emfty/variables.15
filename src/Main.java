import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("hola");
        System.out.print("hola amigo  ingrese su numero ");
        int n = leer.nextInt();
        if (n % 2 ==0 ) {
            System.out.printf("si el numero %d es PAR\n" , n);
        } else {
            System.out.printf("si el numero %d es IMPAR\n" , n);


        }
    }


}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, numeroMayor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        a=sc.nextInt();
        System.out.println("Ingrese el segundo número: ");
        b=sc.nextInt();

        numeroMayor = a > b ? a : b;

        System.out.println("El número mayor es "+numeroMayor);
    }
}

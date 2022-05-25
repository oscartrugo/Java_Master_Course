import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double estanque;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la capacidad actual del estanque en Litros: ");
        estanque = sc.nextDouble();

        if(estanque > 70) System.out.println("Estanque lleno");
        if(estanque >= 60 & estanque < 70) System.out.println("Estanque casi lleno");
        if(estanque >= 40 & estanque < 60) System.out.println("Estanque 3/4");
        if(estanque >= 35 & estanque < 40) System.out.println("Medio tanque.");
        if(estanque >= 20 & estanque < 35) System.out.println("Suficiente.");
        if(estanque >= 1 & estanque < 20) System.out.println("Insuficiente");

    }
}


/*
* Suponiendo un estanque de gasolina (gas) con capacidad 70 litros, se requiere un programa que pida la medida actual en litros y mostrar el resultado de la forma: Insuficiente, Suficiente, Medio...

La medida o capacidad actual del estanque puede ser en tipo double, para una mejor precisión, pero tambien puede ser del tipo int.

Si la capacidad actual es 70 litros: imprimir Estanque lleno
Si está entre 60 y menor a 70: imprimir Estanque casi lleno
Si está entre 40 y menor a 60: imprimir Estanque  3/4
Si está entre 35 y menor a 40: imprimir Medio Estanque
Si está entre 20 y menor a 35: imprimir Suficiente
Si está entre 1 y menor a 20: imprimir Insuficiente
* */
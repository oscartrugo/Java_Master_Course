public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {

        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("¿Son el mismo objeto? " + (num1 == num2) );

        num2 = 1000;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("¿Son el mismo objeto? " + (num1 == num2) ); //No son el mismo objeto, no por el valor, porque
        //no son la misma instancia

        //Formas de comparar el mismo valor de distintos objetos
        System.out.println("¿Tienen el mismo valor? " + (num1.equals(num2)));
        System.out.println("¿Tienen el mismo valor? " + (num1.intValue() == num2.intValue()) );

        num2 = 200;
        boolean condicion = num1 > num2;
        System.out.println("Condición = " + condicion);

        boolean condicion2 = num1.intValue() < num2.intValue();
        System.out.println("Condición2 = " + condicion2);


    }
}

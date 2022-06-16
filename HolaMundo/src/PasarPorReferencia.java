public class PasarPorReferencia {
    public static void main(String[] args) {

        int[] edad = {10,11,12}; //Variable tipo Integer primitiva, toda v. primitiva siempre se pasa por valor en el argumento del método

        System.out.println("iniciamos en main");
        for(int i=0; i<edad.length; i++){
            System.out.println("edad[i] = " + edad[i]);
        }
        System.out.println("Antes de llamar al método test");
        test(edad); //El método main invoca al método test
        System.out.println("Después de llamar al método test");
        for(int i=0; i<edad.length; i++){ //Pasamor los valores por referencia del método test al método main
            System.out.println("edad[i] = " + edad[i]); //Se imprimen los valores modificados
        }
        System.out.println("Finalizamos el método main cn los datos del arreglo modificados");

    }

    public static void test(int[] edadArr){ //Método estático se puede invocar sin necesidad de crear el objeto, de forma directa
        System.out.println("Iniciamos el método test");
        for(int i=0; i<edadArr.length; i++){
            edadArr[i] = edadArr[i] + 20;
        }
        System.out.println("Finalizamos el método test");
    }
}

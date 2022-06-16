public class PasarPorValor {
    public static void main(String[] args) {
        int i = 10; //Variable tipo Integer primitiva, toda v. primitiva siempre se pasa por valor en el argumento del método

        System.out.println("iniciamos en main con i = " + i);
        test(i); //El método main invoca al método test
        System.out.println("Finalizamos el método main con el valor de i (se mantiene igual) = " + i);

    }

    public static void test(int i){ //Método estático se puede invocar sin necesidad de crear el objeto, de forma directa
        System.out.println("Iniciamos el método test con i = " + i);
        i = 35;
        System.out.println("Finalizamos el método test con i = " + i);
    }
}

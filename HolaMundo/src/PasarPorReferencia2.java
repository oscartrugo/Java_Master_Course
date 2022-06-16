
class Persona{
    private String nombre;

    public void modificarNombre(String nuevoNombre){ //Modificamos el valor de nombre de la clase Persona
        nombre = nuevoNombre; //this hace referencia a que es un atributo de la clase, no del método
    }

    public String leerNombre(){
        return this.nombre;
    }
}

public class PasarPorReferencia2 {
    public static void main(String[] args) {

        Persona persona = new Persona(); //Variable tipo Integer primitiva, toda v. primitiva siempre se pasa por valor en el argumento del método
        persona.modificarNombre("Oscar");


        System.out.println("iniciamos en main");
        System.out.println("persona = " + persona.leerNombre());
        System.out.println("Antes de llamar al método test");
        test(persona); //El método main invoca al método test
        System.out.println("Después de llamar al método test");
        System.out.println("persona = " + persona.leerNombre());
        System.out.println("Finalizamos el método main cn los datos del arreglo modificados");

    }

    public static void test(Persona persona){ //Método estático se puede invocar sin necesidad de crear el objeto, de forma directa
        System.out.println("Iniciamos el método test");
        persona.modificarNombre("Pepe");
        System.out.println("Finalizamos el método test");
    }
}

/*
 *Principio de ocultación
 * Toda variable de clase debe ser privada, y solo debe ser modificado mediante métodos
 */

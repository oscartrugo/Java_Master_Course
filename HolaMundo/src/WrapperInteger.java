
public class WrapperInteger {
    public static void main(String[] args) {

        int intPrimitivo = 128;
        Integer intObjeto = Integer.valueOf(intPrimitivo);
        Integer intObjeto2 = intPrimitivo;
        System.out.println("intObjeto = " + intObjeto);


        int num = intObjeto; //Toma el objeto y lo convierte en primitivo
        System.out.println("num = " + num);
        int num2 = intObjeto2.intValue(); //Retorna el entero primitivo del objeto
        System.out.println("num2 = "+ num2);

        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("Valor = " + valor);

        Short shortObjeto = intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);

        Byte byteObjeto = intObjeto.byteValue();
        System.out.println("byteObjeto = " + byteObjeto); //Hay pérdida de información

        Long longObjeto = intObjeto.longValue();
        System.out.println("longObjeto = " + longObjeto);
    }
}

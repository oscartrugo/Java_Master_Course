public class AutoboxingInteger {
    public static void main(String[] args) {

        Integer[] enteros = {Integer.valueOf(1),2,3,4,5,6,7,8,9,10,11,12,13,14,5};

        int suma = 0;

        //Boxing
        for(Integer i: enteros){ //Sumamos los números pares
            if(i.intValue() % 2 == 0){
                suma+=i.intValue();
            }
        }

        System.out.println("suma = " + suma);


        //Unboxing: convertir de objeto int a primitivo int
        suma = 0;
        for(Integer i: enteros){ //Sumamos los números pares
            if(i % 2 == 0){
                suma+= i;
            }
        }

        System.out.println("suma = " + suma);
    }
}

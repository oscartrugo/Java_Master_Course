public class SentenciaIfElseNumDiasMes {
    public static void main(String[] args) {
        int mes = 2;

        int numDias = 0;
        int anio = 1988;

        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            numDias = 31;
        }else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
            numDias = 30;
        }else if(mes == 2){
            if (anio % 400 == 0 || ( (anio % 4 == 0) && !(anio % 100 == 0))){
                numDias = 29;
            }else{
                numDias = 28;
            }
        }

        System.out.println("Número de días = "+numDias);
    }
}

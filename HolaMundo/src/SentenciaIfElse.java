public class SentenciaIfElse {
    public static void main(String[] args) {
        float promedio = 5.5f;
        if(promedio>=6.5){
            System.out.println("Excelente promedio");
        }else if(promedio>=6.0){
            System.out.println("Muy buen promedio!");
        }else if(promedio>=5.5){
            System.out.println("Promedio");
        }else if(promedio>=5.0){
            System.out.println("Regular, necesitas esforzarte un poco más!");
        }else if(promedio>=4.0){
            System.out.println("Insuficiente, necesitas estudiar más.");
        }else{
            System.out.println("Repronado!");
        }

        System.out.println("Tu promedio: "+ promedio);
    }
}

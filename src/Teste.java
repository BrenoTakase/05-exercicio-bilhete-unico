import java.util.Random;

public class Teste {

    public static void main(String[] args) {

        //Vetor
        int[] numeros = new int[10];

        AdicionarVetor(numeros);

        MostraValor(numeros);

    }

    public static void AdicionarVetor(int[] numeros){

        Random random = new Random();

        for (int i=0; i< numeros.length; i++){
            numeros[i] = random.nextInt(100);
        }
    }

    public static void MostraValor(int[] numeros){
        for (int i=0; i<numeros.length; i++){
            System.out.println(numeros[i]);
        }

        for (int i: numeros){
            System.out.println(i);
        }

    }

}

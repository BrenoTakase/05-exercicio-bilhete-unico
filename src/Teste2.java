public class Teste2 {

    public static void main(String[] args) {
        System.out.println("soma = " + somar(2,3));
        System.out.println("soma = " + somar(2,3,4));
        System.out.println("soma = " + somar(2,3,4,1,7));
    }

    public static int somar(int num1, int num2){
        int soma = num1+num2;
        return soma;
    }

    public static int somar(int num1, int num2,int num3){
        int soma = num1+num2+num3;
        return soma;
    }

    public static int somar(int num1, int num2,int num3,int num4,int num5){
        int soma = num1+num2+num3+num4+num5;
        return soma;
    }

    //Outra forma sem ser o Overload.
    //Quando você coloca o ..."Nome", você coloca todos os números dentro
    //do "Nome", transformando ele em um vetor
    public static int somar(int ...X){
        int soma = 0;
        for(int i: X){
        soma += i;
        }
        return soma;
    }
}

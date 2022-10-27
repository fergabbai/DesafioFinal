import java.util.Scanner;

public class DesafioFinal {
    public static void main(String[] args) {
        int soma = 0;
        Scanner input = new Scanner(System.in);
        int tamanho = getTamanho();
        int[] notas = new int[tamanho];

        for (int i = 0; i < notas.length; i++) {
            int j = getNumber();
            notas[i] = j;
                    getNumber();
            System.out.println("Selecione o calculo desejado. \n Digite ARITMETICA para media aritmetica ou HARMONICA para media harmonica.");
            String tipo = input.nextLine();


            if (tipo.equals("ARITMETICA")){
                double media = getAritmetica(notas);
                System.out.println("A media aritmetica das notas é:" + media );
            }
            else if (tipo.equals("HARMONICA"));
            double media = getHarmonica(notas);
            System.out.println("A media harmonica das notas é:" + media );
        }}

    private static double getHarmonica(int[] notas) {
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += 1d/notas[i];}

        return notas.length / soma;
    }


    private static double getAritmetica(int[] notas) {
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];}
        return soma / notas.length;
    }

    private static String getMedia() {
        System.out.println("Selecione o calculo desejado. \n Digite ARITMETICA para media aritmetica ou HARMONICA para media harmonica.");
        String tipo = new String();
        return tipo;
    }

    private static int getNumber() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Digite uma nota de 0 a 10");
            int numero = input.nextInt();
            return numero;
        } catch (Exception e) {
            System.out.println("Você digitou o tipo errado, por favor, digita corretamente");
            return getNumber();
        }


    }

    private static int getTamanho() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Insira a quantidade de notas a serem calculadas");
            int numero = input.nextInt();
            return numero;
        } catch (Exception e) {
            System.out.println("Você digitou o tipo errado, por favor, digita corretamente");
            return getTamanho();
        }

    }}



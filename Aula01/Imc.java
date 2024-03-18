import java.util.Scanner;

class Imc {
    public static void main(String[] args) {
        Scanner nome = new Scanner(System.in);
        String nometxt;

        System.out.println("Qual seu nome? ");
        nometxt = nome.nextLine();

        Scanner altura = new Scanner(System.in);
        float alturatxt;

        System.out.println("Qual sua altura? ");
        alturatxt = altura.nextLine();

        Scanner peso = new Scanner(System.in);
        float pesotxt;

        System.out.println("Qual seu peso? ");
        pesotxt = peso.nextLine();

        imc = peso/(altura x altura)
    }
}

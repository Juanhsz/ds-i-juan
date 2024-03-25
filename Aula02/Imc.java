import java.util.Scanner;

public class Imc {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome;
        float peso;
        float altura;
        float imc;

        System.out.println("Digite o seu nome: ");
        nome = scanner.nextLine();
        
        System.out.println("Digite o seu peso: ");
        peso = scanner.nextFloat();

        System.out.println("Digite o sua altura: ");
        altura = scanner.nextFloat();

        imc = peso / (altura * altura);

        System.out.println("Nome: " + nome);
        System.out.println("peso: " + peso + "kg");
        System.out.println("Altura: " + altura + "metros");
        System.out.println("IMC: " + imc);

        if (imc < 18.5) {
            System.out.println("Classificação: Magreza");
        } else if (imc < 25) {
            System.out.println("Classificação: Normal");
        } else if (imc < 30) {
            System.out.println("Classificação: Sobrepeso");
        } else if (imc < 40) {
            System.out.println("Classificação: Obesidade");
        } else {
            System.out.println("Classificação: Obesidade Grave");
        };
        scanner.close();
    }
}

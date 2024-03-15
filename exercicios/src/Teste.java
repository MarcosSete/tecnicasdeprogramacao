import java.util.Scanner;

public class Teste {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            int opcao = menu();

            switch (opcao) {
                case 1:
                    retangulo();
                    break;
                case 2:
                    triangulo();
                    break;
                case 3:
                    circulo();
                    break;
                case 4:
                    quadrado();
                    break;
                case 0:
                    System.out.println("Obrigado por usar o menu de figuras geométricas!");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static int menu() {
        System.out.println("Selecione a figura geométrica:");
        System.out.println("1. Retângulo");
        System.out.println("2. Triângulo");
        System.out.println("3. Círculo");
        System.out.println("4. Quadrado");
        System.out.println("0. Sair");

        return scanner.nextInt();
    }

    private static void retangulo() {
        System.out.println("Digite o comprimento do retângulo:");
        double comprimento = scanner.nextDouble();

        System.out.println("Digite a largura do retângulo:");
        double largura = scanner.nextDouble();

        Retangulo retangulo = new Retangulo("Preto", comprimento, largura);

        System.out.println("A área do retângulo é de " + retangulo.area());
    }

    private static void triangulo() {
        System.out.println("Digite a base do triângulo:");
        double base = scanner.nextDouble();

        System.out.println("Digite a altura do triângulo:");
        double altura = scanner.nextDouble();

        Triangulo triangulo = new Triangulo("Azul", base, altura);

        System.out.println("A área do triângulo é de " + triangulo.area());
    }

    private static void circulo() {
        System.out.println("Digite o raio do círculo:");
        double raio = scanner.nextDouble();

        Circulo circulo = new Circulo("Verde", raio);

        System.out.println("A área do círculo é de " + circulo.area());
    }

    private static void quadrado() {
        System.out.println("Digite o lado do quadrado:");
        double lado = scanner.nextDouble();

        Quadrado quadrado = new Quadrado("Vermelho", lado);

        System.out.println("A área do quadrado é de " + quadrado.area());
    }
}

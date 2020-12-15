import java.util.Scanner;

public class calculadora01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double numero01;
        double numero02;
        double adicao;
        double subtracao;
        double multiplicacao;
        double divisao;
        int operacao;
        boolean sair = false;

        do {
            System.out.println("=====================================================================");
            System.out.println("CALCULADORA JAVA");
            System.out.println("=====================================================================");
            System.out.println("");

            System.out.println("Digite :");
            System.out.println("(1)Adição" + "(2)Subtração" + "(3)Multiplicação" + "(4)Divisão");
            operacao = sc.nextInt();

            System.out.println("---------------------------------------------------------------------");
            System.out.println("Digite dois numeros inteiros para a operação:");

            switch (operacao) {

                case 1:
                    numero01 = sc.nextDouble();
                    numero02 = sc.nextDouble();
                    adicao = (numero01 + numero02);
                    System.out.println("Resultado da soma:" + adicao);
                    break;
                case 2:
                    numero01 = sc.nextDouble();
                    numero02 = sc.nextDouble();
                    subtracao = (numero01 - numero02);
                    System.out.println("Resultado da subtração:" + subtracao);
                    break;
                case 3:
                    numero01 = sc.nextDouble();
                    numero02 = sc.nextDouble();
                    multiplicacao = (numero01 * numero02);
                    System.out.println("Resultado da multiplicação:" + multiplicacao);
                    break;
                case 4:
                    do {
                        numero01 = sc.nextDouble();
                        numero02 = sc.nextDouble();

                        if (numero01 == 0 || numero02 == 0) {
                            System.out.println("Divisão por numero 0 não permitida");
                            System.out.println("Digite (1) para refazer a Divisão ou (0) para encerrar:");

                            if (sc.nextDouble() == 0) {
                                sair = true;
                            }
                            System.out.println("Digite a operação novamente:");
                            System.out.println("--------------------------------------------------------");
                        } else {
                            divisao = (numero01 / numero02);
                            System.out.println("Resultado da Divisäo:" + divisao);
                        break;
                        }


                    } while (sair == false);

                    break;

                    default:
                    System.out.println("numero invalido");
                    System.out.println("Digite (1) para voltar ou (0) para encerrar:");
                    if (sc.nextDouble() == 0) {
                        sair = true;
                    }

                    break;
            }


            System.out.println("--------------------------------------------------------------------");
            System.out.println("Operação realizada!");
            System.out.println("Digite (1) para continuar ou (0) para encerrar:");

            if (sc.nextDouble() == 0) {
                sair = true;
            }


        } while (sair == false);

        sc.close();
    }


}

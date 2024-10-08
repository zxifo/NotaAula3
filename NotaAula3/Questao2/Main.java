package AulasP2.NotaAula3.Questao2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        int menu;

        do {
            System.out.println("\nAdministrador de Pet Shop");
            System.out.println("Digite [1] para Cadastrar um Cachorro");
            System.out.println("Digite [2] para Cadastrar um Gato");
            System.out.println("Digite [3] para SAIR");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Digite o nome do cachorro: ");
                    cachorro.setNome(sc1.nextLine());
                    System.out.println("Digite a raça do cachorro: ");
                    cachorro.setRaca(sc1.nextLine());
                    cachorro.caminha();
                    cachorro.late();
                    break;
                case 2:
                    System.out.println("Digite o nome do gato: ");
                    gato.setNome(sc1.nextLine());
                    System.out.println("Digite a raça do gato: ");
                    gato.setRaca(sc1.nextLine());
                    gato.caminha();
                    gato.mia();
                    break;
                case 0:
                    System.out.println("Programa encerrado com sucesso!");
                    break;
                default:
                    System.out.println("Opedação inválida, tente novamente.");
            }
        } while (menu != 0);
    }
}


package src;

import java.util.Scanner;

import src.model.Equipe;
import src.model.Piloto;
import src.service.EquipeService;
import src.service.PilotoService;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PilotoService pilotoService = new PilotoService();
        EquipeService equipeService = new EquipeService();

        int opcao;

        do {
            System.out.println("\n");
            System.out.println("==================================================");
            System.out.println("             F1 MANAGER");
            System.out.println("          FORMULA ONE MANAGER");
            System.out.println("==================================================");
            System.out.println();
            System.out.println("  [1]  Gerenciar Pilotos");
            System.out.println("  [2]  Gerenciar Equipes");
            System.out.println();
            System.out.println("  [3]  Gerenciar Circuitos       [EM BREVE]");
            System.out.println("  [4]  Gerenciar Corridas        [EM BREVE]");
            System.out.println("  [5]  Gerenciar Resultados      [EM BREVE]");
            System.out.println("  [6]  Campeonato                [EM BREVE]");
            System.out.println("  [7]  Estratégias               [EM BREVE]");
            System.out.println();
            System.out.println("--------------------------------------------------");
            System.out.println("  [0]  Sair");
            System.out.println("==================================================");
            System.out.print("\n  Escolha uma opção: ");

            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {

                case 1:
                    menuPilotos(scanner, pilotoService);
                    break;

                case 2:
                    menuEquipes(scanner, equipeService);
                    break;

                case 3:
                    System.out.println("\n  [!] Módulo de Circuitos em construção!");
                    break;

                case 4:
                    System.out.println("\n  [!] Módulo de Corridas em construção!");
                    break;

                case 5:
                    System.out.println("\n  [!] Módulo de Resultados em construção!");
                    break;

                case 6:
                    System.out.println("\n  [!] Módulo de Campeonato em construção!");
                    break;

                case 7:
                    System.out.println("\n  [!] Módulo de Estratégias em construção!");
                    break;

                case 0:
                    System.out.println("\n  Encerrando o F1 Manager...");
                    System.out.println("  Obrigado por utilizar o sistema!");
                    break;

                default:
                    System.out.println("\n  [ERRO] Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }

    // ==========================================
    //             MENU DE PILOTOS
    // ==========================================

    public static void menuPilotos(Scanner scanner, PilotoService service) {

        int opcao;

        do {
            System.out.println("\n");
            System.out.println("==================================================");
            System.out.println("               MODULO DE PILOTOS");
            System.out.println("==================================================");
            System.out.println();
            System.out.println("  [1]  Cadastrar Piloto");
            System.out.println("  [2]  Listar Pilotos");
            System.out.println("  [3]  Buscar Piloto");
            System.out.println("  [4]  Editar Piloto");
            System.out.println("  [5]  Excluir Piloto");
            System.out.println();
            System.out.println("--------------------------------------------------");
            System.out.println("  [0]  Voltar ao Menu Principal");
            System.out.println("==================================================");
            System.out.print("\n  Escolha uma opção: ");

            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {

                case 1:

                    System.out.println("\n  ===== CADASTRO DE PILOTO =====\n");

                    System.out.print("  Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("  Número: ");
                    int numero = Integer.parseInt(scanner.nextLine());

                    System.out.print("  Nacionalidade: ");
                    String nacionalidade = scanner.nextLine();

                    System.out.print("  Equipe: ");
                    String equipe = scanner.nextLine();

                    System.out.print("  Títulos: ");
                    int titulos = Integer.parseInt(scanner.nextLine());

                    Piloto piloto = new Piloto(nome, numero, nacionalidade, equipe, titulos);

                    service.cadastrarPiloto(piloto);

                    System.out.println("\n  [OK] Piloto cadastrado com sucesso!\n");

                    break;

                case 2:

                    System.out.println("\n  ===== LISTA DE PILOTOS =====\n");

                    service.listarPilotos();

                    break;

                case 3:

                    System.out.println("\n  ===== BUSCAR PILOTO =====\n");

                    System.out.print("  Número do piloto: ");
                    int numeroBusca = Integer.parseInt(scanner.nextLine());

                    Piloto encontrado = service.buscarPiloto(numeroBusca);

                    if (encontrado != null) {
                        System.out.println("\n  ===== PILOTO ENCONTRADO =====");
                        System.out.println(encontrado);
                    } else {
                        System.out.println("\n  [ERRO] Piloto não encontrado!");
                    }

                    break;

                case 4:

                    System.out.println("\n  ===== EDITAR PILOTO =====\n");

                    System.out.print("  Número do piloto: ");
                    int numeroEditar = Integer.parseInt(scanner.nextLine());

                    System.out.print("  Novo nome: ");
                    String novoNome = scanner.nextLine();

                    System.out.print("  Nova nacionalidade: ");
                    String novaNacionalidade = scanner.nextLine();

                    System.out.print("  Nova equipe: ");
                    String novaEquipe = scanner.nextLine();

                    System.out.print("  Novos títulos: ");
                    int novosTitulos = Integer.parseInt(scanner.nextLine());

                    service.editarPiloto(numeroEditar, novoNome,
                            novaNacionalidade, novaEquipe, novosTitulos);

                    break;

                case 5:

                    System.out.println("\n  ===== EXCLUIR PILOTO =====\n");

                    System.out.print("  Número do piloto: ");
                    int numeroExcluir = Integer.parseInt(scanner.nextLine());

                    service.excluirPiloto(numeroExcluir);

                    break;

                case 0:

                    System.out.println("\n  Voltando ao menu principal...");

                    break;

                default:

                    System.out.println("\n  [ERRO] Opção inválida!");

                    break;
            }

        } while (opcao != 0);
    }

    // ==========================================
    //             MENU DE EQUIPES
    // ==========================================

    public static void menuEquipes(Scanner scanner, EquipeService service) {

        int opcao;

        do {
            System.out.println("\n");
            System.out.println("==================================================");
            System.out.println("               MODULO DE EQUIPES");
            System.out.println("==================================================");
            System.out.println();
            System.out.println("  [1]  Cadastrar Equipe");
            System.out.println("  [2]  Listar Equipes");
            System.out.println("  [3]  Buscar Equipe");
            System.out.println("  [4]  Editar Equipe");
            System.out.println("  [5]  Excluir Equipe");
            System.out.println();
            System.out.println("--------------------------------------------------");
            System.out.println("  [0]  Voltar ao Menu Principal");
            System.out.println("==================================================");
            System.out.print("\n  Escolha uma opção: ");

            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {

                case 1:

                    System.out.println("\n  ===== CADASTRO DE EQUIPE =====\n");

                    System.out.print("  Nome da equipe: ");
                    String nome = scanner.nextLine();

                    System.out.print("  País: ");
                    String pais = scanner.nextLine();

                    System.out.print("  Chefe: ");
                    String chefe = scanner.nextLine();

                    System.out.print("  Ano de fundação: ");
                    int anoFundacao = Integer.parseInt(scanner.nextLine());

                    System.out.print("  Títulos: ");
                    int titulos = Integer.parseInt(scanner.nextLine());

                    Equipe equipe = new Equipe(nome, pais, chefe, anoFundacao, titulos);

                    service.cadastrarEquipe(equipe);

                    System.out.println("\n  [OK] Equipe cadastrada com sucesso!\n");

                    break;

                case 2:

                    System.out.println("\n  ===== LISTA DE EQUIPES =====\n");

                    service.listarEquipes();

                    break;

                case 3:

                    System.out.println("\n  ===== BUSCAR EQUIPE =====\n");

                    System.out.print("  Nome da equipe: ");
                    String nomeBusca = scanner.nextLine();

                    Equipe encontrada = service.buscarEquipe(nomeBusca);

                    if (encontrada != null) {
                        System.out.println("\n  ===== EQUIPE ENCONTRADA =====");
                        System.out.println(encontrada);
                    } else {
                        System.out.println("\n  [ERRO] Equipe não encontrada!");
                    }

                    break;

                case 4:

                    System.out.println("\n  ===== EDITAR EQUIPE =====\n");

                    System.out.print("  Nome da equipe: ");
                    String nomeEditar = scanner.nextLine();

                    System.out.print("  Novo país: ");
                    String novoPais = scanner.nextLine();

                    System.out.print("  Novo chefe: ");
                    String novoChefe = scanner.nextLine();

                    System.out.print("  Novo ano de fundação: ");
                    int novoAno = Integer.parseInt(scanner.nextLine());

                    System.out.print("  Novos títulos: ");
                    int novosTitulos = Integer.parseInt(scanner.nextLine());

                    service.editarEquipe(nomeEditar, novoPais, novoChefe,
                            novoAno, novosTitulos);

                    break;

                case 5:

                    System.out.println("\n  ===== EXCLUIR EQUIPE =====\n");

                    System.out.print("  Nome da equipe: ");
                    String nomeExcluir = scanner.nextLine();

                    service.excluirEquipe(nomeExcluir);

                    break;

                case 0:

                    System.out.println("\n  Voltando ao menu principal...");

                    break;

                default:

                    System.out.println("\n  [ERRO] Opção inválida!");

                    break;
            }

        } while (opcao != 0);
    }
}

package br.com.agenda;

import br.com.controle.ControleAniversario;
import br.com.controle.ControleCompromisso;
<<<<<<< HEAD
import br.com.controle.ControleFeriados;
import br.com.controle.ControleTarefas;
import br.com.models.Compromissos;
import br.com.models.Tarefas;

import java.util.Scanner;

/**
 * Created by mauricio on 08/03/17.
 */
=======
import br.com.controle.ControleTarefas;
import br.com.models.Compromissos;

import java.util.Scanner;

>>>>>>> b8dad553d2d3cf709a1179b5f119c7798b4a678a
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControleCompromisso c = new ControleCompromisso();
        ControleAniversario ca = new ControleAniversario();
        ControleTarefas ct = new ControleTarefas();
<<<<<<< HEAD
        ControleFeriados cf = new ControleFeriados();
=======
>>>>>>> b8dad553d2d3cf709a1179b5f119c7798b4a678a
        int opcao = 0;
        do {
            Menu.menuInicial();
            opcao = scanner.nextInt();
            switch (opcao){
                case 1:
<<<<<<< HEAD
                    do {
                        Menu.menuCompromissos();
                        opcao = scanner.nextInt();
                        switch (opcao){
                            case 1:
                                Formularios.formCadastroCompromisso(scanner, c);
                                break;
                            case 2:
                                Formularios.formEditarCompromisso(scanner, c);
                                break;
                            case 3:
                                Formularios.formRemoverCompromisso(scanner, c);
                                break;
                            case 4:
                                Formularios.formMostrarCompromissos(c);
                                break;
                            case 5:
                                System.out.println("Menu anterior.");
=======
                    Menu.menuCompromissos();
                    opcao = scanner.nextInt();
                    do {
                        switch (opcao){
                            case 1:
                                int codigo = c.tamanho() + 1;
                                System.out.println("Informe o titulo:");
                                String titulo = scanner.nextLine();
                                System.out.println("Informe a descrição:");
                                String descricao = scanner.nextLine();
                                System.out.println("Informe a duração:");
                                System.out.println("Se deseja que dure o dia inteiro digite: dia inteiro.");
                                String duracao = scanner.nextLine();
                                boolean diaInteiro = false;
                                if (duracao.equals("dia inteiro")){
                                    diaInteiro = true;
                                }
                                Compromissos compromissos;
                                if (diaInteiro){
                                    compromissos = new Compromissos(codigo, titulo, descricao, diaInteiro);
                                    c.criar(compromissos);
                                }else{
                                    System.out.println("Informe data e hora de inicio:");
                                    String data = scanner.nextLine();
                                    System.out.println("Informe data e hora de fim:");
                                    String dataFim = scanner.nextLine();
                                    compromissos = new Compromissos(codigo, titulo, descricao, data, dataFim);
                                    c.criar(compromissos);
                                }
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
>>>>>>> b8dad553d2d3cf709a1179b5f119c7798b4a678a
                                break;
                        }
                    }while (opcao != 5);
                    break;
                case 2:
<<<<<<< HEAD
                    do {
                        Menu.menuFeriados();
                        opcao = scanner.nextInt();
                        switch (opcao){
                            case 1:
                                Formularios.formMostraFeriados(cf);
                                break;
                            case 2:
                                System.out.println("Menu anterior.");
=======
                    Menu.menuFeriados();
                    opcao = scanner.nextInt();
                    do {
                        switch (opcao){
                            case 1:
                                break;
                            case 2:
>>>>>>> b8dad553d2d3cf709a1179b5f119c7798b4a678a
                                break;
                        }
                    }while (opcao != 2);
                    break;
                case 3:
<<<<<<< HEAD
                    do {
                        Menu.menuTarefas();
                        opcao = scanner.nextInt();
                        switch (opcao){
                            case 1:
                                Formularios.formCadastrarTarefa(scanner, ct);
                                break;
                            case 2:
                                Formularios.formEditarTarefa(scanner, ct);
                                break;
                            case 3:
                                Formularios.formRemoverTarefa(scanner, ct);
                                break;
                            case 4:
                                Formularios.formMostrarTarefas(ct);
                                break;
                            case 5:
                                Formularios.formCompletarTarefa(scanner, ct);
                                break;
                            case 6:
                                System.out.println("Menu anterior.");
                                break;
                        }
                    }while (opcao != 6);
                    break;
                case 4:
                    do {
                        Menu.menuAniversarios();
                        opcao = scanner.nextInt();
                        switch (opcao){
                            case 1:
                                Formularios.formCadastroAniversario(scanner, ca);
                                break;
                            case 2:
                                Formularios.formEditarAniversario(scanner, ca);
                                break;
                            case 3:
                                Formularios.formRemoverAniversario(scanner, ca);
                                break;
                            case 4:
                                Formularios.formMostrarAniversario(ca);
                                break;
                            case 5:
                                System.out.println("Menu anterior.");
                                break;
                        }
                    }while (opcao != 5);
                case 7:
=======
                    Menu.menuTarefas();
                    opcao = scanner.nextInt();
                    do {
                        switch (opcao){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                        }
                    }while (opcao != 5);
                    break;
                case 4:
                    Menu.menuAniversarios();
                    opcao = scanner.nextInt();
                    do {
                        switch (opcao){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                        }
                    }while (opcao != 5);
                case 5:
>>>>>>> b8dad553d2d3cf709a1179b5f119c7798b4a678a
                    System.out.println("Programa encerrado.");
                    break;
            }

<<<<<<< HEAD
        }while (opcao != 7);
=======
        }while (opcao != 5);
>>>>>>> b8dad553d2d3cf709a1179b5f119c7798b4a678a

    }
}


package heranca;
import java.util.Scanner;
public class VeiculoTest { // classe drive contendo o método main, na qual dentro do seu corpo podemos instanciar as classes
    public static void main(String[] args) { // método main
        Scanner input = new Scanner(System.in); // instanciado a classe Scanner


        int opcao_veiculo; // variável que recebe a escolha do clinte com relação ao tipo de veículo ele quer cadastar
        int opcao_alterar_dados_ou_excluir_veiculo; // variável que recebe a opção do cliente sobre alterar os dados do veículo ou excluir os dados
        boolean controle = true; // variável de controle
        int escolha_sair_ou_voltar_menu; // variável que recebe a opção do cliente de ir para o menu ou sair


        String placa; // variável que recebe o valor da placa do veículo
        int ano; // variável que armazena o valor do ano do veículo



        // laço while que se repetirar enquanto cliente quiser fica no menu de escolha
        while(controle) {


            // método static que exibe o menu de escolha. Usado para diminuir a quantidade linhas
            // ele está na linha 244 desta classe VeiculoTest
            displayVeiculo();
            opcao_veiculo = input.nextInt();


            // garante que os valores informados sejam entre 1 e 3 incluindo os extremos
            if(opcao_veiculo != 1 && opcao_veiculo != 2 && opcao_veiculo != 3){
                do{
                    System.out.println("O valor digitado está incorreto, por favor digite novamente a opção deseja: ");

                    // método static que exibe o menu de escolha, usado para diminuir a quantidade linhas
                    displayVeiculo();
                    opcao_veiculo = input.nextInt();

                }while(opcao_veiculo != 1 && opcao_veiculo != 2 && opcao_veiculo != 3);
            }


            // comando if-else aninhados
            // os comandos if e else serão executados de acordo com a escolha que o cliente fizer.
            if (opcao_veiculo == 1) {

                System.out.print("Digite o ano do seu veículo:"); // prompt
                ano = input.nextInt();

                input.nextLine(); // consome a nova linha

                System.out.print("Digite a placa do seu veículo:"); //prompt
                placa = input.nextLine();

                // estância a classe veículo e inicializa-a com os valores digitados pelo cliente
                Veiculo veiculo = new Veiculo(placa, ano);

                // exibi o as informações da classe veículo que se encontram no método toString
                System.out.println(veiculo);
                System.out.println(); // nova linha

                // informa ao cliente se ele deseja editar os valores cadastrados ou exclui-los
                System.out.print("Deseja alterar as informações digitadas ou exclui-las :\n1-editar\n2-excluir\nOpção: ");
                opcao_alterar_dados_ou_excluir_veiculo = input.nextInt();

                // comando de seleção múltipla
                switch (opcao_alterar_dados_ou_excluir_veiculo) {
                    // case 1 permite que o cliente edite os valores cadastrados anteriomente
                    case 1: {
                        System.out.println("Digite novamente o ano do seu carro: ");
                        ano = input.nextInt();
                        System.out.println("Digite novamente a placa do seu carro: ");
                        input.nextLine();
                        placa = input.nextLine();

                        veiculo.setPlaca(placa); // chama o método setPlaca
                        veiculo.setAno(ano); // chama o método setAno


                        // exibi o as informações da classe veículo que se encontram no método toString
                        System.out.printf("As novas informações do veículo: %s", veiculo);
                        System.out.println(); // nova linha


                    }
                    break;
                    // case dois exlui o objeto veiculo
                    case 2: {
                        veiculo = null; // instrução que exclui o objeto
                        System.out.println("O cadastro do veiculo foi excluído"); // prompt
                    }
                    break;


                }

            }
            // caso o if acima for falso esse comando else executa
            else {
                // verifica se o valor digitado é 2
                if (opcao_veiculo == 2) {

                    int eixos; // variável que armazena a quantidade de eixos do caminhão

                    System.out.print("Digite o ano do seu caminhao:"); // prompt
                    ano = input.nextInt();

                    input.nextLine();

                    System.out.print("Digite a placa do seu caminhao:"); // prompt
                    placa = input.nextLine();

                    System.out.println("Digite a quantidade de eixos do camihão: "); // prompt
                    eixos = input.nextInt();

                    // estância a classe Caminhao e inicializa-a com os valores digitados pelo cliente
                    Caminhao caminhao = new Caminhao(placa, ano, eixos);

                    // exibi as informações de Caminhao contidas no método toString
                    System.out.println(caminhao);

                    System.out.println(); // nova linha

                    // verifica se o cliente deseja altera ou exluir o dados cadastrados
                    System.out.print("Deseja alterar as informações digitadas ou exclui-las :\n1-editar\n2-excluir\nOpção: ");
                    opcao_alterar_dados_ou_excluir_veiculo = input.nextInt();

                    // comando de múltipla escolha
                    switch (opcao_alterar_dados_ou_excluir_veiculo) {

                        // case 1 permite que o cliente edite os valores cadastrados anteriomente
                        case 1: {
                            System.out.println("Digite novamente o ano do seu carro: "); // prompt
                            ano = input.nextInt();

                            input.nextLine(); // consome a nova linha

                            System.out.println("Digite novamente a placa do seu carro: "); // prompt
                            placa= input.nextLine();

                            System.out.println("Digite novamete a quantidade de eixos"); // prompt
                            eixos = input.nextInt();

                            caminhao.setPlaca(placa); // chama o método de caminhao
                            caminhao.setAno(ano); // chama o método de caminhao
                            caminhao.setEixos(eixos); // chama o método de caminhão


                            // exibi o as informações da classe veículo que se encontram no método toString
                            System.out.printf("As novas informações do veículo: %s", caminhao);
                            System.out.println(); // nova linha


                        }
                        break;

                        // case 2 escluir o objeto
                        case 2: {
                            caminhao = null; // instrução que exclui o objeto
                            System.out.println("O cadastro do veiculo foi excluído"); // prompt
                        }
                        break;

                    }



                } else {
                    int assentos; // variável que armazena a quantidade de assentos

                    System.out.print("Digite o ano do seu Ônibus:"); // prompt
                    ano = input.nextInt();

                    input.nextLine(); // consome a nova linha

                    System.out.print("Digite a placa do seu Ônibus:"); //prompt
                    placa = input.nextLine();

                    System.out.println("Digite a quantidade de assentos do Ônibus: "); // prompt
                    assentos = input.nextInt();

                    // estância a classe onibus e inicializa-a com os valores digitados pelo cliente
                    Onibus onibus = new Onibus(placa, ano, assentos);

                    //exibe informações da classe Onibus contidas no método toString
                    System.out.println(onibus);

                    System.out.println(); // nova linha

                    // verifica se o cliente deseja altera ou exluir o dados cadastrados
                    System.out.print("Deseja alterar as informações digitadas ou exclui-las :\n1-editar\n2-excluir\nOpção: ");
                    opcao_alterar_dados_ou_excluir_veiculo = input.nextInt();


                    // comando de múltipla escolha
                    switch (opcao_alterar_dados_ou_excluir_veiculo) {
                        // case 1 permite que o cliente edite os valores cadastrados anteriomente
                        case 1: {
                            System.out.println("Digite novamente o ano do seu Ônibus: "); //prompt
                            ano = input.nextInt();

                            input.nextLine();

                            System.out.println("Digite novamente a placa do seu Ônibus: "); //prompt
                            placa = input.nextLine();

                            System.out.println("Digite novamete a quantidade de assentos:");//prompt
                            assentos = input.nextInt();

                            onibus.setPlaca(placa); // armazena valor de placa
                            onibus.setAno(ano); // armazena calor de ano
                            onibus.setAssentos(assentos); // armazena valor de assentos

                            // exibi as informações da classe Onibus
                            System.out.printf("As novas informações do veículo: %s", onibus);
                            System.out.println(); // nova linha


                        }
                        break;
                        // exclui o objeto
                        case 2: {
                            onibus = null;
                            System.out.println("O cadastro do veiculo foi excluído");
                        }
                        break;

                    }
                }


            }
            // permite o cliente escolher entre ir para o menu ou sair
            System.out.printf("Deseja voltar ao menu principal ou sair:%n 1-voltar%n2-sair%nopção: ");
            escolha_sair_ou_voltar_menu = input.nextInt();

            // comando que tem como função atribuir o valor falsa a variável controle para que o laçoi não se repita
            if( escolha_sair_ou_voltar_menu==2)
                controle = false;



        }
    }

    public static void  displayVeiculo(){
        System.out.println("Escolha qual veículo você deseja cadastrar: ");
        System.out.println(); // gera uma nova linha
        System.out.printf("1-Veículo%n2-Caminhão%n3-Ônibus%nOpção: ");

    }






}

package CadastroDev;

import java.util.Scanner;

public class CadastroDev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------Cadastro Dev---------------");
        System.out.println("Bem Vindo!");
        boolean continuacao = true;
        boolean invalido = true;
        String NomeDev = "" , sobrenomeDev = "", Senioridade = "", NomePrograma ="", DescricaoLing = "";




        while (continuacao){
            System.out.println("Menu: \n1-Cadastro dev\n2-Cadastro linguagem\n3-Sair");
            System.out.print("\nDigite:");
            int opcao = sc.nextInt();


            switch (opcao){
                case 1:
                    sc.nextLine();


                    do {
                        System.out.println("Digite o nome do desenvolvedor:");
                        String nomeDev = sc.nextLine();
                         if(nomeDev.length() < 3) {
                             System.out.println("Erro:Nome do desenvolvedor deve ter mais caracteres!");
                             invalido = true;
                         }
                         else {
                             NomeDev = nomeDev;
                             invalido = false;
                         }
                    }while (invalido);

                    do {
                        System.out.println("Digite o sobrenome do desenvolvedor:");
                        String SobrenomeDev = sc.nextLine();
                        if (SobrenomeDev.length() < 3) {

                            System.out.println("Error:Sobrenome do desenvolvedor deve ter mais de 3 caracteres !");
                            invalido = true;

                        } else {
                            sobrenomeDev = SobrenomeDev;
                            invalido = false;
                        }
                    }while (invalido);

                    do {
                        System.out.println("Digite a senioridade do desenvolvedor:");
                        String senioridade = sc.nextLine();
                        if (senioridade.length() < 3) {
                            System.out.println("Error:Senioridade do desenvolvedor deve ter mais de 3 caracteres! ");
                            invalido =true;
                        } else {
                            Senioridade = senioridade;
                            invalido = false;
                        }
                    }while(invalido);

                    do {
                        System.out.println("Digite a idade do desenvolvedor:");
                        int idade = sc.nextInt();
                        if (idade <  8){
                            System.out.println("Error:Idade deve que ser maior que oito anos!");
                            invalido = true;
                        }
                        else{
                            System.out.printf("Nome do desenvolvedor : %s %s\n",NomeDev,sobrenomeDev );
                            System.out.printf("Senioridade : %s\n", Senioridade);
                            System.out.println("Idade : " + idade+"\n");

                            invalido = false;
                        }

                    }while (invalido);
                    break;

                case 2:
                    sc.nextLine();

                     do{
                         System.out.println("Digte o nome da linguagem de programação:");
                         String programa = sc.nextLine();

                         if(programa.length() < 3){
                             System.out.println("Erro:Nome deve possuir mais de 3 caracteres!");
                             invalido = true;
                         }
                         else{
                             NomePrograma = programa;
                             invalido = false;
                         }
                     }while (invalido);

                     do{
                         System.out.println("Digite  descrição da linguagem:");
                         String descricao = sc.nextLine();

                         if (descricao.length() <3 ){
                             System.out.println("Erro:Descrição deve possuir mais de 3 caracteres");
                             invalido = true;
                         }
                         else{
                             DescricaoLing = descricao;
                             invalido=false;
                         }


                     }while (invalido);

                     do{
                         System.out.println("Quais dessas( Frontend, Backend ou Mobile) é aplicação do programa?");
                         String aplicacao = sc.nextLine();

                         if(aplicacao.equals("Frontend") || aplicacao.equals("Backend") || aplicacao.equals("Mobile")){
                             invalido=false;
                             System.out.printf("Nome do programa : %s \n",NomePrograma);
                             System.out.printf("Descrição: %s\n",DescricaoLing);
                             System.out.println("Aplicacao : " + aplicacao);
                         }
                         else{
                             System.out.println("Error:Digite a aplicação conforme citado!");
                             invalido = true;

                         }
                     }while (invalido);

                    break;

                case 3:
                    System.out.println("Obrigada pela sua visita!");
                    continuacao = false;
                    break;
                default:
                    System.out.println("Opcao incorreta tenta novamente");
                    break;
            }
        }
    }
}

package CadastroDev;

import java.util.Scanner;

public class CadastroDev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------Cadastro Dev---------------");
        System.out.println("Bem Vindo!");
        boolean continuacao = true;
        boolean invalido = true;




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
                             System.out.println("Erro,nome do desenvolvedor deve ter mais caracteres!");
                             invalido = true;
                         }
                         else {
                             invalido = false;
                         }
                    }while (invalido);

                    do {
                        System.out.println("Digite o sobrenome do desenvolvedor:");
                        String SobrenomeDev = sc.nextLine();
                        if (SobrenomeDev.length() < 3) {

                            System.out.println("Error,sobrenome do desenvolvedor deve ter mais de 3 caracteres !");
                            invalido = true;

                        } else {
                            invalido = false;
                        }
                    }while (invalido);

                    do {
                        System.out.println("Digite a senioridade do desenvolvedor:");
                        String senioridade = sc.nextLine();
                        if (senioridade.length() < 3) {
                            System.out.println("Error, senioridade do desenvolvedor deve ter mais de 3 caracteres! ");
                            invalido =true;
                        } else {
                            invalido = false;
                        }
                    }while(invalido);

                    do {
                        System.out.println("Digite a idade do desenvolvedor:");
                        int idade = sc.nextInt();
                        if (idade <= 0){
                            System.out.println("Error, idade tem que ser maior que zero! ");
                            invalido = true;
                        }
                        else{
                            invalido = false;
                        }
                    }while (invalido);
                    break;

                case 2:
                    continuacao = false;
                    break;

            }
        }
    }
}

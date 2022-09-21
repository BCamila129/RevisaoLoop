package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Cliente> clienteList = new ArrayList<>();

    public static void main(String[] args) {
        int contador = 0;

        LoopUm:
        while(true){
          contador++;
            System.out.println("Quantas vezes entrou?" + " "+ contador);
            System.out.println("Você deseja continuar ou sair do loop?");
            System.out.println("Se desejar buscar uma entidade cliente, digite 4");
            System.out.println("Se você deseja criar uma entidade cliente, digite 2");
            System.out.println("Se você deseja retirar uma entidade cliente, digite 3");
            System.out.println("Se deseja ver a lista de cliente, digite 5");
            System.out.println("Se desejar atualizar a idade da entidade cliente, digite 6");
            System.out.println("Se você deseja sair, digite 1");
            Scanner scanner = new Scanner(System.in);
            int opcaoEscolhida = scanner.nextInt();
            if(opcaoEscolhida == 1){
                System.out.println("Você entrou" + contador + "vezes no LoopUm?");
                System.out.println("Você está saindo do loop...");
                break LoopUm;
            }
            if(opcaoEscolhida == 2){
                Cliente cliente = new Cliente();
                System.out.println("Qual o nome do cliente?");
                Scanner atributoDoCliente = new Scanner(System.in);
                cliente.nome = atributoDoCliente.nextLine();
                cliente.idade = Integer.valueOf(atributoDoCliente.nextLine());
                System.out.println("Cliente de nome : " + cliente.nome);
                System.out.println("Cliente com idade : " + cliente.idade);

                if(cliente.idade > 65){
                    cliente.aposentadoria = 2000;
                }
                clienteList.add(cliente);
            }
            if(opcaoEscolhida == 3) {
                int i;
                for (i = 0; i <= clienteList.size(); i++) ;
                Scanner scannerNomeSerRemovido = new Scanner(System.in);
                String nomeDigitado = scannerNomeSerRemovido.nextLine();
                if(nomeDigitado.equals(clienteList.get(i).nome));
                clienteList.remove(i);
            }
            if(opcaoEscolhida == 4) {
                int i;
                for (i = 0; i <= clienteList.size(); i++) {
                    Scanner acharNome = new Scanner(System.in);
                    System.out.println("Digite o nome do cliente: ");
                    String encontrarNome = acharNome.nextLine();
                    if (encontrarNome.equals(clienteList.get(i).nome)) {
                        System.out.println("Cliente encontrado!!" + clienteList.get(i).nome);
                    } else {
                        System.out.println("Cliente não encontrado");
                    }
                }
            }
                    if(opcaoEscolhida == 5){
                        int i;
                        for(i = 0; i <= clienteList.size(); i++){
                            System.out.println(clienteList);
                        }
                    }
                    if(opcaoEscolhida == 6){
                        int i;
                        for(i = 0; i < clienteList.size(); i++){
                            Scanner encontrarNome = new Scanner(System.in);
                            System.out.println("Digite o nome do cliente: ");
                            String nomeEncontrado = encontrarNome.nextLine();
                            if(nomeEncontrado.equals(clienteList.get(i).nome)){
                                System.out.println("Informe a idade");
                                Integer idade = Integer.valueOf(encontrarNome.nextLine());
                                clienteList.get(i).idade = idade;
                        }


                        }
                    }

                }
            }

        }



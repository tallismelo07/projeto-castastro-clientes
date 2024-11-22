package CadastroCliente.Application;

import CadastroCliente.Entities.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Cliente> clientes = new ArrayList<>();
        Cliente cliente;

        // Numeros de clientes que querem ser cadastrado durante o dia
        System.out.print("Clientes para ser cadastrados: ");
        int numerosDeClientes = sc.nextInt();

        // Aqui fica o loop para colocar todos os clientes que compram no site
        for (int i = 1; i < numerosDeClientes; i++) {
            System.out.println();
            System.out.printf("-----> Cadastro de Clientes %d. : ", i);
            System.out.println("\n----------------------------------");

            // Escrevendo Nomes Clientes
            System.out.print("Nome Cliente: ");
            sc.nextLine();
            String nomeCliente = sc.nextLine();

           //  Escrevendo Ids e validar Ids duplicados ou iguais
            System.out.print("Id Cliente: ");
            int idCliente = sc.nextInt();
            while (validarId(clientes, idCliente)) {
                    System.out.println("Esse Id esta sendo utilizado por outro Cliente. Por favor Gerar outro Id");
                    idCliente = sc.nextInt();
                    sc.nextLine();
            }

            // Escrevendo Emails dos clientes
            System.out.print("Email Cliente: ");
            sc.nextLine();
            String emailCliente = sc.nextLine();

            // Escrevendo CPFS dos Clientes
            System.out.print("CPF Cliente: ");
            int cpfCliente = sc.nextInt();

            clientes.add(new Cliente(emailCliente, idCliente, nomeCliente, cpfCliente));

        }

        System.out.println("\nListas dos Clientes Cadastrados: ");
        for (Cliente listasClientesCadastrados : clientes){
            System.out.println(listasClientesCadastrados);
        }
    }
    // Validaçao do se nao tem ids iguais ou ids que nao estao na lista
    public static boolean validarId(List<Cliente> clientes, int id){
        Cliente cliente = clientes.stream().filter(ids -> ids.getId() == id).findFirst().orElse(null);
        return cliente != null;
    }
}

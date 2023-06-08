import java.util.ArrayList;
import java.util.Scanner;

public class CadastroClientes {
    public static void main(String[] args) {
        // Lista para armazenar os clientes cadastrados
        ArrayList<Cliente> clientes = new ArrayList<>();

        // Loop para cadastrar clientes até que o usuário digite "sair"
        
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("===== CADASTRO DE CLIENTE =====");
            System.out.print("Nome: ");
            String nome = input.nextLine();
            System.out.print("CPF: ");
            String cpf = input.nextLine();
            System.out.print("E-mail: ");
            String email = input.nextLine();
            System.out.print("Endereço: ");
            String endereco = input.nextLine();
            System.out.print("Modalidade: ");
            String modalidade = input.nextLine();
            clientes.add(new Cliente(nome, cpf, email, endereco, modalidade));
            System.out.println("Cadastro realizado com sucesso!");
            System.out.print("Deseja cadastrar um novo cliente? (s/n): ");
            String opcao = input.nextLine();
            if (opcao.equalsIgnoreCase("n")) {
                break;
            }
            else if (!opcao.equalsIgnoreCase("s")) {
                System.out.println("Opção inválida, digite s para cadastrar um novo cliente ou n para sair.");
            }
        }

        // Exibindo lista de clientes cadastrados
        System.out.println("===== CLIENTES CADASTRADOS =====");
        for (Cliente cliente : clientes) {
            System.out.println(cliente.toString());
        }
    }
}

class Cliente {
    private String nome;
    private String cpf;
    private String email;
    private String endereco;
    private String modalidade;

    public Cliente(String nome, String cpf, String email, String endereco, String modalidade) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
        this.modalidade = modalidade;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getModalidade() {
        return modalidade;
    }

    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf + ", E-mail: " + email + ", Endereço: " + endereco + ", Modalidade: " + modalidade;
    }
}

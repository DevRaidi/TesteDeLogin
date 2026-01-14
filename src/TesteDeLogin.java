import java.util.Scanner;

public class TesteDeLogin{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("=== CADASTRO DE USUÁRIO ===");
        System.out.println("Cadastre o nome de usuário abaixo.");
        String cadastroUsuario;
        while(true){
            System.out.println("Nome de usuário:");
            cadastroUsuario = leitor.nextLine();
            if(cadastroUsuario.matches("[a-zA-Z]+")){
                System.out.println("Cadastro de usuário realizado com sucesso!");
                System.out.println();
                break;

            } else {
                System.out.println("O cadastro deve ter apenas letras. \nPor favor realize o cadastro novamente!");
                System.out.println();
            }
        }
        String senha;
        while(true){
            System.out.println("Cadastre uma senha com 6 números:");
            System.out.println("Digite sua Senha:");
            senha = leitor.nextLine();

            if(senha.matches("\\d{6}")){
                System.out.println("Cadastro de senha realizado com sucesso.");
                break;
            } else {
                System.out.println("Cadastro de senha inválido! \nA senha deve ter 6 números.");
                System.out.println();
            }
        }
        // Login
        System.out.println("\n===LOGIN===");
        System.out.println();
        System.out.println("Digite o seu usuário: ");
        System.out.println("Usuário:");
        String usuarioLogin = leitor.nextLine();
        System.out.println();

        System.out.println("Digite sua senha: ");
        System.out.println("Senha:");
        String senhaLogin = leitor.nextLine();
        System.out.println();

            if(usuarioLogin.equals(cadastroUsuario) && senhaLogin.equals(senha)){
                System.out.println("Login realizado com sucesso!");
            } else {
                System.out.println("Usuário ou senha inválidos! Por favor verifique os dados do seu login");
            }
            leitor.close();
    }
}

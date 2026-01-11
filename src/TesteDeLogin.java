import java.util.Scanner;

public class TesteDeLogin{
    public static void main(String[] arg){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Vamos realizar o seu cadastro");
        String cadastroUsuario;
        while(true){
            System.out.println("Digite o nome do seu usuário:");
            cadastroUsuario = leitor.nextLine();
            if(cadastroUsuario.matches("[a-zA-Z]+")){
                System.out.println("Cadastro de usuário realizado com sucesso!");
                break;

            } else {
                System.out.println("O cadastro deve ter apenas letras. Por favor realize o cadastro novamente.");
            }
        }
        String senha;
        while(true){
            System.out.println("Cadastre uma senha com 6 números:");
            senha = leitor.nextLine();
            if(senha.matches("\\d{6}+")){
                System.out.println("Cadastro de senha realizado com sucesso.");
                break;
            } else {
                System.out.println("Cadastro de senha inválido! A senha deve ter 6 números.");
            }
        }
    }
}
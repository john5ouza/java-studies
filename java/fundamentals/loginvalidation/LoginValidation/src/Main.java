public class Main {

    public static void main(String[] args) {
        //input
        String usuario = "John";
        String senha = "abc@123";

        //sistema
        String usuarioSistema = "john";
        String senhaSistema = "abc@123";

        //validação
        int usuarioValidado = usuario.compareToIgnoreCase(usuarioSistema);
        int senhaValidada = senha.compareTo(senhaSistema);

        //condição
        if (usuarioValidado == 0) {
            System.out.println("Usuário validado.");
        } else {
            System.out.println("Usuário desconhecido.");
        }

        if (senhaValidada == 0) {
            System.out.println("Senha correta.");
        } else {
            System.out.println("Senha incorreta.");
        }

        System.out.println("Login feito com sucesso, seja-bem vindo " + usuario + "!");

    }
}

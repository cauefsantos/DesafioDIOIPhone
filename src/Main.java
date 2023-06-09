import dispositivos.Smartfone;

public class Main {

    public static void main(String[] args) {

        Smartfone iPhone = new Smartfone();

        System.out.println("NAVEGADOR:");

        iPhone.exibirPagina("Google");
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();

        System.out.println("REPRODUTOR");

        iPhone.selecionarMusica();
        iPhone.tocarMusica(4);
        iPhone.pausarMusica();

        System.out.println("TELEFONE");

        iPhone.atender();
        iPhone.telefonar("999999999");

    }

}

package dispositivos;

import funcionalidades.Navegador;
import funcionalidades.Reprodutor;
import funcionalidades.Telefone;

public class Smartfone implements Telefone, Navegador, Reprodutor {

    public void exibirPagina(String url) {
        System.out.printf("Exibindo %s\n", url);
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba abera");
    }

    public void atualizarPagina() {
        System.out.println("Pagina atual atualizada");
    }

    public void tocarMusica(int idMusica) {
        System.out.printf("Tocando a musica %d\n", idMusica);
    }

    public void pausarMusica() {
        System.out.println("Musica pausada");
    }

    public int selecionarMusica() {
        int idMusica = 4;
        System.out.printf("Musica %d selecionada\n", idMusica);
        return idMusica;
    }

    public void telefonar(String telefone) {
        System.out.printf("Ligando para %s\n", telefone);
    }

    public void atender() {
        System.out.println("Ligação em andamento");
    }
}

public class MainIphone {
    public static void main(String[] args){
        
        Musica spotify = new Musica();
        Web safari = new Web();
        Telefone telefone = new Telefone();

        String youtube = "https://youtube.com";
        String numero = "998641370";
        String musica = "Appetite";

        safari.adicionarNovaAba();
        safari.atualizarAba();
        safari.exibirPagina(youtube);

        spotify.selecionarMusica(musica);
        spotify.tocar();
        spotify.pausar();

        telefone.ligar(numero);
        telefone.iniciarCorreioDeVoz();
        telefone.atender();
    }
}
